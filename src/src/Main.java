package src;

import java.time.LocalDate;

import br.com.dio.DesafioPOO.dominio.Curso;
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
		
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
}
	
}