package desafiostreamapi.desafio;

import java.util.*;
import java.util.function.*;

public class D3 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        Predicate<Integer> positivos = n -> n > 0;
        
        numeros.stream().sorted().filter(positivos).forEach(n -> System.out.println(n));
        
        
        
    }
    
}

// Desafio -> https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api

