package br.com.fiap.tdss.global.model;

public class Alimento {
	//Atributos
	private String nome;
	private String dataValidade;
	private String tipo;
	private int quantidade;
	//Construtores
	public Alimento(String nome, String dataValidade, String tipo, int quantidade) {
		super();
		this.nome = nome;
		this.dataValidade = dataValidade;
		this.tipo = tipo;
		this.quantidade = quantidade;
	}
	public Alimento() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "Alimento [nome = " + nome + "]";
	}
	//GETTERS
	public String getNome() {
		return nome;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public String getTipo() {
		return tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	//SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	//Métodos
	public String retornarInformacoes() {
		return "Nome: " + nome + ", Data de Validade: " + dataValidade 
				+ ", Tipo: " + tipo + ", Quantidade: " + quantidade; 
	}//retornarInformacoes
	
	
}//CLASS