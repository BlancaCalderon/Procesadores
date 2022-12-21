import java.util.Scanner;
import java.util.Stack;

public class AnalizadorListener extends sintacticoBaseListener {

    private int opcion;
    private TablaSimbolos tablaSimbolos;
    private Stack<Dato> pila;
    private boolean esDeclaracion;

    public AnalizadorListener(int opcion) {
        this.opcion = opcion;
        this.tablaSimbolos = new TablaSimbolos();
        this.pila = new Stack<>();
        esDeclaracion = false;
    }

    public void insertarElemento(Dato elem) {
        pila.push(elem);
    }

    public Dato getElemento() {
        return pila.pop();
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

    public boolean stop() {
        if (opcion == 2) {
            Scanner input = new Scanner(System.in);
            mostrarMenu();
        }
        return true;
    }

    @Override
    public void enterLetIdentificador(sintactico.LetIdentificadorContext ctx) {
        System.out.println("Voy a declarar");
        tablaSimbolos.addElem(ctx.stop.getText(), new Dato());
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
            tablaSimbolos.addElem(idAux, valAux);
        }
        else {
            if (!tablaSimbolos.containsId(idAux)) {
                System.out.println("Error: No has declarado la variable");
            }
            if (valAux.getTipo() != tablaSimbolos.getTipo(idAux) && tablaSimbolos.getTipo(idAux) != "") {
                System.out.println("Error: No se puede convertir el tipo " + valAux.getTipo() +
                        " a " + tablaSimbolos.getTipo(idAux));
            }
            else {
                tablaSimbolos.addElem(idAux, valAux);
            }
        }
        esDeclaracion = false;
    }

    @Override
    public void enterSumrestoper(sintactico.SumrestoperContext ctx) {
        System.out.println("Voy a sumar");
        System.out.println(ctx.start);
        System.out.println(ctx.stop);
    }

    @Override
    public void exitSumrestoper(sintactico.SumrestoperContext ctx) throws Exception {
        Dato b = pila.pop();
        Dato a = pila.pop();
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
                System.out.println("No se pueden restar cadenas");
            }
        }
        else {
            throw new Exception("No se puede realizar la operacion modulo y exponente para los tipos " + a.getTipo() + " " + b.getTipo());
        }

        pila.push(new Dato(resultado));
        System.out.println(pila);
    }

    @Override
    public void enterMuldivoper(sintactico.MuldivoperContext ctx) {
        System.out.println("Voy a multiplicar");
        System.out.println(ctx.start);
        System.out.println(ctx.stop);
    }

    @Override public void exitMuldivoper(sintactico.MuldivoperContext ctx) {
        String resultado = "";
        Dato b = pila.pop();
        Dato a = pila.pop();

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
            System.out.println("No se puede realizar la operacion modulo y exponente para los tipos " + a.getTipo() + " " + b.getTipo());
        }

        pila.push(new Dato(resultado));
        System.out.println(pila);
    }

    @Override public void enterModexpoper(sintactico.ModexpoperContext ctx) {
        System.out.println("Voy a modular/exponenciar");
        System.out.println(ctx.start);
        System.out.println(ctx.stop);
    }

    @Override public void exitModexpoper(sintactico.ModexpoperContext ctx) {
        int resultado = 0;
        Dato b = pila.pop();
        Dato a = pila.pop();
        if (a.getTipo().equals("int") && b.getTipo().equals("int")) {
            if (ctx.getChild(1).getText().equals("%")) {
                resultado = Integer.parseInt(a.getLexema()) % Integer.parseInt(b.getLexema());
            } else {
                resultado = (int) Math.pow(Integer.parseInt(a.getLexema()), Integer.parseInt(b.getLexema()));
            }
        }
        else {
            System.out.println("No se puede realizar la operacion modulo y exponente para los tipos " + a.getTipo() + " " + b.getTipo());
        }
        pila.push(new Dato(String.valueOf(resultado)));
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
    public void exitFunc(sintactico.FuncContext ctx) {
        System.out.println(tablaSimbolos);
    }
}
