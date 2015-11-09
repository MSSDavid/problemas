package br.ufg.inf.es.construcao.somaarray46;

public class SomaArray46 {
    
    public static int somaarray46(int n) {
        if (n < 0) { 
            throw new IllegalArgumentException("n: Menor que 0");
        }
               
        int[] A = new int[n];
        
        int s = 0;
        int i = 1;
        
        while (i <= n) {
            s = (s + A[i]);
            i += 1;
        }
        
        return s;
    }
    
}
