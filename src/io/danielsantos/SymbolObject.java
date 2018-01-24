package io.danielsantos;

public class SymbolObject {
    public enum SymbolObjectType {
        VAR,
        LET
    }

    public SymbolObjectType type;
    public Integer value;

    public SymbolObject(SymbolObjectType type, Integer value) {
        this.type = type;
        this.value = value;
    }
}
