package lab.banco.digital.oo.master.Service;

public class Cliente {

    private int contaCliente = 1;
    private int idClente;
    private String nome;

    public void setNome(String nome) {
        this.idClente = contaCliente++;
        this.nome = nome;
    }
    
    public String getidClente() {
        return nome;
    }
    
    public String getNome() {
        return nome;
    }
        

}
