package menu;

import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
	public static void Jogar() {
		Scanner sc1 = new Scanner(System.in);
		int escolha;

		System.out.println("Escolha tua mão: \n 1-Pedra \n 2-Papel \n 3-Tesoura");
		escolha = sc1.nextByte();
		switch (escolha) {
		case 1:
			Random random = new Random();
			int numeroAdv = random.nextInt(3);
			switch (numeroAdv) {
			case 0:
				System.out.println("Adversario escolheu: Pedra \n Empate!");
				break;
			case 1:
				System.out.println("Adversario escolheu: Papel \n Perdeu!");
				break;
			case 2:
				System.out.println("Adversario escolheu: Tesoura \n Ganhou!");
				break;

			}
			break;
		case 2:
			random = new Random();
			numeroAdv = random.nextInt(3);
			switch (numeroAdv) {
			case 0:
				System.out.println("Adversario escolheu: Pedra \n Ganhou!");
				break;
			case 1:
				System.out.println("Adversario escolheu: Papel \n Empate!");
				break;
			case 2:
				System.out.println("Adversario escolheu: Tesoura \n Perdeu!");
				break;
			}
			break;
		case 3:
			random = new Random();
			numeroAdv = random.nextInt(3);
			switch (numeroAdv) {
			case 0:
				System.out.println("Adversario escolheu: Pedra \n Perdeu!");
				break;
			case 1:
				System.out.println("Adversario escolheu: Papel \n Ganhou!");
				break;
			case 2:
				System.out.println("Adversario escolheu: Tesoura \n Empate!");
				break;
			}
			break;
		}
	}
}
