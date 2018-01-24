package io.danielsantos;

import java.util.ArrayList;

public class IfElseStatement extends Statement {
    public BinaryExpression binaryExpression;
    public ArrayList<Statement> body;
    public ArrayList<Statement> elseBody;

    private SymbolTable localTable;

    public IfElseStatement(BinaryExpression binaryExpression, ArrayList<Statement> body,
                           ArrayList<Statement> elseBody, SymbolTable table) {
        this.binaryExpression = binaryExpression;
        this.body = body;
        this.elseBody = elseBody;
        this.localTable = table;
    }
}
