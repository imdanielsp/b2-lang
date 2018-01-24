package io.danielsantos;
/**
 *
 * CmpStatement := Statement;
 *                 Statement;
 * Example:
 * var x = 4;
 * let n = 3;
 * */
public class CmpStatement extends Statement {
    public Statement left;
    public Statement right;

    public CmpStatement(Statement left, Statement right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return left.toString() + "\n" + right.toString() + "\n";
    }
}
