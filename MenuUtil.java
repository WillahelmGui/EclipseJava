package menu;

import java.util.Scanner;

public class MenuUtil {
	static Scanner sc1 = new Scanner(System.in);
	
	public static void mostrarOpcoesMenu() {
		System.out.println("Digite um númnero para escolher a opcao");
		System.out.println("1 - IMC");
		System.out.println("2 - Tabuada");
		System.out.println("3 - Despesas");
		System.out.println("4 - Multas");
		System.out.println("5 - Calcular formas");
		System.out.println("6 - Frete");
		System.out.println("7 - Par ou ímpar");
		System.out.println("8 - Pedra, papel, tesoura");
		System.out.println("0 - Sair");
	}

	public static void main(String[] args) {

		byte escolha;
		// Loop
		do {
			mostrarOpcoesMenu();
			escolha = sc1.nextByte();

			switch (escolha) {

			case 1:
				System.out.println("IMC");
				IMC.fazerIMC();
				break;

			case 2:
				System.out.println("Tabuada");
				Tabuada.fazerTabuada();
				break;

			case 3:
				System.out.println("Despesas");
				Despesas.fazerCalculoDespesas();
				break;

			case 4:
				System.out.println("Multas");
				break;

			case 5:
				System.out.println("Calcular formas");
				FormasGeometricas.calcularFormaGeo();
				break;

			case 6:
				System.out.println("Frete");
				Frete.calcularFrete();
				break;

			case 7:
				System.out.println("Par ou ímpar");
				
				break;

			case 8:
				System.out.println("Pedra, papel e tesoura");
				break;
			}
		} while (escolha != 0);

		sc1.close();
	}

}
