package menu;

import java.util.Scanner;

public class Frete {
	static Scanner sc1 = new Scanner (System.in);
	public static void calcularFrete() {
		System.out.println("Digite sua localidade (AM, SP, RJ, BA OU GO.)");
		String uf = sc1.next();

		switch (uf) {
		case "AM":
			System.out.println("Seu frete é R$35,00");

			break;
		case "SP":
		case "RJ":
			System.out.println("Seu frete é R$10,00");

			break;
		case "BA":
			System.out.println("Seu frete é R$50,00");

			break;
		case "GO":
			System.out.println("Seu frete é R$30,00");

			break;
		default:
			System.out.println("Nào há frete para" + uf);
			break;
		}
	}

}
