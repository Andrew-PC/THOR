// Generated from TimeTable.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimeTableParser extends Parser {
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
	public static final int
		RULE_specification = 0, RULE_resource = 1, RULE_resource_declaration = 2, 
		RULE_relation = 3, RULE_list = 4, RULE_concat = 5, RULE_concat_more = 6, 
		RULE_schedule = 7, RULE_constraint = 8, RULE_type = 9, RULE_declaration = 10, 
		RULE_component_decl = 11, RULE_quant_decl = 12, RULE_in_decl = 13, RULE_with_decl = 14, 
		RULE_not_same = 15, RULE_hours = 16, RULE_quantity = 17, RULE_comparison = 18, 
		RULE_accessor = 19, RULE_component = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "resource", "resource_declaration", "relation", "list", 
			"concat", "concat_more", "schedule", "constraint", "type", "declaration", 
			"component_decl", "quant_decl", "in_decl", "with_decl", "not_same", "hours", 
			"quantity", "comparison", "accessor", "component"
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

	@Override
	public String getGrammarFileName() { return "TimeTable.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TimeTableParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TimeTableParser.COLON, 0); }
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(TimeTableParser.LBRACE, 0); }
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TimeTableParser.RBRACE, 0); }
		public List<ScheduleContext> schedule() {
			return getRuleContexts(ScheduleContext.class);
		}
		public ScheduleContext schedule(int i) {
			return getRuleContext(ScheduleContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(COLON);
			setState(44);
			match(ID);
			setState(45);
			match(LBRACE);
			setState(46);
			resource();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(47);
				schedule();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RBRACE);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TimeTableParser.COLON, 0); }
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(TimeTableParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimeTableParser.RBRACE, 0); }
		public List<Resource_declarationContext> resource_declaration() {
			return getRuleContexts(Resource_declarationContext.class);
		}
		public Resource_declarationContext resource_declaration(int i) {
			return getRuleContext(Resource_declarationContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__1);
			setState(56);
			match(COLON);
			setState(57);
			match(ID);
			setState(58);
			match(LBRACE);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==ID) {
				{
				{
				setState(59);
				resource_declaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(RBRACE);
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

	public static class Resource_declarationContext extends ParserRuleContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TimeTableParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TimeTableParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(TimeTableParser.EQUAL, 0); }
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(TimeTableParser.LBRACK, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> RARROW() { return getTokens(TimeTableParser.RARROW); }
		public TerminalNode RARROW(int i) {
			return getToken(TimeTableParser.RARROW, i);
		}
		public TerminalNode RBRACK() { return getToken(TimeTableParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TimeTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimeTableParser.COMMA, i);
		}
		public Component_declContext component_decl() {
			return getRuleContext(Component_declContext.class,0);
		}
		public Resource_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterResource_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitResource_declaration(this);
		}
	}

	public final Resource_declarationContext resource_declaration() throws RecognitionException {
		Resource_declarationContext _localctx = new Resource_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_resource_declaration);
		int _la;
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(67);
					match(ID);
					setState(68);
					match(EQUAL);
					}
				}

				setState(71);
				list();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(72);
					match(T__2);
					setState(73);
					match(ID);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(ID);
				setState(77);
				match(EQUAL);
				setState(78);
				concat();
				{
				setState(79);
				match(T__2);
				setState(80);
				match(ID);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(82);
					match(ID);
					setState(83);
					match(EQUAL);
					}
				}

				setState(86);
				match(LBRACK);
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(87);
						relation();
						setState(88);
						match(RARROW);
						setState(89);
						relation();
						setState(90);
						match(COMMA);
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(97);
				relation();
				setState(98);
				match(RARROW);
				setState(99);
				relation();
				setState(100);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				component_decl();
				setState(103);
				match(RARROW);
				setState(104);
				match(ID);
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

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TimeTableParser.LBRACK, 0); }
		public List<TerminalNode> STRING() { return getTokens(TimeTableParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TimeTableParser.STRING, i);
		}
		public TerminalNode RBRACK() { return getToken(TimeTableParser.RBRACK, 0); }
		public List<Component_declContext> component_decl() {
			return getRuleContexts(Component_declContext.class);
		}
		public Component_declContext component_decl(int i) {
			return getRuleContext(Component_declContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(TimeTableParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimeTableParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TimeTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimeTableParser.COMMA, i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relation);
		try {
			int _alt;
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LBRACK);
				setState(109);
				match(STRING);
				setState(110);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				component_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(112);
				match(LBRACE);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						match(STRING);
						setState(114);
						match(COMMA);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(120);
				match(STRING);
				setState(121);
				match(RBRACE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(122);
				match(LBRACE);
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						component_decl();
						setState(124);
						match(COMMA);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(131);
				component_decl();
				setState(132);
				match(RBRACE);
				}
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TimeTableParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TimeTableParser.RBRACK, 0); }
		public List<TerminalNode> STRING() { return getTokens(TimeTableParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TimeTableParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimeTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimeTableParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LBRACK);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						match(STRING);
						setState(138);
						match(COMMA);
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(144);
				match(STRING);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(RBRACK);
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

	public static class ConcatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public Concat_moreContext concat_more() {
			return getRuleContext(Concat_moreContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitConcat(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concat);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ID);
				setState(153);
				concat_more();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				list();
				setState(155);
				concat_more();
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

	public static class Concat_moreContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TimeTableParser.PLUS, 0); }
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public Concat_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterConcat_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitConcat_more(this);
		}
	}

	public final Concat_moreContext concat_more() throws RecognitionException {
		Concat_moreContext _localctx = new Concat_moreContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_concat_more);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(PLUS);
				setState(160);
				concat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ScheduleContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TimeTableParser.COLON, 0); }
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(TimeTableParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimeTableParser.RBRACE, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitSchedule(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_schedule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__3);
			setState(165);
			match(COLON);
			setState(166);
			match(ID);
			setState(167);
			match(LBRACE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				{
				setState(168);
				constraint();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(RBRACE);
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

	public static class ConstraintContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode COLON() { return getToken(TimeTableParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(176);
				type();
				}
			}

			setState(179);
			match(T__4);
			setState(180);
			match(ID);
			setState(181);
			match(COLON);
			}
			setState(183);
			declaration();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DeclarationContext extends ParserRuleContext {
		public Quant_declContext quant_decl() {
			return getRuleContext(Quant_declContext.class,0);
		}
		public Component_declContext component_decl() {
			return getRuleContext(Component_declContext.class,0);
		}
		public In_declContext in_decl() {
			return getRuleContext(In_declContext.class,0);
		}
		public With_declContext with_decl() {
			return getRuleContext(With_declContext.class,0);
		}
		public Not_sameContext not_same() {
			return getRuleContext(Not_sameContext.class,0);
		}
		public HoursContext hours() {
			return getRuleContext(HoursContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				quant_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				component_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				in_decl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				with_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				not_same();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				hours();
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

	public static class Component_declContext extends ParserRuleContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public Component_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterComponent_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitComponent_decl(this);
		}
	}

	public final Component_declContext component_decl() throws RecognitionException {
		Component_declContext _localctx = new Component_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_component_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(195);
				accessor();
				}
				break;
			}
			setState(198);
			component();
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

	public static class Quant_declContext extends ParserRuleContext {
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public AccessorContext accessor() {
			return getRuleContext(AccessorContext.class,0);
		}
		public Quant_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterQuant_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitQuant_decl(this);
		}
	}

	public final Quant_declContext quant_decl() throws RecognitionException {
		Quant_declContext _localctx = new Quant_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quant_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			quantity();
			setState(201);
			match(T__7);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(202);
				accessor();
				}
				break;
			}
			setState(205);
			match(ID);
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

	public static class In_declContext extends ParserRuleContext {
		public Quant_declContext quant_decl() {
			return getRuleContext(Quant_declContext.class,0);
		}
		public List<Component_declContext> component_decl() {
			return getRuleContexts(Component_declContext.class);
		}
		public Component_declContext component_decl(int i) {
			return getRuleContext(Component_declContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public In_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterIn_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitIn_decl(this);
		}
	}

	public final In_declContext in_decl() throws RecognitionException {
		In_declContext _localctx = new In_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_in_decl);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				quant_decl();
				setState(208);
				match(T__8);
				setState(209);
				component_decl();
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(210);
					match(T__9);
					setState(211);
					component_decl();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				component_decl();
				setState(218);
				match(T__8);
				setState(219);
				component_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				component();
				setState(222);
				match(T__8);
				setState(223);
				component();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(224);
					match(T__10);
					setState(225);
					component();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class With_declContext extends ParserRuleContext {
		public List<Component_declContext> component_decl() {
			return getRuleContexts(Component_declContext.class);
		}
		public Component_declContext component_decl(int i) {
			return getRuleContext(Component_declContext.class,i);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode NEQUAL() { return getToken(TimeTableParser.NEQUAL, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode INT() { return getToken(TimeTableParser.INT, 0); }
		public With_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterWith_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitWith_decl(this);
		}
	}

	public final With_declContext with_decl() throws RecognitionException {
		With_declContext _localctx = new With_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_with_decl);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				component_decl();
				setState(234);
				match(T__11);
				setState(235);
				component_decl();
				setState(236);
				match(T__12);
				setState(237);
				quantity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(ID);
				setState(240);
				match(T__11);
				setState(241);
				component_decl();
				setState(242);
				match(NEQUAL);
				setState(243);
				component_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(T__13);
				setState(246);
				component_decl();
				setState(247);
				match(T__11);
				setState(248);
				comparison();
				setState(249);
				match(INT);
				setState(250);
				match(ID);
				setState(251);
				match(T__8);
				setState(252);
				component_decl();
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

	public static class Not_sameContext extends ParserRuleContext {
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public TerminalNode NEQUAL() { return getToken(TimeTableParser.NEQUAL, 0); }
		public List<Component_declContext> component_decl() {
			return getRuleContexts(Component_declContext.class);
		}
		public Component_declContext component_decl(int i) {
			return getRuleContext(Component_declContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TimeTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimeTableParser.COMMA, i);
		}
		public Not_sameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_same; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterNot_same(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitNot_same(this);
		}
	}

	public final Not_sameContext not_same() throws RecognitionException {
		Not_sameContext _localctx = new Not_sameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_not_same);
		try {
			int _alt;
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				component();
				setState(257);
				match(NEQUAL);
				setState(258);
				component();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						component_decl();
						setState(261);
						match(COMMA);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(268);
				component_decl();
				setState(269);
				match(NEQUAL);
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						component_decl();
						setState(271);
						match(COMMA);
						}
						} 
					}
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(278);
				component_decl();
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

	public static class HoursContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode LESS() { return getToken(TimeTableParser.LESS, 0); }
		public TerminalNode INT() { return getToken(TimeTableParser.INT, 0); }
		public TerminalNode GREATER() { return getToken(TimeTableParser.GREATER, 0); }
		public TerminalNode EQUAL() { return getToken(TimeTableParser.EQUAL, 0); }
		public HoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitHours(this);
		}
	}

	public final HoursContext hours() throws RecognitionException {
		HoursContext _localctx = new HoursContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hours);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(ID);
				setState(283);
				match(T__14);
				setState(284);
				match(LESS);
				setState(285);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(ID);
				setState(287);
				match(T__14);
				setState(288);
				match(GREATER);
				setState(289);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(ID);
				setState(291);
				match(T__14);
				setState(292);
				match(EQUAL);
				setState(293);
				match(INT);
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

	public static class QuantityContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TimeTableParser.INT, 0); }
		public TerminalNode STAR() { return getToken(TimeTableParser.STAR, 0); }
		public TerminalNode QUESTION() { return getToken(TimeTableParser.QUESTION, 0); }
		public TerminalNode PLUS() { return getToken(TimeTableParser.PLUS, 0); }
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitQuantity(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_quantity);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case RBRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(INT);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(STAR);
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(QUESTION);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(PLUS);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(T__15);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				match(T__16);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(TimeTableParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(TimeTableParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(TimeTableParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(TimeTableParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(TimeTableParser.EQUAL, 0); }
		public TerminalNode NEQUAL() { return getToken(TimeTableParser.NEQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << NEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class AccessorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode DOT() { return getToken(TimeTableParser.DOT, 0); }
		public AccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitAccessor(this);
		}
	}

	public final AccessorContext accessor() throws RecognitionException {
		AccessorContext _localctx = new AccessorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accessor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ID);
			setState(308);
			match(DOT);
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

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimeTableParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(TimeTableParser.LBRACK, 0); }
		public TerminalNode STAR() { return getToken(TimeTableParser.STAR, 0); }
		public TerminalNode RBRACK() { return getToken(TimeTableParser.RBRACK, 0); }
		public List<TerminalNode> STRING() { return getTokens(TimeTableParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TimeTableParser.STRING, i);
		}
		public TerminalNode COLON() { return getToken(TimeTableParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(TimeTableParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TimeTableParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TimeTableParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TimeTableParser.COMMA, i);
		}
		public List<Component_declContext> component_decl() {
			return getRuleContexts(Component_declContext.class);
		}
		public Component_declContext component_decl(int i) {
			return getRuleContext(Component_declContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TimeTableListener ) ((TimeTableListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_component);
		try {
			int _alt;
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(ID);
				setState(311);
				match(LBRACK);
				setState(312);
				match(STAR);
				setState(313);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(ID);
				setState(315);
				match(LBRACK);
				setState(316);
				match(STRING);
				setState(317);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(ID);
				setState(319);
				match(LBRACK);
				setState(320);
				match(COLON);
				setState(321);
				match(RBRACK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(ID);
				setState(323);
				match(LBRACK);
				setState(324);
				match(LBRACE);
				setState(325);
				match(STRING);
				setState(326);
				match(RBRACE);
				setState(327);
				match(RBRACK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				match(ID);
				setState(329);
				match(LBRACK);
				{
				setState(330);
				match(LBRACE);
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(331);
						match(STRING);
						setState(332);
						match(COMMA);
						}
						} 
					}
					setState(337);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(338);
				match(STRING);
				setState(339);
				match(RBRACE);
				}
				setState(341);
				match(RBRACK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(ID);
				setState(343);
				match(LBRACK);
				{
				setState(344);
				match(LBRACE);
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						component_decl();
						setState(346);
						match(COMMA);
						}
						} 
					}
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(353);
				component_decl();
				setState(354);
				match(RBRACE);
				}
				setState(356);
				match(RBRACK);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u016b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13"+
		"\3\3\3\3\3\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5\16"+
		"\5\u0084\13\5\3\5\3\5\3\5\5\5\u0089\n\5\3\6\3\6\3\6\7\6\u008e\n\6\f\6"+
		"\16\6\u0091\13\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\t\3\t\3\n\5\n\u00b4\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4\n\f\3\r\5"+
		"\r\u00c7\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ce\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00d7\n\17\f\17\16\17\u00da\13\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e5\n\17\f\17\16\17\u00e8\13\17"+
		"\5\17\u00ea\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0101\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u010a\n\21\f\21\16\21\u010d\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0114\n\21\f\21\16\21\u0117\13\21\3\21"+
		"\3\21\5\21\u011b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0129\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0132"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0150\n\26\f\26\16\26\u0153\13\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u015f\n\26\f\26\16\26\u0162\13\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0169\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\4\3\2\b\t\5\2 \"&\'\64\64\2\u0188\2,\3\2\2"+
		"\2\49\3\2\2\2\6l\3\2\2\2\b\u0088\3\2\2\2\n\u008a\3\2\2\2\f\u009f\3\2\2"+
		"\2\16\u00a4\3\2\2\2\20\u00a6\3\2\2\2\22\u00b3\3\2\2\2\24\u00bb\3\2\2\2"+
		"\26\u00c3\3\2\2\2\30\u00c6\3\2\2\2\32\u00ca\3\2\2\2\34\u00e9\3\2\2\2\36"+
		"\u0100\3\2\2\2 \u011a\3\2\2\2\"\u0128\3\2\2\2$\u0131\3\2\2\2&\u0133\3"+
		"\2\2\2(\u0135\3\2\2\2*\u0168\3\2\2\2,-\7\3\2\2-.\7\32\2\2./\7\67\2\2/"+
		"\60\7$\2\2\60\64\5\4\3\2\61\63\5\20\t\2\62\61\3\2\2\2\63\66\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7,\2\28\3\3"+
		"\2\2\29:\7\4\2\2:;\7\32\2\2;<\7\67\2\2<@\7$\2\2=?\5\6\4\2>=\3\2\2\2?B"+
		"\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7,\2\2D\5\3\2\2\2E"+
		"F\7\67\2\2FH\7 \2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IL\5\n\6\2JK\7\5\2\2"+
		"KM\7\67\2\2LJ\3\2\2\2LM\3\2\2\2Mm\3\2\2\2NO\7\67\2\2OP\7 \2\2PQ\5\f\7"+
		"\2QR\7\5\2\2RS\7\67\2\2Sm\3\2\2\2TU\7\67\2\2UW\7 \2\2VT\3\2\2\2VW\3\2"+
		"\2\2WX\3\2\2\2X`\7%\2\2YZ\5\b\5\2Z[\7\63\2\2[\\\5\b\5\2\\]\7\35\2\2]_"+
		"\3\2\2\2^Y\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2c"+
		"d\5\b\5\2de\7\63\2\2ef\5\b\5\2fg\7-\2\2gm\3\2\2\2hi\5\30\r\2ij\7\63\2"+
		"\2jk\7\67\2\2km\3\2\2\2lG\3\2\2\2lN\3\2\2\2lV\3\2\2\2lh\3\2\2\2m\7\3\2"+
		"\2\2no\7%\2\2op\7\66\2\2p\u0089\7-\2\2q\u0089\5\30\r\2rw\7$\2\2st\7\66"+
		"\2\2tv\7\35\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3"+
		"\2\2\2z{\7\66\2\2{\u0089\7,\2\2|\u0082\7$\2\2}~\5\30\r\2~\177\7\35\2\2"+
		"\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\30\r\2\u0086\u0087\7,\2\2\u0087\u0089\3\2\2\2\u0088n\3\2\2\2"+
		"\u0088q\3\2\2\2\u0088r\3\2\2\2\u0088|\3\2\2\2\u0089\t\3\2\2\2\u008a\u0095"+
		"\7%\2\2\u008b\u008c\7\66\2\2\u008c\u008e\7\35\2\2\u008d\u008b\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\66\2\2\u0093\u008f\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7-\2\2\u0099\13\3\2\2\2\u009a"+
		"\u009b\7\67\2\2\u009b\u00a0\5\16\b\2\u009c\u009d\5\n\6\2\u009d\u009e\5"+
		"\16\b\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009c\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2\u00a5\5\f\7\2\u00a3\u00a5\3\2\2\2"+
		"\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a7"+
		"\7\6\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00ad\7$\2\2"+
		"\u00aa\u00ac\5\22\n\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7,\2\2\u00b1\21\3\2\2\2\u00b2\u00b4\5\24\13\2\u00b3\u00b2\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7"+
		"\7\67\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5\26\f"+
		"\2\u00ba\23\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\25\3\2\2\2\u00bd\u00c4\5"+
		"\32\16\2\u00be\u00c4\5\30\r\2\u00bf\u00c4\5\34\17\2\u00c0\u00c4\5\36\20"+
		"\2\u00c1\u00c4\5 \21\2\u00c2\u00c4\5\"\22\2\u00c3\u00bd\3\2\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\27\3\2\2\2\u00c5\u00c7\5(\25\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\5*\26\2\u00c9"+
		"\31\3\2\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cd\7\n\2\2\u00cc\u00ce\5(\25"+
		"\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\7\67\2\2\u00d0\33\3\2\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3\7\13\2\2"+
		"\u00d3\u00d8\5\30\r\2\u00d4\u00d5\7\f\2\2\u00d5\u00d7\5\30\r\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00ea\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd\7"+
		"\13\2\2\u00dd\u00de\5\30\r\2\u00de\u00ea\3\2\2\2\u00df\u00e0\5*\26\2\u00e0"+
		"\u00e1\7\13\2\2\u00e1\u00e6\5*\26\2\u00e2\u00e3\7\r\2\2\u00e3\u00e5\5"+
		"*\26\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00d1\3\2"+
		"\2\2\u00e9\u00db\3\2\2\2\u00e9\u00df\3\2\2\2\u00ea\35\3\2\2\2\u00eb\u00ec"+
		"\5\30\r\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5\30\r\2\u00ee\u00ef\7\17\2"+
		"\2\u00ef\u00f0\5$\23\2\u00f0\u0101\3\2\2\2\u00f1\u00f2\7\67\2\2\u00f2"+
		"\u00f3\7\16\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\7\64\2\2\u00f5\u00f6"+
		"\5\30\r\2\u00f6\u0101\3\2\2\2\u00f7\u00f8\7\20\2\2\u00f8\u00f9\5\30\r"+
		"\2\u00f9\u00fa\7\16\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc\7\65\2\2\u00fc"+
		"\u00fd\7\67\2\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0101"+
		"\3\2\2\2\u0100\u00eb\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f7\3\2\2\2\u0101"+
		"\37\3\2\2\2\u0102\u0103\5*\26\2\u0103\u0104\7\64\2\2\u0104\u0105\5*\26"+
		"\2\u0105\u011b\3\2\2\2\u0106\u0107\5\30\r\2\u0107\u0108\7\35\2\2\u0108"+
		"\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\5\30\r\2\u010f\u0115\7\64\2\2\u0110\u0111\5\30\r\2\u0111\u0112"+
		"\7\35\2\2\u0112\u0114\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0117\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0118\u0119\5\30\r\2\u0119\u011b\3\2\2\2\u011a\u0102\3\2\2\2"+
		"\u011a\u010b\3\2\2\2\u011b!\3\2\2\2\u011c\u011d\7\67\2\2\u011d\u011e\7"+
		"\21\2\2\u011e\u011f\7&\2\2\u011f\u0129\7\65\2\2\u0120\u0121\7\67\2\2\u0121"+
		"\u0122\7\21\2\2\u0122\u0123\7!\2\2\u0123\u0129\7\65\2\2\u0124\u0125\7"+
		"\67\2\2\u0125\u0126\7\21\2\2\u0126\u0127\7 \2\2\u0127\u0129\7\65\2\2\u0128"+
		"\u011c\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0124\3\2\2\2\u0129#\3\2\2\2"+
		"\u012a\u0132\3\2\2\2\u012b\u0132\7\65\2\2\u012c\u0132\7\61\2\2\u012d\u0132"+
		"\7\62\2\2\u012e\u0132\7+\2\2\u012f\u0132\7\22\2\2\u0130\u0132\7\23\2\2"+
		"\u0131\u012a\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012d"+
		"\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"%\3\2\2\2\u0133\u0134\t\3\2\2\u0134\'\3\2\2\2\u0135\u0136\7\67\2\2\u0136"+
		"\u0137\7\36\2\2\u0137)\3\2\2\2\u0138\u0139\7\67\2\2\u0139\u013a\7%\2\2"+
		"\u013a\u013b\7\61\2\2\u013b\u0169\7-\2\2\u013c\u013d\7\67\2\2\u013d\u013e"+
		"\7%\2\2\u013e\u013f\7\66\2\2\u013f\u0169\7-\2\2\u0140\u0141\7\67\2\2\u0141"+
		"\u0142\7%\2\2\u0142\u0143\7\32\2\2\u0143\u0169\7-\2\2\u0144\u0145\7\67"+
		"\2\2\u0145\u0146\7%\2\2\u0146\u0147\7$\2\2\u0147\u0148\7\66\2\2\u0148"+
		"\u0149\7,\2\2\u0149\u0169\7-\2\2\u014a\u014b\7\67\2\2\u014b\u014c\7%\2"+
		"\2\u014c\u0151\7$\2\2\u014d\u014e\7\66\2\2\u014e\u0150\7\35\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7\66\2\2\u0155"+
		"\u0156\7,\2\2\u0156\u0157\3\2\2\2\u0157\u0169\7-\2\2\u0158\u0159\7\67"+
		"\2\2\u0159\u015a\7%\2\2\u015a\u0160\7$\2\2\u015b\u015c\5\30\r\2\u015c"+
		"\u015d\7\35\2\2\u015d\u015f\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\5\30\r\2\u0164\u0165\7,\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0167\7-\2\2\u0167\u0169\3\2\2\2\u0168\u0138\3\2\2\2\u0168"+
		"\u013c\3\2\2\2\u0168\u0140\3\2\2\2\u0168\u0144\3\2\2\2\u0168\u014a\3\2"+
		"\2\2\u0168\u0158\3\2\2\2\u0169+\3\2\2\2!\64@GLV`lw\u0082\u0088\u008f\u0095"+
		"\u009f\u00a4\u00ad\u00b3\u00c3\u00c6\u00cd\u00d8\u00e6\u00e9\u0100\u010b"+
		"\u0115\u011a\u0128\u0131\u0151\u0160\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}