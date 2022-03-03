package br.senac.search;

public class SequencialSearch {

    public static int buscar(int[] elementos, int valor) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == valor)
                return i;
        }
        return -1;
    }

}

