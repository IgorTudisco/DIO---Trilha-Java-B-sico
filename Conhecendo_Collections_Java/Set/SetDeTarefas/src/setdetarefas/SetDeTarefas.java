
package setdetarefas;

import SetService.ListaTarefas;

public class SetDeTarefas {


    public static void main(String[] args) {
        
        ListaTarefas tarefas = new ListaTarefas();
        
        
        tarefas.adicionarTarefa("Lavar a Louça");
        tarefas.adicionarTarefa("Lavar o carro");
        tarefas.adicionarTarefa("Lavar a caixa de arreia do gato");
        tarefas.adicionarTarefa("Lavar a roupa");
        tarefas.adicionarTarefa("Passar pano na casa");
        tarefas.adicionarTarefa("Lavar a Louça");
        
        tarefas.exibirTarefas();
        
        
        
        System.out.println(tarefas.contarTarefas());
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());
        
        System.out.println("----------------");
        tarefas.removerTarefa("Lavar a Louça");
        tarefas.exibirTarefas();
        System.out.println(tarefas.contarTarefas());
        
        System.out.println("----------------");
        System.out.println("Concluida");
        tarefas.marcarTarefaConcluida("Passar pano na casa");
        tarefas.marcarTarefaConcluida("Lavar a roupa");
        tarefas.marcarTarefaConcluida("Lavar a caixa de arreia do gato");
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasConcluidas());
        
        System.out.println("----------------");
        System.out.println("Pendente");
        tarefas.marcarTarefaPendente("Lavar o carro");
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasPendentes());
        
        System.out.println("----------------");
        System.out.println("Lavar a roupa de novo");
        tarefas.marcarTarefaPendente("Lavar a roupa");
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasPendentes());
        
        System.out.println("----------------");
        tarefas.exibirTarefas();
        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();
        
    }
    
}


// Desafio => https://github.com/cami-la/collections-java-api-2023/tree/master/src/main/java/set