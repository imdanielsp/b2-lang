package io.danielsantos;

public class LetStatement extends Statement {
    public IdExpression id;
    public Expression expression;

    public LetStatement(IdExpression id, Expression expression) {
        this.id = id;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "let " + id.toString() + " = " + expression.toString() + ";";
    }
}
