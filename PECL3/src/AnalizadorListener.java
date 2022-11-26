import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AnalizadorListener extends sintacticoBaseListener {

    private int opcion;
    private TablaSimbolo tablaSimbolos;
    private Queue<String> pila = new LinkedList<>();

    public AnalizadorListener(int opcion) {
        this.opcion = opcion;
    }

    public void insertarElemento(String elem) {
        pila.add(elem);
    }

    public void insertarFuncion(Funcion funcion) {
        pila.add(funcion.getIdentificador());
    }

    public String getElemento() {
        return pila.remove();
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


}
