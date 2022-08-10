package nz.ac.wgtn.ecs.swen438.assignment1.mayan;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Task4 {
    private static boolean oneOpen = false;
    private static boolean twoOpen = false;
    private static boolean oneClose = false;
    private static boolean twoClose = false;

    public static boolean doesContainDoubleBracket(String input) throws Exception {
        if(!Task1.isValidMayanNumberExpression(input)) {
            throw new Exception();
        } else {
            oneOpen = false;
            twoOpen = false;
            oneClose = false;
            twoClose = false;
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
                    openCheck2();
                    closeCheck2();
                }

                @Override
                public void enterMinusop(MayanMathParser.MinusopContext ctx) {

                }

                @Override
                public void exitMinusop(MayanMathParser.MinusopContext ctx) {
                    openCheck2();
                    closeCheck2();
                }

                @Override
                public void enterUnderscore(MayanMathParser.UnderscoreContext ctx) {

                }

                @Override
                public void exitUnderscore(MayanMathParser.UnderscoreContext ctx) {
                    openCheck2();
                    closeCheck2();
                }

                @Override
                public void enterOpenbracket(MayanMathParser.OpenbracketContext ctx) {

                }

                @Override
                public void exitOpenbracket(MayanMathParser.OpenbracketContext ctx) {
                    openCheck();
                }

                @Override
                public void enterClosebracket(MayanMathParser.ClosebracketContext ctx) {

                }

                @Override
                public void exitClosebracket(MayanMathParser.ClosebracketContext ctx) {
                    closeCheck();
                }

                @Override
                public void enterDigit(MayanMathParser.DigitContext ctx) {

                }

                @Override
                public void exitDigit(MayanMathParser.DigitContext ctx) {
                    openCheck2();
                    closeCheck2();
                }

                @Override
                public void enterZero(MayanMathParser.ZeroContext ctx) {

                }

                @Override
                public void exitZero(MayanMathParser.ZeroContext ctx) {

                }

                @Override
                public void enterOne(MayanMathParser.OneContext ctx) {

                }

                @Override
                public void exitOne(MayanMathParser.OneContext ctx) {

                }

                @Override
                public void enterTwo(MayanMathParser.TwoContext ctx) {

                }

                @Override
                public void exitTwo(MayanMathParser.TwoContext ctx) {

                }

                @Override
                public void enterThree(MayanMathParser.ThreeContext ctx) {

                }

                @Override
                public void exitThree(MayanMathParser.ThreeContext ctx) {

                }

                @Override
                public void enterFour(MayanMathParser.FourContext ctx) {

                }

                @Override
                public void exitFour(MayanMathParser.FourContext ctx) {

                }

                @Override
                public void enterFive(MayanMathParser.FiveContext ctx) {

                }

                @Override
                public void exitFive(MayanMathParser.FiveContext ctx) {

                }

                @Override
                public void enterSix(MayanMathParser.SixContext ctx) {

                }

                @Override
                public void exitSix(MayanMathParser.SixContext ctx) {

                }

                @Override
                public void enterSeven(MayanMathParser.SevenContext ctx) {

                }

                @Override
                public void exitSeven(MayanMathParser.SevenContext ctx) {

                }

                @Override
                public void enterEight(MayanMathParser.EightContext ctx) {

                }

                @Override
                public void exitEight(MayanMathParser.EightContext ctx) {

                }

                @Override
                public void enterNine(MayanMathParser.NineContext ctx) {

                }

                @Override
                public void exitNine(MayanMathParser.NineContext ctx) {

                }

                @Override
                public void enterTen(MayanMathParser.TenContext ctx) {

                }

                @Override
                public void exitTen(MayanMathParser.TenContext ctx) {

                }

                @Override
                public void enterEleven(MayanMathParser.ElevenContext ctx) {

                }

                @Override
                public void exitEleven(MayanMathParser.ElevenContext ctx) {

                }

                @Override
                public void enterTwelve(MayanMathParser.TwelveContext ctx) {

                }

                @Override
                public void exitTwelve(MayanMathParser.TwelveContext ctx) {

                }

                @Override
                public void enterThirteen(MayanMathParser.ThirteenContext ctx) {

                }

                @Override
                public void exitThirteen(MayanMathParser.ThirteenContext ctx) {

                }

                @Override
                public void enterFourteen(MayanMathParser.FourteenContext ctx) {

                }

                @Override
                public void exitFourteen(MayanMathParser.FourteenContext ctx) {

                }

                @Override
                public void enterFifteen(MayanMathParser.FifteenContext ctx) {

                }

                @Override
                public void exitFifteen(MayanMathParser.FifteenContext ctx) {

                }

                @Override
                public void enterSixteen(MayanMathParser.SixteenContext ctx) {

                }

                @Override
                public void exitSixteen(MayanMathParser.SixteenContext ctx) {

                }

                @Override
                public void enterSeventeen(MayanMathParser.SeventeenContext ctx) {

                }

                @Override
                public void exitSeventeen(MayanMathParser.SeventeenContext ctx) {

                }

                @Override
                public void enterEighteen(MayanMathParser.EighteenContext ctx) {

                }

                @Override
                public void exitEighteen(MayanMathParser.EighteenContext ctx) {

                }

                @Override
                public void enterNineteen(MayanMathParser.NineteenContext ctx) {

                }

                @Override
                public void exitNineteen(MayanMathParser.NineteenContext ctx) {

                }
            };
            ParseTreeWalker.DEFAULT.walk(listener, tree);
        }
        return twoClose;
    }

    private static void openCheck() {
        if(oneOpen) {
            twoOpen = true;
        } else {
            oneOpen = true;
        }
    }

    private static void closeCheck() {
        if(twoOpen) {
            if (oneClose) {
                twoClose = true;
            } else {
                oneClose = true;
            }
        }
    }

    private static void openCheck2() {
        if(oneOpen && twoOpen) {
            return;
        } else if(oneOpen){
            oneOpen = false;
        }else {
            return;
        }
    }

    private static void closeCheck2() {
        if(oneClose && twoClose) {
            return;
        } else if(oneClose) {
            oneClose = false;
        } else {
            return;
        }
    }
}
