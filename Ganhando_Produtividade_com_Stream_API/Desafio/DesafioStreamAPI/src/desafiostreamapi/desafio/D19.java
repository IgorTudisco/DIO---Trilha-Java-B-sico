package desafiostreamapi.desafio;

import java.util.*;
import java.util.function.*;

public class D19 {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        BinaryOperator<Integer> somaTodos = (n1, n2) -> n1 + n2;
        
        Consumer<Integer> printSoma = n1 -> {
            Integer soma;
            if(n1 % 3 == 0){
                soma = numeros.stream().reduce(0, somaTodos);
                System.out.println(soma);
            } else if (n1 == 5){
                System.out.println(n1);
            }
        }; 
        
        numeros.stream().forEach(printSoma);
        
        
        
    }
    
}

// Desafio -> https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/stream_api

