/*Clase que representa la máquina de estados asociada al autómata determinista, 
sus atributos son estadoActual (entero) y automata(AFD) y sus funciones inicializar(), 
aceptaCaracter(carácter), isFinal(), comprobarCadena(cadena). 
 */
package practica1procesadores;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author blanf
 */
public class MaquinaDeEstados {
    //Definimos las variables
    private Integer estadoActual;   //Variable que contiene estado en el que nos encontramos actuamente
    private AFD automata;   //Variable representa al automata determinista
    private ArrayList <String> correctas = new ArrayList<String>(); //Lista que guarda cadenas correctas
    private ArrayList <String> tokens = new ArrayList<String>(); //Lista que guarda tokens generados por el automata

    //Constructor de la clase
    public MaquinaDeEstados ( AFD automata) 
    {
        this.automata = automata;
    }

    //Constructor vacio
    public MaquinaDeEstados () { }

    //Función que devuelve valor del estado actual
    public Integer getEstadoActual () 
    {
        return estadoActual;
    }

    //Función que establece el valor de variable estadoActual
    public void setEstadoActual (Integer estadoActual) 
    {
        this.estadoActual = estadoActual;
    }

    //Función que devuelve el automata
    public AFD getAutomata () 
    {
        return automata;
    }

    //Función que establece el automata
    public void setAutomata (AFD automata) 
    {
        this.automata = automata;
    }

    //Función que devuelve lista de cadenas correctas
    public ArrayList<String> getCorrectas() 
    {
        return correctas;
    }

    //Función que establece lista de cadenas correctas
    public void setCorrectas(ArrayList<String> correctas) {
        this.correctas = correctas;
    }
    
    //Función que inicializa estado actual
    public void inicializarEstadoActual ()
    {
        estadoActual = automata.getEstadoInicial(); //Inicializa valor de la variable al estado inicial del automata
    }

    //Función que devuelve lista de tokens generados
    public ArrayList<String> getTokens() 
    {
        return tokens;
    }

    //Función que establece lista de tokens generados
    public void setTokens(ArrayList<String> tokens) 
    {
        this.tokens = tokens;
    }
    
    //Función que indica si estado pasado es final
    public boolean isFinal (Integer estado)
    {
        return automata.isFinal(estado); //Comprueba si es final llamando a la función isFinal de la clase AFD
    }
    
    //Función que limpia array que guarda cadenas correctas
    public void limpiarCorrectas ()
    {
        correctas.clear();  //Vacia array
    }   
    
    //Función que vacia lista de tokens generadas por los autómatas
    public void limpiarTokens ()
    {
        tokens.clear(); //Vacia lista de tokens
    }
   
    //Función que comprueba la cadena completa en todos los autómatas
    public String comprobarCadenas (String cadena, String tipoAutomata)
    {
        String palabra = "", posibleCorrecta = ""; //Variables que guardan las palabra a analizar,la incorrecta que vamos formando  y la posible correcta
        char[] array = cadena.toCharArray();    //Separa cadena de entrada en caracteres
        int estado = automata.getEstadoInicial();

        for(int i = 0; i < array.length; i++)  //Bucle que recoore todos los caracteres de la cadena
        {   
            if(aceptaCaracter(array[i], estado))    //Comprueba si caracter es valido
            {
                estado = automata.getSiguienteEstado(estado, array[i]);  //Cambia estado al siguiente al que pasariamos con ese caracter 
                palabra = palabra + array[i];   //Almacena palabra que van formando los caracteres correctos
                if(automata.isFinal(estado))    //Sicon este caracter se alcanza estado final puede ser palabra correcta aunque caracter erroneo este mas adelante
                {
                    posibleCorrecta = array[i] + " "; //Palabra que puede ser correcta si no hay una palabra mas larga que tambien sea correcta
                }
            }                                                            
            else    //Si caracter no es valido
            {
                System.out.println("<ERROR, " + array[i] + ">");   //Imprime token cuando caracter es incorrecto
                return  comprobarValidez (estado, palabra, posibleCorrecta, tipoAutomata, cadena); //Llama a la función comprobarValidez que devuelve parte de la cadena que no se correspondía con el autómata y la devolvemos como valor de retorno
            }
        }
         return  comprobarValidez (estado, palabra, posibleCorrecta, tipoAutomata, cadena); //Llama a la función comprobarValidez que devuelve parte de la cadena que no se correspondía con el autómata y la devolvemos como valor de retorno
    }
    
    //Función que comprueba la validez de la palabra formada y de una más corta posible
    public String comprobarValidez (int estado, String palabra, String posibleCorrecta, String tipoAutomata, String cadena)
    {
        if(automata.isFinal(estado)) //Comprueba si palabra formada es una cadena correcta mirando si ha llegado ha estado final
        {
            cadena = almacenarCorrecta(palabra, tipoAutomata, cadena); //Llama a función almacenaCorrecta para hacer operaciones correspondientes cuando palabra es correcta  
        }
        else
        {
            if(!posibleCorrecta.isEmpty())  //Si la variable que guarad posible palabra correcta no esta vacia
            {
                cadena = almacenarCorrecta(posibleCorrecta, tipoAutomata, cadena);  //Llama a función almacenaCorrecta para hacer operaciones correspondientes cuando palabra es correcta
            }
        }
        return cadena;
    }
    
