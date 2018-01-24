// Generated from B2.g4 by ANTLR 4.7.1
package io.danielsantos.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, READ=3, PRINT=4, VAR=5, LET=6, IF=7, ELSE=8, ASSIGN=9, 
		SEMI=10, INT=11, DIGIT=12, ID=13, LINE_COMMENT=14, COMMENT=15, PLUS=16, 
		MINUS=17, MULTI=18, DIVIDE=19, EQUALITY=20, NOT_EQUALITY=21, GREAT_THAN=22, 
		GREAT_THAN_EQ=23, LESS_THAN=24, LESS_THAN_EQ=25, NOT=26, LPAREN=27, RPAREN=28, 
		WS=29;
	public static final int
		RULE_prog = 0, RULE_cmpStat = 1, RULE_stat = 2, RULE_expr = 3, RULE_binaryExpr = 4, 
		RULE_ifStat = 5;
	public static final String[] ruleNames = {
		"prog", "cmpStat", "stat", "expr", "binaryExpr", "ifStat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'read'", "'print'", "'var'", "'let'", "'if'", "'else'", 
		"'='", "';'", null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
		"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'!'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "READ", "PRINT", "VAR", "LET", "IF", "ELSE", "ASSIGN", 
		"SEMI", "INT", "DIGIT", "ID", "LINE_COMMENT", "COMMENT", "PLUS", "MINUS", 
		"MULTI", "DIVIDE", "EQUALITY", "NOT_EQUALITY", "GREAT_THAN", "GREAT_THAN_EQ", 
		"LESS_THAN", "LESS_THAN_EQ", "NOT", "LPAREN", "RPAREN", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "B2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public B2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public CmpStatContext cmpStat() {
			return getRuleContext(CmpStatContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			cmpStat(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmpStatContext extends ParserRuleContext {
		public CmpStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmpStat; }
	 
		public CmpStatContext() { }
		public void copyFrom(CmpStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmpStatStatContext extends CmpStatContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CmpStatStatContext(CmpStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitCmpStatStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpCmpStatContext extends CmpStatContext {
		public CmpStatContext cmpStat() {
			return getRuleContext(CmpStatContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CmpCmpStatContext(CmpStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitCmpCmpStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpStatCmpContext extends CmpStatContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CmpStatContext cmpStat() {
			return getRuleContext(CmpStatContext.class,0);
		}
		public CmpStatCmpContext(CmpStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitCmpStatCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpCmpCmpContext extends CmpStatContext {
		public List<CmpStatContext> cmpStat() {
			return getRuleContexts(CmpStatContext.class);
		}
		public CmpStatContext cmpStat(int i) {
			return getRuleContext(CmpStatContext.class,i);
		}
		public CmpCmpCmpContext(CmpStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitCmpCmpCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpStatContext cmpStat() throws RecognitionException {
		return cmpStat(0);
	}

	private CmpStatContext cmpStat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CmpStatContext _localctx = new CmpStatContext(_ctx, _parentState);
		CmpStatContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_cmpStat, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new CmpStatStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(15);
				stat();
				setState(17);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(16);
					stat();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new CmpStatCmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				stat();
				setState(20);
				cmpStat(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(28);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new CmpCmpCmpContext(new CmpStatContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpStat);
						setState(24);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(25);
						cmpStat(2);
						}
						break;
					case 2:
						{
						_localctx = new CmpCmpStatContext(new CmpStatContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpStat);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
						stat();
						}
						break;
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementContext extends StatContext {
		public TerminalNode PRINT() { return getToken(B2Parser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(B2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(B2Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(B2Parser.SEMI, 0); }
		public PrintStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetStatementContext extends StatContext {
		public TerminalNode LET() { return getToken(B2Parser.LET, 0); }
		public TerminalNode ID() { return getToken(B2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(B2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(B2Parser.SEMI, 0); }
		public LetStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public IfStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStatementContext extends StatContext {
		public TerminalNode VAR() { return getToken(B2Parser.VAR, 0); }
		public TerminalNode ID() { return getToken(B2Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(B2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(B2Parser.SEMI, 0); }
		public VarStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case INT:
			case ID:
			case MINUS:
			case LPAREN:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				expr(0);
				}
				break;
			case VAR:
				_localctx = new VarStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(VAR);
				setState(35);
				match(ID);
				setState(36);
				match(ASSIGN);
				setState(37);
				expr(0);
				setState(38);
				match(SEMI);
				}
				break;
			case LET:
				_localctx = new LetStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(LET);
				setState(41);
				match(ID);
				setState(42);
				match(ASSIGN);
				setState(43);
				expr(0);
				setState(44);
				match(SEMI);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(PRINT);
				setState(47);
				match(LPAREN);
				setState(48);
				expr(0);
				setState(49);
				match(RPAREN);
				setState(50);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				ifStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdExpressionContext extends ExprContext {
		public TerminalNode ID() { return getToken(B2Parser.ID, 0); }
		public IdExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExpressionContext extends ExprContext {
		public TerminalNode INT() { return getToken(B2Parser.INT, 0); }
		public IntExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadExpressionContext extends ExprContext {
		public TerminalNode READ() { return getToken(B2Parser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(B2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(B2Parser.RPAREN, 0); }
		public ReadExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitReadExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(B2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(B2Parser.RPAREN, 0); }
		public ParenExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(B2Parser.MINUS, 0); }
		public TerminalNode MULTI() { return getToken(B2Parser.MULTI, 0); }
		public TerminalNode DIVIDE() { return getToken(B2Parser.DIVIDE, 0); }
		public OpExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitOpExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpressionContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(B2Parser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitNegExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(56);
				match(MINUS);
				setState(57);
				expr(5);
				}
				break;
			case INT:
				{
				_localctx = new IntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(ID);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(LPAREN);
				setState(61);
				expr(0);
				setState(62);
				match(RPAREN);
				}
				break;
			case READ:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(READ);
				setState(65);
				match(LPAREN);
				setState(66);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpExpressionContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(69);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(70);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIVIDE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(71);
					expr(7);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinaryExprContext extends ParserRuleContext {
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
	 
		public BinaryExprContext() { }
		public void copyFrom(BinaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExpressionContext extends BinaryExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALITY() { return getToken(B2Parser.EQUALITY, 0); }
		public TerminalNode NOT_EQUALITY() { return getToken(B2Parser.NOT_EQUALITY, 0); }
		public TerminalNode GREAT_THAN() { return getToken(B2Parser.GREAT_THAN, 0); }
		public TerminalNode GREAT_THAN_EQ() { return getToken(B2Parser.GREAT_THAN_EQ, 0); }
		public TerminalNode LESS_THAN() { return getToken(B2Parser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_EQ() { return getToken(B2Parser.LESS_THAN_EQ, 0); }
		public BoolExpressionContext(BinaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenBoolExpressionContext extends BinaryExprContext {
		public TerminalNode LPAREN() { return getToken(B2Parser.LPAREN, 0); }
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(B2Parser.RPAREN, 0); }
		public ParenBoolExpressionContext(BinaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitParenBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends BinaryExprContext {
		public TerminalNode LPAREN() { return getToken(B2Parser.LPAREN, 0); }
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(B2Parser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(B2Parser.NOT, 0); }
		public UnaryExpressionContext(BinaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryExpr);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				expr(0);
				setState(78);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALITY) | (1L << NOT_EQUALITY) | (1L << GREAT_THAN) | (1L << GREAT_THAN_EQ) | (1L << LESS_THAN) | (1L << LESS_THAN_EQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ParenBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(LPAREN);
				setState(82);
				binaryExpr();
				setState(83);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new UnaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(85);
				match(NOT);
				}
				setState(86);
				match(LPAREN);
				setState(87);
				binaryExpr();
				setState(88);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(B2Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(B2Parser.LPAREN, 0); }
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(B2Parser.RPAREN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B2Visitor ) return ((B2Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IF);
			setState(93);
			match(LPAREN);
			setState(94);
			binaryExpr();
			setState(95);
			match(RPAREN);
			setState(96);
			match(T__0);
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				stat();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << PRINT) | (1L << VAR) | (1L << LET) | (1L << IF) | (1L << INT) | (1L << ID) | (1L << MINUS) | (1L << LPAREN))) != 0) );
			setState(102);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return cmpStat_sempred((CmpStatContext)_localctx, predIndex);
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cmpStat_sempred(CmpStatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\5\3\24\n\3\3\3"+
		"\3\3\3\3\5\3\31\n\3\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5F\n\5\3"+
		"\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7e\n\7\r\7\16\7f\3"+
		"\7\3\7\3\7\2\4\4\b\b\2\4\6\b\n\f\2\4\3\2\22\25\3\2\26\33\2t\2\16\3\2\2"+
		"\2\4\30\3\2\2\2\6\67\3\2\2\2\bE\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16\17\5"+
		"\4\3\2\17\3\3\2\2\2\20\21\b\3\1\2\21\23\5\6\4\2\22\24\5\6\4\2\23\22\3"+
		"\2\2\2\23\24\3\2\2\2\24\31\3\2\2\2\25\26\5\6\4\2\26\27\5\4\3\5\27\31\3"+
		"\2\2\2\30\20\3\2\2\2\30\25\3\2\2\2\31 \3\2\2\2\32\33\f\3\2\2\33\37\5\4"+
		"\3\4\34\35\f\4\2\2\35\37\5\6\4\2\36\32\3\2\2\2\36\34\3\2\2\2\37\"\3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#8\5\b\5\2$%\7\7\2\2%"+
		"&\7\17\2\2&\'\7\13\2\2\'(\5\b\5\2()\7\f\2\2)8\3\2\2\2*+\7\b\2\2+,\7\17"+
		"\2\2,-\7\13\2\2-.\5\b\5\2./\7\f\2\2/8\3\2\2\2\60\61\7\6\2\2\61\62\7\35"+
		"\2\2\62\63\5\b\5\2\63\64\7\36\2\2\64\65\7\f\2\2\658\3\2\2\2\668\5\f\7"+
		"\2\67#\3\2\2\2\67$\3\2\2\2\67*\3\2\2\2\67\60\3\2\2\2\67\66\3\2\2\28\7"+
		"\3\2\2\29:\b\5\1\2:;\7\23\2\2;F\5\b\5\7<F\7\r\2\2=F\7\17\2\2>?\7\35\2"+
		"\2?@\5\b\5\2@A\7\36\2\2AF\3\2\2\2BC\7\5\2\2CD\7\35\2\2DF\7\36\2\2E9\3"+
		"\2\2\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2EB\3\2\2\2FL\3\2\2\2GH\f\b\2\2HI\t"+
		"\2\2\2IK\5\b\5\tJG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\t\3\2\2\2NL"+
		"\3\2\2\2OP\5\b\5\2PQ\t\3\2\2QR\5\b\5\2R]\3\2\2\2ST\7\35\2\2TU\5\n\6\2"+
		"UV\7\36\2\2V]\3\2\2\2WX\7\34\2\2XY\7\35\2\2YZ\5\n\6\2Z[\7\36\2\2[]\3\2"+
		"\2\2\\O\3\2\2\2\\S\3\2\2\2\\W\3\2\2\2]\13\3\2\2\2^_\7\t\2\2_`\7\35\2\2"+
		"`a\5\n\6\2ab\7\36\2\2bd\7\3\2\2ce\5\6\4\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2"+
		"\2fg\3\2\2\2gh\3\2\2\2hi\7\4\2\2i\r\3\2\2\2\13\23\30\36 \67EL\\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}