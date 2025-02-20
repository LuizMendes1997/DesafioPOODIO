package br.com.dio.DesafioPOO.dominio;

public class Curso extends Conteudo{
	private int cargaHoraria;	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Curso() {
		super();
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + ", xp: " + calcularXp()+"]";
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + cargaHoraria;
	}
	
}
