package livraria.operacao;

import java.util.*;

public class LivrariaOnline {
    
    private Map<String, Livro> livrariaMap;
    
    public LivrariaOnline (){
        this.livrariaMap = new HashMap<>();
    }
    
    public void adicionarLivro(String link, String titulo, String autor, double preco){        
        livrariaMap.put(link, new Livro(titulo, autor, preco));        
    }
    
    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
          if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
            chavesRemover.add(entry.getKey());
          }
        }
        for (String chave : chavesRemover) {
          livrariaMap.remove(chave);
        }
    }
    
    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> treeMapLivraria = new TreeMap(livrariaMap);
        System.out.println(treeMapLivraria);
    }
    
    public void pesquisarLivrosPorAutor(String autor){
        Livro livroByAutor = null;
        if(!livrariaMap.isEmpty()){            
            for(Livro l : livrariaMap.values()){
                
                if(l.getTitulo() == autor){
                    livroByAutor = l;
                    break;
                }
            }            
        }
        System.out.println(livroByAutor);
    }
    
    public Livro obterLivroMaisCaro(){
        Livro livroCaro = null;
        Double valor = Double.MIN_VALUE;
        if(!livrariaMap.isEmpty()){
             for(Livro l : livrariaMap.values()){                
                if(valor >= l.getPreco()){
                    valor = l.getPreco();
                    livroCaro = l;
                }                 
            }   
        }
        return livroCaro;
    }
    
    public Livro exibirLivroMaisBarato(){
        Livro livroBarato = null;
        Double valor = Double.MIN_VALUE;
        if(!livrariaMap.isEmpty()){
             for(Livro l : livrariaMap.values()){                
                if(l.getPreco() <= valor){
                    valor = l.getPreco();
                    livroBarato = l;
                }                 
            }   
        }
        return livroBarato;
    }
    

    
}
