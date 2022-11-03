parser grammar sintactico;
options { tokenVocab = lexico;}

axioma: sentencia* EOF;

sentencia:(decl|expr|asig|cond|bucle|func|dev|bloque) PUNTOCOMA;
decl: let (variable|asig);
asig: variable IGUAL expr;
expr:   PI expr PD                  |
        expr opermuldiv expr        |
        expr opersumrest expr       |
        expr opercomparacion expr   |
        expr operlogico expr        |
        variable                    |
        cadena                      |
        polinomio                   |
        llamadafuncion              |
        evaluacionpolinomio         |
        numerico;
cond: if PI expr PD bloque;
bucle: while PI expr PD bloque;
func: function variable PI parametros? PD bloque;
bloque: CI sentencia* CD;

opercomparacion: opermenorque | opermayorque | opermayorigualque | opermenorigualque | operiguala | operdistinto;
operlogico: operand | operor | operxor | operneg;
opermuldiv: opermul | operdiv;
opersumrest: opersum | operrest;

evaluacionpolinomio: val PI expr (COMA caracter COMA expr)* PD;

llamadafuncion: variable PI argumentos? PD;
argumentos: argumento (COMA argumento)*;
argumento: expr;

parametros: parametro (COMA parametro)*;
parametro: variable;
dev: (return expr?)?;

variable: VAR;
opersum: SUM;
operrest: REST;
opermul: MULT;
operdiv: DIV;
opermenorque: MENORQUE;
opermenorigualque: MENORIGUALQUE;
opermayorque: MAYORQUE;
opermayorigualque: MAYORIGUALQUE;
operiguala: IGUALA;
operdistinto: DISTINTO;
operand: AND;
operor: OR;
operxor: XOR;
operneg: NEG;
numerico: NUMERICO;
let: LET;
if: IF;
while: WHILE;
function: FUNCTION;
return: RETURN;
val: VAL;
caracter: CARACTER;
cadena: TEXTO;
polinomio: POLINOMIO;
