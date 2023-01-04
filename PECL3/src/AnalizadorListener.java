import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class AnalizadorListener extends sintacticoBaseListener {

    private int opcion, ambito;
    private HashMap<Integer, TablaSimbolos> tablasDeSimbolos;
    private Stack<Dato> pila;
    private Stack<ParseTree> hijosReutilizables;
    private boolean esDeclaracion;
    private int nArgs;

    public AnalizadorListener(int opcion, TablaSimbolos tablaSimbolos) {
        this.ambito = -1;
        this.opcion = opcion;
        this.tablasDeSimbolos = new HashMap<Integer, TablaSimbolos>();
        this.tablasDeSimbolos.put(0, tablaSimbolos);
        this.pila = new Stack<>();
        this.hijosReutilizables = new Stack<>();
        esDeclaracion = false;
    }

    public AnalizadorListener(int opcion, int ambito, HashMap<Integer, TablaSimbolos> tablasDeSimbolos) {
        this.ambito = ambito;
        this.opcion = opcion;
        this.tablasDeSimbolos = tablasDeSimbolos;
        this.pila = new Stack<>();
        this.hijosReutilizables = new Stack<>();
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

    private boolean stop() {
        if (opcion == 2) {
            Scanner input = new Scanner(System.in);
            mostrarMenu();
        }
        return true;
    }

    private Dato getElemTabla(String id) throws Errores {
        for (int i = tablasDeSimbolos.size() - 1; i >= 0; i--) {
            if (tablasDeSimbolos.get(i).containsId(id)) {
                if (!tablasDeSimbolos.get(i).getDato(id).getTipo().equals("null")) {
                    return tablasDeSimbolos.get(i).getDato(id);
                }
                throw new Errores(11);
            }
        }
        throw new Errores(10);
    }

    public void evaluarPolinomio() throws Errores {
        HashMap<Character, Float> tablaAux = new HashMap<>();
        Dato valor, id, polinomio, retorno = new Dato();

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

    @Override
    public void enterLetIdentificador(sintactico.LetIdentificadorContext ctx) {
        System.out.println("Voy a declarar");
        tablasDeSimbolos.get(ambito).addElem(ctx.stop.getText(), new Dato());
    }

    @Override
    public void enterLetAsignacion(sintactico.LetAsignacionContext ctx) {
        System.out.println("Voy a declarar");
        esDeclaracion = true;
    }

    @Override
    public void exitAsig(sintactico.AsigContext ctx) throws Errores{
        System.out.println("Voy a realizar una asignacion");
        String idAux = ctx.start.getText();
        Dato valAux = pila.pop();
        boolean encontrado = false;

        if (esDeclaracion) {
            System.out.println(ambito);
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
                throw new Errores(10);
            }
        }
        esDeclaracion = false;
    }

    @Override
    public void enterSumrestoper(sintactico.SumrestoperContext ctx) {
        System.out.println("Voy a sumar");
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
                throw new Errores(20, a.getTipo(), b.getTipo(), "OPERACION " + ctx.getChild(1).getText());
            }
        }
        else {
            throw new Errores(20, a.getTipo(), b.getTipo(), "OPERACION '" + ctx.getChild(1).getText() + "'");

        }

        pila.push(new Dato(resultado));
        System.out.println(pila);
    }

    @Override
    public void enterMuldivoper(sintactico.MuldivoperContext ctx) {
        System.out.println("Voy a multiplicar");
    }

    @Override
    public void exitMuldivoper(sintactico.MuldivoperContext ctx) throws Errores {
        String resultado = "";
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
            throw new Errores(20, a.getTipo(), b.getTipo(), "OPERACION '" + ctx.getChild(1).getText() + "'");
        }

        pila.push(new Dato(resultado));
        System.out.println(pila);
    }

    @Override public void enterModexpoper(sintactico.ModexpoperContext ctx) {
        System.out.println("Voy a modular/exponenciar");
    }

    @Override public void exitModexpoper(sintactico.ModexpoperContext ctx) throws Errores{
        int resultado = 0;
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
            throw new Errores(20, a.getTipo(), b.getTipo(), "OPERACION '" + ctx.getChild(1).getText() + "'");
        }
        pila.push(new Dato(String.valueOf(resultado)));
        System.out.println(pila);
    }

    @Override
    public void enterComparacionoper(sintactico.ComparacionoperContext ctx) {
        System.out.println("Voy a comparar");
    }

    @Override
    public void exitComparacionoper(sintactico.ComparacionoperContext ctx) throws Errores {
        boolean resultado = false;
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
            throw new Errores(20, a.getTipo(), b.getTipo(), "OPERACION '" + ctx.getChild(1).getText() + "'");
        }
        pila.push(new Dato(String.valueOf(resultado)));
        System.out.println(pila);
    }

    @Override
    public void enterLogicooper(sintactico.LogicooperContext ctx) {
        System.out.println("Voy a comparar lógicamente");
    }

    @Override
    public void exitLogicooper(sintactico.LogicooperContext ctx) throws Errores {
        boolean resultado = false;
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
            throw new Errores(20, a.getTipo(), b.getTipo(), "OPERACION '" + ctx.getChild(1).getText() + "'");
        }
        pila.push(new Dato(String.valueOf(resultado)));
        System.out.println(pila);
    }

    @Override
    public void enterNegacion(sintactico.NegacionContext ctx) {
        System.out.println("Voy a negar");
    }

    @Override
    public void exitNegacion(sintactico.NegacionContext ctx) throws Errores {
        boolean resultado = false;
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
        System.out.println(pila);
    }

    @Override
    public void enterCondicion(sintactico.CondicionContext ctx) {
        System.out.println("Voy a condicionar");
        //No vamos a añadir los else

        ParseTree condicion = ctx.getChild(1);
        ParseTree bloque = ctx.getChild(2);
        hijosReutilizables.push(bloque);
        hijosReutilizables.push(condicion);
        ctx.children.remove(1);
        ctx.children.remove(1);

        AnalizadorListener listener = new AnalizadorListener(opcion, ambito, tablasDeSimbolos);
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
    }

    @Override
    public void enterWhilebucle(sintactico.WhilebucleContext ctx) {
        System.out.println("Voy a buclear");
        boolean iterar = true;

        ParseTree condicion = ctx.getChild(1);
        ParseTree bloque = ctx.getChild(2);
        hijosReutilizables.push(bloque);
        hijosReutilizables.push(condicion);
        ctx.children.remove(1);
        ctx.children.remove(1);

        while (iterar) {
            AnalizadorListener listener = new AnalizadorListener(opcion, ambito, tablasDeSimbolos);
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
    }

    @Override
    public void enterCuerpocondicion(sintactico.CuerpocondicionContext ctx) {
        System.out.println("Voy a realizar una condicion");
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
        System.out.println("Voy a cambiar de ambito");
        ambito++;
        if (ambito != 0) {
            tablasDeSimbolos.put(ambito, new TablaSimbolos());
        }
    }

    @Override
    public void exitBloque(sintactico.BloqueContext ctx) {
        System.out.println("TABLACONAMBITOS");
        System.out.println(pila);
        for (int i = 0; i <tablasDeSimbolos.size(); i++) {
            System.out.println(tablasDeSimbolos.get(i));
        }

        tablasDeSimbolos.remove(ambito);
        ambito--;
    }

    @Override
    public void enterFuncion(sintactico.FuncionContext ctx) {
        System.out.println("Voy a llamar");
    }

    @Override
    public void exitFuncion(sintactico.FuncionContext ctx) throws Errores {
        System.out.println(ctx.start.getText());
        Funcion func = tablasDeSimbolos.get(0).getFuncion(ctx.start.getText());
        if (func == null) {
            throw new Errores(40, ctx.start.getText());
        }
        if (func.getIdentificador().equals("val")) {
            evaluarPolinomio();
            return;
        }

        int argsAux = func.getNumArgumentos();
        if (argsAux != nArgs) {
            throw new Errores(41, String.valueOf(pila.size()), String.valueOf(argsAux));
        }

        if (func.getIdentificador().equals("print")) {
            System.out.println("VOY A DEPURAR <------------------------------------------------" + pila.pop().getLexema());
        }
        else {
            HashMap<String, Dato> tablaAux = new HashMap<>();
            for (int i = argsAux - 1; i >= 0; i--) {
                tablaAux.put(func.getIdArgumentos().get(i), pila.pop());
            }
            TablaSimbolos tablaSimbolos = new TablaSimbolos(tablaAux, tablasDeSimbolos.get(0).getTablaFunciones());

            AnalizadorListener listener = new AnalizadorListener(opcion, tablaSimbolos);
            ParseTreeWalker caminante = new ParseTreeWalker();
            caminante.walk(listener, func.getRaiz());

            pila.push(tablaSimbolos.getRetorno());
            if (ctx.parent instanceof sintactico.SentenciaContext) {
                pila.pop();
            }
        }
    }

    @Override
    public void enterCuerpoargumentos(sintactico.CuerpoargumentosContext ctx) {
        nArgs = 0;
    }

    @Override
    public void exitArgumento(sintactico.ArgumentoContext ctx) {
        nArgs++;
    }

    @Override
    public void exitIde(sintactico.IdeContext ctx) throws Errores {
        pila.push(getElemTabla(ctx.getText()));
    }

    @Override
    public void enterNumeric(sintactico.NumericContext ctx) {
        System.out.println("Tengo un numerico ");
    }

    @Override
    public void exitNumeric(sintactico.NumericContext ctx) {
        pila.push(new Dato(ctx.start.getText()));
        System.out.println(pila);
    }

    @Override
    public void enterCadena(sintactico.CadenaContext ctx) {
        System.out.println("Tengo una cadena");
    }

    @Override
    public void exitCadena(sintactico.CadenaContext ctx) {
        String cadena = ctx.start.getText();
        pila.push(new Dato(cadena.substring(1, cadena.length() - 1)));
        System.out.println(pila);
    }

    @Override
    public void enterBool(sintactico.BoolContext ctx) {
        System.out.println("Tengo un booleano");
    }

    @Override
    public void exitBool(sintactico.BoolContext ctx) {
        pila.push(new Dato(ctx.start.getText()));
        System.out.println(pila);
    }

    @Override
    public void enterPoli(sintactico.PoliContext ctx) {
        System.out.println("Tengo un polinomio");
    }

    @Override
    public void exitPoli(sintactico.PoliContext ctx) {
        pila.push(new Dato(ctx));
        System.out.println(pila);
    }

    @Override
    public void enterRetorno(sintactico.RetornoContext ctx) {
        System.out.println("Voy a devolverme");
    }

    @Override
    public void exitRetorno(sintactico.RetornoContext ctx) {
        if (!pila.empty()) {
            tablasDeSimbolos.get(0).setRetorno(pila.pop());
        }
    }

    @Override
    public void enterFunc(sintactico.FuncContext ctx) {
        System.out.println("Tengo una función");

    }

    @Override
    public void exitFunc(sintactico.FuncContext ctx) {

    }
}
