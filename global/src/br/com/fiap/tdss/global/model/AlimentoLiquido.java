package br.com.fiap.tdss.global.model;

public class AlimentoLiquido extends Alimento{
	//Atributos
	private double volumeEmLitro;
	//Construtores
	public AlimentoLiquido(String nome, String dataValidade, String tipo, int quantidade, double volumeEmLitro) {
		super(nome, dataValidade, tipo, quantidade);
		this.volumeEmLitro = volumeEmLitro;
	}
	public AlimentoLiquido() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "AlimentoLiquido [nome = " + super.getNome()+ "]";
	}
	//GETTERS
	public double getVolumeEmLitro() {
		return volumeEmLitro;
	}
	//SETTERS
	public void setVolumeEmLitro(double volumeEmLitro) {
		this.volumeEmLitro = volumeEmLitro;
	}
	//Métodos
	@Override
	public String retornarInformacoes() {
		return "Nome: " + super.getNome() + ", Data de Validade: " + super.getDataValidade() 
				+ ", Tipo: " + super.getTipo() + ", Quantidade: " + super.getQuantidade()
				+ ", Peso: " + volumeEmLitro + "L"; 
	}//retornarInformacoes
}//CLASS