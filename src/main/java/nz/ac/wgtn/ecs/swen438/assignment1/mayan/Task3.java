package nz.ac.wgtn.ecs.swen438.assignment1.mayan;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Task3 {
    private static boolean oneMinus = false;
    private static boolean twoMinus = false;

    public static boolean doesContainDoubleUnaryOperator(String input) throws Exception {

        if (!Task1.isValidMayanNumberExpression(input)) {
            throw new Exception();
        } else {
            oneMinus = false;
            twoMinus = false;
            MayanMathLexer lexer = new MayanMathLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MayanMathParser parser = new MayanMathParser(tokens);
            ParseTree tree = parser.expression();
            MayanMathListener listener = new MayanMathListener() {

                @Override
                public void visitTerminal(TerminalNode terminalNode) {

                }

                @Override
                public void visitErrorNode(ErrorNode errorNode) {

                }

                @Override
                public void enterEveryRule(ParserRuleContext parserRuleContext) {

                }

                @Override
                public void exitEveryRule(ParserRuleContext parserRuleContext) {

                }

                @Override
                public void enterExpression(MayanMathParser.ExpressionContext ctx) {

                }

                @Override
                public void exitExpression(MayanMathParser.ExpressionContext ctx) {

                }

                @Override
                public void enterExpr(MayanMathParser.ExprContext ctx) {

                }

                @Override
                public void exitExpr(MayanMathParser.ExprContext ctx) {

                }

                @Override
                public void enterAddop(MayanMathParser.AddopContext ctx) {

                }

                @Override
                public void exitAddop(MayanMathParser.AddopContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterMinusop(MayanMathParser.MinusopContext ctx) {

                }

                @Override
                public void exitMinusop(MayanMathParser.MinusopContext ctx) {
                    minusCheck();
                }

                @Override
                public void enterUnderscore(MayanMathParser.UnderscoreContext ctx) {

                }

                @Override
                public void exitUnderscore(MayanMathParser.UnderscoreContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterOpenbracket(MayanMathParser.OpenbracketContext ctx) {

                }

                @Override
                public void exitOpenbracket(MayanMathParser.OpenbracketContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterClosebracket(MayanMathParser.ClosebracketContext ctx) {

                }

                @Override
                public void exitClosebracket(MayanMathParser.ClosebracketContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterNumber(MayanMathParser.NumberContext ctx) {

                }

                @Override
                public void exitNumber(MayanMathParser.NumberContext ctx) {

                }

                @Override
                public void enterDigit(MayanMathParser.DigitContext ctx) {

                }

                @Override
                public void exitDigit(MayanMathParser.DigitContext ctx) {

                }

                @Override
                public void enterZero(MayanMathParser.ZeroContext ctx) {

                }

                @Override
                public void exitZero(MayanMathParser.ZeroContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterOne(MayanMathParser.OneContext ctx) {

                }

                @Override
                public void exitOne(MayanMathParser.OneContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterTwo(MayanMathParser.TwoContext ctx) {

                }

                @Override
                public void exitTwo(MayanMathParser.TwoContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterThree(MayanMathParser.ThreeContext ctx) {

                }

                @Override
                public void exitThree(MayanMathParser.ThreeContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterFour(MayanMathParser.FourContext ctx) {

                }

                @Override
                public void exitFour(MayanMathParser.FourContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterFive(MayanMathParser.FiveContext ctx) {

                }

                @Override
                public void exitFive(MayanMathParser.FiveContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterSix(MayanMathParser.SixContext ctx) {

                }

                @Override
                public void exitSix(MayanMathParser.SixContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterSeven(MayanMathParser.SevenContext ctx) {

                }

                @Override
                public void exitSeven(MayanMathParser.SevenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterEight(MayanMathParser.EightContext ctx) {

                }

                @Override
                public void exitEight(MayanMathParser.EightContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterNine(MayanMathParser.NineContext ctx) {

                }

                @Override
                public void exitNine(MayanMathParser.NineContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterTen(MayanMathParser.TenContext ctx) {

                }

                @Override
                public void exitTen(MayanMathParser.TenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterEleven(MayanMathParser.ElevenContext ctx) {

                }

                @Override
                public void exitEleven(MayanMathParser.ElevenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterTwelve(MayanMathParser.TwelveContext ctx) {

                }

                @Override
                public void exitTwelve(MayanMathParser.TwelveContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterThirteen(MayanMathParser.ThirteenContext ctx) {

                }

                @Override
                public void exitThirteen(MayanMathParser.ThirteenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterFourteen(MayanMathParser.FourteenContext ctx) {

                }

                @Override
                public void exitFourteen(MayanMathParser.FourteenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterFifteen(MayanMathParser.FifteenContext ctx) {

                }

                @Override
                public void exitFifteen(MayanMathParser.FifteenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterSixteen(MayanMathParser.SixteenContext ctx) {

                }

                @Override
                public void exitSixteen(MayanMathParser.SixteenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterSeventeen(MayanMathParser.SeventeenContext ctx) {

                }

                @Override
                public void exitSeventeen(MayanMathParser.SeventeenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterEighteen(MayanMathParser.EighteenContext ctx) {

                }

                @Override
                public void exitEighteen(MayanMathParser.EighteenContext ctx) {
                    oneMinus = false;
                }

                @Override
                public void enterNineteen(MayanMathParser.NineteenContext ctx) {

                }

                @Override
                public void exitNineteen(MayanMathParser.NineteenContext ctx) {
                    oneMinus = false;
                }
            };
            ParseTreeWalker.DEFAULT.walk(listener, tree);
        }
        return twoMinus;
    }

    private static void minusCheck() {
        if(oneMinus) {
            twoMinus = true;
        } else {
            oneMinus = true;
        }
    }
}