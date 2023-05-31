package br.com.fiap.tdss.global.model;

public class Endereco {
	//Atributos
	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade;
	//Construtores
	public Endereco(String logradouro, int numero, String cep, String bairro, String cidade) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public Endereco() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "Endereco [logradouro = " + logradouro + "]";
	}
	//GETTERS
	public String getLogradouro() {
		return logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public String getCep() {
		return cep;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	//SETTERS
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//MÉTODOS
	public String retornarInformacoes() {
		return "Logradouro: " + logradouro + ", Número: " + numero 
				+ ", CEP: " + cep + ", Bairro: " + bairro + ", Cidade:" 
				+ cidade;
	}//retornarInformacoes
	
	
}//CLASS