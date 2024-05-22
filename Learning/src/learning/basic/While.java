package learning.basic;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		System.out.printf("Digite a senha para te acesso: ");

		int x;

		Scanner md = new Scanner(System.in);

		x = md.nextInt();

		while (x != 2002) {

			System.out.printf("Senha errada! Digite novamente: ");

			x = md.nextInt();

		}

		System.out.println("Senha correta, obrigado!");

		md.close();

	}

}
