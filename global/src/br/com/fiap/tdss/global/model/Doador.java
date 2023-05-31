package br.com.fiap.tdss.global.model;

public class Doador extends Pessoa{
	//Atributos
	private String idDoador;
	private double dinheiro;
	//Construtores
	public Doador(String nome, String dataNascimento, Endereco endereco, String idDoador, double dinheiro) {
		super(nome, dataNascimento, endereco);
		this.idDoador = idDoador;
		this.dinheiro = dinheiro;
	}
	public Doador() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "Doador [nome = " + nome + "]";
	}
	//GETTERS
	public String getIdDoador() {
		return idDoador;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	//SETTERS
	public void setIdDoador(String idDoador) {
		this.idDoador = idDoador;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	//Métodos
	@Override
	public String vincularONG(ONG ongAVincular) {
		setOngCadastrada(ongAVincular);
		for (int i = 0 ; i < ongAVincular.getDoadores().length ; i++) {
			if(ongAVincular.getDoadores()[i] == (null)) {
				ongAVincular.getDoadores()[i] = this;
				break;
			}//if
		}//for
		
		
		return "Vínculo efetuado com sucesso";
	}//vincularONG
	public String adquirirAlimento(Alimento alimento) {
		for(int i = 0 ; i < alimentos.length ; i++) {
			if(alimentos[i] == null) {
				alimentos[i] = alimento;
				break;
			}
		}
		return "Alimento adquirido com sucesso!";
	}//adquirirAlimento
	public void doar() {
		for(int i = 0 ; i < alimentos.length ; i++) {
			if(alimentos[i] != null) {
				this.ongCadastrada.receberAlimentos(alimentos[i]);
				alimentos[i] = null;
				break;
			}
		}
	}//doar-sem-argumentos
	public void doar(double valor) {
		if(this.dinheiro >= valor) {
			dinheiro -= valor;
			this.ongCadastrada.receberDinheiro(valor);
			System.out.println("Doação efetuada com sucesso!");
		} else {
			System.out.println("Fundos insuficientes!");
		}
	}//doar-com-argumentos
	
	
}//CLASS