package nz.ac.wgtn.ecs.swen438.assignment1.mayan;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static int output = 0;
    private static String op = "";
    private static final List<Integer> numbersList = new ArrayList<>();
    private static final List<Integer> digitsList = new ArrayList<>();

    public static int evaluateMayanNumberExpression(String input) throws Exception {
        // Check valid input
        if(Task1.isValidMayanNumberExpression(input)){
            numbersList.clear();
            digitsList.clear();
            output = 0;
            op = "";
            MayanMathLexer lexer = new MayanMathLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MayanMathParser parser = new MayanMathParser(tokens);
            ParseTree tree = parser.expression();
            MayanMathListener listener = new MayanMathListener() {
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
                    op = "+";
                }

                @Override
                public void enterMinusop(MayanMathParser.MinusopContext ctx) {

                }

                @Override
                public void exitMinusop(MayanMathParser.MinusopContext ctx) {
                    op = "-";
                }

                @Override
                public void enterNumber(MayanMathParser.NumberContext ctx) {

                }

                @Override
                public void exitNumber(MayanMathParser.NumberContext ctx) {
                    calculateNumber();
                    numbersList.clear();
                    op = "";
                }

                @Override
                public void enterUnderscore(MayanMathParser.UnderscoreContext ctx) {

                }

                @Override
                public void exitUnderscore(MayanMathParser.UnderscoreContext ctx) {

                }

                @Override
                public void enterOpenbracket(MayanMathParser.OpenbracketContext ctx) {

                }

                @Override
                public void exitOpenbracket(MayanMathParser.OpenbracketContext ctx) {

                }

                @Override
                public void enterClosebracket(MayanMathParser.ClosebracketContext ctx) {

                }

                @Override
                public void exitClosebracket(MayanMathParser.ClosebracketContext ctx) {

                }

                @Override
                public void enterDigit(MayanMathParser.DigitContext ctx) {

                }

                @Override
                public void exitDigit(MayanMathParser.DigitContext ctx) {
                    calculateDigits();
                    digitsList.clear();
                }

                @Override
                public void enterZero(MayanMathParser.ZeroContext ctx) {

                }

                @Override
                public void exitZero(MayanMathParser.ZeroContext ctx) {
                    visit(0);
                }

                @Override
                public void enterOne(MayanMathParser.OneContext ctx) {
                    visit(1);
                }

                @Override
                public void exitOne(MayanMathParser.OneContext ctx) {

                }

                @Override
                public void enterTwo(MayanMathParser.TwoContext ctx) {

                }

                @Override
                public void exitTwo(MayanMathParser.TwoContext ctx) {
                    visit(2);
                }

                @Override
                public void enterThree(MayanMathParser.ThreeContext ctx) {

                }

                @Override
                public void exitThree(MayanMathParser.ThreeContext ctx) {
                    visit(3);
                }

                @Override
                public void enterFour(MayanMathParser.FourContext ctx) {

                }

                @Override
                public void exitFour(MayanMathParser.FourContext ctx) {
                    visit(4);
                }

                @Override
                public void enterFive(MayanMathParser.FiveContext ctx) {

                }

                @Override
                public void exitFive(MayanMathParser.FiveContext ctx) {
                    visit(5);
                }

                @Override
                public void enterSix(MayanMathParser.SixContext ctx) {

                }

                @Override
                public void exitSix(MayanMathParser.SixContext ctx) {
                    visit(6);
                }

                @Override
                public void enterSeven(MayanMathParser.SevenContext ctx) {

                }

                @Override
                public void exitSeven(MayanMathParser.SevenContext ctx) {
                    visit(7);
                }

                @Override
                public void enterEight(MayanMathParser.EightContext ctx) {

                }

                @Override
                public void exitEight(MayanMathParser.EightContext ctx) {
                    visit(8);
                }

                @Override
                public void enterNine(MayanMathParser.NineContext ctx) {

                }

                @Override
                public void exitNine(MayanMathParser.NineContext ctx) {
                    visit(9);
                }

                @Override
                public void enterTen(MayanMathParser.TenContext ctx) {

                }

                @Override
                public void exitTen(MayanMathParser.TenContext ctx) {
                    visit(10);
                }

                @Override
                public void enterEleven(MayanMathParser.ElevenContext ctx) {

                }

                @Override
                public void exitEleven(MayanMathParser.ElevenContext ctx) {
                    visit(11);
                }

                @Override
                public void enterTwelve(MayanMathParser.TwelveContext ctx) {

                }

                @Override
                public void exitTwelve(MayanMathParser.TwelveContext ctx) {
                    visit(12);
                }

                @Override
                public void enterThirteen(MayanMathParser.ThirteenContext ctx) {

                }

                @Override
                public void exitThirteen(MayanMathParser.ThirteenContext ctx) {
                    visit(13);
                }

                @Override
                public void enterFourteen(MayanMathParser.FourteenContext ctx) {

                }

                @Override
                public void exitFourteen(MayanMathParser.FourteenContext ctx) {
                    visit(14);
                }

                @Override
                public void enterFifteen(MayanMathParser.FifteenContext ctx) {

                }

                @Override
                public void exitFifteen(MayanMathParser.FifteenContext ctx) {
                    visit(15);
                }

                @Override
                public void enterSixteen(MayanMathParser.SixteenContext ctx) {

                }

                @Override
                public void exitSixteen(MayanMathParser.SixteenContext ctx) {
                    visit(16);
                }

                @Override
                public void enterSeventeen(MayanMathParser.SeventeenContext ctx) {

                }

                @Override
                public void exitSeventeen(MayanMathParser.SeventeenContext ctx) {
                    visit(17);
                }

                @Override
                public void enterEighteen(MayanMathParser.EighteenContext ctx) {

                }

                @Override
                public void exitEighteen(MayanMathParser.EighteenContext ctx) {
                    visit(18);
                }

                @Override
                public void enterNineteen(MayanMathParser.NineteenContext ctx) {

                }

                @Override
                public void exitNineteen(MayanMathParser.NineteenContext ctx) {
                    visit(19);
                }

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
            };
            ParseTreeWalker.DEFAULT.walk(listener, tree);
            return output;
        }
        return 0;
    }

    private static void visit(int input){
        digitsList.add(input);
    }

    private static void calculateDigits(){
        int digit = 0;
        for(int symb : digitsList){
            digit += symb;
        }
        numbersList.add(digit);
    }

    private static void calculateNumber(){
        int num = 0;
        for(int i = 0; i < numbersList.size(); i++){
            num += numbersList.get(i) * (int) Math.pow(20, numbersList.size()-1-i);
        }
        if(op.equals("-")) output -= num; // Need to think about operations here
        else output += num;
    }
}
