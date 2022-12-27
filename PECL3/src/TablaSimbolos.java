import java.util.HashMap;

public class TablaSimbolos {

    //Tabla de simbolos --> identificador{valor, tipo}
    private HashMap<String, Dato> tabla;
    private HashMap<String, Funcion> tablaFunciones;

    public TablaSimbolos() {
        tabla = new HashMap<>();
        tablaFunciones = new HashMap<>();
    }

    public void addElem(String id, Dato dato) {
        tabla.put(id, dato);
    }

    public Dato getDato(String id) {
        return tabla.get(id);
    }

    public String getValor(String id) {
        return tabla.get(id).getLexema();
    }

    public boolean containsId(String id) {
        return tabla.containsKey(id);
    }

    /**
     * Metodo que obtiene el tipo de un identificador
     * @param id
     * @return
     */
    public String getTipo(String id) {
        return tabla.get(id).getTipo();
    }

    public int getTamTabla() {
        return tabla.size();
    }

    public void setElem(String id, Dato dato) {
        if (getTipo(id).equals(dato.getTipo())) {
            addElem(id, dato);
        }
        else {
            System.out.println("Tipo no valido");
        }
    }

    /**
     * Metodo que elimina una entrada en la tabla de paginas
     * @param id
     */
    public void removeElem(String id) {
        tabla.remove(id);
    }

    /**
     * Metodo que añade datos de una funcion a la tabla
     * @param id
     * @param funcion
     */
    public void addFuncion(String id, Funcion funcion) {
        tablaFunciones.put(id, funcion);
    }

    /**
     * Metodo para obtener los datos de una funcion
     * @param id
     * @return
     */
    public Funcion getFuncion(String id) {
        return tablaFunciones.get(id);
    }

    /**
     * Metodo para eliminar la entrada de una funcion
     * @param id
     */
    public void removeFuncion(String id) {
        tablaFunciones.remove(id);
    }

    @Override
    public String toString() {
        return "TablaSimbolos{" +
                "tabla=" + tabla +
                ", tablaFunciones=" + tablaFunciones +
                '}';
    }
}