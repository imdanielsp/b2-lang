package io.danielsantos.grammar;

import io.danielsantos.*;


public class ASTBuilder extends B2BaseVisitor<Object> {

    @Override
    public Object visitProg(B2Parser.ProgContext ctx) {
        return new Program((CmpStatement) this.visit(ctx.cmpStat()));

    }

    @Override
    public Object visitCmpStatStat(B2Parser.CmpStatStatContext ctx) {
        Statement left = (Statement) this.visit(ctx.stat(0));
        Statement right = (Statement) this.visit(ctx.stat(1));

        return new CmpStatement(left, right);
    }

    @Override
    public Object visitCmpCmpStat(B2Parser.CmpCmpStatContext ctx) {
        CmpStatement left = (CmpStatement) this.visit(ctx.cmpStat());
        Statement right = (Statement) this.visit(ctx.stat());

        return new CmpStatement(left, right);
    }

    @Override
    public Object visitCmpStatCmp(B2Parser.CmpStatCmpContext ctx) {
        Statement left = (Statement) this.visit(ctx.stat());
        CmpStatement right = (CmpStatement) this.visit(ctx.cmpStat());

        return new CmpStatement(left, right);
    }

    @Override
    public Object visitCmpCmpCmp(B2Parser.CmpCmpCmpContext ctx) {
        CmpStatement left = (CmpStatement) this.visit(ctx.cmpStat(0));
        CmpStatement right = (CmpStatement) this.visit(ctx.cmpStat(1));

        return new CmpStatement(left, right);
    }

    @Override
    public Object visitExprStatement(B2Parser.ExprStatementContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Object visitPrintStatement(B2Parser.PrintStatementContext ctx) {
        Expression expr = (Expression) this.visit(ctx.expr());

        return new PrintStatement(expr);
    }

    @Override
    public Object visitVarStatement(B2Parser.VarStatementContext ctx) {
        IdExpression id = new IdExpression(ctx.ID().toString());
        Expression expr = (Expression) this.visit(ctx.expr());
        return new VarStatement(id, expr);
    }

    @Override
    public Object visitLetStatement(B2Parser.LetStatementContext ctx) {
        IdExpression id = new IdExpression(ctx.ID().toString());
        Expression expr = (Expression) this.visit(ctx.expr());
        return new LetStatement(id, expr);
    }

    @Override
    public Object visitIdExpression(B2Parser.IdExpressionContext ctx) {
        String id = ctx.ID().toString();

        return new IdExpression(id);
    }

    @Override
    public Object visitIntExpression(B2Parser.IntExpressionContext ctx) {
        Integer value = Integer.parseInt(ctx.INT().toString());

        return new IntExpression(value);
    }

    @Override
    public Object visitParenExpression(B2Parser.ParenExpressionContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Object visitOpExpression(B2Parser.OpExpressionContext ctx) {
        Expression left = (Expression) this.visit(ctx.expr(0));
        Expression right = (Expression) this.visit(ctx.expr(1));
        Operator op = null;

        if (ctx.PLUS() != null) {
            op = Operator.PLUS;
        } else if (ctx.MINUS() != null) {
            op = Operator.MINUS;
        } else if (ctx.DIVIDE() != null) {
            op = Operator.DIVIDE;
        } else if (ctx.MULTI() != null) {
            op = Operator.MULTI;
        }

        return new OpExpression(left, op, right);
    }

    @Override
    public Object visitNegExpression(B2Parser.NegExpressionContext ctx) {
        Expression expr = (Expression) this.visit(ctx.expr());

        return new NegativeExpression(expr);
    }

    @Override
    public Object visitReadExpression(B2Parser.ReadExpressionContext ctx) {
        return new ReadExpression();
    }
}
