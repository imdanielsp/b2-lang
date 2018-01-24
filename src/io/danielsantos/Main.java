package io.danielsantos;

import io.danielsantos.grammar.ASTBuilder;
import io.danielsantos.grammar.B2Lexer;
import io.danielsantos.grammar.B2Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        if (args.length >= 1) {
            try {
                FileInputStream inputFile = new FileInputStream(args[0]);

                runFile(inputFile);
            } catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
        } else {
            runConsole();
        }
    }

    private static void runFile(FileInputStream inputFile) {
        try {
            CharStream inputStream = new ANTLRInputStream(inputFile);
            B2Lexer lexer = new B2Lexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            B2Parser parser = new B2Parser(commonTokenStream);

            ParseTree tree = parser.prog();

            Program prog = (Program) new ASTBuilder().visit(tree);

            Interpreter.interpret(prog);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println();
        }
    }

    private static void runConsole() {
        Scanner in = new Scanner(System.in);

        clearScreen();

        while (true) {
            System.out.print("> ");
            String input = in.nextLine();

            try {
                CharStream inputStream = new ANTLRInputStream(new ByteArrayInputStream(input.getBytes()));
                B2Lexer lexer = new B2Lexer(inputStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                B2Parser parser = new B2Parser(commonTokenStream);

                ParseTree tree = parser.stat();

                Statement stat = (Statement) new ASTBuilder().visit(tree);

                Program prog = new Program(new CmpStatement(stat, null));

                Interpreter.interpret(prog);

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }
    }
    private static void clearScreen() {
        String os = System.getProperty("os.name");

        try {
            if (os.equals("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException e) {
        }
    }
}
