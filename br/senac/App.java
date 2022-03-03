package br.senac;

import br.senac.preRequisites.Requisitos;
import br.senac.recursao.Contador;
import br.senac.recursao.Fatorial;
import br.senac.recursao.Fibonacci;
import br.senac.search.*;
import br.senac.sort.BubbleSort;
import br.senac.sort.InsertionSort;
import br.senac.sort.MergeSort;
import br.senac.sort.QuickSort;
import br.senac.sort.SelectionSort;
import br.senac.structure.Fila.Fila2;


public class App {


    public static void main(String[] args) {
        try {
            //testarRecursividade();
            //testarOrdenacao();
            //testarFila();
            Requisitos.teste();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    static void testarOrdenacao() {
        int[] numeros = new int[]{ 7, 8, 5, 2, 4, 6, 3 };
        // numeros = InsertionSort.ordenar(numeros);
        // numeros = BubbleSort.ordenar(numeros);
        // numeros = MergeSort.ordenar(numeros);
        //numeros = SelectionSort.ordenar(numeros);
        numeros = QuickSort.ordenar(numeros);

        for (int n : numeros) {
            System.out.print(n);
        }
        System.out.println();
    }


    static void testarRecursividade() {
        //Contador.contagemRegressiva(10);
        Fibonacci.calcular(100);
    }


    static void testarAlgoritmosBusca() throws Exception {
        int[] numberos = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int a = SequencialSearch.buscar(numberos, 10);
        System.out.println(a);

        int b = BinarySearch.buscar(numberos, 7);
        System.out.println("busca é: " + b);

        b = BinaryRecursiveSearch.buscar(numberos, 7);
        System.out.println("busca é: " + b);

        int c = Fatorial.calcular(5);
        System.out.println(c);
    }


    static void testarFila() {
        Fila2 fila = new Fila2();
        
        fila.enfileirar(10);
        System.out.println(fila.primeiro().getValor());

        fila.enfileirar(20);
        System.out.println(fila.primeiro().getValor());

        fila.enfileirar(30);
        System.out.println(fila.primeiro().getValor());

        System.out.println(fila.tamanho());

        fila.desenfileirar();
        System.out.println(fila.primeiro().getValor());

        fila.desenfileirar();
        System.out.println(fila.primeiro().getValor());

        fila.desenfileirar();
        System.out.println(fila.primeiro().getValor());

        System.out.println(fila.primeiro().getValor());
        System.out.println(fila.tamanho());

    }

}

