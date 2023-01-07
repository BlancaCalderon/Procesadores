import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Errores {
        String file;
        int opcion;

        try {
            if (args.length < 2) {
                throw new Errores(1);
            }
            file = args[0];
            opcion = Integer.parseInt(args[1]);
            InputStream is = new FileInputStream(file);

            if (opcion == 1 || opcion == 2) {

                CharStream input = CharStreams.fromStream(is);
                lexico lexer = new lexico(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                sintactico parser = new sintactico(tokens);
                parser.setBuildParseTree(true);

                ParseTree tree = parser.axioma();
                HashMap<String, Funcion> tablaFunciones = new HashMap<>();
                AnalizadorVisitor<String> visitor = new AnalizadorVisitor<>(tablaFunciones);
                visitor.visit(tree);

                ArrayList<String> argumentos = new ArrayList<>();
                argumentos.add("texto");
                tablaFunciones.put("print", new Funcion("print", argumentos, null));
                tablaFunciones.put("val", new Funcion("val", null, null));

                String nombreFuncion = tree.getChild(tree.getChildCount() - 3).getChild(1).getText();
                Funcion funcRaiz = tablaFunciones.get(nombreFuncion);

                HashMap<String, Dato> tabla = new HashMap<>();
                for (int i = 0; i < funcRaiz.getNumArgumentos(); i++) {
                    tabla.put(funcRaiz.getIdArgumentos().get(i), new Dato(args[i + 2]));
                }

                TablaSimbolos tablaSimbolos = new TablaSimbolos(tabla, tablaFunciones);
                Stack<String> pilaLlamadas = new Stack<>();
                AnalizadorListener listener = new AnalizadorListener(opcion, tablaSimbolos, pilaLlamadas);

                ParseTreeWalker caminante = new ParseTreeWalker();

                caminante.walk(listener, funcRaiz.getRaiz());
            }
            else {
                throw new Errores(3);
            }

        } catch (NumberFormatException nfe) {
            throw new Errores(3);
        } catch (FileNotFoundException e) {
            throw new Errores(2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (RuntimeException rte) {
            //rte.printStackTrace();
        } catch (Errores e) {
            throw new RuntimeException(e);
        }
    }
}