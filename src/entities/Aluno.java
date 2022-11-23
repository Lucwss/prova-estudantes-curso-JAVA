package entities;

public class Aluno {
	private Integer cod;
	private String nome;
	private Double valorMensalidade;
	private Curso c;
	
	public Aluno(Integer cod, String nome) {
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public Curso getC() {
		return c;
	}

	public void setC(Curso c) {
		this.c = c;
	}
	
	
	
	
}
