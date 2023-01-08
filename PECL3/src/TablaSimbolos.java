import java.util.HashMap;

public class TablaSimbolos {

    //Tabla de simbolos --> identificador{valor, tipo}
    private HashMap<String, Dato> tabla;
    private HashMap<String, Funcion> tablaFunciones;
    private Dato retorno;

    public TablaSimbolos() {
        tabla = new HashMap<>();
        tablaFunciones = new HashMap<>();
        retorno = null;
    }

    public TablaSimbolos(HashMap<String, Dato> tabla, HashMap<String, Funcion> tablaFunciones) {
        this.tabla = tabla;
        this.tablaFunciones = tablaFunciones;
        this.retorno = null;
    }

    public void addElem(String id, Dato dato) {
        tabla.put(id, dato);
    }

    public Dato getDato(String id) {
        return tabla.get(id);
    }

    public Dato getRetorno() {
        return retorno;
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

    public HashMap<String, Funcion> getTablaFunciones() {
        return tablaFunciones;
    }

    public void setRetorno(Dato retorno) {
        this.retorno = retorno;
    }

    /**
     * Metodo para obtener los datos de una funcion
     * @param id
     * @return
     */
    public Funcion getFuncion(String id) {
        return tablaFunciones.get(id);
    }

    public void mostrarTablaSimbolo() {
        for (HashMap.Entry<String, Dato> set : tabla.entrySet()) {
            System.out.println(set.getKey() + " - " + set.getValue().getLexema());
        }
    }
    @Override
    public String toString() {
        return "TablaSimbolos{" +
                "tabla=" + tabla +
                ", tablaFunciones=" + tablaFunciones +
                '}';
    }
}
