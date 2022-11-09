parser grammar sintactico;
options {tokenVocab = lexico;}

//Axioma
axioma: (func puntocoma)* EOF;

//Sentencias
sentencia:(decl | asig | expr | cond | bucle | dev | bloque) puntocoma;

//Declaraciones
decl: let (identificador | asig);

//Asignaciones
asig: identificador igual expr;

//Expresiones
expr:   pi expr pd                  |
        expr opermodexp expr        |
        expr opermuldiv expr        |
        expr opersumrest expr       |
        expr opercomparacion expr   |
        expr operlogico expr        |
        identificador               |
        cadena                      |
        booleano                    |
        polinomio                   |
        llamadafuncion              |
        signonumerico               |
        numerico                    ;

//Bloque de código
bloque: ci sentencia* cd;

//Condicionales
cond: if cuerpocondicion bloque (elseif cuerpocondicion bloque)* (else bloque)?;
cuerpocondicion: pi expr pd;

//Bucles
bucle: buclewhile;
buclewhile: while cuerpocondicion bloque;

//Llamada a funciones
llamadafuncion: nombrefuncion cuerpoargumentos;
cuerpoargumentos: pi argumentos? pd;
argumentos: argumento (coma argumento)*;
argumento: expr;

//Declaración de funciones
func: function nombrefuncion cuerpofuncion bloque;
cuerpofuncion: pi parametros? pd;

//Retorno de funciones
dev: (return expr?)?;

//Operadores
opercomparacion: opermenorque | opermayorque | opermayorigualque | opermenorigualque | operiguala | operdistinto;
operlogico: operand | operor | operxor | operneg;
opermuldiv: opermul | operdiv;
opermodexp: opermod | operexp;
opersumrest: opersum | operrest;

//Polinomios
polinomio: comillasimple monomio (opersumrest monomio)* comillasimple;
monomio:(numerico letra | numerico | letra) (operexp numerico)*;

//Parámetros
parametros: parametro (coma parametro)*;
parametro: identificador;

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
identificador: VAR | LETRA;
nombrefuncion: VAR | LETRA;

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
signonumerico: pi opersumrest numerico pd;
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
