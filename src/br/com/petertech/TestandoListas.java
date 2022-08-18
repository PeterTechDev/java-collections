package br.com.petertech;

import java.util.ArrayList;

public class TestandoListas {
    public static void main(String[] args) {
        String curso1 = "Java 8";
        String curso2 = "Maven";
        String curso3 = "Spring";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);
    }
}
