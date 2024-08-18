package lab.banco.digital.oo.master;

import lab.banco.digital.oo.master.Service.ContaCorrente;
import lab.banco.digital.oo.master.Service.ContaPoupanca;
import lab.banco.digital.oo.master.Service.Conta;
import lab.banco.digital.oo.master.Service.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente clienteBD1 = new Cliente();
		clienteBD1.setNome("Igor");
		
		Conta ContaC1 = new ContaCorrente(clienteBD1);
		Conta ContaP1 = new ContaPoupanca(clienteBD1);
                

		ContaC1.depositar(100);
		ContaC1.transferir(80, ContaP1);
                
                ContaP1.pix(10, ContaP1, "Salve", 1);
                
                System.out.println("");
                System.out.println("");
                          
		ContaC1.imprimirExtrato();
		ContaP1.imprimirExtrato();
                
                
                
                
	}

}
