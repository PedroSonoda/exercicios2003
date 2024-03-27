package estruturaCondicional;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int numero1,numero2,numero3;

		System.out.println("Digite o primeiro valor:");
		numero1 = ler.nextInt();


		System.out.println("Digite o segundo valor:");
		numero2 = ler.nextInt();
		

		System.out.println("Digite o terceiro valor:");
		numero3 = ler.nextInt();

		if (numero1 == numero2 && numero1 == numero3)
			System.out.println("O triangulo é equilatero");
		
		else if (numero1 == numero2 || numero1 == numero3) {
			System.out.println("O triangulo é isosceles");
		}
		
		else 
			System.out.println("O triangulo é escaleno");
			ler.close();

	}

}
