import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class Funcion {

    private String identificador;               //nombre de la funcion
    private ArrayList<String> idArgumentos;     //lista de tipos de parametros
    private ParseTree raiz;

    public Funcion(String identificador, ArrayList<String> idArgumentos, ParseTree raiz) {
        this.identificador = identificador;
        this.idArgumentos = idArgumentos;
        this.raiz = raiz;
    }

    public String getIdentificador() {
        return identificador;
    }

    public ArrayList<String> getIdArgumentos() {
        return idArgumentos;
    }

    public int getNumArgumentos() {
        return idArgumentos.size();
    }

    public ParseTree getRaiz() {
        return raiz;
    }

    public void setRaiz(ParseTree raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "identificador='" + identificador + '\'' +
                ", idArgumentos=" + idArgumentos +
                ", raiz=" + raiz +
                '}';
    }
}
