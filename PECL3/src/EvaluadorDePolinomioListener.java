import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Stack;

public class EvaluadorDePolinomioListener extends sintacticoBaseListener {

    private HashMap<Character, Float> tablaValores;
    private float pilaMonomio;
    private float pilaPolinomio;
    private char operacionMonomio;
    private char operacionPolinomio;
    private Dato retorno;

    public EvaluadorDePolinomioListener(HashMap<Character, Float> tablaValores, Dato retorno) {
        this.tablaValores = tablaValores;
        this.retorno = retorno;
        operacionPolinomio = '+';
        operacionMonomio = '*';
        pilaMonomio = 1;
        pilaPolinomio = 0;
    }

    @Override
    public void enterLetras(sintactico.LetrasContext ctx) {
        System.out.println("Tengo letras");
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
                pilaMonomio *= numericAux;
            }
            else {
                pilaMonomio = (float) Math.pow(pilaMonomio, numericAux);
            }
        }
    }

    @Override
    public void enterNumerico(sintactico.NumericoContext ctx) {
        System.out.println("Tengo un numero");
    }

    @Override
    public void exitNumerico(sintactico.NumericoContext ctx) {
        float numericAux = Float.parseFloat(ctx.getText());

        if (operacionMonomio == '*') {
            pilaMonomio *= numericAux;
        }
        else {
            pilaMonomio = (float) Math.pow(pilaMonomio, numericAux);
        }
    }

    @Override
    public void enterMonomio(sintactico.MonomioContext ctx) {
        System.out.println("Voy a monomiar");
    }

    @Override
    public void exitMonomio(sintactico.MonomioContext ctx) {
        float numericAux = pilaMonomio;

        if (operacionPolinomio == '+') {
            pilaPolinomio += numericAux;
        }
        else {
            pilaPolinomio -= numericAux;
        }
        pilaMonomio = 1;
        operacionMonomio = '*';
    }

    @Override
    public void enterOperexp(sintactico.OperexpContext ctx) {
        System.out.println("Voy a exponenciar");
    }

    @Override
    public void exitOperexp(sintactico.OperexpContext ctx) {
        operacionMonomio = '^';
    }

    @Override
    public void enterOpersumrest(sintactico.OpersumrestContext ctx) {
        System.out.println("Voy a sumar");
    }

    @Override
    public void exitOpersumrest(sintactico.OpersumrestContext ctx) {
        operacionPolinomio = ctx.getText().charAt(0);
    }

    @Override
    public void exitPolinomio(sintactico.PolinomioContext ctx) {
        retorno.setLexema(String.valueOf(pilaPolinomio));
        retorno.setTipo("float");
        System.out.println("RESULTADOOOOOOOOOOOOOO " + retorno.getLexema());
    }

}
