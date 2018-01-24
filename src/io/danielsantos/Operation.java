package io.danielsantos;

public enum Operation {
    PLUS,
    MINUS,
    DIVIDE,
    MULTI;

    @Override
    public String toString() {
        switch (this) {
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            default:
                return "";
        }
    }
}
