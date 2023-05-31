package br.com.fiap.tdss.global.model;

import javax.swing.JOptionPane;

public class ONG {
	//Atributos
	private Endereco endereco;
	private String zona;
	private String nome;
	private Pessoa[] donatarios = new Pessoa[10];
	private Pessoa[] doadores = new Pessoa[10];
	private Alimento[] alimento = new Alimento[10];
	private double doacoesEmDinheiro;
	//Construtores
	public ONG(Endereco endereco, String zona, String nome, double doacoesEmDinheiro) {
		super();
		this.endereco = endereco;
		this.zona = zona;
		this.nome = nome;
		this.doacoesEmDinheiro = doacoesEmDinheiro;
	}
	public ONG() {
		super();
	} 
	//toString
	@Override
	public String toString() {
		return "ONG [zona = " + zona + ", nome = " + nome + "]";
	}
	//GETTERS
	public Endereco getEndereco() {
		return endereco;
	}
	public String getZona() {
		return zona;
	}
	public String getNome() {
		return nome;
	}
	public Pessoa[] getDonatarios() {
		return donatarios;
	}
	public Pessoa[] getDoadores() {
		return doadores;
	}
	public Alimento[] getAlimento() {
		return alimento;
	}
	public double getDoacoesEmDinheiro() {
		return doacoesEmDinheiro;
	}
	//SETTERS
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDonatarios(Pessoa[] donatarios) {
		this.donatarios = donatarios;
	}
	public void setDoadores(Pessoa[] doadores) {
		this.doadores = doadores;
	}
	public void setAlimento(Alimento[] alimento) {
		this.alimento = alimento;
	}
	public void setDoacoesEmDinheiro(double doacoesEmDinheiro) {
		this.doacoesEmDinheiro = doacoesEmDinheiro;
	}
	//Métodos
	public void receberAlimentos(Alimento alimento) {
		for(int i = 0 ; i < this.alimento.length ; i++) {
			if(this.alimento[i] == null) {
				this.alimento[i] = alimento;
				break;
			}
		}
	}//receberAlimentos
	public void receberDinheiro(double valor) {
		this.doacoesEmDinheiro += valor;
	}//receberDinheiro
	public void encaminharAlimento() {
		int escolhaAlimento = Integer.parseInt(JOptionPane.showInputDialog("Escolha o alimento a ser doado: \n" + retornaStringListaAlimentos()));
		if(this.alimento[escolhaAlimento] != null) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o donatário \n" + retornaStringListaDonatarios()));
			this.donatarios[opcao].receberAlimentos(alimento[escolhaAlimento]);
			alimento[escolhaAlimento] = null;
			JOptionPane.showConfirmDialog(null, "Doação encaminhada com sucesso");
		} else {
			JOptionPane.showConfirmDialog(null, "Alimento inválido!");
		}
	}//encaminharAlimento
	
	public void comprarAlimentos() {
		double valorArroz = 9.69;
		double valorFeijao = 10.25;
		double valorAgua = 32;
		while(true) {
			int option = Integer.parseInt(JOptionPane.showInputDialog("\n Escolha o produto que deseja comprar: \n 1 - Arroz R$ 9,69 1Kg \n 2 - Feijão R$ 10,25 1Kg \n 3 - Água R$ 32,00 20L \n 4 - Sair"));
			if(option == 1 && this.doacoesEmDinheiro >= valorArroz) {
				for(int i = 0; i < this.alimento.length ; i++) {
					if(this.alimento[i] == null) {
						this.alimento[i] = new AlimentoSolido("Arroz", "16/07/2024", "Grão", 1, 1);
						this.doacoesEmDinheiro -= valorArroz;
						JOptionPane.showConfirmDialog(null, this.alimento[i] + " comprado com sucesso!");
						break;
					}//if
				}//for
			} else if(option == 2 && this.doacoesEmDinheiro >= valorFeijao) {
				for(int i = 0; i < this.alimento.length ; i++) {
					if(this.alimento[i] == null) {
						this.alimento[i] = new AlimentoSolido("Feijão", "01/02/2024", "Grão", 1, 1);
						this.doacoesEmDinheiro -= valorFeijao;
						JOptionPane.showConfirmDialog(null, this.alimento[i] + " comprado com sucesso!");
						break;
					}//if
				}//for
			} else if(option == 3 && this.doacoesEmDinheiro >= valorAgua) {
				for(int i = 0; i < this.alimento.length ; i++) {
					if(this.alimento[i] == null) {
						this.alimento[i] = new AlimentoLiquido("Água Mineral", "30/05/2026", "Água", 1, 20);
						this.doacoesEmDinheiro -= valorAgua;
						JOptionPane.showConfirmDialog(null, this.alimento[i] + " comprado com sucesso!");
						break;
					}//if
				}//for
			} else if(option == 4) {
				JOptionPane.showConfirmDialog(null, "Obrigado pela preferência!");
				break;
			} else {
				JOptionPane.showConfirmDialog(null, "Opção inválida ou fundos insuficientes para compra!");
			}
		}//while
	}//comprarAlimentos
	
	public String retornaStringListaAlimentos() {
		String relatorio = "";
		for(int i = 0; i < this.alimento.length ; i++) {
			relatorio += "\n" + i + " - " + this.alimento[i];
		}
		return relatorio;
	}//retornaStringListaAlimentos
	public String retornaStringListaDonatarios() {
		String relatorio = "";
		for(int i = 0; i < this.donatarios.length ; i++) {
			relatorio += "\n" + i + " - " + this.donatarios[i];
		}
		return relatorio;
	}//retornaStringListaDonatarios
	public String retornaStringListaDoadores() {
		String relatorio = "";
		for(int i = 0; i < this.doadores.length ; i++) {
			relatorio += "\n" + i + " - " + this.doadores[i];
		}
		return relatorio;
	}//retornaStringListaDoadores
	public String retornarStringAlimentoPessoas(Pessoa pessoa) {
		String relatorio = "";
		for(int i = 0; i < pessoa.alimentos.length ; i++) {
			relatorio += "\n" + i + " - " + pessoa.alimentos[i];
		}
		return relatorio;
	}

	
	
	
}//CLASS