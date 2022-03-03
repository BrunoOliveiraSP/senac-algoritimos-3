package br.senac.sort;

public class SelectionSort {
    
    public static int[] ordenar(int items[])
    {
        int totalItems = items.length;
  
        for (int i = 0; i < totalItems-1; i++)
        {
            int posMenorItem = i;
            for (int j = i + 1; j < totalItems; j++) {
                if (items[j] < items[posMenorItem])
                    posMenorItem = j;
            }

            int temp = items[posMenorItem];
            items[posMenorItem] = items[i];
            items[i] = temp;
        }
        return items;
    }
}
