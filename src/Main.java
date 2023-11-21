package src;

import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Desenvolvedor;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java", "Desc Curso JAVA", 4);
        Curso curso2 = new Curso("Curso de Kotlin", "Desc Curso Kotlin", 10);
        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria("Mentoria Java com spring-boot","Descrição Mentoria Java com spring-boot", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria Java com Struts2","Descrição Mentoria Java com Struts2", LocalDate.now().plusMonths(1));
        System.out.println(mentoria1);
        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Carrefour");
        bootcamp.setDescricao("Descrição Bootcamp Java Carrefour");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Desenvolvedor devDiego = new Desenvolvedor();
        devDiego.setNome("Diego dos Santos Cordeiro");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDiego.getNome() +" :" + devDiego.getConteudosInscritos());

        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devDiego.getNome() +" :" + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("Conteúdos Concluídos" + devDiego.getNome() +" :" + devDiego.getConteudosConcluidos());
        System.out.println("XP:" + devDiego.calcularTotalXp());

    }
}