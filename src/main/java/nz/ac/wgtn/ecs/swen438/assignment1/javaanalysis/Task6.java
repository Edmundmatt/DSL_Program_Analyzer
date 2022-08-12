package nz.ac.wgtn.ecs.swen438.assignment1.javaanalysis;


import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.util.Arrays;

public class Task6 {
    public static boolean isDbClassWithUIDependencies(String input) throws Exception {
        try {
            CompilationUnit cu = StaticJavaParser.parse(input);
            String[] strings = {"java.awt", "javax.swing"};

            return cu.findAll(PackageDeclaration.class).stream()
                    .filter(decl -> decl.getNameAsString().contains("db"))
                    .flatMap(decl -> decl.findAll(ClassOrInterfaceDeclaration.class).stream())
                    .flatMap(decl -> decl.findAll(ImportDeclaration.class).stream())
                    .anyMatch(decl -> decl.getNameAsString().contains(strings[0])
                            || decl.getNameAsString().contains(strings[1]));
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
