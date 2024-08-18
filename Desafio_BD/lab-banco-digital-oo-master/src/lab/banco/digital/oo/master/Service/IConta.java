package lab.banco.digital.oo.master.Service;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
        
        void pix(double valor, IConta contaDestino, String mensagem, int key);
	
	void imprimirExtrato();
}
