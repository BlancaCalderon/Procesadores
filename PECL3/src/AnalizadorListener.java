import java.util.Scanner;
import java.util.Stack;

public class AnalizadorListener extends sintacticoBaseListener {

    private int opcion;
    private TablaSimbolos tablaSimbolos;
    private Stack<String> pila;
    private boolean esDeclaracion;

    public AnalizadorListener(int opcion) {
        this.opcion = opcion;
        this.tablaSimbolos = new TablaSimbolos();
        this.pila = new Stack<>();
        esDeclaracion = false;
    }

    public void insertarElemento(String elem) {
        pila.push(elem);
    }

    public void insertarFuncion(Funcion funcion) {
        pila.push(funcion.getIdentificador());
    }

    public String getElemento() {
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
        tablaSimbolos.addElem(ctx.stop.getText(), "", "");
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
        String valAux = pila.pop();

        String tipoAux = "int";                             //Cambiar en el futuro :)

        if (esDeclaracion) {
            tablaSimbolos.addElem(idAux, valAux, tipoAux);
        }
        else {
            if (!tablaSimbolos.containsId(idAux)) {
                System.out.println("Error: No has declarado la variable");
            }
            if (tipoAux != tablaSimbolos.getTipo(idAux) && tablaSimbolos.getTipo(idAux) != "") {
                System.out.println("Error: No se puede convertir el tipo " + tipoAux +
                        " a " + tablaSimbolos.getTipo(idAux));
            }
            else {
                tablaSimbolos.addElem(idAux, valAux, tipoAux);
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
    public void exitSumrestoper(sintactico.SumrestoperContext ctx) {
        int resultado;
        int b = Integer.parseInt(pila.pop());
        int a = Integer.parseInt(pila.pop());

        if (ctx.getChild(1).getText().equals("+")) {
            resultado = a + b;
        }
        else {
            resultado = a - b;
        }

        pila.push(String.valueOf(resultado));
        System.out.println(pila);
    }

    @Override
    public void enterNumerico(sintactico.NumericoContext ctx) {
        System.out.println("Tengo un numero ");
    }

    @Override
    public void exitNumerico(sintactico.NumericoContext ctx) {
        pila.push(ctx.start.getText());
        System.out.println(pila);
    }

    @Override
    public void enterCadena(sintactico.CadenaContext ctx) {
        System.out.println("Tengo una cadena");
    }

    @Override
    public void exitCadena(sintactico.CadenaContext ctx) {
        pila.push(ctx.start.getText());
        System.out.println(pila);
    }

    @Override
    public void exitFunc(sintactico.FuncContext ctx) {
        System.out.println(tablaSimbolos);
    }


}
