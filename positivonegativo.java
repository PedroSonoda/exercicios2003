package estruturaCondicional;

import java.util.Scanner;

public class positivonegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		int numero;

		System.out.println("Digite um valor:");
		numero = ler.nextInt();


		if (numero > 0) {
			System.out.println("O numero é positivo");
		}
		

		if (numero < 0) {
			System.out.println("O numero é negativo");
		}
		

		else if (numero ==0) {
			System.out.println("O numero é 0");
		}
			ler.close();
	}

	 
		
}

