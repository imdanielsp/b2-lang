package io.danielsantos;

public class OpExpression extends Expression {
    public Expression left;
    public Operation op;
    public Expression right;

    public OpExpression(Expression left, Operation op, Expression right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + " " + op.toString() + " " + right.toString();
    }
}
