package nz.ac.wgtn.ecs.swen438.assignment1.mayan;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Task1 {
    public static boolean isValidMayanNumberExpression(String input) {
        try {
            MayanMathLexer lexer = new MayanMathLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MayanMathParser parser = new MayanMathParser(tokens);
            parser.setErrorHandler(new BailErrorStrategy());
            parser.expression();
            return true;
        }
        catch (ParseCancellationException x) {
            return false;
        }
    }

}
