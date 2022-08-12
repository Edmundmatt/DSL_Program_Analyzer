package nz.ac.wgtn.ecs.swen438.assignment1.javaanalysis;


import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;

import java.util.stream.Stream;

public class Task5 {
    public static boolean doesUseDifferentVariablesInEqualsAndHashCode(String input) throws Exception {
        try {
            CompilationUnit cu = StaticJavaParser.parse(input);
            return !cu.findAll(MethodDeclaration.class).stream()
                    .filter(decl -> decl.getNameAsString().equals("hashCode"))
                    .flatMap(decl -> decl.findAll(Parameter.class).stream())
                    .equals(returnEquals(cu));
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    private static Stream<Object> returnEquals(CompilationUnit cu){
        return cu.findAll(MethodDeclaration.class).stream()
                .filter(decl -> decl.getNameAsString().equals("equals"))
                .flatMap(decl -> decl.findAll(Parameter.class).stream());
    }
}
