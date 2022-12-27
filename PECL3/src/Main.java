import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        String file;
        int opcion;
        System.out.println("hola");
        System.out.println("Adios");

        /*if (args.length != 2) {
            System.out.println("Error número de argumentos incorrectos");
            return;
        }*/

        opcion = 1;//Integer.parseInt(args[1]);
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

                AnalizadorListener listener = new AnalizadorListener(opcion);
                ParseTreeWalker caminante = new ParseTreeWalker();

                caminante.walk(listener, tree);
            }
            else {
                System.out.println("Opcion incorrecta");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Fin del programa por error");
        }
    }
}