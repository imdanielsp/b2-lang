lexer grammar B2CommonLexer;

READ : 'read' ;
PRINT : 'print';
VAR : 'var';
LET : 'let';
IF : 'if';
ELSE : 'else';

ASSIGN : '=';
SEMI : ';';

INT :   DIGIT+ ;
DIGIT : [0-9] ;

ID  :   ID_LETTER (ID_LETTER | DIGIT)* ;
fragment ID_LETTER : [a-zA-Z_] ;


LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;


PLUS : '+' ;
MINUS : '-';
MULTI : '*';
DIVIDE : '/';

EQUALITY : '==';
NOT_EQUALITY : '!=';
GREAT_THAN : '>';
GREAT_THAN_EQ : '>=';
LESS_THAN : '<';
LESS_THAN_EQ : '<=';
NOT : '!';

LPAREN : '(';
RPAREN : ')';


WS  : [ \t\r\n]+ -> skip;
