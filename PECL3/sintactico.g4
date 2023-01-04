parser grammar sintactico;

options {tokenVocab = lexico;}

//Axioma
axioma: (func puntocoma)* EOF;

//Sentencias
sentencia: (decl | asig | expr | cond | bucle | dev | bloque) puntocoma;

//Declaraciones
decl:   let identificador        #letIdentificador  |
        let asig                 #letAsignacion     ;

//Asignaciones
asig: identificador igual expr;

//Expresiones
expr:   pi expr pd                  #parentesis     |
        expr opermodexp expr        #modexpoper     |
        expr opermuldiv expr        #muldivoper     |
        expr opersumrest expr       #sumrestoper    |
        expr opercomparacion expr   #comparacionoper|
        expr operlogico expr        #logicooper     |
        operneg expr                #negacion       |
        identificador               #ide            |
        cadena                      #cad            |
        booleano                    #bool           |
        signonumerico               #signumerico    |
        numerico                    #numeric        |
        polinomio                   #poli           |
        llamadafuncion              #funcion        ;

//Bloque de código
bloque: ci sentencia* cd;

//Condicionales
cond: if cuerpocondicion bloque (elseif cuerpocondicion bloque)* (else bloque)?     #condicion;
cuerpocondicion: pi expr pd;

//Bucles
bucle: buclewhile;
buclewhile: while cuerpocondicion bloque        #whilebucle;

//Llamada a funciones
llamadafuncion: nombrefuncion cuerpoargumentos;
cuerpoargumentos: pi argumentos? pd;
argumentos: argumento (coma argumento)*;
argumento: expr;

//Declaración de funciones
func: function nombrefuncion cuerpofuncion bloque;
cuerpofuncion: pi parametros? pd;

//Parámetros
parametros: parametro (coma parametro)*;
parametro: identificador;

//Retorno de funciones
dev: return expr?       #retorno;

//Operadores
opercomparacion: opermenorque | opermayorque | opermayorigualque | opermenorigualque | operiguala | operdistinto;
operlogico: operand | operor | operxor;
opermuldiv: opermul | operdiv;
opermodexp: opermod | operexp;
opersumrest: opersum | operrest;

//Polinomios
polinomio: comillasimple monomio (opersumrest monomio)* comillasimple;
monomio: (numerico letras | numerico | letras) (operexp numerico)*;

//Numéricos con signo
signonumerico: pi opersumrest numerico pd;

/* ELEMENTOS DEL LEXER */
//Keywords
let: LET;
if: IF;
elseif: ELSEIF;
else: ELSE;
while: WHILE;
function: FUNCTION;
return: RETURN;

//Identificadores
letra: LETRA;
letras: LETRAS;
identificador: VAR | LETRA | LETRAS;
nombrefuncion: VAR | LETRA | LETRAS;

//Operadores matemáticos
opersum: SUM;
operrest: REST;
opermul: MULT;
operdiv: DIV;
operexp: EXP;
opermod: MOD;

//Operadores de comparación
opermenorque: MENORQUE;
opermenorigualque: MENORIGUALQUE;
opermayorque: MAYORQUE;
opermayorigualque: MAYORIGUALQUE;
operiguala: IGUALA;
operdistinto: DISTINTO;

//Operadores logicos
operand: AND;
operor: OR;
operxor: XOR;
operneg: NEG;

//Tipos de datos
numerico: NUMERICO;
cadena: TEXTO;
booleano: BOOLEANO;

//Operador de asignación
igual: IGUAL;

//Separadores
ci: CI;
cd: CD;
pi: PI;
pd: PD;
comillasimple: COMILLASIMPLE;
puntocoma: PUNTOCOMA;
coma: COMA;
