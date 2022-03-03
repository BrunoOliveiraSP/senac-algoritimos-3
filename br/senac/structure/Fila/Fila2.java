package br.senac.structure.Fila;

import br.senac.structure.Pair.Node;

public class Fila2 {
    private Node primeiro = null;
    private Node ultimo = null;
    private int tamanho = 0;

    public Node primeiro() {
        return this.primeiro;
    }

    public boolean vazia() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void enfileirar(int numero) {
        if (this.primeiro == null) {
            this.primeiro = new Node(numero);
        } else if (this.ultimo == null) {
            this.ultimo = new Node(numero);
            this.primeiro.setProximo(this.ultimo);
        } else {
            Node e = new Node(numero);
            this.ultimo.setProximo(e);
            this.ultimo = e;
        }
        this.tamanho++;
    }

    public Node desenfileirar() {
        if (this.vazia())
            throw new RuntimeException("A fila está vazia.");
        
        Node e = this.primeiro;
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
        
        if (this.tamanho == 0) {
            this.primeiro = null;
            this.ultimo = null;
        }
        return e;
    }
}
