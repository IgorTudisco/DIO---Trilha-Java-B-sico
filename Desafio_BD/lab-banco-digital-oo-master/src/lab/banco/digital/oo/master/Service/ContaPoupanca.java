package lab.banco.digital.oo.master.Service;

import lab.banco.digital.oo.master.Service.Conta;
import lab.banco.digital.oo.master.Service.Cliente;

public class ContaPoupanca extends Conta {

        protected int contador = 1;
        protected int KeyPix;
        
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
                this.KeyPix = contador++;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
        
        @Override
	public void pix(double valor, IConta contaDestino, String mensagem, int key) {
            
            if(this.KeyPix == key){
                this.sacar(valor);
                contaDestino.depositar(valor);                
                PixEfetuado(valor, this.cliente.getNome(), mensagem, key);
            } else {
                PixEfetuadoErrado(key);
            }            
	}
        
        protected void PixEfetuadoErrado(int key) {
            System.out.println("=> Os dados de destino estão errados. ");
	}
        
        protected void PixEfetuado(double valor, String nome, String mensagem, int key) {
            System.out.println("=> Seus dados da conta Poupança: ");
            System.out.println("");
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", valor));
                
            System.out.println("=>Você fez um pix para: ");
            System.out.println("");
            System.out.println(String.format("Titular: %s", nome));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Numero: %d", key));
            System.out.println(String.format("Saldo: %.2f", valor));
            System.out.println("Mensagem:");
            System.out.println(mensagem);
            System.out.println("");
            
	}
}
