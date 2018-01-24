grammar B2;
import B2CommonLexer;

prog : cmpStat ;

cmpStat : stat stat?                        # cmpStatStat
        | stat cmpStat                      # cmpStatCmp
        | cmpStat stat                      # cmpCmpStat
        | cmpStat cmpStat                   # cmpCmpCmp
        ;

stat : expr                                 # exprStatement
     | VAR ID ASSIGN expr SEMI              # varStatement
     | LET ID ASSIGN expr SEMI              # letStatement
     | PRINT LPAREN expr RPAREN SEMI        # printStatement
     | ifStat                               # ifStatement
     ;


expr :  expr (
              PLUS|MINUS|MULTI|DIVIDE
             )
        expr                                # opExpression
     |  MINUS expr                          # negExpression
     |  INT                                 # intExpression
     |  ID                                  # idExpression
     |  LPAREN expr RPAREN                  # parenExpression
     |  READ LPAREN RPAREN                  # readExpression
     ;

binaryExpr : expr (
                    EQUALITY|NOT_EQUALITY|
                    GREAT_THAN|GREAT_THAN_EQ|
                    LESS_THAN|LESS_THAN_EQ
                  )
             expr                           # boolExpression
         | LPAREN binaryExpr RPAREN         # parenBoolExpression
         | (NOT) LPAREN binaryExpr RPAREN   # unaryExpression
         ;

ifStat : IF LPAREN binaryExpr RPAREN '{' stat+ '}'
       ;
