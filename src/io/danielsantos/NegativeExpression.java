package io.danielsantos;

/**
 *
 * NegativeExpression := - expr
 *
 * Example:
 * -x
 * -1
 * -(4 + 5)
 *
 * */
public class NegativeExpression extends Expression {
    public Expression expression;

    public NegativeExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "-" + expression.toString();
    }
}
