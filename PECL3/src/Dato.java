public class Dato {

    private String lexema;
    private String tipo;

    public Dato() {
        this.lexema = "null";
        this.tipo = "null";
    }

    public Dato(String lexema) {
        this.lexema = lexema;
        this.tipo = caster(lexema);
    }

    public Dato(String lexema, String tipo) {
        this.lexema = lexema;
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public  String caster(String variable) {
        try {
            Integer.parseInt(variable);
            return "int";

        } catch (NumberFormatException nfe) {
            try {
                Float.parseFloat(variable);
                return "float";

            } catch (NumberFormatException nfe2) {
                if (variable.equals("true") || variable.equals("false")) {
                    return "boolean";
                }
                else if (variable.charAt(0) == '\'' && variable.charAt(variable.length() - 1) == '\'') {
                    return "polinomio";
                }
                else {
                    return "String";
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Dato{" +
                "lexema='" + lexema + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
