package livraria;

import livraria.operacao.LivrariaOnline;

public class Livraria {

    public static void main(String[] args) {
        
        LivrariaOnline livraria = new LivrariaOnline();
        
        livraria.adicionarLivro("www.livros.com.br", "Java Básico", "Peper", 500.00);
        livraria.adicionarLivro("livro", "Java Intermediário", "Tai Pimenta", 560.00);
        livraria.adicionarLivro("www", "Go Básico", "Taina Peper", 700.00);
        livraria.adicionarLivro("www2", "Go Básico 2", "Taina Pimenta", 777.77);
        livraria.adicionarLivro("livros.com", "Go Avançado", "Tai Zika", 767.00);
        livraria.adicionarLivro("www.livros.com", "Go Intermediário", "ZikaTai", 768.00);
        livraria.adicionarLivro("go", "Go", "ZikaPeper", 7.00);
        livraria.adicionarLivro("www.livro.io", "Go2 -------", "ZikaAmor", 8.00);
        livraria.adicionarLivro("www.livro", "Azure Acançado", "Amor Pimenta", 800.00);
        livraria.adicionarLivro("www.livrosAzure", "Azure intermediário", "Amor Peper", 880.00);
        livraria.adicionarLivro("www.livrosZikas", "Azure Básico", "Amor Tai", 800.70);
        
        livraria.exibirLivros();
        
        livraria.removerLivro("Go2 -------");
        
        System.out.println("----------");
        
        livraria.exibirLivrosOrdenadosPorPreco();
        
        System.out.println("----------");
        livraria.pesquisarLivrosPorAutor("Taina Pimenta");
        
        System.out.println("----------");        
        System.out.println(livraria.obterLivroMaisCaro());
        
        System.out.println("----------");
        System.out.println(livraria.exibirLivroMaisBarato());
        
        
    }
    
}
