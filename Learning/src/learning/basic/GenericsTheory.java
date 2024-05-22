package learning.basic;

import java.util.Locale;

/* "import.java.util.x", serve pra importar uma classe de outro packpage. 
 */

public class GenericsTheory {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		short x = 32767;
		double y = 5250;

		System.out.println("Hello World " + x);

		/*
		 * Como fazer uma junção, por exemplo: Caracteres mais uma variável impressos de
		 * uma só vez.
		 */

		System.out.printf("%.2f%n", y);
		
		/* Concatenar  com variáveis: 
		 * %f: ponto flutuante
		 * %d: inteiro
		 * %s: texto
		 * %n: quebra de linha
		 */
		
	    char f = 'F';   /* pode ser String ou Char*/
	    int g = 20;
	    double h = 1500;		
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", f , g , h);

	}
}

