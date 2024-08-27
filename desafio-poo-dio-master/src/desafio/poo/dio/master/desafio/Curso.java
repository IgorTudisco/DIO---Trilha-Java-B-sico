package desafio.poo.dio.master.desafio;

import desafio.poo.dio.master.desafio.Conteudo;

public class Curso extends Conteudo{    
    
    @Override
    public double calcularXp() {
        
        return XP_PADRAO * getCargaHoraria();
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", Carga horaria=" + getCargaHoraria() +
                ", Pré requisito=" + getPreRequisito() +
                '}';
    }
}