    //Función que gestiona la cadena cuando es correcta
    public String almacenarCorrecta (String palabra, String tipoAutomata, String cadena)
    {
        correctas.add(palabra); //Añadimos palabra correcta a la lista de palabras correctas
        tokens.add("<"+ tipoAutomata + ", " + palabra + ">");   //Crea token y lo introduce en la lista que contiene todos los tokens generados por el autómata 
        return cadena.replaceFirst(palabra, "/");   //Devuelve cadena que queda tras quitar la parte correcta y cambiarla por caracter / (para diferenciar sepearación original)
    }
    
    //Función que comprueba si sen acepta un caracter en la expresion regular
    public boolean aceptaCaracter (char c, Integer estado)
    {
        if (!(automata.getAlfabetoAutomata().contains(c))) //Si caracter no se encuentra en el alfabeto del automata
        {
            return false;   //Devuelve que caracter nos es valido
        }
        return automata.getMatriz().get(estado).keySet().contains(c); //Devuelve si estado tiene algun valor cuya clave sea caracter pasado (si transición con ese caracter es válida)
    }
    
    //Función que genera la matriz a partir de un archivo indicado que contiene el automata determinista
    public void importarMatriz(File inputFile) throws ParserConfigurationException, SAXException {
        try {
            limpiarAnterior(); //Llama a función para limpiar datos del automata anterior
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = (Document) dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList estados = doc.getElementsByTagName("state");   //Coge los elementos del archivo que correspondan a los estados de la matriz (tag = 'id')
            NodeList transiciones = doc.getElementsByTagName("transition"); //Guarda los elementos correspondientes a las transiciones (tag = 'transition')
            for (int i = 0; i < estados.getLength(); i++)   //Bucle que recorre la cantidad de nodos estados que tenemos
            {
                Node nNode = estados.item(i);   //Recoge nodo i de la lista de nodos estados
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element e = (Element) nNode;
                    automata.cargarEstados(Integer.parseInt(e.getAttribute("id"))); //Llama a la función del autómata para cargar los estados del autómata mandando solo su identificador (nº que los identifica)
                    if(e.getElementsByTagName("final").item(0) != null) //Comprueba si estado es final (si tag del elemento es 'final)
                    {
                        automata.establecerEstadoFin(Integer.parseInt(e.getAttribute("id")));   //Introduce el estado final en la lista
                    }
                    if(e.getElementsByTagName("initial").item(0) != null)   //Comprueba si el estado es inicial (si tag del elemento es 'initial')
                    {
                        automata.establecerEstadoIni(Integer.parseInt(e.getAttribute("id")));   //Introduce estado inicial a la lista
                    }
                }
            }
            automata.inicializarMatriz();   //Llama a la función para inicializar la matriz
            for (int i = 0; i < transiciones.getLength(); i++) {    //Recorre la lista de transiciones de la matriz
                int estadoBase, estadoSig;  //Variables que contienen el estado actualy al que pasaremos
                char c;     //Variable que contiene caracter actual
                Node nNode = transiciones.item(i);  //Coge transición i
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    estadoBase = Integer.parseInt(e.getElementsByTagName("from").item(0).getTextContent()); //Guarda el estado en el que nos encontramos indicado por etiqueta from
                    estadoSig= Integer.parseInt(e.getElementsByTagName("to").item(0).getTextContent()); //Guarda estado siguiente tras transicionar indicado por eqtiqueta to
                    c = e.getElementsByTagName("read").item(0).getTextContent().charAt(0);  //Guarda el caracter con el que hacemos transición
                    automata.cargarMatriz(estadoBase, c, estadoSig);    //LLama a la función para cargar matyriz con el estado base, el carater con el que transicionamos y al estado al que iriíamos a partir de los dos anteriores
                    automata.cargarAlfabeto(c); //Llama a la función cargar alfabeto para introducir caracter encontrado en el alfabeto
                    
                }
            }
            
        } 
        catch (IOException | NumberFormatException | ParserConfigurationException | DOMException | SAXException e) 
        {
            System.out.println("Excepcion al importar la matriz");
        }
    }
    
    //Función que limpia valores anteriores de la matriz del automata (estados, estados finales y alfabeto)
    public void limpiarAnterior ()
    {
        automata.limpiarAlfabeto(); //Limpia alfabeto por si se hubiese rellenado con otro automata anteriormente
        automata.limpiarEstadoFin();
        automata.limpiarEstados();
    }
    
    //Fubción que crea la matriz para el autómata cadebas
    public void crearMatrizCadena ()
    {
        limpiarAnterior(); //Llama a función para limpiar datos del automata anterior
        int limiteEstados = 259, estadoFinal = 257, estadoFinal2 = 258;  //Variable que almacena el numero maximo de estados que tendremos (en ASCII extendidos serán 258 = 253 (quitando " y ') + 2 para " + 2 para ' + inicial) y el valor de los dos estados finales
        for (int i = 0; i < limiteEstados; i++)   //Recorremos número de estados 
        {
            automata.cargarEstados(i); //Llama a la función del autómata para cargar los estados del autómata
        }
        automata.establecerEstadoFin(estadoFinal);   //Introduce el estado final 257 en la lista
        automata.establecerEstadoFin(estadoFinal2);   //Introduce el estado final 258 en la lista
        automata.establecerEstadoIni(0);   //Introduce estado inicial a la lista
        automata.inicializarMatriz();   //Llama a la función para inicializar la matriz
  
        automata.cargarAscii(); //Llama a función para generar alfabeto ASCII
        automata.setAlfabetoAutomata(automata.getAlfabeto());   //Establece alfabeto del automata como el ASCII
        
        //Cargamos en la matriz los dos estados de los que partimos al detectar las primeras " o '
        automata.cargarMatriz(0,'\"', 1);    //LLama a la función para cargar en matriz el estado base y el carater " con el que transicionamos y el estado al que iriíamos a partir de los dos anteriores
        automata.cargarMatriz(0,'\'', 2);   //LLama a la función para cargar matriz con el estado base, el carater ' con el que transicionamos y al estado al que iríamos a partir de los dos anteriores
       
        for (int i = 3; i < limiteEstados; i++)  //Bucle para las transiciones con los caracteres ASCCII de una a otras y repeticion (empieza en 3 ya que es el primer estado con el que pasamos con un caracter ascii)
        {
            int estadoBase, estadoSiguiente;  //Estado en el que nos encontramos, al que pasaremos con el caracter 
            char c; //Caracter con el que se realiza transicion
            c = (char) (i-3); //Pasa entero a su ASCII correspondiente (i-3 porque bucle comienza en estado 3 pero caracteres ASCII en 0)
            estadoBase = i; //El estado base sera la variable i para avanzar en cada iteración
            
            if (c != '\''  && c != '\"')    //Si los caracteres no son ni " ni '
            {
                automata.cargarMatriz(estadoBase, '\'', estadoFinal);  //Une nodo actual con el final '
                automata.cargarMatriz(estadoBase, '\"', estadoFinal2);  //Une nodo actual con el final "
                for (int j = 3; j < limiteEstados; j++) //Bucle para los etados siguientes
                {
                    estadoSiguiente = j; //Guarda estado al que pasaremos, en este caso variable j ya que recorreremos todos los estados
                    if(estadoSiguiente == estadoFinal && estadoBase != estadoFinal && estadoBase != estadoFinal2)    //Si el siguiente estado es final y estado base no es final
                    {
                        unionConSiguiente (c, estadoBase, 37); //Sustituye estado Siguiente por el 37 (el qeu orresponderia al caracter ")
                    }
                    if(estadoBase == estadoFinal && estadoSiguiente != estadoFinal && estadoSiguiente != estadoFinal2)   //Si estado base es final y estado siguiente no es final
                    {
                        automata.cargarMatriz(37, c, estadoSiguiente); //Carga en matriz la transición del estado 37 al siguiente con caracter ASCII
                    }
                    if(estadoSiguiente == estadoFinal2 && estadoBase != estadoFinal && estadoBase != estadoFinal2) //Si el siguiente estado es final y estado base no es final
                    {
                         unionConSiguiente (c, estadoBase, 99);    //Sustituye estado Siguiente por el 99 (el qeu orresponderia al caracter ")
                    }
                    if(estadoBase == estadoFinal2 && estadoSiguiente != estadoFinal && estadoSiguiente != estadoFinal2)  //Si estado base es final y estado siguiente no es final
                    {
                        automata.cargarMatriz(99, c, estadoSiguiente); //Carga en matriz la transición del estado 99 al siguiente con caracter ASCII
                    }
                    if(estadoSiguiente != estadoFinal && estadoSiguiente != estadoFinal2 && estadoBase != estadoFinal && estadoBase != estadoFinal2)    //Si ni el estado actual ni el siguiente es final
                    {
                        automata.cargarMatriz(estadoBase, c, estadoSiguiente);    //Guarda transición del  nodo actual con el resto de nodos
                        unionConSiguiente (c, estadoSiguiente, estadoBase); //Llama a función para unir estados 1, 2 y estadoBase pasado con un siguiente especificado
                    }
                }
            }
        }
    }
    
    //Función que hace carga en matriz la unión de estados 1,2 y estadoBase con un estado siguiente especifico
    public void unionConSiguiente (char caracter, int estadoBase, int estadoCambio)
    {
        automata.cargarMatriz(estadoBase, caracter, estadoCambio);   //Carga en matriz estado origen base transición con caracter al estado 99
        automata.cargarMatriz(2, caracter, estadoCambio); //Une estado 1 con el estadoCambio 
        automata.cargarMatriz(1, caracter, estadoCambio);  //Une estado 2 con el estadoCambio 
    }

}
        



