package br.senac.preRequisites;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {

    }

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }


    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
