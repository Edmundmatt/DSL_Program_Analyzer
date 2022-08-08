package nz.ac.wgtn.ecs.swen438.assignment1.mayan;


import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.xpath.XPath;

import java.util.Collection;

public class Task2 {
    public static int evaluateMayanNumberExpression(String input) throws Exception {
        try {
//            MayanMathLexer lexer = new MayanMathLexer(CharStreams.fromString(input));
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            MayanMathParser parser = new MayanMathParser(tokens);
//            XPath p = new XPath(parser, input);
//            Collection<ParseTree> results = p.evaluate(parser.expression());
//
//            for (ParseTree solution : results) {
//                String parseTreeAsString = solution.toStringTree(parser);
//                System.out.println(parseTreeAsString + '\n');
//                System.out.println(solution.getText());
//                System.out.println();

            MayanMathLexer lexer = new MayanMathLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            new MayanMathParser(tokens).expression();

            for (Token token:tokens.getTokens()) {
                System.out.println(token);
                System.out.println(token.getText());
            }
            return 0;
        } catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
