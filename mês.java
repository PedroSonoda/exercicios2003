package estruturaCondicional;

import java.util.Scanner;

public class mês {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
		
		int mes;
		 
		System.out.println("Informe o número do mês: ");
		mes= ler.nextInt();
		
		
		if (mes == 1) {
			System.out.println("o mês é janiero");
		}

		if (mes == 2) {
			System.out.println("o mês é fevereiro");
	}
		
		if (mes == 3) {
			System.out.println("o mês é março");
	}
		
		if (mes == 4) {
			System.out.println("o mês é abril");
		}
		
		if (mes == 5) {
			System.out.println("o mês é maio");
		}
		
		if (mes == 6) {
			System.out.println("o mês é junho");
		}
		
		if (mes == 7) {
			System.out.println("o mês é julho ");
		}
		
		if (mes == 8) {
			System.out.println("o mês é agosto ");
		}
		if (mes == 9) {
			System.out.println("o mês é setembro ");
		}
		
		if (mes == 10) {
			System.out.println("o mês é outubro ");
		}
		
		if (mes == 11) {
			System.out.println("o mês é novembro ");
		}
		
		if (mes == 12) {
			System.out.println("o mês é dezembro ");
		}
		else if (mes >=12) {
			System.out.println("isso não é um mês");
		}
	
	
	}

}
