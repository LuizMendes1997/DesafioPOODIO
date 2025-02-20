package br.com.dio.DesafioPOO.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	private LocalDate data;
	public Mentoria() {
		super();
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + ", xp: " + calcularXp()+"]";
	}
	
	
}
