package desafiostreamapi.desafio;

import java.util.*;

public class D1 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        ordem(numeros);
        
    }
    
    
    public static void ordem(List<Integer> numeros){
        numeros.stream().sorted().forEach(n -> System.out.println(n));
    }
    
}

// Desafio -> https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api

