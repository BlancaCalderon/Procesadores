// Generated from C:/Users/mfran/IdeaProjects/Prueba\sintactico.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sintactico}.
 */
public interface sintacticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sintactico#axioma}.
	 * @param ctx the parse tree
	 */
	void enterAxioma(sintactico.AxiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#axioma}.
	 * @param ctx the parse tree
	 */
	void exitAxioma(sintactico.AxiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(sintactico.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(sintactico.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(sintactico.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(sintactico.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(sintactico.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(sintactico.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sintactico.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sintactico.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(sintactico.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(sintactico.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(sintactico.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(sintactico.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#cuerpocondicion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpocondicion(sintactico.CuerpocondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#cuerpocondicion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpocondicion(sintactico.CuerpocondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(sintactico.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(sintactico.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#buclewhile}.
	 * @param ctx the parse tree
	 */
	void enterBuclewhile(sintactico.BuclewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#buclewhile}.
	 * @param ctx the parse tree
	 */
	void exitBuclewhile(sintactico.BuclewhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadafuncion(sintactico.LlamadafuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#llamadafuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadafuncion(sintactico.LlamadafuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#cuerpoargumentos}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoargumentos(sintactico.CuerpoargumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#cuerpoargumentos}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoargumentos(sintactico.CuerpoargumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(sintactico.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(sintactico.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(sintactico.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(sintactico.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(sintactico.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(sintactico.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#cuerpofuncion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpofuncion(sintactico.CuerpofuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#cuerpofuncion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpofuncion(sintactico.CuerpofuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(sintactico.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(sintactico.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(sintactico.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(sintactico.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#dev}.
	 * @param ctx the parse tree
	 */
	void enterDev(sintactico.DevContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#dev}.
	 * @param ctx the parse tree
	 */
	void exitDev(sintactico.DevContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opercomparacion}.
	 * @param ctx the parse tree
	 */
	void enterOpercomparacion(sintactico.OpercomparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opercomparacion}.
	 * @param ctx the parse tree
	 */
	void exitOpercomparacion(sintactico.OpercomparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operlogico}.
	 * @param ctx the parse tree
	 */
	void enterOperlogico(sintactico.OperlogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operlogico}.
	 * @param ctx the parse tree
	 */
	void exitOperlogico(sintactico.OperlogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermuldiv}.
	 * @param ctx the parse tree
	 */
	void enterOpermuldiv(sintactico.OpermuldivContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermuldiv}.
	 * @param ctx the parse tree
	 */
	void exitOpermuldiv(sintactico.OpermuldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermodexp}.
	 * @param ctx the parse tree
	 */
	void enterOpermodexp(sintactico.OpermodexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermodexp}.
	 * @param ctx the parse tree
	 */
	void exitOpermodexp(sintactico.OpermodexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opersumrest}.
	 * @param ctx the parse tree
	 */
	void enterOpersumrest(sintactico.OpersumrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opersumrest}.
	 * @param ctx the parse tree
	 */
	void exitOpersumrest(sintactico.OpersumrestContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#polinomio}.
	 * @param ctx the parse tree
	 */
	void enterPolinomio(sintactico.PolinomioContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#polinomio}.
	 * @param ctx the parse tree
	 */
	void exitPolinomio(sintactico.PolinomioContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#monomio}.
	 * @param ctx the parse tree
	 */
	void enterMonomio(sintactico.MonomioContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#monomio}.
	 * @param ctx the parse tree
	 */
	void exitMonomio(sintactico.MonomioContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#signonumerico}.
	 * @param ctx the parse tree
	 */
	void enterSignonumerico(sintactico.SignonumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#signonumerico}.
	 * @param ctx the parse tree
	 */
	void exitSignonumerico(sintactico.SignonumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(sintactico.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(sintactico.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(sintactico.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(sintactico.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(sintactico.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(sintactico.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(sintactico.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(sintactico.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(sintactico.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(sintactico.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(sintactico.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(sintactico.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(sintactico.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(sintactico.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#letra}.
	 * @param ctx the parse tree
	 */
	void enterLetra(sintactico.LetraContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#letra}.
	 * @param ctx the parse tree
	 */
	void exitLetra(sintactico.LetraContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(sintactico.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(sintactico.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#nombrefuncion}.
	 * @param ctx the parse tree
	 */
	void enterNombrefuncion(sintactico.NombrefuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#nombrefuncion}.
	 * @param ctx the parse tree
	 */
	void exitNombrefuncion(sintactico.NombrefuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opersum}.
	 * @param ctx the parse tree
	 */
	void enterOpersum(sintactico.OpersumContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opersum}.
	 * @param ctx the parse tree
	 */
	void exitOpersum(sintactico.OpersumContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operrest}.
	 * @param ctx the parse tree
	 */
	void enterOperrest(sintactico.OperrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operrest}.
	 * @param ctx the parse tree
	 */
	void exitOperrest(sintactico.OperrestContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermul}.
	 * @param ctx the parse tree
	 */
	void enterOpermul(sintactico.OpermulContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermul}.
	 * @param ctx the parse tree
	 */
	void exitOpermul(sintactico.OpermulContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operdiv}.
	 * @param ctx the parse tree
	 */
	void enterOperdiv(sintactico.OperdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operdiv}.
	 * @param ctx the parse tree
	 */
	void exitOperdiv(sintactico.OperdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operexp}.
	 * @param ctx the parse tree
	 */
	void enterOperexp(sintactico.OperexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operexp}.
	 * @param ctx the parse tree
	 */
	void exitOperexp(sintactico.OperexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermod}.
	 * @param ctx the parse tree
	 */
	void enterOpermod(sintactico.OpermodContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermod}.
	 * @param ctx the parse tree
	 */
	void exitOpermod(sintactico.OpermodContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermenorque}.
	 * @param ctx the parse tree
	 */
	void enterOpermenorque(sintactico.OpermenorqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermenorque}.
	 * @param ctx the parse tree
	 */
	void exitOpermenorque(sintactico.OpermenorqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermenorigualque}.
	 * @param ctx the parse tree
	 */
	void enterOpermenorigualque(sintactico.OpermenorigualqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermenorigualque}.
	 * @param ctx the parse tree
	 */
	void exitOpermenorigualque(sintactico.OpermenorigualqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermayorque}.
	 * @param ctx the parse tree
	 */
	void enterOpermayorque(sintactico.OpermayorqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermayorque}.
	 * @param ctx the parse tree
	 */
	void exitOpermayorque(sintactico.OpermayorqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#opermayorigualque}.
	 * @param ctx the parse tree
	 */
	void enterOpermayorigualque(sintactico.OpermayorigualqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#opermayorigualque}.
	 * @param ctx the parse tree
	 */
	void exitOpermayorigualque(sintactico.OpermayorigualqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operiguala}.
	 * @param ctx the parse tree
	 */
	void enterOperiguala(sintactico.OperigualaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operiguala}.
	 * @param ctx the parse tree
	 */
	void exitOperiguala(sintactico.OperigualaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operdistinto}.
	 * @param ctx the parse tree
	 */
	void enterOperdistinto(sintactico.OperdistintoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operdistinto}.
	 * @param ctx the parse tree
	 */
	void exitOperdistinto(sintactico.OperdistintoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(sintactico.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(sintactico.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operor}.
	 * @param ctx the parse tree
	 */
	void enterOperor(sintactico.OperorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operor}.
	 * @param ctx the parse tree
	 */
	void exitOperor(sintactico.OperorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operxor}.
	 * @param ctx the parse tree
	 */
	void enterOperxor(sintactico.OperxorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operxor}.
	 * @param ctx the parse tree
	 */
	void exitOperxor(sintactico.OperxorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#operneg}.
	 * @param ctx the parse tree
	 */
	void enterOperneg(sintactico.OpernegContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#operneg}.
	 * @param ctx the parse tree
	 */
	void exitOperneg(sintactico.OpernegContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#numerico}.
	 * @param ctx the parse tree
	 */
	void enterNumerico(sintactico.NumericoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#numerico}.
	 * @param ctx the parse tree
	 */
	void exitNumerico(sintactico.NumericoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(sintactico.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(sintactico.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(sintactico.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(sintactico.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(sintactico.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(sintactico.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#ci}.
	 * @param ctx the parse tree
	 */
	void enterCi(sintactico.CiContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#ci}.
	 * @param ctx the parse tree
	 */
	void exitCi(sintactico.CiContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#cd}.
	 * @param ctx the parse tree
	 */
	void enterCd(sintactico.CdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#cd}.
	 * @param ctx the parse tree
	 */
	void exitCd(sintactico.CdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#pi}.
	 * @param ctx the parse tree
	 */
	void enterPi(sintactico.PiContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#pi}.
	 * @param ctx the parse tree
	 */
	void exitPi(sintactico.PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#pd}.
	 * @param ctx the parse tree
	 */
	void enterPd(sintactico.PdContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#pd}.
	 * @param ctx the parse tree
	 */
	void exitPd(sintactico.PdContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#comillasimple}.
	 * @param ctx the parse tree
	 */
	void enterComillasimple(sintactico.ComillasimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#comillasimple}.
	 * @param ctx the parse tree
	 */
	void exitComillasimple(sintactico.ComillasimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#puntocoma}.
	 * @param ctx the parse tree
	 */
	void enterPuntocoma(sintactico.PuntocomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#puntocoma}.
	 * @param ctx the parse tree
	 */
	void exitPuntocoma(sintactico.PuntocomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sintactico#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(sintactico.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sintactico#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(sintactico.ComaContext ctx);
}