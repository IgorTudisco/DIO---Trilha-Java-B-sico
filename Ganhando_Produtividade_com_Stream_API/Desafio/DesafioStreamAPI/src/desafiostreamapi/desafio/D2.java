package desafiostreamapi.desafio;

import java.util.*;
import java.util.function.*;

public class D2 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        BinaryOperator<Integer> somaTodos = (n1, n2) -> n1 + n2;
    
        Integer somaResultado = numeros.stream().reduce(0, somaTodos);
        
        System.out.println(somaResultado);
        
    }
    
}

// Desafio -> https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api

