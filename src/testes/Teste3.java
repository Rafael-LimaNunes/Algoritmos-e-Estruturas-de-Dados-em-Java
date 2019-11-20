package testes;

import model.Aluno;
import vetores.Vetor;

import java.util.ArrayList;
import java.util.Vector;

public class Teste3 {
    public static void main(String[] args) {
        Vetor lista = new Vetor();
        System.out.println(lista.tamanho());
        for(int i = 0; i < 1000; i++){
            Aluno aluno = new Aluno();
            lista.adiciona(aluno);
        }
        System.out.println(lista.tamanho());

        Vector lista2 = new Vector();
        System.out.println(lista2.size());
        for(int i = 0; i < lista.tamanho(); i++){
            lista2.add(lista.pega(i));
        }
        System.out.println(lista2.size());

        ArrayList lista3 = new ArrayList();
        System.out.println(lista3.size());
        for(int i = 0; i < lista.tamanho(); i++){
            lista3.add(lista2.get(i));
        }
        System.out.println(lista3.size());
    }
}
