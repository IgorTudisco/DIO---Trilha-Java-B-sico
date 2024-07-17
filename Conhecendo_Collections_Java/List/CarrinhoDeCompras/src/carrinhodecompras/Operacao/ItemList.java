package carrinhodecompras.Operacao;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    
    private List<Carrinho> listaDeCompras;
    
    public ItemList(){
        this.listaDeCompras = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){        
        this.listaDeCompras.add(new Carrinho(nome, preco, quantidade));        
    }
    
    public void removerItem(String nome){
        
        List<Carrinho> listaDeComprasPraRemover = new ArrayList<>();

        if (!listaDeCompras.isEmpty()) {
            
            for(Carrinho item : listaDeCompras){
                if(item.getNome().equalsIgnoreCase(nome)){
                    listaDeComprasPraRemover.add(item);
                }
            }        
            listaDeCompras.removeAll(listaDeComprasPraRemover);
            
        } else {
          System.out.println("A lista está vazia!");
        }
        
        
    }

    public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!listaDeCompras.isEmpty()) {
      for (Carrinho item : listaDeCompras) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
    
    public void calcularQuantidadeDeItens(){
        if (!listaDeCompras.isEmpty()) {
            System.out.println("Quantidade de itens: " + listaDeCompras.size());
        } else {
            System.out.println("A lista está vazia!");
        }
        
    }
    
    public void exibirItens(){
       
        if (!listaDeCompras.isEmpty()) {
             System.out.println(listaDeCompras);
        } else {
          System.out.println("A lista está vazia!");
        }
        
    }


    
}


