package carrinhodecompras;

import carrinhodecompras.Operacao.ItemList;

public class CarrinhoDeCompras{

        public static void main(String[] args) {
        
        ItemList listaDeCompras = new ItemList();
        
        listaDeCompras.calcularQuantidadeDeItens();  
        
        listaDeCompras.adicionarItem("relógio", 500, 1);
        listaDeCompras.adicionarItem("relógio", 500, 1);
        listaDeCompras.adicionarItem("Bandagem", 500, 1);
        listaDeCompras.exibirItens();
        listaDeCompras.calcularQuantidadeDeItens();
        System.out.println("Valor total da compra é: " + listaDeCompras.calcularValorTotal());
        
        
        listaDeCompras.removerItem("relógio");
        System.out.println(listaDeCompras.calcularValorTotal());
        
        listaDeCompras.exibirItens();
        
    }
    
}

// tarefa => https://github.com/cami-la/collections-java-api-2023/tree/master/src/main/java/list
