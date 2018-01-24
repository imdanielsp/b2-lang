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
		READ=1, PRINT=2, VAR=3, LET=4, ASSIGN=5, SEMI=6, INT=7, DIGIT=8, ID=9, 
		LINE_COMMENT=10, COMMENT=11, PLUS=12, MINUS=13, MULTI=14, DIVIDE=15, LPAREN=16, 
		RPAREN=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_cmpStat = 1, RULE_stat = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"prog", "cmpStat", "stat", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'read'", "'print'", "'var'", "'let'", "'='", "';'", null, null, 
		null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "READ", "PRINT", "VAR", "LET", "ASSIGN", "SEMI", "INT", "DIGIT", 
		"ID", "LINE_COMMENT", "COMMENT", "PLUS", "MINUS", "MULTI", "DIVIDE", "LPAREN", 
		"RPAREN", "WS"
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
			setState(8);
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
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new CmpStatStatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(11);
				stat();
				setState(12);
				stat();
				}
				break;
			case 2:
				{
				_localctx = new CmpStatCmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				stat();
				setState(15);
				cmpStat(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(23);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new CmpCmpCmpContext(new CmpStatContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpStat);
						setState(19);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(20);
						cmpStat(2);
						}
						break;
					case 2:
						{
						_localctx = new CmpCmpStatContext(new CmpStatContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cmpStat);
						setState(21);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(22);
						stat();
						}
						break;
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(47);
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
				setState(28);
				expr(0);
				}
				break;
			case VAR:
				_localctx = new VarStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(VAR);
				setState(30);
				match(ID);
				setState(31);
				match(ASSIGN);
				setState(32);
				expr(0);
				setState(33);
				match(SEMI);
				}
				break;
			case LET:
				_localctx = new LetStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(LET);
				setState(36);
				match(ID);
				setState(37);
				match(ASSIGN);
				setState(38);
				expr(0);
				setState(39);
				match(SEMI);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				match(PRINT);
				setState(42);
				match(LPAREN);
				setState(43);
				expr(0);
				setState(44);
				match(RPAREN);
				setState(45);
				match(SEMI);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new NegExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(MINUS);
				setState(51);
				expr(5);
				}
				break;
			case INT:
				{
				_localctx = new IntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new IdExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(ID);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(LPAREN);
				setState(55);
				expr(0);
				setState(56);
				match(RPAREN);
				}
				break;
			case READ:
				{
				_localctx = new ReadExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(READ);
				setState(59);
				match(LPAREN);
				setState(60);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpExpressionContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(63);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(64);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIVIDE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(65);
					expr(7);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\24\n\3\3\3"+
		"\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\7\5E\n\5\f\5"+
		"\16\5H\13\5\3\5\2\4\4\b\6\2\4\6\b\2\3\3\2\16\21\2P\2\n\3\2\2\2\4\23\3"+
		"\2\2\2\6\61\3\2\2\2\b?\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2\2\f\r\b\3\1\2\r"+
		"\16\5\6\4\2\16\17\5\6\4\2\17\24\3\2\2\2\20\21\5\6\4\2\21\22\5\4\3\5\22"+
		"\24\3\2\2\2\23\f\3\2\2\2\23\20\3\2\2\2\24\33\3\2\2\2\25\26\f\3\2\2\26"+
		"\32\5\4\3\4\27\30\f\4\2\2\30\32\5\6\4\2\31\25\3\2\2\2\31\27\3\2\2\2\32"+
		"\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\33\3\2\2\2\36"+
		"\62\5\b\5\2\37 \7\5\2\2 !\7\13\2\2!\"\7\7\2\2\"#\5\b\5\2#$\7\b\2\2$\62"+
		"\3\2\2\2%&\7\6\2\2&\'\7\13\2\2\'(\7\7\2\2()\5\b\5\2)*\7\b\2\2*\62\3\2"+
		"\2\2+,\7\4\2\2,-\7\22\2\2-.\5\b\5\2./\7\23\2\2/\60\7\b\2\2\60\62\3\2\2"+
		"\2\61\36\3\2\2\2\61\37\3\2\2\2\61%\3\2\2\2\61+\3\2\2\2\62\7\3\2\2\2\63"+
		"\64\b\5\1\2\64\65\7\17\2\2\65@\5\b\5\7\66@\7\t\2\2\67@\7\13\2\289\7\22"+
		"\2\29:\5\b\5\2:;\7\23\2\2;@\3\2\2\2<=\7\3\2\2=>\7\22\2\2>@\7\23\2\2?\63"+
		"\3\2\2\2?\66\3\2\2\2?\67\3\2\2\2?8\3\2\2\2?<\3\2\2\2@F\3\2\2\2AB\f\b\2"+
		"\2BC\t\2\2\2CE\5\b\5\tDA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\t\3\2"+
		"\2\2HF\3\2\2\2\b\23\31\33\61?F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}