// Generated from TimeTable.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimeTableLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		WS=18, SL_COMMENT=19, ML_COMMENT=20, ARROW=21, AT=22, BAR=23, COLON=24, 
		COLON_COLON=25, COLON_EQUAL=26, COMMA=27, DOT=28, DOTDOT=29, EQUAL=30, 
		GREATER=31, GREATER_EQUAL=32, HASH=33, LBRACE=34, LBRACK=35, LESS=36, 
		LESS_EQUAL=37, LPAREN=38, MINUS=39, NOT_EQUAL=40, PLUS=41, RBRACE=42, 
		RBRACK=43, RPAREN=44, SEMI=45, SLASH=46, STAR=47, QUESTION=48, RARROW=49, 
		NEQUAL=50, INT=51, STRING=52, ID=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"WS", "SL_COMMENT", "ML_COMMENT", "NEWLINE", "ARROW", "AT", "BAR", "COLON", 
			"COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "GREATER", 
			"GREATER_EQUAL", "HASH", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", 
			"MINUS", "NOT_EQUAL", "PLUS", "RBRACE", "RBRACK", "RPAREN", "SEMI", "SLASH", 
			"STAR", "QUESTION", "RARROW", "NEQUAL", "INT", "REAL", "STRING", "ESC", 
			"HEX_DIGIT", "ID", "VOCAB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Specification'", "'Struct'", "'as'", "'Schedule'", "'rule'", 
			"'hard'", "'soft'", "'of'", "'in'", "'and'", "'or'", "'with'", "'for'", 
			"'no'", "'hours'", "'none'", "'zero'", null, null, null, "'->'", "'@'", 
			"'|'", "':'", "'::'", "':='", "','", "'.'", "'..'", "'='", "'>'", "'>='", 
			"'#'", "'{'", "'['", "'<'", "'<='", "'('", "'-'", "'<>'", "'+'", "'}'", 
			"']'", "')'", "';'", "'/'", "'*'", "'?'", "'=>'", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "SL_COMMENT", "ML_COMMENT", 
			"ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", 
			"DOT", "DOTDOT", "EQUAL", "GREATER", "GREATER_EQUAL", "HASH", "LBRACE", 
			"LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "NOT_EQUAL", "PLUS", 
			"RBRACE", "RBRACK", "RPAREN", "SEMI", "SLASH", "STAR", "QUESTION", "RARROW", 
			"NEQUAL", "INT", "STRING", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public TimeTableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TimeTable.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u017e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00d3\n\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00db\n\24\3\24\7\24\u00de\n\24\f\24\16\24\u00e1\13\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00eb\n\25\f\25\16\25\u00ee"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00f8\n\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\6\65\u0140\n\65\r\65\16\65\u0141\3\66\3\66\3\66\3\66\3\66\5\66\u0149"+
		"\n\66\3\66\5\66\u014c\n\66\3\66\3\66\5\66\u0150\n\66\3\66\5\66\u0153\n"+
		"\66\3\67\3\67\3\67\7\67\u0158\n\67\f\67\16\67\u015b\13\67\3\67\3\67\3"+
		"8\38\38\38\38\38\38\38\38\38\38\58\u016a\n8\58\u016c\n8\38\38\58\u0170"+
		"\n8\58\u0172\n8\39\39\3:\3:\7:\u0178\n:\f:\16:\u017b\13:\3;\3;\3\u00ec"+
		"\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\2-\27/\30\61\31\63\32\65\33\67\349\35"+
		";\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\2"+
		"m\66o\2q\2s\67u\2\3\2\13\5\2\13\13\16\16\"\"\4\2\f\f\17\17\4\2GGgg\4\2"+
		"--//\4\2))^^\n\2$$))^^ddhhppttvv\5\2\62;CHch\6\2&&C\\aac|\6\2\62;C\\a"+
		"ac|\2\u018b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3\2\2\2\2s\3\2\2\2"+
		"\3w\3\2\2\2\5\u0085\3\2\2\2\7\u008c\3\2\2\2\t\u008f\3\2\2\2\13\u0098\3"+
		"\2\2\2\r\u009d\3\2\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00aa\3\2"+
		"\2\2\25\u00ad\3\2\2\2\27\u00b1\3\2\2\2\31\u00b4\3\2\2\2\33\u00b9\3\2\2"+
		"\2\35\u00bd\3\2\2\2\37\u00c0\3\2\2\2!\u00c6\3\2\2\2#\u00cb\3\2\2\2%\u00d2"+
		"\3\2\2\2\'\u00da\3\2\2\2)\u00e6\3\2\2\2+\u00f7\3\2\2\2-\u00f9\3\2\2\2"+
		"/\u00fc\3\2\2\2\61\u00fe\3\2\2\2\63\u0100\3\2\2\2\65\u0102\3\2\2\2\67"+
		"\u0105\3\2\2\29\u0108\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2?\u010f\3\2"+
		"\2\2A\u0111\3\2\2\2C\u0113\3\2\2\2E\u0116\3\2\2\2G\u0118\3\2\2\2I\u011a"+
		"\3\2\2\2K\u011c\3\2\2\2M\u011e\3\2\2\2O\u0121\3\2\2\2Q\u0123\3\2\2\2S"+
		"\u0125\3\2\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012c\3\2\2\2[\u012e\3\2"+
		"\2\2]\u0130\3\2\2\2_\u0132\3\2\2\2a\u0134\3\2\2\2c\u0136\3\2\2\2e\u0138"+
		"\3\2\2\2g\u013b\3\2\2\2i\u013f\3\2\2\2k\u0143\3\2\2\2m\u0154\3\2\2\2o"+
		"\u015e\3\2\2\2q\u0173\3\2\2\2s\u0175\3\2\2\2u\u017c\3\2\2\2wx\7U\2\2x"+
		"y\7r\2\2yz\7g\2\2z{\7e\2\2{|\7k\2\2|}\7h\2\2}~\7k\2\2~\177\7e\2\2\177"+
		"\u0080\7c\2\2\u0080\u0081\7v\2\2\u0081\u0082\7k\2\2\u0082\u0083\7q\2\2"+
		"\u0083\u0084\7p\2\2\u0084\4\3\2\2\2\u0085\u0086\7U\2\2\u0086\u0087\7v"+
		"\2\2\u0087\u0088\7t\2\2\u0088\u0089\7w\2\2\u0089\u008a\7e\2\2\u008a\u008b"+
		"\7v\2\2\u008b\6\3\2\2\2\u008c\u008d\7c\2\2\u008d\u008e\7u\2\2\u008e\b"+
		"\3\2\2\2\u008f\u0090\7U\2\2\u0090\u0091\7e\2\2\u0091\u0092\7j\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7f\2\2\u0094\u0095\7w\2\2\u0095\u0096\7n\2\2"+
		"\u0096\u0097\7g\2\2\u0097\n\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7w"+
		"\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\f\3\2\2\2\u009d\u009e"+
		"\7j\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7f\2\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7h\2\2\u00a9"+
		"\22\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\24\3\2\2\2\u00ad"+
		"\u00ae\7c\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7f\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7t\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7j\2\2\u00b8\32\3\2\2\2\u00b9"+
		"\u00ba\7h\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc\34\3\2\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7q\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7j\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7u\2\2"+
		"\u00c5 \3\2\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2"+
		"\2\u00c9\u00ca\7g\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7|\2\2\u00cc\u00cd\7"+
		"g\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7q\2\2\u00cf$\3\2\2\2\u00d0\u00d3"+
		"\t\2\2\2\u00d1\u00d3\5+\26\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\b\23\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7\61\2"+
		"\2\u00d7\u00db\7\61\2\2\u00d8\u00d9\7/\2\2\u00d9\u00db\7/\2\2\u00da\u00d6"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\n\3\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5+\26\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\b\24\2\2\u00e5(\3\2\2\2\u00e6\u00e7\7\61\2"+
		"\2\u00e7\u00e8\7,\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\13\2\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f1\7\61"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\25\2\2\u00f3*\3\2\2\2\u00f4\u00f5"+
		"\7\17\2\2\u00f5\u00f8\7\f\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f4\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8,\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7@"+
		"\2\2\u00fb.\3\2\2\2\u00fc\u00fd\7B\2\2\u00fd\60\3\2\2\2\u00fe\u00ff\7"+
		"~\2\2\u00ff\62\3\2\2\2\u0100\u0101\7<\2\2\u0101\64\3\2\2\2\u0102\u0103"+
		"\7<\2\2\u0103\u0104\7<\2\2\u0104\66\3\2\2\2\u0105\u0106\7<\2\2\u0106\u0107"+
		"\7?\2\2\u01078\3\2\2\2\u0108\u0109\7.\2\2\u0109:\3\2\2\2\u010a\u010b\7"+
		"\60\2\2\u010b<\3\2\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7\60\2\2\u010e"+
		">\3\2\2\2\u010f\u0110\7?\2\2\u0110@\3\2\2\2\u0111\u0112\7@\2\2\u0112B"+
		"\3\2\2\2\u0113\u0114\7@\2\2\u0114\u0115\7?\2\2\u0115D\3\2\2\2\u0116\u0117"+
		"\7%\2\2\u0117F\3\2\2\2\u0118\u0119\7}\2\2\u0119H\3\2\2\2\u011a\u011b\7"+
		"]\2\2\u011bJ\3\2\2\2\u011c\u011d\7>\2\2\u011dL\3\2\2\2\u011e\u011f\7>"+
		"\2\2\u011f\u0120\7?\2\2\u0120N\3\2\2\2\u0121\u0122\7*\2\2\u0122P\3\2\2"+
		"\2\u0123\u0124\7/\2\2\u0124R\3\2\2\2\u0125\u0126\7>\2\2\u0126\u0127\7"+
		"@\2\2\u0127T\3\2\2\2\u0128\u0129\7-\2\2\u0129V\3\2\2\2\u012a\u012b\7\177"+
		"\2\2\u012bX\3\2\2\2\u012c\u012d\7_\2\2\u012dZ\3\2\2\2\u012e\u012f\7+\2"+
		"\2\u012f\\\3\2\2\2\u0130\u0131\7=\2\2\u0131^\3\2\2\2\u0132\u0133\7\61"+
		"\2\2\u0133`\3\2\2\2\u0134\u0135\7,\2\2\u0135b\3\2\2\2\u0136\u0137\7A\2"+
		"\2\u0137d\3\2\2\2\u0138\u0139\7?\2\2\u0139\u013a\7@\2\2\u013af\3\2\2\2"+
		"\u013b\u013c\7#\2\2\u013c\u013d\7?\2\2\u013dh\3\2\2\2\u013e\u0140\4\62"+
		";\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142j\3\2\2\2\u0143\u0152\5i\65\2\u0144\u0145\7\60\2\2"+
		"\u0145\u014b\5i\65\2\u0146\u0148\t\4\2\2\u0147\u0149\t\5\2\2\u0148\u0147"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\5i\65\2\u014b"+
		"\u0146\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0153\3\2\2\2\u014d\u014f\t\4"+
		"\2\2\u014e\u0150\t\5\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\5i\65\2\u0152\u0144\3\2\2\2\u0152\u014d\3\2"+
		"\2\2\u0153l\3\2\2\2\u0154\u0159\7)\2\2\u0155\u0158\n\6\2\2\u0156\u0158"+
		"\5o8\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015d\7)\2\2\u015dn\3\2\2\2\u015e\u0171\7^\2\2\u015f\u0172"+
		"\t\7\2\2\u0160\u0161\7w\2\2\u0161\u0162\5q9\2\u0162\u0163\5q9\2\u0163"+
		"\u0164\5q9\2\u0164\u0165\5q9\2\u0165\u0172\3\2\2\2\u0166\u016b\4\62\65"+
		"\2\u0167\u0169\4\629\2\u0168\u016a\4\629\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u0172\3\2\2\2\u016d\u016f\4\669\2\u016e\u0170\4\629\2\u016f\u016e\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u015f\3\2\2\2\u0171"+
		"\u0160\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u016d\3\2\2\2\u0172p\3\2\2\2"+
		"\u0173\u0174\t\b\2\2\u0174r\3\2\2\2\u0175\u0179\t\t\2\2\u0176\u0178\t"+
		"\n\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017at\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\4\5\u0379"+
		"\2\u017dv\3\2\2\2\24\2\u00d2\u00da\u00df\u00ec\u00f7\u0141\u0148\u014b"+
		"\u014f\u0152\u0157\u0159\u0169\u016b\u016f\u0171\u0179\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}