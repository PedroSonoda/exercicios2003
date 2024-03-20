package estruturaCondicional;

import java.util.Scanner;

public class semana {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int semana;
		
		System.out.println("Informe o número do dia da semana: ");
		semana= ler.nextInt();
		
		
		if (semana == 1) {
			System.out.println("o dia da semana é domingo");
		}

		if (semana == 2) {
			System.out.println("o dia da semana é segunda");
	}
		
		if (semana == 3) {
			System.out.println("o dia da semana é terça");
	}
		
		if (semana == 4) {
			System.out.println("o dia da semana é quarta");
		}
		
		if (semana == 5) {
			System.out.println("o dia da semana é quinta");
		}
		
		if (semana == 6) {
			System.out.println("o dia da semana é sexta");
		}
		
		if (semana == 7) {
			System.out.println("o dia da semana é sabado");
		}
		else if (semana >=7) {
			System.out.println("Isso  não é um dia na semana");
		}
	
	}
}
