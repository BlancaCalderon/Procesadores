import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnalizadorVisitor<T> extends sintacticoBaseVisitor{

    private HashMap<String, Funcion> tablaFunciones;

    public AnalizadorVisitor(HashMap<String, Funcion> tablaFunciones) {
        this.tablaFunciones = tablaFunciones;
    }

    @Override
    public T visitAxioma(sintactico.AxiomaContext ctx) {
        for (int i = 0; i < ctx.getChildCount() - 1; i = i + 2) {
            this.visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public T visitFunc(sintactico.FuncContext ctx) {
        String nombre = ctx.getChild(1).getText();
        ArrayList<String> parametros;
        try {
            parametros = new ArrayList<>(Arrays.asList(ctx.cuerpofuncion().parametros().getText().split(",")));
        }
        catch (NullPointerException npe) {
            parametros = new ArrayList<>();
        }
        Funcion funcion = new Funcion(nombre, parametros, ctx);

        tablaFunciones.put(nombre, funcion);

        return null;
    }
}
