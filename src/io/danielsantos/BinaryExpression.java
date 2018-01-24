package io.danielsantos;

public class BinaryExpression extends Expression {
    public Expression left;
    public Operator op;
    public Expression right;

    public BinaryExpression(Expression left, Operator op, Expression right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }
}
