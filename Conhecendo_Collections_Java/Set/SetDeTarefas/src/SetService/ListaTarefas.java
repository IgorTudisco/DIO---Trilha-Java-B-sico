package SetService;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> SetTarefas;

    public ListaTarefas() {
        
        this.SetTarefas = new HashSet<>();
        
    }
    
    public void adicionarTarefa(String descricao){
        
        this.getTarefas().add(new Tarefa(descricao, false));
        
    }
    
    public void removerTarefa(String descricao){
        
        Tarefa tarefaRemover = null;
        
        for (Tarefa t : getTarefas()){
            
            if(t.getDescricao() == descricao){
                tarefaRemover = t;                
                break;
            }            
        }
        
        getTarefas().remove(tarefaRemover);
    }
    
    public void exibirTarefas(){
        
        System.out.println(getTarefas());
        
    }
    
    public int contarTarefas(){
        return getTarefas().size();
    }
    
    public int obterTarefasConcluidas(){
        
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        
        for(Tarefa t : SetTarefas){
            
            if(t.getPendente() == true){
                
                tarefasConcluidas.add(t);
                
            }
            
        }
        
        return tarefasConcluidas.size();
        
    }
    
        public int obterTarefasPendentes(){
        
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        
        for(Tarefa t : SetTarefas){
            
            if(t.getPendente() == false){
                
                tarefasPendentes.add(t);
                
            }
            
        }
        
        return tarefasPendentes.size();
        
    }
        
    public Tarefa marcarTarefaConcluida(String descricao){
        
        Tarefa tarefaConcluida = null;
        
        for(Tarefa t : SetTarefas){
            
            if(t.getDescricao().equals(descricao)){
                
                t.setPendente(true);
                tarefaConcluida = t;
                
            }
            
        }
        
        return tarefaConcluida;
        
    }
    
    public Tarefa marcarTarefaPendente(String descricao) {
        
        Tarefa tarefaConcluida = null;
        
        for(Tarefa t : SetTarefas){
            
            if(t.getDescricao().equals(descricao)){
                
                t.setPendente(false);
                tarefaConcluida = t;
                
            }
            
        }
        
        return tarefaConcluida;
        
    }
    
    
    public void limparListaTarefas() {
        
        Set<Tarefa> limparTarefas = new HashSet<>();
        
        for(Tarefa t : SetTarefas){
            
            limparTarefas.add(t);
            
        }
        
        SetTarefas.removeAll(limparTarefas);
        
    }
    

    public Set<Tarefa> getTarefas() {
        return SetTarefas;
    }

    public void setTarefas(Set<Tarefa> tarefas) {
        this.SetTarefas = tarefas;
    }
    
    
    
}
