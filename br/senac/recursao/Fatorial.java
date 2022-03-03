package br.senac.recursao;


public class Fatorial {
    
    public static int calcular(int fatorial) throws Exception {
        if (fatorial < 0) throw new Exception("Fatorial inválido");
        if (fatorial == 0) return 0;
        if (fatorial == 1) return 1;
        
        return fatorial * calcular(fatorial - 1);
    }
}
