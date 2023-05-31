package br.com.fiap.tdss.global.model;

public class AlimentoSolido extends Alimento{
	//Atributos
	private double pesoEmKg;
	//Construtores
	public AlimentoSolido(String nome, String dataValidade, String tipo, int quantidade, double pesoEmKg) {
		super(nome, dataValidade, tipo, quantidade);
		this.pesoEmKg = pesoEmKg;
	}
	public AlimentoSolido() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "AlimentoSolido [nome = " + super.getNome()+ "]";
	}
	//GETTERS
	public double getPesoEmKg() {
		return pesoEmKg;
	}
	//SETTERS
	public void setPesoEmKg(double pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}
	//Métodos
	@Override
	public String retornarInformacoes() {
		return "Nome: " + super.getNome() + ", Data de Validade: " + super.getDataValidade() 
				+ ", Tipo: " + super.getTipo() + ", Quantidade: " + super.getQuantidade()
				+ ", Peso: " + pesoEmKg + "Kg"; 
	}//retornarInformacoes
}//CLASS