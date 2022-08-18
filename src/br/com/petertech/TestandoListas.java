package br.com.petertech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String curso1 = "Java 8";
        String curso2 = "Maven";
        String curso3 = "Spring";
        String curso4 = "Apache";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
        cursos.remove(1);
        System.out.println(cursos);
        System.out.println("O nome do primeiro curso é: " + cursos.get(0));
        Collections.sort(cursos);
        System.out.println(cursos);
    }
}
