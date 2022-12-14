// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sintactico extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSEIF=2, ELSE=3, WHILE=4, FUNCTION=5, RETURN=6, LET=7, CI=8, CD=9, 
		PI=10, PD=11, PUNTOCOMA=12, COMA=13, AND=14, OR=15, XOR=16, NEG=17, SUM=18, 
		REST=19, MULT=20, DIV=21, EXP=22, MOD=23, IGUAL=24, MENORQUE=25, MENORIGUALQUE=26, 
		MAYORQUE=27, MAYORIGUALQUE=28, IGUALA=29, DISTINTO=30, LINEA=31, BLOQUE=32, 
		WS=33, NUMERICO=34, TEXTO=35, BOOLEANO=36, COMILLASIMPLE=37, LETRAS=38, 
		LETRA=39, VAR=40;
	public static final int
		RULE_axioma = 0, RULE_sentencia = 1, RULE_decl = 2, RULE_asig = 3, RULE_expr = 4, 
		RULE_bloque = 5, RULE_cond = 6, RULE_cuerpocondicion = 7, RULE_bucle = 8, 
		RULE_buclewhile = 9, RULE_llamadafuncion = 10, RULE_cuerpoargumentos = 11, 
		RULE_argumentos = 12, RULE_argumento = 13, RULE_func = 14, RULE_cuerpofuncion = 15, 
		RULE_parametros = 16, RULE_parametro = 17, RULE_dev = 18, RULE_opercomparacion = 19, 
		RULE_operlogico = 20, RULE_opermuldiv = 21, RULE_opermodexp = 22, RULE_opersumrest = 23, 
		RULE_polinomio = 24, RULE_monomio = 25, RULE_signonumerico = 26, RULE_let = 27, 
		RULE_if = 28, RULE_elseif = 29, RULE_else = 30, RULE_while = 31, RULE_function = 32, 
		RULE_return = 33, RULE_letra = 34, RULE_letras = 35, RULE_identificador = 36, 
		RULE_nombrefuncion = 37, RULE_opersum = 38, RULE_operrest = 39, RULE_opermul = 40, 
		RULE_operdiv = 41, RULE_operexp = 42, RULE_opermod = 43, RULE_opermenorque = 44, 
		RULE_opermenorigualque = 45, RULE_opermayorque = 46, RULE_opermayorigualque = 47, 
		RULE_operiguala = 48, RULE_operdistinto = 49, RULE_operand = 50, RULE_operor = 51, 
		RULE_operxor = 52, RULE_operneg = 53, RULE_numerico = 54, RULE_cadena = 55, 
		RULE_booleano = 56, RULE_igual = 57, RULE_ci = 58, RULE_cd = 59, RULE_pi = 60, 
		RULE_pd = 61, RULE_comillasimple = 62, RULE_puntocoma = 63, RULE_coma = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"axioma", "sentencia", "decl", "asig", "expr", "bloque", "cond", "cuerpocondicion", 
			"bucle", "buclewhile", "llamadafuncion", "cuerpoargumentos", "argumentos", 
			"argumento", "func", "cuerpofuncion", "parametros", "parametro", "dev", 
			"opercomparacion", "operlogico", "opermuldiv", "opermodexp", "opersumrest", 
			"polinomio", "monomio", "signonumerico", "let", "if", "elseif", "else", 
			"while", "function", "return", "letra", "letras", "identificador", "nombrefuncion", 
			"opersum", "operrest", "opermul", "operdiv", "operexp", "opermod", "opermenorque", 
			"opermenorigualque", "opermayorque", "opermayorigualque", "operiguala", 
			"operdistinto", "operand", "operor", "operxor", "operneg", "numerico", 
			"cadena", "booleano", "igual", "ci", "cd", "pi", "pd", "comillasimple", 
			"puntocoma", "coma"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else if'", "'else'", "'while'", "'function'", "'return'", 
			"'let'", "'{'", "'}'", "'('", "')'", "';'", "','", "'&&'", "'||'", "'##'", 
			"'!'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'='", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", null, null, null, null, null, null, "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSEIF", "ELSE", "WHILE", "FUNCTION", "RETURN", "LET", "CI", 
			"CD", "PI", "PD", "PUNTOCOMA", "COMA", "AND", "OR", "XOR", "NEG", "SUM", 
			"REST", "MULT", "DIV", "EXP", "MOD", "IGUAL", "MENORQUE", "MENORIGUALQUE", 
			"MAYORQUE", "MAYORIGUALQUE", "IGUALA", "DISTINTO", "LINEA", "BLOQUE", 
			"WS", "NUMERICO", "TEXTO", "BOOLEANO", "COMILLASIMPLE", "LETRAS", "LETRA", 
			"VAR"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sintactico(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AxiomaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sintactico.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public List<PuntocomaContext> puntocoma() {
			return getRuleContexts(PuntocomaContext.class);
		}
		public PuntocomaContext puntocoma(int i) {
			return getRuleContext(PuntocomaContext.class,i);
		}
		public AxiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axioma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterAxioma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitAxioma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitAxioma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxiomaContext axioma() throws RecognitionException {
		AxiomaContext _localctx = new AxiomaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_axioma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(130);
				func();
				setState(131);
				puntocoma();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public PuntocomaContext puntocoma() {
			return getRuleContext(PuntocomaContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public DevContext dev() {
			return getRuleContext(DevContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).enterSentencia(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(140);
				decl();
				}
				break;
			case 2:
				{
				setState(141);
				asig();
				}
				break;
			case 3:
				{
				setState(142);
				expr(0);
				}
				break;
			case 4:
				{
				setState(143);
				cond();
				}
				break;
			case 5:
				{
				setState(144);
				bucle();
				}
				break;
			case 6:
				{
				setState(145);
				dev();
				}
				break;
			case 7:
				{
				setState(146);
				bloque();
				}
				break;
			}
			setState(149);
			puntocoma();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetIdentificadorContext extends DeclContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public LetIdentificadorContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLetIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitLetIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLetIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LetAsignacionContext extends DeclContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public LetAsignacionContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLetAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitLetAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLetAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new LetIdentificadorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				let();
				setState(152);
				identificador();
				}
				break;
			case 2:
				_localctx = new LetAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				let();
				setState(155);
				asig();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitAsig(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			identificador();
			setState(160);
			igual();
			setState(161);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class MuldivoperContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpermuldivContext opermuldiv() {
			return getRuleContext(OpermuldivContext.class,0);
		}
		public MuldivoperContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterMuldivoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitMuldivoper(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitMuldivoper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExprContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CadContext extends ExprContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public CadContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCad(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PoliContext extends ExprContext {
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public PoliContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterPoli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitPoli(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitPoli(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacionContext extends ExprContext {
		public OpernegContext operneg() {
			return getRuleContext(OpernegContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegacionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitNegacion(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericContext extends ExprContext {
		public NumericoContext numerico() {
			return getRuleContext(NumericoContext.class,0);
		}
		public NumericContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModexpoperContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpermodexpContext opermodexp() {
			return getRuleContext(OpermodexpContext.class,0);
		}
		public ModexpoperContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterModexpoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitModexpoper(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitModexpoper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdeContext extends ExprContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public IdeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterIde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitIde(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitIde(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionoperContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpercomparacionContext opercomparacion() {
			return getRuleContext(OpercomparacionContext.class,0);
		}
		public ComparacionoperContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterComparacionoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitComparacionoper(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitComparacionoper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExprContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignumericoContext extends ExprContext {
		public SignonumericoContext signonumerico() {
			return getRuleContext(SignonumericoContext.class,0);
		}
		public SignumericoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterSignumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitSignumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitSignumerico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicooperContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperlogicoContext operlogico() {
			return getRuleContext(OperlogicoContext.class,0);
		}
		public LogicooperContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLogicooper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitLogicooper(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLogicooper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumrestoperContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpersumrestContext opersumrest() {
			return getRuleContext(OpersumrestContext.class,0);
		}
		public SumrestoperContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterSumrestoper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitSumrestoper(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitSumrestoper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ExprContext {
		public LlamadafuncionContext llamadafuncion() {
			return getRuleContext(LlamadafuncionContext.class,0);
		}
		public FuncionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitFuncion(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitFuncion(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				pi();
				setState(165);
				expr(0);
				setState(166);
				pd();
				}
				break;
			case 2:
				{
				_localctx = new NegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				operneg();
				setState(169);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new IdeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				identificador();
				}
				break;
			case 4:
				{
				_localctx = new CadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				cadena();
				}
				break;
			case 5:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				booleano();
				}
				break;
			case 6:
				{
				_localctx = new SignumericoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				signonumerico();
				}
				break;
			case 7:
				{
				_localctx = new NumericContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				numerico();
				}
				break;
			case 8:
				{
				_localctx = new PoliContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				polinomio();
				}
				break;
			case 9:
				{
				_localctx = new FuncionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				llamadafuncion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ModexpoperContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(181);
						opermodexp();
						setState(182);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new MuldivoperContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(185);
						opermuldiv();
						setState(186);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new SumrestoperContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(189);
						opersumrest();
						setState(190);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ComparacionoperContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193);
						opercomparacion();
						setState(194);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new LogicooperContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						operlogico();
						setState(198);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(204);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public CiContext ci() {
			return getRuleContext(CiContext.class,0);
		}
		public CdContext cd() {
			return getRuleContext(CdContext.class,0);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			ci();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843518930L) != 0) {
				{
				{
				setState(206);
				sentencia();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			cd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends CondContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public List<CuerpocondicionContext> cuerpocondicion() {
			return getRuleContexts(CuerpocondicionContext.class);
		}
		public CuerpocondicionContext cuerpocondicion(int i) {
			return getRuleContext(CuerpocondicionContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public CondicionContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			_localctx = new CondicionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			if_();
			setState(215);
			cuerpocondicion();
			setState(216);
			bloque();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(217);
				elseif();
				setState(218);
				cuerpocondicion();
				setState(219);
				bloque();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(226);
				else_();
				setState(227);
				bloque();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpocondicionContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public CuerpocondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpocondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCuerpocondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitCuerpocondicion(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCuerpocondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpocondicionContext cuerpocondicion() throws RecognitionException {
		CuerpocondicionContext _localctx = new CuerpocondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cuerpocondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			pi();
			setState(232);
			expr(0);
			setState(233);
			pd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BucleContext extends ParserRuleContext {
		public BuclewhileContext buclewhile() {
			return getRuleContext(BuclewhileContext.class,0);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			buclewhile();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BuclewhileContext extends ParserRuleContext {
		public BuclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclewhile; }
	 
		public BuclewhileContext() { }
		public void copyFrom(BuclewhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilebucleContext extends BuclewhileContext {
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public CuerpocondicionContext cuerpocondicion() {
			return getRuleContext(CuerpocondicionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public WhilebucleContext(BuclewhileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterWhilebucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitWhilebucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitWhilebucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_buclewhile);
		try {
			_localctx = new WhilebucleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			while_();
			setState(238);
			cuerpocondicion();
			setState(239);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadafuncionContext extends ParserRuleContext {
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public CuerpoargumentosContext cuerpoargumentos() {
			return getRuleContext(CuerpoargumentosContext.class,0);
		}
		public LlamadafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadafuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLlamadafuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitLlamadafuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLlamadafuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadafuncionContext llamadafuncion() throws RecognitionException {
		LlamadafuncionContext _localctx = new LlamadafuncionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_llamadafuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			nombrefuncion();
			setState(242);
			cuerpoargumentos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpoargumentosContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public CuerpoargumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoargumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCuerpoargumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCuerpoargumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCuerpoargumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoargumentosContext cuerpoargumentos() throws RecognitionException {
		CuerpoargumentosContext _localctx = new CuerpoargumentosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpoargumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			pi();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843518464L) != 0) {
				{
				setState(245);
				argumentos();
				}
			}

			setState(248);
			pd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			argumento();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(251);
				coma();
				setState(252);
				argumento();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
		public CuerpofuncionContext cuerpofuncion() {
			return getRuleContext(CuerpofuncionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			function();
			setState(262);
			nombrefuncion();
			setState(263);
			cuerpofuncion();
			setState(264);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpofuncionContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public CuerpofuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpofuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCuerpofuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCuerpofuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCuerpofuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpofuncionContext cuerpofuncion() throws RecognitionException {
		CuerpofuncionContext _localctx = new CuerpofuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cuerpofuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			pi();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0) {
				{
				setState(267);
				parametros();
				}
			}

			setState(270);
			pd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			parametro();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(273);
				coma();
				setState(274);
				parametro();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			identificador();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DevContext extends ParserRuleContext {
		public DevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dev; }
	 
		public DevContext() { }
		public void copyFrom(DevContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends DevContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(DevContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DevContext dev() throws RecognitionException {
		DevContext _localctx = new DevContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dev);
		int _la;
		try {
			_localctx = new RetornoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			return_();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 2181843518464L) != 0) {
				{
				setState(284);
				expr(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpercomparacionContext extends ParserRuleContext {
		public OpermenorqueContext opermenorque() {
			return getRuleContext(OpermenorqueContext.class,0);
		}
		public OpermayorqueContext opermayorque() {
			return getRuleContext(OpermayorqueContext.class,0);
		}
		public OpermayorigualqueContext opermayorigualque() {
			return getRuleContext(OpermayorigualqueContext.class,0);
		}
		public OpermenorigualqueContext opermenorigualque() {
			return getRuleContext(OpermenorigualqueContext.class,0);
		}
		public OperigualaContext operiguala() {
			return getRuleContext(OperigualaContext.class,0);
		}
		public OperdistintoContext operdistinto() {
			return getRuleContext(OperdistintoContext.class,0);
		}
		public OpercomparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opercomparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpercomparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpercomparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpercomparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpercomparacionContext opercomparacion() throws RecognitionException {
		OpercomparacionContext _localctx = new OpercomparacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opercomparacion);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENORQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				opermenorque();
				}
				break;
			case MAYORQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				opermayorque();
				}
				break;
			case MAYORIGUALQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				opermayorigualque();
				}
				break;
			case MENORIGUALQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				opermenorigualque();
				}
				break;
			case IGUALA:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				operiguala();
				}
				break;
			case DISTINTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				operdistinto();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperlogicoContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperorContext operor() {
			return getRuleContext(OperorContext.class,0);
		}
		public OperxorContext operxor() {
			return getRuleContext(OperxorContext.class,0);
		}
		public OperlogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operlogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperlogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperlogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperlogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperlogicoContext operlogico() throws RecognitionException {
		OperlogicoContext _localctx = new OperlogicoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operlogico);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				operand();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				operor();
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				operxor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermuldivContext extends ParserRuleContext {
		public OpermulContext opermul() {
			return getRuleContext(OpermulContext.class,0);
		}
		public OperdivContext operdiv() {
			return getRuleContext(OperdivContext.class,0);
		}
		public OpermuldivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermuldiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermuldiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermuldiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermuldiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermuldivContext opermuldiv() throws RecognitionException {
		OpermuldivContext _localctx = new OpermuldivContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opermuldiv);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				opermul();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				operdiv();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermodexpContext extends ParserRuleContext {
		public OpermodContext opermod() {
			return getRuleContext(OpermodContext.class,0);
		}
		public OperexpContext operexp() {
			return getRuleContext(OperexpContext.class,0);
		}
		public OpermodexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermodexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermodexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermodexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermodexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermodexpContext opermodexp() throws RecognitionException {
		OpermodexpContext _localctx = new OpermodexpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opermodexp);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				opermod();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				operexp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpersumrestContext extends ParserRuleContext {
		public OpersumContext opersum() {
			return getRuleContext(OpersumContext.class,0);
		}
		public OperrestContext operrest() {
			return getRuleContext(OperrestContext.class,0);
		}
		public OpersumrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opersumrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpersumrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpersumrest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpersumrest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpersumrestContext opersumrest() throws RecognitionException {
		OpersumrestContext _localctx = new OpersumrestContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opersumrest);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				opersum();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				operrest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PolinomioContext extends ParserRuleContext {
		public List<ComillasimpleContext> comillasimple() {
			return getRuleContexts(ComillasimpleContext.class);
		}
		public ComillasimpleContext comillasimple(int i) {
			return getRuleContext(ComillasimpleContext.class,i);
		}
		public List<MonomioContext> monomio() {
			return getRuleContexts(MonomioContext.class);
		}
		public MonomioContext monomio(int i) {
			return getRuleContext(MonomioContext.class,i);
		}
		public List<OpersumrestContext> opersumrest() {
			return getRuleContexts(OpersumrestContext.class);
		}
		public OpersumrestContext opersumrest(int i) {
			return getRuleContext(OpersumrestContext.class,i);
		}
		public PolinomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterPolinomio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitPolinomio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitPolinomio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolinomioContext polinomio() throws RecognitionException {
		PolinomioContext _localctx = new PolinomioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_polinomio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			comillasimple();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUM || _la==REST) {
				{
				setState(313);
				opersumrest();
				}
			}

			setState(316);
			monomio();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				{
				setState(317);
				opersumrest();
				setState(318);
				monomio();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			comillasimple();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MonomioContext extends ParserRuleContext {
		public List<NumericoContext> numerico() {
			return getRuleContexts(NumericoContext.class);
		}
		public NumericoContext numerico(int i) {
			return getRuleContext(NumericoContext.class,i);
		}
		public LetrasContext letras() {
			return getRuleContext(LetrasContext.class,0);
		}
		public List<OperexpContext> operexp() {
			return getRuleContexts(OperexpContext.class);
		}
		public OperexpContext operexp(int i) {
			return getRuleContext(OperexpContext.class,i);
		}
		public MonomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monomio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterMonomio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitMonomio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitMonomio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonomioContext monomio() throws RecognitionException {
		MonomioContext _localctx = new MonomioContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_monomio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(327);
				numerico();
				setState(328);
				letras();
				}
				break;
			case 2:
				{
				setState(330);
				numerico();
				}
				break;
			case 3:
				{
				setState(331);
				letras();
				}
				break;
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXP) {
				{
				{
				setState(334);
				operexp();
				setState(335);
				numerico();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SignonumericoContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public OpersumrestContext opersumrest() {
			return getRuleContext(OpersumrestContext.class,0);
		}
		public NumericoContext numerico() {
			return getRuleContext(NumericoContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public SignonumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signonumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterSignonumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitSignonumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitSignonumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignonumericoContext signonumerico() throws RecognitionException {
		SignonumericoContext _localctx = new SignonumericoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signonumerico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			pi();
			setState(343);
			opersumrest();
			setState(344);
			numerico();
			setState(345);
			pd();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(sintactico.LET, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(sintactico.IF, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(IF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(sintactico.ELSEIF, 0); }
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ELSEIF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(sintactico.ELSE, 0); }
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ELSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(sintactico.WHILE, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(WHILE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(sintactico.FUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(FUNCTION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(sintactico.RETURN, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(RETURN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetraContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(sintactico.LETRA, 0); }
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLetra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitLetra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLetra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_letra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(LETRA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetrasContext extends ParserRuleContext {
		public TerminalNode LETRAS() { return getToken(sintactico.LETRAS, 0); }
		public LetrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterLetras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) {
				try {
					((sintacticoListener)listener).exitLetras(this);
				} catch (Errores e) {
					throw new RuntimeException(e);
				}
			}
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitLetras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetrasContext letras() throws RecognitionException {
		LetrasContext _localctx = new LetrasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_letras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LETRAS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sintactico.VAR, 0); }
		public TerminalNode LETRA() { return getToken(sintactico.LETRA, 0); }
		public TerminalNode LETRAS() { return getToken(sintactico.LETRAS, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NombrefuncionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(sintactico.VAR, 0); }
		public TerminalNode LETRA() { return getToken(sintactico.LETRA, 0); }
		public TerminalNode LETRAS() { return getToken(sintactico.LETRAS, 0); }
		public NombrefuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrefuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterNombrefuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitNombrefuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitNombrefuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombrefuncionContext nombrefuncion() throws RecognitionException {
		NombrefuncionContext _localctx = new NombrefuncionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nombrefuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpersumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(sintactico.SUM, 0); }
		public OpersumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opersum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpersum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpersum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpersum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpersumContext opersum() throws RecognitionException {
		OpersumContext _localctx = new OpersumContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_opersum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(SUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperrestContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(sintactico.REST, 0); }
		public OperrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperrest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperrest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperrestContext operrest() throws RecognitionException {
		OperrestContext _localctx = new OperrestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operrest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(REST);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermulContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(sintactico.MULT, 0); }
		public OpermulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermulContext opermul() throws RecognitionException {
		OpermulContext _localctx = new OpermulContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opermul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(MULT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperdivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(sintactico.DIV, 0); }
		public OperdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operdiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperdivContext operdiv() throws RecognitionException {
		OperdivContext _localctx = new OperdivContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operdiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(DIV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperexpContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(sintactico.EXP, 0); }
		public OperexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperexpContext operexp() throws RecognitionException {
		OperexpContext _localctx = new OperexpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(EXP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermodContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(sintactico.MOD, 0); }
		public OpermodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermodContext opermod() throws RecognitionException {
		OpermodContext _localctx = new OpermodContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opermod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(MOD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermenorqueContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(sintactico.MENORQUE, 0); }
		public OpermenorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermenorque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermenorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermenorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermenorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermenorqueContext opermenorque() throws RecognitionException {
		OpermenorqueContext _localctx = new OpermenorqueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_opermenorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(MENORQUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermenorigualqueContext extends ParserRuleContext {
		public TerminalNode MENORIGUALQUE() { return getToken(sintactico.MENORIGUALQUE, 0); }
		public OpermenorigualqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermenorigualque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermenorigualque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermenorigualque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermenorigualque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermenorigualqueContext opermenorigualque() throws RecognitionException {
		OpermenorigualqueContext _localctx = new OpermenorigualqueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_opermenorigualque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(MENORIGUALQUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermayorqueContext extends ParserRuleContext {
		public TerminalNode MAYORQUE() { return getToken(sintactico.MAYORQUE, 0); }
		public OpermayorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermayorque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermayorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermayorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermayorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermayorqueContext opermayorque() throws RecognitionException {
		OpermayorqueContext _localctx = new OpermayorqueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opermayorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(MAYORQUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpermayorigualqueContext extends ParserRuleContext {
		public TerminalNode MAYORIGUALQUE() { return getToken(sintactico.MAYORIGUALQUE, 0); }
		public OpermayorigualqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opermayorigualque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOpermayorigualque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOpermayorigualque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOpermayorigualque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpermayorigualqueContext opermayorigualque() throws RecognitionException {
		OpermayorigualqueContext _localctx = new OpermayorigualqueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_opermayorigualque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(MAYORIGUALQUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperigualaContext extends ParserRuleContext {
		public TerminalNode IGUALA() { return getToken(sintactico.IGUALA, 0); }
		public OperigualaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operiguala; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperiguala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperiguala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperiguala(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperigualaContext operiguala() throws RecognitionException {
		OperigualaContext _localctx = new OperigualaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_operiguala);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(IGUALA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperdistintoContext extends ParserRuleContext {
		public TerminalNode DISTINTO() { return getToken(sintactico.DISTINTO, 0); }
		public OperdistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operdistinto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperdistinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperdistinto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperdistinto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperdistintoContext operdistinto() throws RecognitionException {
		OperdistintoContext _localctx = new OperdistintoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_operdistinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(DISTINTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(sintactico.AND, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(AND);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(sintactico.OR, 0); }
		public OperorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperorContext operor() throws RecognitionException {
		OperorContext _localctx = new OperorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(OR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperxorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(sintactico.XOR, 0); }
		public OperxorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operxor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperxor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperxor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperxor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperxorContext operxor() throws RecognitionException {
		OperxorContext _localctx = new OperxorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operxor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(XOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpernegContext extends ParserRuleContext {
		public TerminalNode NEG() { return getToken(sintactico.NEG, 0); }
		public OpernegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operneg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterOperneg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitOperneg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitOperneg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpernegContext operneg() throws RecognitionException {
		OpernegContext _localctx = new OpernegContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_operneg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(NEG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericoContext extends ParserRuleContext {
		public TerminalNode NUMERICO() { return getToken(sintactico.NUMERICO, 0); }
		public NumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterNumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitNumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitNumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericoContext numerico() throws RecognitionException {
		NumericoContext _localctx = new NumericoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_numerico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(NUMERICO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(sintactico.TEXTO, 0); }
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cadena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(TEXTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(sintactico.BOOLEANO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(BOOLEANO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(sintactico.IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IGUAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CiContext extends ParserRuleContext {
		public TerminalNode CI() { return getToken(sintactico.CI, 0); }
		public CiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiContext ci() throws RecognitionException {
		CiContext _localctx = new CiContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(CI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CdContext extends ParserRuleContext {
		public TerminalNode CD() { return getToken(sintactico.CD, 0); }
		public CdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterCd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitCd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitCd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdContext cd() throws RecognitionException {
		CdContext _localctx = new CdContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(CD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PiContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(sintactico.PI, 0); }
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(PI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PdContext extends ParserRuleContext {
		public TerminalNode PD() { return getToken(sintactico.PD, 0); }
		public PdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterPd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitPd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitPd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(PD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComillasimpleContext extends ParserRuleContext {
		public TerminalNode COMILLASIMPLE() { return getToken(sintactico.COMILLASIMPLE, 0); }
		public ComillasimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comillasimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterComillasimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitComillasimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitComillasimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComillasimpleContext comillasimple() throws RecognitionException {
		ComillasimpleContext _localctx = new ComillasimpleContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_comillasimple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(COMILLASIMPLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PuntocomaContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(sintactico.PUNTOCOMA, 0); }
		public PuntocomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntocoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterPuntocoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitPuntocoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitPuntocoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuntocomaContext puntocoma() throws RecognitionException {
		PuntocomaContext _localctx = new PuntocomaContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_puntocoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(PUNTOCOMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(sintactico.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sintacticoListener ) ((sintacticoListener)listener).exitComa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sintacticoVisitor ) return ((sintacticoVisitor<? extends T>)visitor).visitComa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(COMA);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u01a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0086\b\u0000\n\u0000\f\u0000"+
		"\u0089\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0094\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u009e\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b3\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c9\b\u0004\n\u0004"+
		"\f\u0004\u00cc\t\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u00d0\b\u0005"+
		"\n\u0005\f\u0005\u00d3\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00de\b\u0006\n\u0006\f\u0006\u00e1\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00e6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u00f7\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ff\b\f\n\f\f\f"+
		"\u0102\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u010d\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0115\b\u0010\n\u0010\f\u0010\u0118\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u011e\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0126\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u012b\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u012f\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0133"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0137\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u013b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0141\b\u0018\n\u0018\f\u0018\u0144\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u014d\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0152\b\u0019\n\u0019\f\u0019\u0155\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001"+
		"<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001@\u0000"+
		"\u0001\bA\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0000\u0001\u0001\u0000&(\u0192\u0000\u0087\u0001\u0000\u0000"+
		"\u0000\u0002\u0093\u0001\u0000\u0000\u0000\u0004\u009d\u0001\u0000\u0000"+
		"\u0000\u0006\u009f\u0001\u0000\u0000\u0000\b\u00b2\u0001\u0000\u0000\u0000"+
		"\n\u00cd\u0001\u0000\u0000\u0000\f\u00d6\u0001\u0000\u0000\u0000\u000e"+
		"\u00e7\u0001\u0000\u0000\u0000\u0010\u00eb\u0001\u0000\u0000\u0000\u0012"+
		"\u00ed\u0001\u0000\u0000\u0000\u0014\u00f1\u0001\u0000\u0000\u0000\u0016"+
		"\u00f4\u0001\u0000\u0000\u0000\u0018\u00fa\u0001\u0000\u0000\u0000\u001a"+
		"\u0103\u0001\u0000\u0000\u0000\u001c\u0105\u0001\u0000\u0000\u0000\u001e"+
		"\u010a\u0001\u0000\u0000\u0000 \u0110\u0001\u0000\u0000\u0000\"\u0119"+
		"\u0001\u0000\u0000\u0000$\u011b\u0001\u0000\u0000\u0000&\u0125\u0001\u0000"+
		"\u0000\u0000(\u012a\u0001\u0000\u0000\u0000*\u012e\u0001\u0000\u0000\u0000"+
		",\u0132\u0001\u0000\u0000\u0000.\u0136\u0001\u0000\u0000\u00000\u0138"+
		"\u0001\u0000\u0000\u00002\u014c\u0001\u0000\u0000\u00004\u0156\u0001\u0000"+
		"\u0000\u00006\u015b\u0001\u0000\u0000\u00008\u015d\u0001\u0000\u0000\u0000"+
		":\u015f\u0001\u0000\u0000\u0000<\u0161\u0001\u0000\u0000\u0000>\u0163"+
		"\u0001\u0000\u0000\u0000@\u0165\u0001\u0000\u0000\u0000B\u0167\u0001\u0000"+
		"\u0000\u0000D\u0169\u0001\u0000\u0000\u0000F\u016b\u0001\u0000\u0000\u0000"+
		"H\u016d\u0001\u0000\u0000\u0000J\u016f\u0001\u0000\u0000\u0000L\u0171"+
		"\u0001\u0000\u0000\u0000N\u0173\u0001\u0000\u0000\u0000P\u0175\u0001\u0000"+
		"\u0000\u0000R\u0177\u0001\u0000\u0000\u0000T\u0179\u0001\u0000\u0000\u0000"+
		"V\u017b\u0001\u0000\u0000\u0000X\u017d\u0001\u0000\u0000\u0000Z\u017f"+
		"\u0001\u0000\u0000\u0000\\\u0181\u0001\u0000\u0000\u0000^\u0183\u0001"+
		"\u0000\u0000\u0000`\u0185\u0001\u0000\u0000\u0000b\u0187\u0001\u0000\u0000"+
		"\u0000d\u0189\u0001\u0000\u0000\u0000f\u018b\u0001\u0000\u0000\u0000h"+
		"\u018d\u0001\u0000\u0000\u0000j\u018f\u0001\u0000\u0000\u0000l\u0191\u0001"+
		"\u0000\u0000\u0000n\u0193\u0001\u0000\u0000\u0000p\u0195\u0001\u0000\u0000"+
		"\u0000r\u0197\u0001\u0000\u0000\u0000t\u0199\u0001\u0000\u0000\u0000v"+
		"\u019b\u0001\u0000\u0000\u0000x\u019d\u0001\u0000\u0000\u0000z\u019f\u0001"+
		"\u0000\u0000\u0000|\u01a1\u0001\u0000\u0000\u0000~\u01a3\u0001\u0000\u0000"+
		"\u0000\u0080\u01a5\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u001c\u000e"+
		"\u0000\u0083\u0084\u0003~?\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u0082\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u0000\u0000\u0001\u008b\u0001\u0001\u0000\u0000\u0000\u008c"+
		"\u0094\u0003\u0004\u0002\u0000\u008d\u0094\u0003\u0006\u0003\u0000\u008e"+
		"\u0094\u0003\b\u0004\u0000\u008f\u0094\u0003\f\u0006\u0000\u0090\u0094"+
		"\u0003\u0010\b\u0000\u0091\u0094\u0003$\u0012\u0000\u0092\u0094\u0003"+
		"\n\u0005\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000"+
		"\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000"+
		"\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0003~?\u0000\u0096\u0003\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u00036\u001b\u0000\u0098\u0099\u0003H$\u0000\u0099\u009e"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u00036\u001b\u0000\u009b\u009c\u0003"+
		"\u0006\u0003\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0097\u0001"+
		"\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009e\u0005\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003H$\u0000\u00a0\u00a1\u0003r9\u0000"+
		"\u00a1\u00a2\u0003\b\u0004\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0006\u0004\uffff\uffff\u0000\u00a4\u00a5\u0003x<\u0000\u00a5\u00a6"+
		"\u0003\b\u0004\u0000\u00a6\u00a7\u0003z=\u0000\u00a7\u00b3\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0003j5\u0000\u00a9\u00aa\u0003\b\u0004\b\u00aa"+
		"\u00b3\u0001\u0000\u0000\u0000\u00ab\u00b3\u0003H$\u0000\u00ac\u00b3\u0003"+
		"n7\u0000\u00ad\u00b3\u0003p8\u0000\u00ae\u00b3\u00034\u001a\u0000\u00af"+
		"\u00b3\u0003l6\u0000\u00b0\u00b3\u00030\u0018\u0000\u00b1\u00b3\u0003"+
		"\u0014\n\u0000\u00b2\u00a3\u0001\u0000\u0000\u0000\u00b2\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b2\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00ca\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\n\r\u0000\u0000\u00b5\u00b6\u0003,\u0016\u0000"+
		"\u00b6\u00b7\u0003\b\u0004\u000e\u00b7\u00c9\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\n\f\u0000\u0000\u00b9\u00ba\u0003*\u0015\u0000\u00ba\u00bb\u0003"+
		"\b\u0004\r\u00bb\u00c9\u0001\u0000\u0000\u0000\u00bc\u00bd\n\u000b\u0000"+
		"\u0000\u00bd\u00be\u0003.\u0017\u0000\u00be\u00bf\u0003\b\u0004\f\u00bf"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c0\u00c1\n\n\u0000\u0000\u00c1\u00c2"+
		"\u0003&\u0013\u0000\u00c2\u00c3\u0003\b\u0004\u000b\u00c3\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\n\t\u0000\u0000\u00c5\u00c6\u0003(\u0014"+
		"\u0000\u00c6\u00c7\u0003\b\u0004\n\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00b4\u0001\u0000\u0000\u0000\u00c8\u00b8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\t\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d1\u0003t:\u0000\u00ce\u00d0\u0003\u0002\u0001\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003"+
		"v;\u0000\u00d5\u000b\u0001\u0000\u0000\u0000\u00d6\u00d7\u00038\u001c"+
		"\u0000\u00d7\u00d8\u0003\u000e\u0007\u0000\u00d8\u00df\u0003\n\u0005\u0000"+
		"\u00d9\u00da\u0003:\u001d\u0000\u00da\u00db\u0003\u000e\u0007\u0000\u00db"+
		"\u00dc\u0003\n\u0005\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d9"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0003<\u001e\u0000\u00e3\u00e4\u0003\n\u0005\u0000\u00e4\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\r\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003x"+
		"<\u0000\u00e8\u00e9\u0003\b\u0004\u0000\u00e9\u00ea\u0003z=\u0000\u00ea"+
		"\u000f\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003\u0012\t\u0000\u00ec\u0011"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003>\u001f\u0000\u00ee\u00ef\u0003"+
		"\u000e\u0007\u0000\u00ef\u00f0\u0003\n\u0005\u0000\u00f0\u0013\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0003J%\u0000\u00f2\u00f3\u0003\u0016\u000b\u0000"+
		"\u00f3\u0015\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003x<\u0000\u00f5\u00f7"+
		"\u0003\u0018\f\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003"+
		"z=\u0000\u00f9\u0017\u0001\u0000\u0000\u0000\u00fa\u0100\u0003\u001a\r"+
		"\u0000\u00fb\u00fc\u0003\u0080@\u0000\u00fc\u00fd\u0003\u001a\r\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0019\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0003\b\u0004\u0000\u0104"+
		"\u001b\u0001\u0000\u0000\u0000\u0105\u0106\u0003@ \u0000\u0106\u0107\u0003"+
		"J%\u0000\u0107\u0108\u0003\u001e\u000f\u0000\u0108\u0109\u0003\n\u0005"+
		"\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u010a\u010c\u0003x<\u0000\u010b"+
		"\u010d\u0003 \u0010\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0003z=\u0000\u010f\u001f\u0001\u0000\u0000\u0000\u0110\u0116\u0003\""+
		"\u0011\u0000\u0111\u0112\u0003\u0080@\u0000\u0112\u0113\u0003\"\u0011"+
		"\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0111\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117!\u0001\u0000\u0000\u0000"+
		"\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0003H$\u0000\u011a#"+
		"\u0001\u0000\u0000\u0000\u011b\u011d\u0003B!\u0000\u011c\u011e\u0003\b"+
		"\u0004\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e%\u0001\u0000\u0000\u0000\u011f\u0126\u0003X,\u0000"+
		"\u0120\u0126\u0003\\.\u0000\u0121\u0126\u0003^/\u0000\u0122\u0126\u0003"+
		"Z-\u0000\u0123\u0126\u0003`0\u0000\u0124\u0126\u0003b1\u0000\u0125\u011f"+
		"\u0001\u0000\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0121"+
		"\u0001\u0000\u0000\u0000\u0125\u0122\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\'\u0001"+
		"\u0000\u0000\u0000\u0127\u012b\u0003d2\u0000\u0128\u012b\u0003f3\u0000"+
		"\u0129\u012b\u0003h4\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b)\u0001"+
		"\u0000\u0000\u0000\u012c\u012f\u0003P(\u0000\u012d\u012f\u0003R)\u0000"+
		"\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000"+
		"\u012f+\u0001\u0000\u0000\u0000\u0130\u0133\u0003V+\u0000\u0131\u0133"+
		"\u0003T*\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000"+
		"\u0000\u0000\u0133-\u0001\u0000\u0000\u0000\u0134\u0137\u0003L&\u0000"+
		"\u0135\u0137\u0003N\'\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136"+
		"\u0135\u0001\u0000\u0000\u0000\u0137/\u0001\u0000\u0000\u0000\u0138\u013a"+
		"\u0003|>\u0000\u0139\u013b\u0003.\u0017\u0000\u013a\u0139\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u0142\u00032\u0019\u0000\u013d\u013e\u0003.\u0017\u0000"+
		"\u013e\u013f\u00032\u0019\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140"+
		"\u013d\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0003|>\u0000\u01461\u0001\u0000\u0000\u0000\u0147\u0148\u0003"+
		"l6\u0000\u0148\u0149\u0003F#\u0000\u0149\u014d\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0003l6\u0000\u014b\u014d\u0003F#\u0000\u014c\u0147\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u0153\u0001\u0000\u0000\u0000\u014e\u014f\u0003"+
		"T*\u0000\u014f\u0150\u0003l6\u0000\u0150\u0152\u0001\u0000\u0000\u0000"+
		"\u0151\u014e\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u01543\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0003x<\u0000\u0157\u0158\u0003.\u0017\u0000\u0158\u0159\u0003"+
		"l6\u0000\u0159\u015a\u0003z=\u0000\u015a5\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005\u0007\u0000\u0000\u015c7\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0005\u0001\u0000\u0000\u015e9\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0002\u0000\u0000\u0160;\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0003"+
		"\u0000\u0000\u0162=\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0004\u0000"+
		"\u0000\u0164?\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0005\u0000\u0000"+
		"\u0166A\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0006\u0000\u0000\u0168"+
		"C\u0001\u0000\u0000\u0000\u0169\u016a\u0005\'\u0000\u0000\u016aE\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0005&\u0000\u0000\u016cG\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0007\u0000\u0000\u0000\u016eI\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0007\u0000\u0000\u0000\u0170K\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005\u0012\u0000\u0000\u0172M\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0005\u0013\u0000\u0000\u0174O\u0001\u0000\u0000\u0000\u0175\u0176\u0005"+
		"\u0014\u0000\u0000\u0176Q\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0015"+
		"\u0000\u0000\u0178S\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0016\u0000"+
		"\u0000\u017aU\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0017\u0000\u0000"+
		"\u017cW\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u0019\u0000\u0000\u017e"+
		"Y\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u001a\u0000\u0000\u0180[\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005\u001b\u0000\u0000\u0182]\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0005\u001c\u0000\u0000\u0184_\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0005\u001d\u0000\u0000\u0186a\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0005\u001e\u0000\u0000\u0188c\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0005\u000e\u0000\u0000\u018ae\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\u000f\u0000\u0000\u018cg\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"\u0010\u0000\u0000\u018ei\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0011"+
		"\u0000\u0000\u0190k\u0001\u0000\u0000\u0000\u0191\u0192\u0005\"\u0000"+
		"\u0000\u0192m\u0001\u0000\u0000\u0000\u0193\u0194\u0005#\u0000\u0000\u0194"+
		"o\u0001\u0000\u0000\u0000\u0195\u0196\u0005$\u0000\u0000\u0196q\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005\u0018\u0000\u0000\u0198s\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0005\b\u0000\u0000\u019au\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\t\u0000\u0000\u019cw\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0005\n\u0000\u0000\u019ey\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005\u000b\u0000\u0000\u01a0{\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0005%\u0000\u0000\u01a2}\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\f"+
		"\u0000\u0000\u01a4\u007f\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\r\u0000"+
		"\u0000\u01a6\u0081\u0001\u0000\u0000\u0000\u0017\u0087\u0093\u009d\u00b2"+
		"\u00c8\u00ca\u00d1\u00df\u00e5\u00f6\u0100\u010c\u0116\u011d\u0125\u012a"+
		"\u012e\u0132\u0136\u013a\u0142\u014c\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}