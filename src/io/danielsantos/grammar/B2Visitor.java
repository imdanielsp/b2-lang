// Generated from B2.g4 by ANTLR 4.7.1
package io.danielsantos.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link B2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface B2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link B2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(B2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatStat}
	 * labeled alternative in {@link B2Parser#cmpStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatStat(B2Parser.CmpStatStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpCmpStat}
	 * labeled alternative in {@link B2Parser#cmpStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpCmpStat(B2Parser.CmpCmpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatCmp}
	 * labeled alternative in {@link B2Parser#cmpStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatCmp(B2Parser.CmpStatCmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpCmpCmp}
	 * labeled alternative in {@link B2Parser#cmpStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpCmpCmp(B2Parser.CmpCmpCmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link B2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(B2Parser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varStatement}
	 * labeled alternative in {@link B2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStatement(B2Parser.VarStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letStatement}
	 * labeled alternative in {@link B2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStatement(B2Parser.LetStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link B2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(B2Parser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link B2Parser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(B2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link B2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(B2Parser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExpression}
	 * labeled alternative in {@link B2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpression(B2Parser.IntExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readExpression}
	 * labeled alternative in {@link B2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpression(B2Parser.ReadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link B2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(B2Parser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpression}
	 * labeled alternative in {@link B2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpression(B2Parser.OpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link B2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpression(B2Parser.NegExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link B2Parser#binaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(B2Parser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenBoolExpression}
	 * labeled alternative in {@link B2Parser#binaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBoolExpression(B2Parser.ParenBoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link B2Parser#binaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(B2Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link B2Parser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(B2Parser.IfElseStatementContext ctx);
}