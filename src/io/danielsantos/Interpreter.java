package io.danielsantos;

import java.util.Scanner;


public class Interpreter {
    static private  SymbolTable symbolTable = new SymbolTable();

    public static int interpret(Program prog) throws ErrorException {
        // Entry point of any program
        Statement left = prog.cmpStatement.left;
        Statement right = prog.cmpStatement.right;

        if (left != null) {
            handleStatement(left);
        }

        if (right != null) {
            handleStatement(right);
        }

        return 0;
    }

    private static void handleStatement(Statement stat) throws ErrorException {
        if (stat instanceof VarStatement) {
            handleVarStatement((VarStatement) stat);
        } else if (stat instanceof LetStatement) {
            handleLetStatement((LetStatement) stat);
        } else if (stat instanceof PrintStatement) {
            handlePrint((PrintStatement) stat);
        } else if (stat instanceof CmpStatement) {
            handleStatement(((CmpStatement) stat).left);
            handleStatement(((CmpStatement) stat).right);
        } else if (stat instanceof Expression) {
            handleExpression((Expression) stat);
        } else if (stat instanceof IfStatement) {
            handleIfStatement((IfStatement) stat);
        }
    }

    private static void handleIfStatement(IfStatement stat) throws ErrorException {
        IntExpression result = handleBinaryExpression(stat.binaryExpression);

        if (result.value.equals(1)) {
            for (Statement statInIf : stat.body) {
                handleStatement(statInIf);
            }
        }
    }

    private static void handleVarStatement(VarStatement stat) throws ErrorException {
        IntExpression value = handleExpression(stat.expression);

        if (symbolTable.containsObject(stat.id.id)) {
            throw new ErrorException("Identifier " + stat.id.id + " already used.");
        }

        symbolTable.insert(stat.id.id, new SymbolObject(
                SymbolObject.SymbolObjectType.VAR,
                value.value));
    }

    private static void handleLetStatement(LetStatement stat) throws ErrorException {
        IntExpression value = handleExpression(stat.expression);

        if (symbolTable.containsObject(stat.id.id)) {
            throw new ErrorException("Identifier " + stat.id.id + " already used.");
        }

        symbolTable.insert(stat.id.id, new SymbolObject(
                SymbolObject.SymbolObjectType.LET,
                value.value));
    }

    private static void handlePrint(PrintStatement stat) throws ErrorException {
        IntExpression value = handleExpression(stat.expression);
        System.out.println(value);
    }

    private static IntExpression handleExpression(Expression expression) throws ErrorException {
        if (expression instanceof IdExpression) {
            return handleIdExpression((IdExpression) expression);
        } else if (expression instanceof OpExpression) {
            return handleOpExpression((OpExpression) expression);
        } else if (expression instanceof NegativeExpression) {
            return handleNegativeExpression((NegativeExpression) expression);
        } else if (expression instanceof IntExpression) {
            return (IntExpression) expression;
        } else if (expression instanceof ReadExpression) {
            return handleReadExpression((ReadExpression) expression);
        } else if (expression instanceof BinaryExpression) {
            return handleBinaryExpression((BinaryExpression) expression);
        } else {
            throw new ErrorException("Expression: " + expression.toString() + " is invalid.");
        }
    }

    private static IntExpression handleBinaryExpression(BinaryExpression expression) throws ErrorException {
        IntExpression left = handleExpression(expression.left);
        IntExpression right = handleExpression(expression.right);

        switch (expression.op) {
            case EQUAL:
                if (left.value.equals(right.value)) {
                    return new IntExpression(1);
                } else {
                    return new IntExpression(0);
                }
            case NOT_EQUAL:
                if (!left.value.equals(right.value)) {
                    return new IntExpression(1);
                } else {
                    return new IntExpression(0);
                }
            case GREATER_THAN:
                if (left.value > right.value) {
                    return new IntExpression(1);
                } else {
                    return new IntExpression(0);
                }
            case GREATER_THAN_EQ:
                if (left.value >= right.value) {
                    return new IntExpression(1);
                } else {
                    return new IntExpression(0);
                }
            case LESS_THAN:
                if (left.value < right.value) {
                    return new IntExpression(1);
                } else {
                    return new IntExpression(0);
                }
            case LESS_THAN_EQ:
                if (left.value <= right.value) {
                    return new IntExpression(1);
                } else {
                    return new IntExpression(0);
                }
            default:
                throw new ErrorException("Unsupported binary operator");
        }
    }

    private static IntExpression handleIdExpression(IdExpression expression) throws ErrorException {
        SymbolObject obj = symbolTable.get(expression.id);

        if (obj == null) {
            throw new ErrorException("Undefined identifier: " + expression.id);
        }

        Integer value = obj.value;

        return new IntExpression(value);
    }

    private static IntExpression handleOpExpression(OpExpression expression) throws ErrorException {
        IntExpression leftValue = handleExpression(expression.left);
        IntExpression rightValue = handleExpression(expression.right);

        switch (expression.op) {
            case PLUS:
                return new IntExpression(leftValue.value + rightValue.value);
            case MINUS:
                return new IntExpression(leftValue.value - rightValue.value);
            default:
                throw new ErrorException("Invalid operation: " + expression.op.toString());

        }
    }

    private static IntExpression handleNegativeExpression(NegativeExpression expression) throws ErrorException {
        IntExpression value = handleExpression(expression.expression);

        value.value = -value.value;

        return value;
    }

    private static IntExpression handleReadExpression(ReadExpression expression) {
        Scanner in = new Scanner(System.in);

        Integer value = in.nextInt();

        return new IntExpression(value);
    }
}
