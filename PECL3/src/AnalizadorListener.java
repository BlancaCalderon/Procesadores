import org.antlr.v4.runtime.RuleContext;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class AnalizadorListener extends sintacticoBaseListener {

    private int opcion, ambito;
    private HashMap<Integer, TablaSimbolos> tablasDeSimbolos;
    private Stack<Dato> pila;
    private boolean esDeclaracion;

    public AnalizadorListener(int opcion) {
        this.ambito = -1;
        this.opcion = opcion;
        this.tablasDeSimbolos = new HashMap();
        this.pila = new Stack<>();
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
        for (int i = 0; i < tablasDeSimbolos.size(); i++) {
            if (tablasDeSimbolos.get(i).containsId(id)) {
                if (!tablasDeSimbolos.get(i).getDato(id).getTipo().equals("null")) {
                    return tablasDeSimbolos.get(i).getDato(id);
                }
                throw new Errores(11);
            }
        }
        throw new Errores(10);
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
    public void exitAsig(sintactico.AsigContext ctx) {
        System.out.println("Voy a realizar una asignacion");
        String idAux = ctx.start.getText();
        Dato valAux = pila.pop();

        if (esDeclaracion) {
            tablasDeSimbolos.get(ambito).addElem(idAux, valAux);
        }
        else {
            if (!tablasDeSimbolos.get(ambito).containsId(idAux)) {
                System.out.println("Error: No has declarado la variable");
            }
            if (valAux.getTipo() != tablasDeSimbolos.get(ambito).getTipo(idAux) && tablasDeSimbolos.get(ambito).getTipo(idAux) != "") {
                System.out.println("Error: No se puede convertir el tipo " + valAux.getTipo() +
                        " a " + tablasDeSimbolos.get(ambito).getTipo(idAux));
            }
            else {
                tablasDeSimbolos.get(ambito).addElem(idAux, valAux);
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

        

        boolean encontrado = false;
        int hijo = 0;
        for (int i = 0; i < ctx.children.size() && !encontrado; i++) {
            if (ctx.getChild(i).getText().charAt(0) == '{') {
                encontrado = true;
                hijo = i;
            }
        }

        ctx.children.remove(hijo);
    }

    @Override
    public void exitCondicion(sintactico.CondicionContext ctx) {

    }

    @Override
    public void enterCuerpocondicion(sintactico.CuerpocondicionContext ctx) {
        System.out.println("Voy a realizar una condicion");
    }

    @Override
    public void exitCuerpocondicion(sintactico.CuerpocondicionContext ctx) throws Errores {
        Dato resCondicion = pila.pop();
        if (resCondicion.getTipo().equals("boolean")) {
            pila.push(resCondicion);
        }
        else {
            throw new Errores(30);
        }
    }

    @Override
    public void enterBloque(sintactico.BloqueContext ctx) {
        System.out.println("Voy a cambiar de ambito");
        ambito++;
        tablasDeSimbolos.put(ambito, new TablaSimbolos());
    }

    @Override
    public void exitBloque(sintactico.BloqueContext ctx) {
        System.out.println("TABLACONAMBITOS");
        System.out.println(pila);
        for (int i = 0; i <tablasDeSimbolos.size(); i++) {
            System.out.println(tablasDeSimbolos.get(i));
        }

        for (int i = 0; i < tablasDeSimbolos.get(ambito).getTamTabla(); i++) {
            pila.pop();
        }

        tablasDeSimbolos.remove(ambito);
        ambito--;
    }

    @Override public void enterIdentificador(sintactico.IdentificadorContext ctx) {
        System.out.println("Tengo una variable");
    }

    @Override public void exitIdentificador(sintactico.IdentificadorContext ctx) {
        pila.push(new Dato(ctx.start.getText(), "var"));
        System.out.println(pila);
    }

    @Override
    public void enterNumerico(sintactico.NumericoContext ctx) {
        System.out.println("Tengo un numero ");
    }

    @Override
    public void exitNumerico(sintactico.NumericoContext ctx) {
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
        pila.push(new Dato(ctx.getText()));
        System.out.println(pila);
    }

    @Override
    public void enterFunc(sintactico.FuncContext ctx) {
        System.out.println("Tengo una función");

    }

    @Override
    public void exitFunc(sintactico.FuncContext ctx) {

    }
}
