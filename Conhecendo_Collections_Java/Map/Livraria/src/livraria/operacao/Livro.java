package livraria.operacao;

public class Livro {
    
    private String titulo;
    private String autor;
    private Double preco;
    
    public Livro(String titulo, String autor, Double preco){
        
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
        
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    @Override
    public String toString() {
      return " { " + "Autor: " + autor + " - Titulo: " + titulo + " - Preço: " + preco + " } ";
    }
     
    
}
