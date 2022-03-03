package br.senac.structure.Pair;

public class Node {
    int valor;
    Node proximo;

    public Node(int valor) {
        this.valor = valor;
        proximo = null;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return this.valor;
    }

    public Node getProximo() {
        return this.proximo;
    }
}
