lexer grammar lexico;

//Keywords
IF: 'if';
ELSEIF: 'else if';
ELSE: 'else';
WHILE: 'while';
FUNCTION: 'function';
RETURN: 'return';
LET: 'let';

//Separadores
CI: '{';
CD: '}';
PI: '(';
PD: ')';
PUNTOCOMA: ';';
COMA: ',';

//Operadores logicos
AND: '&&';
OR: '||';
XOR: '##';
NEG: '!';

//Operadores matemáticos
SUM: '+';
REST: '-';
MULT: '*';
DIV: '/';
EXP: '^';
MOD: '%';

//Operador de asignación
IGUAL: '=';

//Operadores de comparación
MENORQUE: '<';
MENORIGUALQUE: '<=';
MAYORQUE: '>';
MAYORIGUALQUE: '>=';
IGUALA: '==';
DISTINTO: '!=';

//Comentarios
LINEA: '%%%'.*?'\n' -> skip;
BLOQUE: '***'.*?'***' -> skip;

//Espacios
WS:[ \b\n\t\r]+ -> skip;

/* TIPOS DE DATOS */
//Numérico
fragment DIGITO: [0-9];
fragment SIGNO: ('-'|'+');
fragment ENTERO: DIGITO+;
fragment REAL: ENTERO?'.'DIGITO+;
NUMERICO: ENTERO|REAL;

//Texto
TEXTO: '"' (ESCAPE|.)*? '"';
fragment ESCAPE: '\\'[bntr"\\];

//Booleano
BOOLEANO: 'true'|'false';

//Polinomio
COMILLASIMPLE: '\'';

//Identificadores
LETRA: [A-Z|a-z];
VAR: (LETRA|'_')(LETRA|DIGITO|'_')*;
