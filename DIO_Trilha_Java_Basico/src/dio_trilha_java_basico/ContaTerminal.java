package dio_trilha_java_basico;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int numeroConta = 0;
        String agencia = "";
        String nome = "";
        int saldo = 0;
        
        System.out.println("Por favor, digite o número da Agência !");
        agencia = read.next();
        System.out.println("Digite seu nome");
        nome = read.next();
        System.out.println("Digite o numero da conta");
        numeroConta = read.nextInt();
        System.out.println("Digite o valor do depósito");
        saldo = read.nextInt();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
        
    }
    
}
