package br.com.petertech;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
//        javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylist", 33));
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 33));
        javaColecoes.adiciona(new Aula("Criando aula", 20));
        javaColecoes.adiciona(new Aula("Ahhhhh lek lek lek", 26));


        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);
    }
}
