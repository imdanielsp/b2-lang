package io.danielsantos;
/* *
*
* var ID = expr;
*
* Example:
* var x = 1 + 4;
*
* */
public class VarStatement extends Statement {
    public IdExpression id;
    public Expression expression;

    public VarStatement(IdExpression id, Expression expr) {
        this.id = id;
        this.expression = expr;
    }

    @Override
    public String toString() {
        return "var " + id.toString() + " = " + expression.toString() + ";";
    }
}
