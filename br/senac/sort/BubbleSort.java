package br.senac.sort;

public class BubbleSort {
    
    public static int[] ordenar(int items[]) {
        int totalItems = items.length;
        
        for (int i = 0; i < totalItems - 1; i++) {
            for (int j = 0; j < totalItems - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }
    
}
