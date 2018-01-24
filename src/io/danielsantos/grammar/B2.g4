grammar B2;
import B2CommonLexer;

prog : cmpStat ;

cmpStat : stat stat                     # cmpStatStat
        | stat cmpStat                  # cmpStatCmp
        | cmpStat stat                  # cmpCmpStat
        | cmpStat cmpStat               # cmpCmpCmp
        ;

stat : expr SEMI                        # exprStatement
     | VAR ID ASSIGN expr SEMI          # varStatement
     | LET ID ASSIGN expr SEMI          # letStatement
     | PRINT LPAREN expr RPAREN SEMI    # printStatement
     ;

expr :  expr (
              PLUS|MINUS|MULTI|DIVIDE
             )
        expr                            # opExpression
     |  MINUS expr                      # negExpression
     |  INT                             # intExpression
     |  ID                              # idExpression
     |  LPAREN expr RPAREN              # parenExpression
     |  READ LPAREN RPAREN SEMI         # readExpression
     ;
