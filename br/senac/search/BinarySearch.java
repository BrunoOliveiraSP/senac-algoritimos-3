package br.senac.search;

public class BinarySearch {

    public static int buscar(int[] elementos, int valor) {
        int inicio = 0;
        int fim = elementos.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (elementos[meio] > valor)
                fim = meio - 1;
            else if (elementos[meio] < valor)
                inicio = meio + 1;
            else
                return meio;
        }
        return -1;
    }

    
}

