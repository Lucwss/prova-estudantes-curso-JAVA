package entities;

public class Curso {
	private Integer cod;
	private String nome;
	
	public Curso () {}
	
	public Curso(Integer cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	
	
}
