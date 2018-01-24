// Generated from B2.g4 by ANTLR 4.7.1
package io.danielsantos.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B2Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "READ", "PRINT", "VAR", "LET", "IF", "ELSE", "ASSIGN", 
		"SEMI", "INT", "DIGIT", "ID", "ID_LETTER", "LINE_COMMENT", "COMMENT", 
		"PLUS", "MINUS", "MULTI", "DIVIDE", "EQUALITY", "NOT_EQUALITY", "GREAT_THAN", 
		"GREAT_THAN_EQ", "LESS_THAN", "LESS_THAN_EQ", "NOT", "LPAREN", "RPAREN", 
		"WS"
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


	public B2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\6\fd\n\f\r\f\16\fe\3\r\3\r\3\16\3\16\3\16\7\16m\n\16\f\16\16\16p\13"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20x\n\20\f\20\16\20{\13\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\6\37\u00ae\n\37\r\37\16\37"+
		"\u00af\3\37\3\37\4y\u0086\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\2\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61"+
		"\31\63\32\65\33\67\349\35;\36=\37\3\2\5\3\2\62;\5\2C\\aac|\5\2\13\f\17"+
		"\17\"\"\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tH\3\2\2\2\13N\3\2"+
		"\2\2\rR\3\2\2\2\17V\3\2\2\2\21Y\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27c\3"+
		"\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!\u0080\3\2\2\2"+
		"#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0094\3\2\2\2+\u0096\3"+
		"\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61\u009e\3\2\2\2\63\u00a1\3\2\2\2"+
		"\65\u00a3\3\2\2\2\67\u00a6\3\2\2\29\u00a8\3\2\2\2;\u00aa\3\2\2\2=\u00ad"+
		"\3\2\2\2?@\7}\2\2@\4\3\2\2\2AB\7\177\2\2B\6\3\2\2\2CD\7t\2\2DE\7g\2\2"+
		"EF\7c\2\2FG\7f\2\2G\b\3\2\2\2HI\7r\2\2IJ\7t\2\2JK\7k\2\2KL\7p\2\2LM\7"+
		"v\2\2M\n\3\2\2\2NO\7x\2\2OP\7c\2\2PQ\7t\2\2Q\f\3\2\2\2RS\7n\2\2ST\7g\2"+
		"\2TU\7v\2\2U\16\3\2\2\2VW\7k\2\2WX\7h\2\2X\20\3\2\2\2YZ\7g\2\2Z[\7n\2"+
		"\2[\\\7u\2\2\\]\7g\2\2]\22\3\2\2\2^_\7?\2\2_\24\3\2\2\2`a\7=\2\2a\26\3"+
		"\2\2\2bd\5\31\r\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\30\3\2\2\2"+
		"gh\t\2\2\2h\32\3\2\2\2in\5\35\17\2jm\5\35\17\2km\5\31\r\2lj\3\2\2\2lk"+
		"\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\34\3\2\2\2pn\3\2\2\2qr\t\3\2\2"+
		"r\36\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2vx\13\2\2\2wv\3\2\2\2x{\3"+
		"\2\2\2yz\3\2\2\2yw\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\f\2\2}~\3\2\2\2~\177"+
		"\b\20\2\2\177 \3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086"+
		"\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\b\21\2\2\u008d\"\3\2\2\2\u008e\u008f\7-\2\2\u008f$\3\2\2\2\u0090"+
		"\u0091\7/\2\2\u0091&\3\2\2\2\u0092\u0093\7,\2\2\u0093(\3\2\2\2\u0094\u0095"+
		"\7\61\2\2\u0095*\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098\7?\2\2\u0098,"+
		"\3\2\2\2\u0099\u009a\7#\2\2\u009a\u009b\7?\2\2\u009b.\3\2\2\2\u009c\u009d"+
		"\7@\2\2\u009d\60\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0\62"+
		"\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\64\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7#\2\2\u00a78\3\2\2\2\u00a8"+
		"\u00a9\7*\2\2\u00a9:\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab<\3\2\2\2\u00ac\u00ae"+
		"\t\4\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\37\2\2\u00b2>\3\2\2\2"+
		"\t\2elny\u0086\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}