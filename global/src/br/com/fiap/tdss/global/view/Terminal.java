package br.com.fiap.tdss.global.view;

import br.com.fiap.tdss.global.model.AlimentoSolido;
import br.com.fiap.tdss.global.model.Doador;
import br.com.fiap.tdss.global.model.Donatario;
import br.com.fiap.tdss.global.model.Endereco;
import br.com.fiap.tdss.global.model.ONG;

public class Terminal {
	public static void main(String[] args) {
		//Instanciando endereços para usar nos construtores de donatarios, pessoas e ONG
		Endereco enderecoDonatario1 = new Endereco("Avenida Cruzeiro do Sul", 123, "02030-000", "Santana", "São Paulo");
		Endereco enderecoDonatario2 = new Endereco("Rua Voluntários da Pátria", 456, "02010-000", "Santana", "São Paulo");
		Endereco enderecoDonatario3 = new Endereco("Avenida Engenheiro Caetano Álvares", 789, "02559-000", "Imirim", "São Paulo");
		Endereco enderecoDoador1 = new Endereco("Rua da Consolação", 987, "02200-000", "Vila Guilherme", "São Paulo");
		Endereco enderecoONG = new Endereco("Jardim Santa Cruz", 154, "02675-031", "Sacomã", "São Paulo");
		
		//Instanciando um alimento que será usado de exemplo
		AlimentoSolido alimento1 = new AlimentoSolido("Arroz", "16/05/2025", "Grão", 1, 1);
		
		//Instanciando uma ONG que poderá receber doações, enviar doação ou comprar
		//Alimentos caso receba doações em dinheiro
		ONG ong = new ONG(enderecoONG, "Norte", "ONG: Banco de Alimentos", 1000);
		
		//Instanciando Donatários
		Donatario donatario1 = new Donatario("Ronald", "16/05/2002", enderecoDonatario1, "dn552698");
		Donatario donatario2 = new Donatario("Vittor", "15/07/2003", enderecoDonatario2, "dn558975");
		Donatario donatario3 = new Donatario("Nick", "02/05/2004", enderecoDonatario3, "dn554318");
		
		//Instanciando Doadores
		Doador doador1 = new Doador("Serbato", "08/02/1999", enderecoDoador1, "do548731", 2900.50);
		
		//Essa função cuidará de adicionar o Alimento de exemplo à lista de alimentos do doador e retornar uma String confirmando
		System.out.println(doador1.adquirirAlimento(alimento1));
		
		//Essa função cuidará de vincular os donatarios e doadores à ONG e retornará uma String confirmando
		System.out.println(doador1.vincularONG(ong));
		System.out.println(donatario1.vincularONG(ong));
		System.out.println(donatario2.vincularONG(ong));
		System.out.println(donatario3.vincularONG(ong));
		
		//Essa função fará com que o doador consiga doar um alimento que ele tiver para a ONG
		//Então o arroz que ele tinha adquirido para o exemplo, será tirado dele e encaminhado para ONG
		doador1.doar();
		
		//Essa função fará com que o doador possa doar para a ONG em dinheiro
		doador1.doar(500.50);
		
		//Essa função fará a ong poder comprar alimentos com o dinheiro que tem das doações e
		//armazena-los no seu Array de alimentos
		ong.comprarAlimentos();
		
		//Essa função fará a ONG escolher o donatário que irá encaminhar o alimento
		//e o alimento que será encaminhado, tirando de sua lista e adicionando na do donatário
		ong.encaminharAlimento();
		
		//Essa função permite verificar o indice e alimento que se encontra nas pessoas após essas operações
		System.out.println(ong.retornarStringAlimentoPessoas(donatario1));
		System.out.println(ong.retornarStringAlimentoPessoas(donatario2));
		System.out.println(ong.retornarStringAlimentoPessoas(donatario3));
		System.out.println(ong.retornarStringAlimentoPessoas(doador1));
		
		//Essa função permite verificar os alimentos contidos na ONG
		System.out.println(ong.retornaStringListaAlimentos());
		
		//Essa função permite verificar os donatários contidos na ONG
		System.out.println(ong.retornaStringListaDonatarios());
		
		//Essa função permite verificar os doadores contidos na ONG
		System.out.println(ong.retornaStringListaDoadores());
		
		
		
	}//MAIN
}//CLASS