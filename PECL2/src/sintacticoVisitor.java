// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sintactico}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sintacticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sintactico#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(sintactico.AxiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(sintactico.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIdentificador}
	 * labeled alternative in {@link sintactico#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIdentificador(sintactico.LetIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letAsignacion}
	 * labeled alternative in {@link sintactico#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetAsignacion(sintactico.LetAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(sintactico.AsigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldivoper}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivoper(sintactico.MuldivoperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(sintactico.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cad}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCad(sintactico.CadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code poli}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoli(sintactico.PoliContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negacion}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(sintactico.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeric}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(sintactico.NumericContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modexpoper}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModexpoper(sintactico.ModexpoperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ide}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIde(sintactico.IdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparacionoper}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacionoper(sintactico.ComparacionoperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(sintactico.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signumerico}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignumerico(sintactico.SignumericoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicooper}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicooper(sintactico.LogicooperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumrestoper}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumrestoper(sintactico.SumrestoperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcion}
	 * labeled alternative in {@link sintactico#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(sintactico.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(sintactico.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(sintactico.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#cuerpocondicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpocondicion(sintactico.CuerpocondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(sintactico.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#buclewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuclewhile(sintactico.BuclewhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#llamadafuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadafuncion(sintactico.LlamadafuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#cuerpoargumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoargumentos(sintactico.CuerpoargumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(sintactico.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(sintactico.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(sintactico.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#cuerpofuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpofuncion(sintactico.CuerpofuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(sintactico.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(sintactico.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#dev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDev(sintactico.DevContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opercomparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpercomparacion(sintactico.OpercomparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operlogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperlogico(sintactico.OperlogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermuldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermuldiv(sintactico.OpermuldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermodexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermodexp(sintactico.OpermodexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opersumrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpersumrest(sintactico.OpersumrestContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#polinomio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolinomio(sintactico.PolinomioContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#monomio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonomio(sintactico.MonomioContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#signonumerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignonumerico(sintactico.SignonumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(sintactico.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(sintactico.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(sintactico.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(sintactico.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(sintactico.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(sintactico.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(sintactico.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetra(sintactico.LetraContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(sintactico.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#nombrefuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrefuncion(sintactico.NombrefuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opersum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpersum(sintactico.OpersumContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperrest(sintactico.OperrestContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermul(sintactico.OpermulContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operdiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperdiv(sintactico.OperdivContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperexp(sintactico.OperexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermod(sintactico.OpermodContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermenorque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermenorque(sintactico.OpermenorqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermenorigualque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermenorigualque(sintactico.OpermenorigualqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermayorque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermayorque(sintactico.OpermayorqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#opermayorigualque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpermayorigualque(sintactico.OpermayorigualqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operiguala}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperiguala(sintactico.OperigualaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operdistinto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperdistinto(sintactico.OperdistintoContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(sintactico.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperor(sintactico.OperorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operxor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperxor(sintactico.OperxorContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#operneg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperneg(sintactico.OpernegContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#numerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerico(sintactico.NumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#cadena}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(sintactico.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(sintactico.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(sintactico.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#ci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCi(sintactico.CiContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#cd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCd(sintactico.CdContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#pi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi(sintactico.PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(sintactico.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#comillasimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComillasimple(sintactico.ComillasimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#puntocoma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuntocoma(sintactico.PuntocomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link sintactico#coma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComa(sintactico.ComaContext ctx);
}