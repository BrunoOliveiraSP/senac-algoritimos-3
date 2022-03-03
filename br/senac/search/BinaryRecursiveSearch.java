package br.senac.search;

public class BinaryRecursiveSearch {


    public static int buscar(int[] elementos, int valor) {
        return buscaBinaria(elementos, valor, 0, elementos.length);
    }



    private static int buscaBinaria(int[] elementos, int valor, int inicio, int fim) {
        int middle = inicio  + ((fim - inicio) / 2);
            
        if (fim < inicio) {
            return -1;
        }

        if (valor == elementos[middle]) {
            return middle;
        } else if (valor < elementos[middle]) {
            return buscaBinaria(elementos, valor, inicio, middle - 1);
        } else {
            return buscaBinaria(elementos, valor, middle + 1, fim);
        }
    }
}

