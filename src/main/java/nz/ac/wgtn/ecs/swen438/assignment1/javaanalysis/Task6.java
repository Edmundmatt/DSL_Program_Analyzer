package nz.ac.wgtn.ecs.swen438.assignment1.javaanalysis;


import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.util.Arrays;

public class Task6 {
    public static boolean isDbClassWithUIDependencies(String input) throws Exception {
        CompilationUnit cu = StaticJavaParser.parse(input);
        String[] strings = {"java.awt", "javax.swing"};


//        if(cu.findAll(PackageDeclaration.class).stream()
//                .anyMatch(decl -> decl.getNameAsString().contains("db"))) {
//            if(cu.findAll(ImportDeclaration.class).stream().anyMatch(decl -> decl.getNameAsString().contains("java.awt"))) return true;
//            if(cu.findAll(ImportDeclaration.class).stream().anyMatch(decl -> decl.getNameAsString().contains("javax.swing"))) return true;
//        }

        return cu.findAll(PackageDeclaration.class).stream()
                .filter(decl -> decl.getNameAsString().contains("db"))
                .flatMap(decl -> decl.findAll(ClassOrInterfaceDeclaration.class).stream())
                .flatMap(decl -> decl.findAll(ImportDeclaration.class).stream())
                .anyMatch(decl -> decl.getNameAsString().contains(strings[0])
                    || decl.getNameAsString().contains(strings[1]));

    }
}
