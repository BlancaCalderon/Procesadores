lexer grammar lexico;

//Keywords
IF:'if';
WHILE:'while';
FUNCTION:'function';
RETURN:'return';
LET:'let';
VAL:'val';

//Separadores
CI:'{';
CD:'}';
PI:'(';
PD:')';
PUNTOCOMA:';';
COMA:',';

//Operadores logicos
AND:'&&';
OR:'||';
XOR:'##';
NEG:'!';

//Operadores matemáticos
SUM:'+';
REST:'-';
MULT:'*';
DIV:'/';
EXP:'^';
MOD:'%';

//Operador de asignacioón
IGUAL:'=';

//Operadores de comparación
MENORQUE:'<';
MENORIGUALQUE:'<=';
MAYORQUE:'>';
MAYORIGUALQUE:'>=';
IGUALA:'==';
DISTINTO:'!=';

//Comentarios
LINEA:'%%%'.*?'\n'->skip;
BLOQUE:'***'.*?'***'->skip;

//Espacios
WS:[ \b\n\t\r]+ -> skip;

//Identificadores
VAR:(LETRA|'_')(LETRA|DIGITO|'_')*;

//Tipos de datos
//NUMERICO
fragment DIGITO:[0-9];
fragment SIGNO:('-'|'+');
fragment ENTERO:/*SIGNO?*/DIGITO+;
fragment REAL:/*SIGNO?*/ENTERO?'.'DIGITO+;
NUMERICO:ENTERO|REAL;

//TEXTO
TEXTO: '"' (ESCAPE|.)*? '"';
fragment ESCAPE: '\\'[bntr"\\];

//POLINOMIO
fragment LETRA:[A-Z|a-z];
fragment OPERADOR:SUM|REST;
fragment MONOMIO:(NUMERICO|LETRA|NUMERICO LETRA)(EXP ENTERO)?;
fragment COMILLASIMPLE: '\'';
CARACTER: COMILLASIMPLE LETRA COMILLASIMPLE;
POLINOMIO:COMILLASIMPLE MONOMIO (OPERADOR MONOMIO)*?COMILLASIMPLE;
