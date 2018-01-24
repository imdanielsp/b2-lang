package io.danielsantos;

public class OpExpression extends Expression {
    public Expression left;
    public Operator op;
    public Expression right;

    public OpExpression(Expression left, Operator op, Expression right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " " + op.toString() + " " + right.toString();
    }
}
