/*Clase principal que contiene los atributos automata (AFD) y maquina (MaquinaDeEstados) y
    en la que comporbamos si dos automatasApartado2 de ejemplo son validas
*/
package practica1procesadores;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author blanf
 */
public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException 
   {
       //Definimos variables
        AFD automata = new AFD();
        MaquinaDeEstados maquina = new MaquinaDeEstados(automata);
        String opcion; //Variables que contienen cadenas y opcion elegida por el usuario
        Scanner escaner = new Scanner(System.in);   //Variable usada paar leer datos entrantes del teclado
        String[] automatasApartado1 = {"a(!+a)*(bc*(m+n+o+p+q))(!+(bc*(m+n+o+p+q)))*"}; //Contiene expresión del autómata del apartado 1
        String[] automatasApartado2 = {"(f+F)(u+U)(n+N)(c+C)(i+I)(o+O)(n+N)", "(a+A)(l+L)(g+G)(o+O)(r+R)(i+I)(t+T)(m+M)(o+O)", "(R+r)(e+E)(p+P)(e+E)(t+T)(i+I)(r+R)"}; //Lista de las automatasApartado2 para las tres palabras reservadas (apartado2)
        String[] automatasApartado3 = {"Cadenas", "Reales", "Enteros", "Booleano"}; //Contiene los identificadores de los autómatas del apartado 3
        String[] archivosApartado1 = {"resources/AFD.jff"}; //Contiene el archivo del autómata del apartado 1
        String[] archivosApartado2 = {"resources/AFD_Funcion.jff", "resources/AFD_Algoritmo.jff", "resources/AFD_Repetir.jff"};    //Array que contiene autómatas usados en el apartado 2
        String[] archivosApartado3 = {"resources/AFD_cadenas.jff","resources/AFD_Decimales.jff","resources/AFD_Enteros.jff","resources/AFD_Booleanos.jff",};  //Array que contiene los archivosApartado2 de los automatas del apartado 3
        int continuar = 0; //Variable que indica si continuar dando a elegir usuario una opcion
        
        //Bucle usado para realizar operaciones hast aque usuario indique lo contrario (introduzco -99 y continuar cambie valor)
        while(continuar == 0)
        {
            maquina.limpiarCorrectas(); //Vacia lista que contenia las cadenas correctas de la anterior iteracion
            maquina.limpiarTokens(); //Vacia lista que contiene tokens generados en la anterior iteración
            //Muestra a usuario opciones a elegir
            System.out.println("""
                               Elije que ejercicio quieres realizar introduciendo 1, 2 o 3: 
                               \t1. Comprobar si cadena de entrada cumple con la ER a(!+a)*(bc*(m+n+o+p+q))(!+(bc*(m+n+o+p+q)))* 
                               \t2. Reconocer palabra reservada de PSEInt como valida 
                               \t3. Reconocer que tipo de datos corresponde una entrada
                               \to escribe -99 para terminar""");
            opcion = escaner.nextLine(); //Guarda opcion elegida en la variable
            switch (opcion)
            {
                case "1" -> recogerCadena (opcion,automatasApartado1, archivosApartado1, maquina);  //Función que recoge cadena introducida por usuario y la lleva a analizar
                
                case "2" -> recogerCadena (opcion,automatasApartado2, archivosApartado2, maquina);  //Función que recoge cadena introducida por usuario y la lleva a analizar
                    
                case "3" -> recogerCadena (opcion,automatasApartado3, archivosApartado3, maquina);  //Función que recoge cadena introducida por usuario y la lleva a analizar
       
                case "-99" -> 
                {
                    System.out.println("Ha pulsado salir. Hasta otra \n");
                    continuar = 1;  //Cambia variable continuar para salir del bucle y terminar ejecución
                }
                    
                default -> System.out.println("Introduce una opcion valida \n");
            }          
        }
   }
    
    //Función que muestra a usuario que opación ha seleccionado y recoge cadena de entrada por teclado mandandola a analizar
    public static void recogerCadena (String opcion, String[] automatas, String[] archivos, MaquinaDeEstados maquina) throws ParserConfigurationException, SAXException
    {
        String cadena; //Variable dónde se guaradrá cadena introducida por el usuario por teclado
        Scanner escaner = new Scanner(System.in);   //Variable usada paar leer datos entrantes del teclado
        System.out.println("Ha seleccionado la opcion " + opcion + ". Introduce cadena a analizar: \n");    //Muestra por pantalla opción elegida y pide cadena de entrada
        cadena = escaner.nextLine();   //Recoge cadena introducida por teclado
        analizarAutomatas (cadena, automatas, archivos, maquina);
    }
    
    //Función contiene bloque de código para analizar cadena con varios autómatas
    public static void analizarAutomatas (String cadena, String[] automatas, String[] archivos, MaquinaDeEstados maquina) throws ParserConfigurationException, SAXException
    {
        //Mientras la cadena a analizar no este vacia realizamos análisis
        while(!cadena.isEmpty())
        {
            for (int i = 0; i < automatas.length; i++)
            {
                cadena = analizarUnAutomata (cadena, automatas [i], archivos [i], maquina);
            }
            //Se ha analizado cadena en todos los autómatas
            if (!cadena.isEmpty()) 
            {
                cadena = cadena.substring(1); //Si la cadena no es vacia quitamos primer caracter para avanzar en el análisis
            }
        }
        mostrarResultados(maquina,cadena); //Llama a función para mostrar por pantalla los resultados
    }
    
    //Función que contiene bloque de código para analizar cadena con un solo automata
    public static String analizarUnAutomata (String cadena, String automata, String archivo, MaquinaDeEstados maquina) throws ParserConfigurationException, SAXException
    {
        System.out.println("Comprobando para expresion " + automata);
        if (!automata.equals("Cadenas"))    //Si no estamos analizando con el autómata de las cadenas importamos autómta del archivo jff en la maquina de estados
        {
            importarArchivo (archivo, maquina); //Llama a función para importar archivo jff
        } 
        else    //Si analizamos con autómata de las cadenas
        {
            maquina.crearMatrizCadena();    //Crea la matriz del autómata de las cadenas
        }
        return maquina.comprobarCadenas(cadena, automata);    //Comprobamos cadena y la sustituimos por la parte que no sea valida para este automata
    }
    
   //Función que muestra resultados por pantalla
   public static void mostrarResultados (MaquinaDeEstados maquina, String cad)
   {
        System.out.println("Palabras reservadas encontradas: " + maquina.getCorrectas().toString());    //Muestra pro pantalla las cadenas correctas
        for (String token : maquina.getTokens())    //Recorre lista de tokens generados
        {
            System.out.println(token);   //Imprime token generado por pantalla
        }
   }
   
   //Función que carga archivo jff a partir de su nombre para importar matriz
   public static void importarArchivo (String nombre, MaquinaDeEstados maquina) throws ParserConfigurationException, SAXException
   {
       File inputFile = new File(nombre);   //Carga el archivo con el nombre del automata
       maquina.importarMatriz(inputFile); //Importamos la matriz de transiciones del automata idnicado
   }
}
