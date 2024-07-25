package desafiostreamapi.desafio;

import java.util.*;
import java.util.function.*;

public class D4 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Consumer<Integer> prinImpar = n1 -> {
            if(n1 % 2 == 0){
                System.out.println(n1);
            }
        }; 
        
        numeros.stream().sorted().forEach(prinImpar);
        
        
        
    }
    
}

// Desafio -> https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api

