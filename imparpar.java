package estruturaCondicional;

import java.util.Scanner;

public class imparpar {

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);

			int numero;

			System.out.println("Digite um valor:");
			numero = ler.nextInt();

			if (numero % 2==0) {
				System.out.println("O numero é par");
			}
			
			else {
				System.out.println("O numero é impar");
			}
				ler.close();

	}

}
