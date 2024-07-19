package SetService;

public class Tarefa {
    
    private String descricao ;
    private boolean pendente;

    public Tarefa(String descricao, boolean pendente) {
        this.descricao = descricao;
        this.pendente = pendente;
    }

    
    @Override
    public String toString() {
        return "[ pendente: " + getPendente() + " => " + getDescricao() + "] ";
    }
    
        public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public boolean getPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente;
    }
    
}
