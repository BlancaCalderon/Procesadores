import java.util.HashMap;

public class TablaSimbolos {

    //Tabla de simbolos --> identificador{valor, tipo}
    private HashMap<String, HashMap<String, String>> tabla;
    private HashMap<String, Funcion> tablaFunciones;

    public TablaSimbolos() {
        tabla = new HashMap<>();
        tablaFunciones = new HashMap<>();
    }

    /**
     * Metodo que introduce un elemento en la tabla
     * @param id
     * @param valor
     * @param tipo
     */
    public void addElem(String id, String valor, String tipo) {
        HashMap<String, String> datos = new HashMap<>();
        datos.put("valor", valor);
        datos.put("tipo", tipo);

        tabla.put(id, datos);
    }

    /**
     * Metodo que obtiene el valor de identificador
     * @param id
     * @return
     */
    public String getValor(String id) {
        return tabla.get(id).get("valor");
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
        return tabla.get(id).get("tipo");
    }

    /**
     * Metodo que modifica el valor de un identificador
     * @param id
     * @param valor
     * @param tipo
     */
    public void setElem(String id, String valor, String tipo) {
        if (getTipo(id).equals(tipo)) {
            addElem(id, valor, tipo);
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
