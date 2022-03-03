package br.senac.preRequisites;

public class Requisitos {
    
    public static void teste() {
        Pessoa p1 = new Pessoa(33, "Bruno");
        Pessoa p2 = new Pessoa(33, "Bruno");

        escrever(p1 == p1);
        escrever(p1 == p2);
        escrever(p1.getNome() == p2.getNome());
    }
    
    public static void escrever(Object valor) {
        System.out.println(valor);
    }
}
