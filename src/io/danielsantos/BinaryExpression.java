package io.danielsantos;

public class BinaryExpression extends Expression {
    public Expression left;
    public BinaryOperator op;
    public Expression right;

    public BinaryExpression(Expression left, BinaryOperator op, Expression right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }
}
