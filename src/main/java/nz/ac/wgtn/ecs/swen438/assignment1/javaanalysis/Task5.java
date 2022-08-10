package nz.ac.wgtn.ecs.swen438.assignment1.javaanalysis;


import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import org.antlr.v4.tool.Rule;

public class Task5 {
    public static boolean doesUseDifferentVariablesInEqualsAndHashCode(String input) throws Exception {
        CompilationUnit cu = StaticJavaParser.parse(input);

        return cu.findAll(MethodDeclaration.class).stream()
                .filter(decl -> decl.getNameAsString().equals("hashCode"))
                .flatMap(decl -> decl.findAll())

        return false;
    }
}
