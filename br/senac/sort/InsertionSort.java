package br.senac.sort;

public class InsertionSort {

    public static int[] ordenar(int[] items) {
        if (items.length <= 1)
            return items;

        for (int pos = 1; pos < items.length; pos++) {
            int itemAtual = items[pos];
            int posAnterior = pos - 1;

            while (posAnterior >= 0 && items[posAnterior] > itemAtual) {
                items[posAnterior + 1] = items[posAnterior];
                posAnterior--;
            }

            items[posAnterior + 1] = itemAtual;
        }
        return items;
    }

}

