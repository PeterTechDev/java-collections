package br.com.petertech;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Lebron James");
        alunos.add("Jaysum Tatum");
        alunos.add("Marcus Smart");
        alunos.add("Stephen Curry");
        alunos.add("Stephen Curry");

        //Set não tem garantia de sequencia dos objetos. Não é possível acessar o index por não tem ordem
        //As vantagens são que não aceita repetidos e velocidade de performance

        System.out.println(alunos);
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

}
