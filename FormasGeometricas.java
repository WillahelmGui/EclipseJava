package menu;

import java.util.Scanner;

public class FormasGeometricas {
	static Scanner sc1 = new Scanner(System.in);
	
	
	public static void calcularFormaGeo() {
	byte formaGeo;	
	int base;
	int altura;
	double resultado;
	int lado;
	int diagonalAltura;
	int diagonalBase;
	System.out.println("Digite um númnero para escolher a opcao");
	System.out.println("1 - Quadrado");
	System.out.println("2 - Trapézio");
	System.out.println("3 - Triângulo Equilátero");
	System.out.println("4 - Retângulo");
	System.out.println("5 - Triângulo Qualquer");
	System.out.println("6 - Paralelogramo");
	System.out.println("7 - Losângulo");
	System.out.println("8 - Círculo");
	System.out.println("0 - Sair");
	formaGeo = sc1.nextByte();
	
	switch(formaGeo) {
	case 1: 
		System.out.println("Digite as medidas do quadrado");
		base = sc1.nextInt();
		resultado = base * base;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 2: 
		System.out.println("Digite as medidas do retângulo");
		base = sc1.nextInt();
		altura = sc1.nextInt();
		resultado = base * altura;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 3: 
		System.out.println("Digite as medidas do trapézio");
		base = sc1.nextInt();
		int topo = sc1.nextInt();
		altura = sc1.nextInt();
		resultado = (base + topo) * altura /2;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 4: 
		System.out.println("Digite as medidas do triângulo equilátero");
		byte tres = 3;
		lado = sc1.nextInt();
		resultado = (lado * lado) * Math.sqrt(tres)/4;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 5: 
		System.out.println("Digite as medidas do triângulo qualquer");
		base = sc1.nextInt();
		altura = sc1.nextInt();
		resultado = base * altura /2;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 6: 
		System.out.println("Digite as medidas do paralelogramo");
		base = sc1.nextInt();
		altura = sc1.nextInt();
		resultado = base * altura;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 7: 
		System.out.println("Digite as medidas do quadrado");
		diagonalAltura = sc1.nextInt();
		diagonalBase = sc1.nextInt();
		resultado = diagonalAltura * diagonalBase/2;
		System.out.println("Seu resultado é: " + resultado);
		break;
	case 8: 
		System.out.println("Digite as medidas do quadrado");
		int raio = sc1.nextInt();
		double pi= 3.14;
		double resultadoCírculo = (raio * raio) * pi;
		System.out.println("Seu resultado é: " + resultadoCírculo);
		
		
		
	}
	}
	
}
