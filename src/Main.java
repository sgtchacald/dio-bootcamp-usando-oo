package src;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
    }
}