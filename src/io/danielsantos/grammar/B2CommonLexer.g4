lexer grammar B2CommonLexer;

READ : 'read' ;
PRINT : 'print';
VAR : 'var';
LET : 'let';
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

LPAREN : '(';
RPAREN : ')';


WS  : [ \t\r\n]+ -> skip;
