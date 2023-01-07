import java.util.HashMap;

public class EvaluadorDePolinomioListener extends sintacticoBaseListener {

    private HashMap<Character, Float> tablaValores;
    private float numero;
    private float letra;
    private float resultado;
    private char operacionMonomio;
    private char operacionPolinomio;
    private Dato retorno;

    public EvaluadorDePolinomioListener(HashMap<Character, Float> tablaValores, Dato retorno) {
        this.tablaValores = tablaValores;
        this.retorno = retorno;
        operacionPolinomio = '+';
        operacionMonomio = '*';
        numero = 1;
        letra = 1;
        resultado = 0;
    }

    @Override
    public void exitLetras(sintactico.LetrasContext ctx) throws Errores{
        float numericAux;
        for (int i = 0; i < ctx.getText().length(); i++) {
            if (!tablaValores.containsKey(ctx.getText().charAt(i))) {
                throw new Errores(50, ctx.getText().substring(i, i+1));
            }
            numericAux = tablaValores.get(ctx.getText().charAt(i));

            if (operacionMonomio == '*') {
                letra *= numericAux;
            }
            else {
                letra = (float) Math.pow(letra, numericAux);
            }
        }
    }

    @Override
    public void exitNumerico(sintactico.NumericoContext ctx) {
        float numericAux = Float.parseFloat(ctx.getText());

        if (operacionMonomio == '*') {
            numero *= numericAux;
        }
        else {
            letra = (float) Math.pow(letra, numericAux);
        }
    }

    @Override
    public void exitMonomio(sintactico.MonomioContext ctx) {
        float numericAux = numero * letra;

        if (operacionPolinomio == '+') {
            resultado += numericAux;
        }
        else {
            resultado -= numericAux;
        }
        numero = 1;
        letra = 1;
        operacionMonomio = '*';
    }

    @Override
    public void exitOperexp(sintactico.OperexpContext ctx) {
        operacionMonomio = '^';
    }

    @Override
    public void exitOpersumrest(sintactico.OpersumrestContext ctx) {
        operacionPolinomio = ctx.getText().charAt(0);
    }

    @Override
    public void exitPolinomio(sintactico.PolinomioContext ctx) {
        retorno.setLexema(String.valueOf(resultado));
        retorno.setTipo("float");
    }

}
