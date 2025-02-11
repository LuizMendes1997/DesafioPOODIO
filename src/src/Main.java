package src;

import java.time.LocalDate;

import br.com.dio.DesafioPOO.dominio.Bootcamp;
import br.com.dio.DesafioPOO.dominio.Curso;
import br.com.dio.DesafioPOO.dominio.Dev;
import br.com.dio.DesafioPOO.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("java");
		curso1.setDescricao("curso java");
		curso1.setCargaHoraria(1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("js");
		curso2.setDescricao("curso js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("de Java");
		mentoria.setDescricao("Mentoria de java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("descricao Bootcamp java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscrito" + devCamila.getConteudoInscrito());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Conteudo Inscrito" + devCamila.getConteudoInscrito());
		System.out.println("Conteudo Concluido" + devCamila.getConteudoConcluido());
		System.out.println("XP" + devCamila.calcularTotalXP());		
	
		Dev devJoa = new Dev();
		devJoa.setNome("Joao");
		devJoa.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscrito" + devJoa.getConteudoInscrito());
		devJoa.progredir();
		devJoa.progredir();
		devJoa.progredir();
		System.out.println("Conteudo Inscrito" + devJoa.getConteudoInscrito());
		System.out.println("Conteudo Concluido" + devJoa.getConteudoConcluido());
		System.out.println("XP" + devJoa.calcularTotalXP());


		


		
		
		/*
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
}
	
}