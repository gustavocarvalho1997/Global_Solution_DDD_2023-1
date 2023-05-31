package br.com.fiap.tdss.global.model;

public class Donatario extends Pessoa{
	//Atributos
	private String idDonatario;
	//Construtores
	public Donatario(String nome, String dataNascimento, Endereco endereco, String idDonatario) {
		super(nome, dataNascimento, endereco);
		this.idDonatario = idDonatario;
	}
	public Donatario() {
		super();
	}
	//toString
	@Override
	public String toString() {
		return "Donatario [nome = " + nome + "]";
	}
	//GETTERS
	public String getIdDonatario() {
		return idDonatario;
	}
	//SETTERS
	public void setIdDonatario(String idDonatario) {
		this.idDonatario = idDonatario;
	}
	//Métodos
	@Override
	public String vincularONG(ONG ongAVincular) {
		setOngCadastrada(ongAVincular);
		for (int i = 0 ; i < ongAVincular.getDonatarios().length ; i++) {
			if(ongAVincular.getDonatarios()[i] == (null)) {
				ongAVincular.getDonatarios()[i] = this;
				break;
			}//if
		}//for
		
		
		return "Vínculo efetuado com sucesso";
	}//vincularONG
	
	
	
}//CLASS