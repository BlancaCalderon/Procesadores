/*Clase que representa al autómata finito determinista cuyos atributos son alfabeto (lista de caracteres),
estados (lista de enteros), estado inicial (entero), estados finales (lista de enteros) y matriz (hashmap cuya clave es entero 
y como valor otro hashmap que a suve tiene un caracter como clave y un entero como valor)
y las funciones cargarAlfabeto(),cargarEstados(), establecerQ0(estado) el cual establece el estado inicial, 
establecerQf, inicializarMatriz(), cargarMatriz(), getSiguienteEstado(estadoActual, caracter), isFinal(estado) 
, getEstadoInicial(0), getAlfabeto, getMatriz(). 
 */
package practica1procesadores;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author blanf
 */
public class AFD 
{
    //Definición de las variables de la clase
    private ArrayList <Character> alfabetoAutomata = new ArrayList<Character>();    //Alfabeto del automata
    private ArrayList <Character> alfabeto = new ArrayList<Character>();    //Alfabeto ASCII
    private ArrayList <Integer> estados = new ArrayList<Integer>();     //Distintos estados de autómata finito
    private Integer estadoInicial;     //Estado inicial ya que solo puede haber uno en el autómata
    private ArrayList <Integer> estadosFinales = new ArrayList<Integer>();  //Lista de los estados finales ya que puede haber varios 
    private HashMap<Integer, HashMap<Character, Integer>> matriz = new HashMap<Integer, HashMap<Character, Integer>>(); /*Representa la matriz de transición de estados siendo la clave el estado actual 
                                                                                                                     y el valor otro hashmap cuya clave es el caracter que llega y el valor el estado
                                                                                                                        al que pasaríamos con ese caracter*/
    //Constructor de la clase (vacio)
    public AFD() { }
    
    //Función que devuelve el alfabeto a utilizar
    public ArrayList<Character> getAlfabetoAutomata() 
    {
        return alfabetoAutomata;
    }

    //Función que establece el alfabeto del automata
    public void setAlfabetoAutomata (ArrayList<Character> alfabeto) 
    {
        this.alfabetoAutomata = alfabeto;
    }

    //Función que devuelve la lista de estados del autómata
    public ArrayList<Integer> getEstados() 
    {
        return estados;
    }

    //Función que establece los estados del autómata
    public void setEstados (ArrayList<Integer> estados) 
    {
        this.estados = estados;
    }

    //Función que devuelve el estado inicial
    public Integer getEstadoInicial() 
    {
        return estadoInicial;
    }

    //Función que establece el estado inicial
    public void setEstadoInicial (Integer estadoInicial) 
    {
        this.estadoInicial = estadoInicial;
    }

    //Función que devuelve la lista de estados finales del autómata
    public ArrayList<Integer> getEstadosFinales() 
    {
        return estadosFinales;
    }

    //Función que establece los estados finales del autómata
    public void setEstadosFinales( ArrayList<Integer> estadosFinales) 
    {
        this.estadosFinales = estadosFinales;
    }

    //Función que devuelve la matriz de transicion
    public HashMap<Integer, HashMap<Character, Integer>> getMatriz() 
    {
        return matriz;
    }

    //Función que establece la matriz de transicion
    public void setMatriz (HashMap<Integer, HashMap<Character, Integer>> matriz) 
    {
        this.matriz = matriz;
    }

    //Función que devuelve alfabeto ASCII
    public ArrayList<Character> getAlfabeto() {
        return alfabeto;
    }

    //Función que establece alfabeto ASCII
    public void setAlfabeto(ArrayList<Character> alfabeto) {
        this.alfabeto = alfabeto;
    }
    
    //Función que permite cargar caracter pasado en la función a la variable alfabeto (carga alfabeto del automata)
    public void cargarAlfabeto (Character c)
    {
        alfabetoAutomata.add(c);    //Introduce caracter pasado al alfabeto
    }
    
    //Función que carga todo el alfabeto ASCCII
    public void cargarAscii ()
    {
        for (int i = 0; i < 255; i++)   //Recorre todos los elementos del alfabeto ASCII
        {
            alfabeto.add((char) i); //Introduce caracter ASCII tranformando número en caracter correspondiente
        }
    }
    
    //Función que introduce tantos estados como indiquemos en el parámetro pasado
    public void cargarEstados (int n)
    {
        for(int i = 0; i < n; i++)  //Bucle que introduce estados tantas veces como indique parametro n
        {
            estados.add(i); //Introduce estado en variable estados
        }
    }
    
    //Función que establece el estado inicial en el que indique parámetro pasado
    public void establecerEstadoIni (int estado)
    {
        estadoInicial = estado;  
    }
    
    //Función que añade el estado final indicado en el parámetro pasado
    public void establecerEstadoFin (int estado)
    {
        estadosFinales.add(estado); //Introduce estado en variable estadosFinales
    }
    
    /*Función que inicializa la matriz (genera un hashmap vacío con tantas entradas 
    como estados hay que se rellenará en el futuro*/
    public void inicializarMatriz ()
    {
        for (int i = 0; i < estados.size(); i++)    //Bucle que se hace tantas veces como estados halla
        {
            matriz.put(i, new HashMap<>()); //Crea matriz con clave estado y valor vacio
        }
    }
        
    //Función que carga los datos en la matriz creada vacía anteriormente (para caracteres)
    public void cargarMatriz (Integer estadoActual, char c, Integer estadoSiguiente)
    {
            matriz.get(estadoActual).put(c, estadoSiguiente);   //Introduce caracter y estado al que saltaremos en línea del estado actual indicado
    }

    //Función que permite saber siguiente estado al que pasaremos sabiendo estado actual y caracter que entra
    public Integer getSiguienteEstado (Integer estadoActual, char c)
    {
        return matriz.get(estadoActual).get(c); /*Devuelve siguiente estado al que saltaremos con ese caracter de entrada 
                                                (valor de la matriz con claves estadoActual, caracter)*/
    }
    
    //Función que indica si estado pasado en un estadi final
    public boolean isFinal(Integer estado)
    {
        return estadosFinales.contains(estado); //Devuelve si lista de estados finales contiene el estado pasado
    }
    
    //Función limpia lista de estados finales
    public void limpiarEstadoFin ()
    {
        estadosFinales.clear(); //Limpia array
    }
    
    //Función limpia lista de estados de la matriz
    public void limpiarEstados ()
    {
        estados.clear();    //Limpia array
    }
    
    //Función limpia alfabeto
    public void limpiarAlfabeto ()
    {
        alfabetoAutomata.clear();   //Vacia array
    }    
    
}   





