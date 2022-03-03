package br.senac.sort;

public class MergeSort {

    public static int[] ordenar(int[] items) {
        sort(items, 0, items.length - 1);
        return items;
    }


    private static void sort(int[] items, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            sort(items, esquerda, meio);
            sort(items, meio + 1, direita);

            merge(items, esquerda, meio, direita);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];
        int i, j;

        for (i = 0; i < n1; ++i)
            L[i] = arr[l + i];

        for (j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        i = 0;
        j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
