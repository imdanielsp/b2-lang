package io.danielsantos;

import java.util.ArrayList;

public class IfStatement extends Statement {
    public BinaryExpression binaryExpression;
    public ArrayList<Statement> body;

    private SymbolTable localTable;

    public IfStatement(BinaryExpression binaryExpression, ArrayList<Statement> body, SymbolTable table) {
        this.binaryExpression = binaryExpression;
        this.body = body;
        this.localTable = table;
    }

    public void setLocalTable(SymbolTable localTable) {
        this.localTable = localTable;
    }
}
