import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class AnalizadorListener extends sintacticoBaseListener {

    private int opcion, ambito;
    private HashMap<Integer, TablaSimbolos> tablasDeSimbolos;
    private Stack<Dato> pila;
    private Stack<Integer> pilaArgumentos;
    private Stack<String> pilaLlamadas;
    private Stack<ParseTree> familia;
    private Stack<ParseTree> hijosReutilizables;
    private boolean esDeclaracion;

    public AnalizadorListener(int opcion, TablaSimbolos tablaSimbolos, Stack<String> pilaLlamadas) {
        this.ambito = -1;
        this.opcion = opcion;
        this.tablasDeSimbolos = new HashMap<>();
        this.tablasDeSimbolos.put(0, tablaSimbolos);
        this.pila = new Stack<>();
        this.pilaArgumentos = new Stack<>();
        this.pilaLlamadas = pilaLlamadas;
        this.familia = new Stack<>();
        this.hijosReutilizables = new Stack<>();
        esDeclaracion = false;
    }

    public AnalizadorListener(int opcion, int ambito, HashMap<Integer, TablaSimbolos> tablasDeSimbolos, Stack<ParseTree> familia, Stack<ParseTree> hijosReutilizables, Stack<String> pilaLlamadas) {
        this.ambito = ambito;
        this.opcion = opcion;
        this.tablasDeSimbolos = tablasDeSimbolos;
        this.pila = new Stack<>();
        this.pilaArgumentos = new Stack<>();
        this.pilaLlamadas = pilaLlamadas;
        this.familia = familia;
        this.hijosReutilizables = hijosReutilizables;
        esDeclaracion = false;
    }

    private void mostrarMenu() {
        System.out.println("""
                Que quieres hacer??:
                1. Mostrar variables 
                2. Mostrar pila de llamadas
                3. Cambiar el valor de un avariable
                4. Continuar con la ejecucion
                5. Parar la ejecucion""");
    }

    private Dato getElemTabla(String id) throws Errores {
        for (int i = tablasDeSimbolos.size() - 1; i >= 0; i--) {
            if (tablasDeSimbolos.get(i).containsId(id)) {
                if (!tablasDeSimbolos.get(i).getDato(id).getTipo().equals("null")) {
                    return tablasDeSimbolos.get(i).getDato(id);
                }
                throw new Errores(11, id);
            }
        }
        throw new Errores(10, id);
    }

    private void evaluarPolinomio() throws Errores {
        HashMap<Character, Float> tablaAux = new HashMap<>();
        Dato valor, id, polinomio, retorno = new Dato();
        int nArgs = pilaArgumentos.pop();
        if (nArgs % 2 == 0) {
            throw new Errores(52);
        }

        for (int i = 1; i < nArgs; i += 2) {
            valor = pila.pop();
            id = pila.pop();

            if (!valor.getTipo().equals("int") && !valor.getTipo().equals("float")) {
                throw new Errores(51, id.getLexema());
            }
            tablaAux.put(id.getLexema().charAt(0), Float.parseFloat(valor.getLexema()));
        }

        polinomio = pila.pop();

        if (!polinomio.getTipo().equals("polinomio")) {
            throw new Errores(53);
        }

        EvaluadorDePolinomioListener listener = new EvaluadorDePolinomioListener(tablaAux, retorno);
        ParseTreeWalker caminante = new ParseTreeWalker();
        caminante.walk(listener, polinomio.getArbol());

        pila.push(retorno);
    }

    private Dato operarPolinomio(Dato a, Dato b, String opcode) {
        String bAux = "", sumaPolinomio;
        if (opcode.equals("-")) {
            for (int i = 0; i < b.getLexema().length(); i++) {
                if (i == 0 && (b.getLexema().charAt(i) != '-' || b.getLexema().charAt(i) != '+')) {
                    bAux = bAux + "-" + b.getLexema().charAt(i);
                }
                else if (b.getLexema().charAt(i) == '-') {
                    bAux += '+';
                }
                else if (b.getLexema().charAt(i) == '+') {
                    bAux += '-';
                }
                else {
                    bAux += b.getLexema().charAt(i);
                }
            }
        }
        else {
            bAux = "+" + b.getLexema();
        }
        sumaPolinomio = a.getLexema() + bAux;
        sumaPolinomio = "'" + optimizarPolinomio(sumaPolinomio) + "'";

        return new Dato(sumaPolinomio);
    }

    private String optimizarPolinomio(String polinomio) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> letras = new ArrayList<>();
        ArrayList<Character> operadores = new ArrayList<>();
        String cadNumeros = "", cadLetras = "";
        boolean reconocerNum = true;

        for (int i = 0; i < polinomio.length(); i++) {
            if (i == 0 && polinomio.charAt(i) != '-' && polinomio.charAt(i) != '+') {
                operadores.add('+');
                if (Character.isDigit(polinomio.charAt(i))) {
                    cadNumeros += polinomio.charAt(i);
                }
                else {
                    cadLetras += polinomio.charAt(i);
                }
            }
            else if (polinomio.charAt(i) == '-' || polinomio.charAt(i) == '+') {
                if (i != 0) {
                    if (cadNumeros.isEmpty()) {
                        numeros.add(1);
                    }
                    else {
                        numeros.add(Integer.parseInt(cadNumeros));
                    }
                    letras.add(cadLetras);
                }
                cadNumeros = "";
                cadLetras = "";
                reconocerNum = true;
                operadores.add(polinomio.charAt(i));
            }
            else if (Character.isDigit(polinomio.charAt(i))) {
                if (reconocerNum) {
                    cadNumeros += polinomio.charAt(i);
                }
                else {
                    cadLetras += polinomio.charAt(i);
                }
            }
            else {
                reconocerNum = false;
                cadLetras += polinomio.charAt(i);
            }
        }
        if (cadNumeros.isEmpty()) {
            numeros.add(1);
        }
        else {
            numeros.add(Integer.parseInt(cadNumeros));
        }
        letras.add(cadLetras);
        String polinomioAux = "";
        int suma;
        ArrayList<String> visitados = new ArrayList<>();
        for (int i = 0; i < letras.size(); i++) {
            suma = 0;
            if (!visitados.contains(letras.get(i))) {
                for (int j = i; j < letras.size(); j++) {
                    if (letras.get(i).equals(letras.get(j))) {
                        if (operadores.get(j) == '+') {
                            suma += numeros.get(j);
                        }
                        else {
                            suma -= numeros.get(j);
                        }
                    }
                }
                if (suma == 1) {
                    polinomioAux += "+" + letras.get(i);
                }
                else if (suma > 0) {
                    polinomioAux += "+" + suma + letras.get(i);
                }
                else if (suma == -1) {
                    polinomioAux += "-" + letras.get(i);
                }
                else if (suma < 0) {
                    polinomioAux += suma + letras.get(i);
                }
                visitados.add(letras.get(i));
            }
        }
        return polinomioAux;
    }

    private void mostrarTablaSimbolos() {
        for (int i = 0; i < tablasDeSimbolos.size(); i++) {
            System.out.println("Ambito: " + i);
            tablasDeSimbolos.get(i).mostrarTablaSimbolo();
        }
    }

    private void mostrarPilaLlamadas() {
        System.out.println("---------------- Pila Llamadas ------------------");
        for (int i = 0; i < pilaLlamadas.size(); i++) {
            System.out.println(pilaLlamadas.get(i));
        }
        System.out.println("-------------------------------------------------");
    }

    private void cambiarVariable() {
        Scanner input = new Scanner(System.in);
        int ambitoElegido = 0;
        String variable;
        String valor;
        if (tablasDeSimbolos.size() > 1) {
            System.out.println("Introduce el ambito en el que se encuentra la variable: ");
            ambitoElegido = input.nextInt();
        }
        if (tablasDeSimbolos.containsKey(ambitoElegido)) {
            System.out.println("Introduce la variable que quieres cambiar:");
            variable = input.nextLine();

            if (tablasDeSimbolos.get(ambitoElegido).containsId(variable)) {
                System.out.println("Introduce el valor para la variable");
                valor = input.nextLine();
                Dato valorAux = new Dato(valor);
                tablasDeSimbolos.get(ambito).addElem(variable, valorAux);
            }
            else {
                System.out.println("La variable elegida no existe");
            }
        }
        else {
            System.out.println("El ambito seleccionado es incorrecto");
        }

    }

    @Override
    public void enterSentencia(sintactico.SentenciaContext ctx) throws Errores {
        if (opcion == 2) {
            boolean continuar = true;
            while (continuar) {
                System.out.println("Linea " + ctx.start.getLine() + ": " + ctx.getText());
                mostrarMenu();
                Scanner input = new Scanner(System.in);
                int eleccion = input.nextInt();

                switch (eleccion) {
                    case 1 -> mostrarTablaSimbolos();
                    case 2 -> mostrarPilaLlamadas();
                    case 3 -> cambiarVariable();
                    case 4 -> {
                        continuar = false;
                        System.out.println("Reanudar la ejecucion");
                    }
                    case 5 -> throw new Errores(0);
                    default -> System.out.println("La opcion " + eleccion + "no existe");
                }
            }
        }
    }

    @Override
    public void enterLetIdentificador(sintactico.LetIdentificadorContext ctx) {
        tablasDeSimbolos.get(ambito).addElem(ctx.stop.getText(), new Dato());
    }

    @Override
    public void enterLetAsignacion(sintactico.LetAsignacionContext ctx) {
        esDeclaracion = true;
    }

    @Override
    public void exitAsig(sintactico.AsigContext ctx) throws Errores{
        String idAux = ctx.start.getText();
        Dato valAux = pila.pop();
        boolean encontrado = false;

        if (esDeclaracion) {
            tablasDeSimbolos.get(ambito).addElem(idAux, valAux);
        }
        else {
            for (int i = tablasDeSimbolos.size() - 1; i >= 0; i--) {
                if (tablasDeSimbolos.get(i).containsId(idAux)) {
                    if (valAux.getTipo() != tablasDeSimbolos.get(i).getTipo(idAux) && tablasDeSimbolos.get(i).getTipo(idAux) != "null") {
                        throw new Errores(12,  valAux.getTipo(), tablasDeSimbolos.get(i).getTipo(idAux));
                    }
                    else {
                        tablasDeSimbolos.get(i).addElem(idAux, valAux);
                        encontrado = true;
                    }
                }
            }

            if (!encontrado) {
                throw new Errores(10, idAux);
            }
        }
        esDeclaracion = false;
    }

    @Override
    public void exitSumrestoper(sintactico.SumrestoperContext ctx) throws Errores {
        Dato b = pila.pop();
        Dato a = pila.pop();

        if (b.getTipo().equals("var")) {
            b = getElemTabla(b.getLexema());
        }
        if (a.getTipo().equals("var")) {
            a = getElemTabla(a.getLexema());
        }
        String resultado = "";

        if (a.getTipo().equals("int") && b.getTipo().equals("int")) {
            if (ctx.getChild(1).getText().equals("+")) {
                resultado = String.valueOf(Integer.parseInt(a.getLexema()) + Integer.parseInt(b.getLexema()));
            }
            else {
                resultado = String.valueOf(Integer.parseInt(a.getLexema()) - Integer.parseInt(b.getLexema()));
            }
        }
        else if (a.getTipo().equals("float") && b.getTipo().equals("float")) {
            if (ctx.getChild(1).getText().equals("+")) {
                resultado = String.valueOf(Float.parseFloat(a.getLexema()) + Float.parseFloat(b.getLexema()));
            }
            else {
                resultado = String.valueOf(Float.parseFloat(a.getLexema()) - Float.parseFloat(b.getLexema()));
            }
        }
        else if (a.getTipo().equals("String") && b.getTipo().equals("String")) {
            if (ctx.getChild(1).getText().equals("+")) {
                resultado = a.getLexema() + b.getLexema();
            }
            else {
                throw new Errores(20, a.getTipo(), b.getTipo(), ctx.getChild(1).getText());
            }
        }
        else if (a.getTipo().equals("polinomio") && b.getTipo().equals("polinomio")) {
            Dato resultadoPolinomio = operarPolinomio(a, b, ctx.getChild(1).getText());
            pila.push(resultadoPolinomio);
        }
        else {
            throw new Errores(20, a.getTipo(), b.getTipo(), ctx.getChild(1).getText());

        }
        if (!resultado.isEmpty()) {
            pila.push(new Dato(resultado));
        }
    }

    @Override
    public void exitMuldivoper(sintactico.MuldivoperContext ctx) throws Errores {
        String resultado;
        Dato b = pila.pop();
        Dato a = pila.pop();

        if (b.getTipo().equals("var")) {
            b = getElemTabla(b.getLexema());
        }
        if (a.getTipo().equals("var")) {
            a = getElemTabla(a.getLexema());
        }

        if (a.getTipo().equals("int") && b.getTipo().equals("int")) {
            if (ctx.getChild(1).getText().equals("*")) {
                resultado = String.valueOf(Integer.parseInt(a.getLexema()) * Integer.parseInt(b.getLexema()));
            }
            else {
                resultado = String.valueOf(Integer.parseInt(a.getLexema()) / Integer.parseInt(b.getLexema()));
            }
        }
        else if (a.getTipo().equals("float") && b.getTipo().equals("float")) {
            if (ctx.getChild(1).getText().equals("*")) {
                resultado = String.valueOf(Float.parseFloat(a.getLexema()) * Float.parseFloat(b.getLexema()));
            }
            else {
                resultado = String.valueOf(Float.parseFloat(a.getLexema()) / Float.parseFloat(b.getLexema()));
            }
        }
        else {
            throw new Errores(20, a.getTipo(), b.getTipo(), ctx.getChild(1).getText());
        }

        pila.push(new Dato(resultado));
    }

    @Override public void exitModexpoper(sintactico.ModexpoperContext ctx) throws Errores{
        int resultado;
        Dato b = pila.pop();
        Dato a = pila.pop();

        if (b.getTipo().equals("var")) {
            b = getElemTabla(b.getLexema());
        }
        if (a.getTipo().equals("var")) {
            a = getElemTabla(a.getLexema());
        }

        if (a.getTipo().equals("int") && b.getTipo().equals("int")) {
            if (ctx.getChild(1).getText().equals("%")) {
                resultado = Integer.parseInt(a.getLexema()) % Integer.parseInt(b.getLexema());
            } else {
                resultado = (int) Math.pow(Integer.parseInt(a.getLexema()), Integer.parseInt(b.getLexema()));
            }
        }
        else {
            throw new Errores(20, a.getTipo(), b.getTipo(), ctx.getChild(1).getText());
        }
        pila.push(new Dato(String.valueOf(resultado)));
    }

    @Override
    public void exitComparacionoper(sintactico.ComparacionoperContext ctx) throws Errores {
        boolean resultado;
        Dato b = pila.pop();
        Dato a = pila.pop();

        if (b.getTipo().equals("var")) {
            b = getElemTabla(b.getLexema());
        }
        if (a.getTipo().equals("var")) {
            a = getElemTabla(a.getLexema());
        }

        if (a.getTipo().equals("int") && b.getTipo().equals("int")) {
            String opcode = ctx.getChild(1).getText();
            switch (opcode) {
                case "<" -> resultado = Integer.parseInt(a.getLexema()) < Integer.parseInt(b.getLexema());

                case "<=" -> resultado = Integer.parseInt(a.getLexema()) <= Integer.parseInt(b.getLexema());

                case ">" -> resultado = Integer.parseInt(a.getLexema()) > Integer.parseInt(b.getLexema());

                case ">=" -> resultado = Integer.parseInt(a.getLexema()) >= Integer.parseInt(b.getLexema());

                case "==" -> resultado = Integer.parseInt(a.getLexema()) == Integer.parseInt(b.getLexema());

                case "!=" -> resultado = Integer.parseInt(a.getLexema()) != Integer.parseInt(b.getLexema());

                default -> throw new Errores(21, ctx.getChild(1).getText());
            }
        }
        else {
            throw new Errores(20, a.getTipo(), b.getTipo(), ctx.getChild(1).getText());
        }
        pila.push(new Dato(String.valueOf(resultado)));
    }

    @Override
    public void exitLogicooper(sintactico.LogicooperContext ctx) throws Errores {
        boolean resultado;
        Dato b = pila.pop();
        Dato a = pila.pop();

        if (b.getTipo().equals("var")) {
            b = getElemTabla(b.getLexema());
        }
        if (a.getTipo().equals("var")) {
            a = getElemTabla(a.getLexema());
        }

        if (a.getTipo().equals("boolean") && b.getTipo().equals("boolean")) {
            String opcode = ctx.getChild(1).getText();
            switch (opcode) {
                case "&&" -> resultado = Boolean.parseBoolean(a.getLexema()) && Boolean.parseBoolean(b.getLexema());

                case "||" -> resultado = Boolean.parseBoolean(a.getLexema()) || Boolean.parseBoolean(b.getLexema());

                case "##" -> resultado = Boolean.parseBoolean(a.getLexema()) ^ Boolean.parseBoolean(b.getLexema());

                default -> throw new Errores(21, ctx.getChild(1).getText());
            }
        }
        else {
            throw new Errores(20, a.getTipo(), b.getTipo(), ctx.getChild(1).getText());
        }
        pila.push(new Dato(String.valueOf(resultado)));
    }

    @Override
    public void exitNegacion(sintactico.NegacionContext ctx) throws Errores {
        boolean resultado;
        Dato a = pila.pop();

        if (a.getTipo().equals("var")) {
            a = getElemTabla(a.getLexema());
        }

        if (a.getTipo().equals("boolean")) {
            resultado = !Boolean.parseBoolean(a.getLexema());
        }
        else {
            throw new Errores(22, a.getTipo(), "OPERACION '" + ctx.getChild(0).getText() + "'");
        }
        pila.push(new Dato(String.valueOf(resultado)));
    }

    @Override
    public void enterCondicion(sintactico.CondicionContext ctx) {
        familia.push(ctx);
        ParseTree condicion = ctx.getChild(1);
        ParseTree bloque = ctx.getChild(2);
        hijosReutilizables.push(bloque);
        hijosReutilizables.push(condicion);
        ctx.children.remove(1);
        ctx.children.remove(1);

        AnalizadorListener listener = new AnalizadorListener(opcion, ambito, tablasDeSimbolos, familia, hijosReutilizables, pilaLlamadas);
        ParseTreeWalker caminante = new ParseTreeWalker();
        caminante.walk(listener, condicion);

        if (tablasDeSimbolos.get(0).getRetorno().getLexema().equals("true")) {
            caminante.walk(listener, bloque);
        }
    }

    @Override
    public void exitCondicion(sintactico.CondicionContext ctx) {
        ctx.addChild((RuleContext) hijosReutilizables.pop());
        ctx.addChild((RuleContext) hijosReutilizables.pop());
        familia.pop();
    }

    @Override
    public void enterWhilebucle(sintactico.WhilebucleContext ctx) {
        boolean iterar = true;

        familia.push(ctx);
        ParseTree condicion = ctx.getChild(1);
        ParseTree bloque = ctx.getChild(2);
        hijosReutilizables.push(bloque);
        hijosReutilizables.push(condicion);
        ctx.children.remove(1);
        ctx.children.remove(1);

        while (iterar) {
            AnalizadorListener listener = new AnalizadorListener(opcion, ambito, tablasDeSimbolos, familia, hijosReutilizables, pilaLlamadas);
            ParseTreeWalker caminante = new ParseTreeWalker();
            caminante.walk(listener, condicion);

            if (tablasDeSimbolos.get(0).getRetorno().getLexema().equals("true")) {
                caminante.walk(listener, bloque);
            }
            else {
                iterar = false;
            }
        }
    }

    @Override
    public void exitWhilebucle(sintactico.WhilebucleContext ctx) {
        ctx.addChild((RuleContext) hijosReutilizables.pop());
        ctx.addChild((RuleContext) hijosReutilizables.pop());
        familia.pop();
    }

    @Override
    public void exitCuerpocondicion(sintactico.CuerpocondicionContext ctx) throws Errores {
        Dato resCondicion = pila.pop();
        if (resCondicion.getTipo().equals("boolean")) {
            tablasDeSimbolos.get(0).setRetorno(resCondicion);
        }
        else {
            throw new Errores(30);
        }
    }

    @Override
    public void enterBloque(sintactico.BloqueContext ctx) {
        ambito++;
        if (ambito != 0) {
            tablasDeSimbolos.put(ambito, new TablaSimbolos());
        }
    }

    @Override
    public void exitBloque(sintactico.BloqueContext ctx) {
        tablasDeSimbolos.remove(ambito);
        ambito--;
    }

    @Override
    public void exitFuncion(sintactico.FuncionContext ctx) throws Errores {
        Funcion func = tablasDeSimbolos.get(0).getFuncion(ctx.start.getText());
        if (func == null) {
            throw new Errores(40, ctx.start.getText());
        }
        if (func.getIdentificador().equals("val")) {
            evaluarPolinomio();
            return;
        }

        int nArgs = pilaArgumentos.pop();
        int argsAux = func.getNumArgumentos();
        if (argsAux != nArgs) {
            throw new Errores(41, String.valueOf(pila.size()), String.valueOf(argsAux));
        }

        if (func.getIdentificador().equals("print")) {
            System.out.println(pila.pop().getLexema());
        }
        else {
            HashMap<String, Dato> tablaAux = new HashMap<>();
            for (int i = argsAux - 1; i >= 0; i--) {
                tablaAux.put(func.getIdArgumentos().get(i), pila.pop());
            }
            Stack<ParseTree> pilaAux = new Stack<>();
            while (!familia.empty()) {
                ParseTree varAux = familia.pop();
                if (varAux instanceof sintactico.CondicionContext) {
                    sintactico.CondicionContext  varAuxCondicion = (sintactico.CondicionContext) varAux;
                    varAuxCondicion.addChild((RuleContext) hijosReutilizables.pop());
                    varAuxCondicion.addChild((RuleContext) hijosReutilizables.pop());
                    pilaAux.push(varAuxCondicion);
                }
                else {
                    sintactico.WhilebucleContext varAuxCondicion = (sintactico.WhilebucleContext) varAux;
                    varAuxCondicion.addChild((RuleContext) hijosReutilizables.pop());
                    varAuxCondicion.addChild((RuleContext) hijosReutilizables.pop());
                    pilaAux.push(varAuxCondicion);
                }
            }
            TablaSimbolos tablaSimbolos = new TablaSimbolos(tablaAux, tablasDeSimbolos.get(0).getTablaFunciones());

            AnalizadorListener listener = new AnalizadorListener(opcion, tablaSimbolos, pilaLlamadas);
            ParseTreeWalker caminante = new ParseTreeWalker();
            caminante.walk(listener, func.getRaiz());

            while (!pilaAux.empty()) {
                ParseTree varAux = pilaAux.pop();

                if (varAux instanceof sintactico.CondicionContext) {
                    sintactico.CondicionContext  varAuxCondicion = (sintactico.CondicionContext) varAux;
                    ParseTree condicion = varAuxCondicion.getChild(1);
                    ParseTree bloque = varAuxCondicion.getChild(2);
                    if (condicion != null && bloque != null) {
                        hijosReutilizables.push(bloque);
                        hijosReutilizables.push(condicion);
                        varAuxCondicion.children.remove(1);
                        varAuxCondicion.children.remove(1);
                    }
                    familia.push(varAuxCondicion);
                }
                else {
                    sintactico.WhilebucleContext varAuxCondicion = (sintactico.WhilebucleContext) varAux;
                    ParseTree condicion = varAuxCondicion.getChild(1);
                    ParseTree bloque = varAuxCondicion.getChild(2);
                    if (condicion != null && bloque != null) {
                        hijosReutilizables.push(bloque);
                        hijosReutilizables.push(condicion);
                        varAuxCondicion.children.remove(1);
                        varAuxCondicion.children.remove(1);
                    }
                    familia.push(varAuxCondicion);
                }
            }

            pila.push(tablaSimbolos.getRetorno());
            if (ctx.parent instanceof sintactico.SentenciaContext) {
                pila.pop();
            }
        }
    }

    @Override
    public void enterCuerpoargumentos(sintactico.CuerpoargumentosContext ctx) {
        pilaArgumentos.push(0);
    }

    @Override
    public void exitArgumento(sintactico.ArgumentoContext ctx) {
        pilaArgumentos.push(pilaArgumentos.pop() + 1);
    }

    @Override
    public void exitIde(sintactico.IdeContext ctx) throws Errores {
        pila.push(getElemTabla(ctx.getText()));
    }

    @Override
    public void exitNumeric(sintactico.NumericContext ctx) {
        pila.push(new Dato(ctx.start.getText()));
    }

    @Override
    public void exitCadena(sintactico.CadenaContext ctx) {
        String cadena = ctx.start.getText();
        pila.push(new Dato(cadena.substring(1, cadena.length() - 1)));
    }

    @Override
    public void exitBool(sintactico.BoolContext ctx) {
        pila.push(new Dato(ctx.start.getText()));
    }

    @Override
    public void exitPoli(sintactico.PoliContext ctx) {
        pila.push(new Dato(ctx));
    }

    @Override
    public void exitRetorno(sintactico.RetornoContext ctx) {
        if (!pila.empty()) {
            tablasDeSimbolos.get(0).setRetorno(pila.pop());
        }
    }

    @Override
    public void enterFunc(sintactico.FuncContext ctx) {
        pilaLlamadas.push(ctx.getChild(1).getText() + "()");

    }

    @Override
    public void exitFunc(sintactico.FuncContext ctx) {
        pilaLlamadas.pop();
    }
}
