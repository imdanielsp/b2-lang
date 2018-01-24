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
		READ=1, PRINT=2, VAR=3, LET=4, ASSIGN=5, SEMI=6, INT=7, DIGIT=8, ID=9, 
		LINE_COMMENT=10, COMMENT=11, PLUS=12, MINUS=13, MULTI=14, DIVIDE=15, LPAREN=16, 
		RPAREN=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"READ", "PRINT", "VAR", "LET", "ASSIGN", "SEMI", "INT", "DIGIT", "ID", 
		"ID_LETTER", "LINE_COMMENT", "COMMENT", "PLUS", "MINUS", "MULTI", "DIVIDE", 
		"LPAREN", "RPAREN", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bB\n\b\r\b\16\bC\3\t"+
		"\3\t\3\n\3\n\3\n\7\nK\n\n\f\n\16\nN\13\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f"+
		"V\n\f\f\f\16\fY\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rc\n\r\f\r\16\r"+
		"f\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\6\24z\n\24\r\24\16\24{\3\24\3\24\4Wd\2\25\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\f\31\r\33\16\35\17\37\20!\21"+
		"#\22%\23\'\24\3\2\5\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u0083\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\3)\3\2\2\2\5.\3\2\2\2\7\64\3\2\2\2\t8\3\2\2\2\13<\3\2\2\2\r"+
		">\3\2\2\2\17A\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2"+
		"\31^\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%"+
		"v\3\2\2\2\'y\3\2\2\2)*\7t\2\2*+\7g\2\2+,\7c\2\2,-\7f\2\2-\4\3\2\2\2./"+
		"\7r\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7v\2\2\63\6\3\2\2\2"+
		"\64\65\7x\2\2\65\66\7c\2\2\66\67\7t\2\2\67\b\3\2\2\289\7n\2\29:\7g\2\2"+
		":;\7v\2\2;\n\3\2\2\2<=\7?\2\2=\f\3\2\2\2>?\7=\2\2?\16\3\2\2\2@B\5\21\t"+
		"\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\20\3\2\2\2EF\t\2\2\2F\22\3"+
		"\2\2\2GL\5\25\13\2HK\5\25\13\2IK\5\21\t\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NL\3\2\2\2OP\t\3\2\2P\26\3\2\2\2QR\7"+
		"\61\2\2RS\7\61\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2"+
		"WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\f\2\2[\\\3\2\2\2\\]\b\f\2\2]\30\3\2"+
		"\2\2^_\7\61\2\2_`\7,\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3"+
		"\2\2\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7,\2\2hi\7\61\2\2ij\3\2\2\2jk\b"+
		"\r\2\2k\32\3\2\2\2lm\7-\2\2m\34\3\2\2\2no\7/\2\2o\36\3\2\2\2pq\7,\2\2"+
		"q \3\2\2\2rs\7\61\2\2s\"\3\2\2\2tu\7*\2\2u$\3\2\2\2vw\7+\2\2w&\3\2\2\2"+
		"xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\24\2"+
		"\2~(\3\2\2\2\t\2CJLWd{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}