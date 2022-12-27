import java.util.ArrayList;

public class Funcion {

    private String identificador;               //nombre de la funcion
    private ArrayList<String> tipoArgumentos;   //lista de tipos de parametros
    private String resultado;

    public Funcion(String identificador, ArrayList<String> tipoArgumentos) {
        this.identificador = identificador;
        this.tipoArgumentos = tipoArgumentos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public ArrayList<String> getTipoArgumentos() {
        return tipoArgumentos;
    }

    public int getNumArgumentos() {
        return tipoArgumentos.size();
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
