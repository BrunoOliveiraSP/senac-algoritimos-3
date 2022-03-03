package br.senac.sort;

public class QuickSort {
    
    public static int[] ordenar(int[] items) {
        quicksort(items, 0, items.length - 1);
        return items;
    }


    static void quicksort(int[] items, int inicio, int fim) {
        if (inicio < fim) {
            int pi = particionar(items, inicio, fim);
            quicksort(items, inicio, pi - 1);
            quicksort(items, pi + 1, fim);
        }
    }

    
    static int particionar(int[] items, int inicio, int fim) {
        int pivot = items[fim];

        int i = (inicio - 1);

        for (int j = inicio; j <= fim - 1; j++) {
            if (items[j] < pivot) {
                i++;
                trocar(items, i, j);
            }
        }
        trocar(items, i + 1, fim);
        return (i + 1);
    }

    
    static void trocar(int[] items, int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }
    
    
    
}
