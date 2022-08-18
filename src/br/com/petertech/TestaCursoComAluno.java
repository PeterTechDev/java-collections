package br.com.petertech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

//        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 33));
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 33));
        javaColecoes.adiciona(new Aula("Criando aula", 20));
        javaColecoes.adiciona(new Aula("Ahhhhh lek lek lek", 26));

        Aluno a1 = new Aluno("Peter Leite", 2323);
        Aluno a2 = new Aluno("Lebron James", 0623);
        Aluno a3 = new Aluno("Paul Pierce", 3434);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno.getNome());
        });


        //Exemplo de como era percorrido os elementos antes do java 8
//        Set<Aluno> alunos = javaColecoes.getAlunos();
//        Iterator<Aluno> iterador = alunos.iterator();
//
//        while (iterador.hasNext()) {
//            System.out.println(iterador.next());
//        }

//        Exemplo de hashMa´p
//        Map<Integer, String> matriculaParaAluno = new HashMap<>();
//        matriculaParaAluno.put(123456, "Leonardo Cordeiro");
    }
}
