package io.danielsantos;

public class IdExpression extends Expression {
    public String id;

    public IdExpression(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
