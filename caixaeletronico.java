package estruturaCondicional;

import java.util.Scanner;

public class caixaeletronico {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
		
		String cpf,senha,login,senhacorreta,cpfcorreto;
		int sf,valor = 0,saldo=1000;
		
		cpfcorreto = ("47499182886");
		senhacorreta= ("123456");
		
		
		System.out.println("informe seu CPF;");
		cpf= ler.nextLine();
		
		if (cpf.equals("47499182886")) 
		{ 
	
			System.out.println("Informe sua senha");
			senha = ler.nextLine();
			if (senha.equals("123456")) {
				System.out.println("Saldo atual é correspondente a " + saldo);
				System.out.println("Que valor você deseja sacar?");
				valor = ler.nextInt();
				if (valor <=saldo) {
					sf= saldo - valor;
					System.out.println("Seu saldo foi atualizado, valor correspondete é " + sf);
				}else {
					System.out.println("Saldo insuficiente");
				}
			}else {
				System.err.println("Senha incorreta");
			}
		}else {
			System.out.println("CPF inválido");
		}ler.close();
	} 
}