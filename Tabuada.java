package menu;

import java.util.Scanner;

public class Tabuada {
	static Scanner sc1 = new Scanner(System.in);
	public static void fazerTabuada() {
		int i = sc1.nextInt();
		int j = 0;
		int resultado;

		do {
			resultado = i * j;
			System.out.println(i + "*" + j + "=" + resultado);
			j++;
		} while (j < 11);

		System.out.println();
		j = 0;
	}
}
