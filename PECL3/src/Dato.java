import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Dato {

    private String lexema;
    private String tipo;
    private sintactico.PoliContext arbol;

    public Dato() {
        this.lexema = "null";
        this.tipo = "null";
    }

    public Dato(sintactico.PoliContext arbol) {
        this.lexema = arbol.getText().substring(1, arbol.getText().length() - 1);
        this.arbol = arbol;
        this.tipo = "polinomio";
    }

    public Dato(String lexema) {
        this.lexema = lexema;
        this.tipo = caster(lexema);
        if (this.tipo.equals("polinomio")) {
            this.lexema = lexema.substring(1, lexema.length()-1);
            this.arbol = construirArbol(lexema);
        }
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

    public sintactico.PoliContext getArbol() {
        return arbol;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setArbol(sintactico.PoliContext arbol) {
        this.arbol = arbol;
    }

    private sintactico.PoliContext construirArbol(String lexemaPolinomio) {
        CharStream input = CharStreams.fromString(lexemaPolinomio);
        lexico lexer = new lexico(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sintactico parser = new sintactico(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expr();
        return (sintactico.PoliContext) tree;
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
                else if (variable.charAt(0) == '\'') {
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
