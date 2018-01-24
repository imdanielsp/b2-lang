package io.danielsantos;

public class IntExpression extends Expression {
    public Integer value;

    public IntExpression(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
