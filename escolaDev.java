package estruturaCondicional;

import java.util.Scanner;

public class escolaDev {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double nota,nota1,nota2,nota3,soma, resultado;

		System.out.println("Informe a primeira nota:");
		nota = ler.nextDouble();

		System.out.println("Informe a segunda nota:");
		nota1 = ler.nextDouble();

		System.out.println("Informe a terceira nota:");
		nota2 = ler.nextDouble();

		System.out.println("Informe a quarta nota:");
		nota3 = ler.nextDouble();

		soma= nota+nota1+nota2+nota3;
		resultado= soma/4;
		
		if (resultado <=6) {
			System.out.println("você está reprovado "+ resultado);
		}
		
		else {
			System.out.println("você está aprovado "+ resultado);
		}
			ler.close();

	}


	}


