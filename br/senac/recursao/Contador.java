package br.senac.recursao;

public class Contador {

    public static void contagemRegressiva(int limite) {
        if (limite < 0)
            return;

        escrever(limite);
        contagemRegressiva(limite - 1);
    }
    

    private static void escrever(int numero) {
        System.out.println(numero);
    }
}

