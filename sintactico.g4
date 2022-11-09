parser grammar sintactico;
options { tokenVocab = lexico;}

axioma: sentencia* EOF;

sentencia:(decl|expr|asig|cond|bucle|func|dev|bloque) PUNTOCOMA;
decl: let (identificador|asig);
asig: identificador IGUAL expr;
expr:   PI expr PD                  |
        expr opermodexp expr        |
        expr opermuldiv expr        |
        expr opersumrest expr       |
        expr opercomparacion expr   |
        expr operlogico expr        |
        identificador               |
        cadena                      |
        polinomio                   |
        llamadafuncion              |
        numerico;
cond: if cuerpocondicion bloque (elseif cuerpocondicion bloque)* (else bloque)?;
cuerpocondicion: PI expr PD;

bucle: buclewhile;
buclewhile: while cuerpocondicion bloque;

func: function nombrefuncion PI parametros? PD bloque;
bloque: CI sentencia* CD;

opercomparacion: opermenorque | opermayorque | opermayorigualque | opermenorigualque | operiguala | operdistinto;
operlogico: operand | operor | operxor | operneg;
opermuldiv: opermul | operdiv;
opermodexp: opermod | operexp;
opersumrest: opersum | operrest;

llamadafuncion: nombrefuncion PI argumentos? PD;
argumentos: argumento (COMA argumento)*;
argumento: expr;

polinomio: comillasimple monomio (opersumrest monomio)* comillasimple;
monomio:(numerico letra|numerico|letra) (operexp numerico)*;

parametros: parametro (COMA parametro)*;
parametro: identificador;
dev: (return expr?)?;

identificador: VAR | LETRA;
nombrefuncion: VAR | LETRA;

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
operexp: EXP;
opermod: MOD;
numerico: NUMERICO;
let: LET;
if: IF;
elseif: ELSEIF;
else: ELSE;
while: WHILE;
function: FUNCTION;
return: RETURN;
letra: LETRA;
cadena: TEXTO;
comillasimple: COMILLASIMPLE;
