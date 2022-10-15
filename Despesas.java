package menu;

import java.util.Scanner;

public class Despesas {
	static Scanner sc1 = new Scanner(System.in);
	public static void fazerCalculoDespesas() {
		System.out.println("Digite o valor da sua renda mensal");
		double rendaMes = sc1.nextDouble();
		System.out.println("Digite o valor de suas despesas em casa");
		double valorDespesas = sc1.nextDouble();
		System.out.println("Digite o valor de tudo pago em dinheiro");
		double tudoEmDinheiro = sc1.nextDouble();
		System.out.println("Digite o valor de tudo pago em cartão ");
		double tudoEmCartao = sc1.nextDouble();

		double totalDespesas = tudoEmDinheiro + tudoEmCartao + valorDespesas;
		double sobraDoMes = rendaMes - totalDespesas;
		System.out.println("Sobrou: " + sobraDoMes);
		if (totalDespesas > rendaMes) {
			System.out.println("Nome no Serasa");
		} else {
			System.out.println("Deu bom");
		}
	}

}