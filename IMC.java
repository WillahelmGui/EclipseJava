package menu;

import java.util.Scanner;

public class IMC {
	static Scanner sc1 = new Scanner(System.in);

	public static void fazerIMC() {
		System.out.println("Informe sua massa");
		double massa = sc1.nextDouble();
		System.out.println("Informe sua altura");
		double altura = sc1.nextDouble();

		double imc;
		imc = massa / (altura * altura);
		System.out.println("O seu IMC é " + imc + ".");
		if (imc < 18.5) {
			System.out.println("seu índice é: Magreza.");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu índice é: Normal.");
		} else if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu índice é: Sobrepeso.");
		} else if (imc > 30) {
			System.out.println("Seu índice é: Obesidade");
		}
	}
}
