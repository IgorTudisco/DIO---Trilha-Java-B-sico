package controledefluxo_desafio;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contador {

    public static void main(String[] args) {
        
        try {
            
            Scanner read = new Scanner(System.in);
            
            int primeiroNum = 0;
            int segundoNum = 0;
            
            System.out.println("Digite dois números para que contemos a diferença deles.");
            
            System.out.print("Digite o primeiro número: ");
            primeiroNum = read.nextInt();
            System.out.println();
            System.out.print("Digite o segundo número: ");
            segundoNum = read.nextInt();
            System.out.println();
            
            
            contar(primeiroNum, segundoNum);
            
        } catch (ParametrosInvalidosException ex) {
            
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }

        
    }
    
    static void contar(int segundoNum, int primeiroNum ) throws ParametrosInvalidosException {
	
        if (primeiroNum > segundoNum){            
            throw new ParametrosInvalidosException();        
        }
        
        int contaNum = segundoNum - primeiroNum;
        
        for (int i = 0; i <= contaNum; i++){
            System.out.println("Imprimindo o número " + i);
        }

        System.out.println();
        
    }
    
}
