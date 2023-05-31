package br.com.fiap.tdss.global.model;

import javax.swing.JOptionPane;

public class Pessoa {
	//Atributos
	protected Alimento[] alimentos = new Alimento[10];
	protected String nome;
	protected String dataNascimento;
	protected Endereco endereco;
	protected ONG ongCadastrada;
	//Construtores
	public Pessoa(String nome, String dataNascimento, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}
	public Pessoa() {
		super();
	} 
	//toString
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + "]";
	} 
	//GETTERS
	public Alimento[] getAlimentos() {
		return alimentos;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public ONG getOngCadastrada() {
		return ongCadastrada;
	}
	//SETTERS
	public void setAlimentos(Alimento[] alimentos) {
		this.alimentos = alimentos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setOngCadastrada(ONG ongCadastrada) {
		this.ongCadastrada = ongCadastrada;
	}
	//Métodos
	public String vincularONG(ONG ongAVincular) {
		setOngCadastrada(ongAVincular);
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha se deseja se vincular como Donatario ou Doador \n 1 - Donatario \n 2 - Doador"));
		if(opcao == 1) {
			for (int i = 0 ; i < ongAVincular.getDonatarios().length ; i++) {
				if(ongAVincular.getDonatarios()[i] == (null)) {
					ongAVincular.getDonatarios()[i] = this;
					break;
				}//if
			}//for
		} else if (opcao == 2) {
			for (int i = 0 ; i < ongAVincular.getDoadores().length ; i++) {
				if(ongAVincular.getDoadores()[i] == (null)) {
					ongAVincular.getDoadores()[i] = this;
					break;
				}//if
			}//for
		}
		
		
		return "Vínculo efetuado com sucesso";
	}//vincularONG
	public void receberAlimentos(Alimento alimento) {
		for(int i = 0 ; i < this.alimentos.length ; i++) {
			if(this.alimentos[i] == null) {
				this.alimentos[i] = alimento;
				break;
			}
		}
	}//receberAlimentos
	
	
	
	
}//CLASS