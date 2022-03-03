package br.senac.recursao;

public class Fibonacci {
    
    public static void calcular(int valorMaximo) {
        escrever(1);
        escrever(1);
        proximoNumero(valorMaximo, 1, 1);
    }

    private static void proximoNumero(int valorMaximo, int atual, int anterior) {
        int proximo = atual + anterior;
        if (proximo > valorMaximo)
            return;

        escrever(proximo);
        proximoNumero(valorMaximo, proximo, atual);
    }
    


    private static void escrever(int numero) {
        System.out.println(numero);
    }
}
