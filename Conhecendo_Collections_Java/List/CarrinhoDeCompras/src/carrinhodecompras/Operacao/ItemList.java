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
        
        for(Carrinho item : listaDeCompras){
            if(item.getNome().equals(nome)){
                listaDeComprasPraRemover.add(item);
            }
        }
        
        listaDeCompras.removeAll(listaDeComprasPraRemover);
        
    }
    
    public int calcularValorTotal(){
        
        return listaDeCompras.size();
    }
    
    public void exibirItens(){
        System.out.println(listaDeCompras);
    }


    
}


