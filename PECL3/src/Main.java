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
    public static void main(String[] args) {
        String file;
        int opcion;

        /*if (args.length != 2) {
            System.out.println("Error número de argumentos incorrectos");
            return;
        }*/

        opcion = 2;//Integer.parseInt(args[1]);
        file = "./src/resources/prueba.txt";

        try {

            InputStream is = new FileInputStream(file);

            if (opcion == 1 || opcion == 2) {

                CharStream input = CharStreams.fromStream(is);
                lexico lexer = new lexico(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                sintactico parser = new sintactico(tokens);
                parser.setBuildParseTree(true);

                ParseTree tree = parser.axioma();
                HashMap<String, Funcion> tablaFunciones = new HashMap<>();
                AnalizadorVisitor visitor = new AnalizadorVisitor(tablaFunciones);
                visitor.visit(tree);

                ArrayList<String> argumentos = new ArrayList<>();
                argumentos.add("texto");
                tablaFunciones.put("print", new Funcion("print", argumentos, null));
                tablaFunciones.put("val", new Funcion("val", null, null));
                System.out.println(tablaFunciones.toString());

                HashMap<String, Dato> tabla = new HashMap<>();
                TablaSimbolos tablaSimbolos = new TablaSimbolos(tabla, tablaFunciones);
                Stack<String> pilaLlamadas = new Stack<>();
                AnalizadorListener listener = new AnalizadorListener(opcion, tablaSimbolos, pilaLlamadas);

                ParseTreeWalker caminante = new ParseTreeWalker();

                String nombreFuncion = tree.getChild(tree.getChildCount() - 3).getChild(1).getText();
                System.out.println(nombreFuncion);
                Funcion funcRaiz = tablaFunciones.get(nombreFuncion);
                caminante.walk(listener, funcRaiz.getRaiz());
            }
            else {
                System.out.println("Opcion incorrecta");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}