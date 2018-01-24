package io.danielsantos;

/**
 * print := print(expr)
 *
 * Example:
 *  print(3)
 *  print(x)
 *  print(x+4)
 *  print(-1)
 *  print(-(2+x))
 * */
public class PrintStatement extends Statement {
    public Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "print(" + expression.toString() + ");";
    }
}
