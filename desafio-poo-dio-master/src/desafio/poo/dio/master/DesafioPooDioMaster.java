package desafio.poo.dio.master;

import desafio.poo.dio.master.desafio.Curso;
import desafio.poo.dio.master.desafio.Bootcamp;
import desafio.poo.dio.master.desafio.Dev;
import desafio.poo.dio.master.desafio.Mentoria;
import java.time.LocalDate;

public class DesafioPooDioMaster {
   public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.setPreRequisito("Não tem pré requisito");

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        curso2.setPreRequisito("Fazer o curso básico de Java");
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria Js");
        mentoria.setPreRequisito("Está matriculado no curso de Js");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitulo("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.setCargaHoraria(4);
        bootcamp.setPreRequisito("Fazer o curso básico de java");

        Dev devTaina = new Dev();
        devTaina.setNome("Camila");
        devTaina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devTaina.getConteudosInscritos());
        devTaina.progredir();
        devTaina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devTaina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devTaina.getConteudosConcluidos());
        System.out.println("XP:" + devTaina.calcularTotalXp());

        System.out.println("-------");

        Dev devIgor = new Dev();
        devIgor.setNome("Joao");
        devIgor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devIgor.getConteudosInscritos());
        devIgor.progredir();
        devIgor.progredir();
        devIgor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devIgor.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devIgor.getConteudosConcluidos());
        System.out.println("XP:" + devIgor.calcularTotalXp());

    }
    
}
