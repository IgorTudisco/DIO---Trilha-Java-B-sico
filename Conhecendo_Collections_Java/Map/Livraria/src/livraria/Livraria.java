package livraria;

import livraria.operacao.LivrariaOnline;

public class Livraria {

    public static void main(String[] args) {
        
        LivrariaOnline livraria = new LivrariaOnline();
        
        livraria.adicionarLivro("www.livros.com.br", "Java Básico", "Taina Pimenta", 500.00);
        livraria.adicionarLivro("www.livro.com.br", "Java Intermediário", "Taina Pimenta", 560.00);
        livraria.adicionarLivro("www.livros.br", "Go Básico", "Taina Pimenta", 700.00);
        livraria.adicionarLivro("livros.com", "Go Avançado", "Taina Pimenta", 767.00);
        livraria.adicionarLivro("www.livros.com", "Go Intermediário", "Taina Pimenta", 767.00);
        livraria.adicionarLivro("www.livro.co", "Go", "Taina Pimenta", 7.00);
        
        livraria.exibirLivrosOrdenadosPorPreco();
        
        livraria.removerLivro("Go");
        
        livraria.exibirLivrosOrdenadosPorPreco();
        
        //Livraria.pesquisarLivrosPorAutor("Go Básico");
        
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.exibirLivroMaisBarato());
        
        
    }
    
}
