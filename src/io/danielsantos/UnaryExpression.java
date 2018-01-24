package io.danielsantos;

public class UnaryExpression extends Expression {
    public BinaryExpression binaryExpression;
    public UnaryOperator unaryOperator;

    public UnaryExpression(BinaryExpression binaryExpression, UnaryOperator unaryOperator) {
        this.binaryExpression = binaryExpression;
        this.unaryOperator = unaryOperator;
    }
}
