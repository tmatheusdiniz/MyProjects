package learning.intermediate;

import java.util.Scanner;

public class Vect {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		System.out.println("Digite quantas alturas deseja digitar: ");
		
		
	    int n = md.nextInt();
	    double z = 0;
		
		double[] vetorloco = new double[n];
        
		for(int i = 0; i<n; i++) {
			
		    System.out.println("Digite a altura " + (i+1) +": ");
			
			vetorloco[i] = md.nextDouble();
		
			z = z + vetorloco[i]; 
			
		}
		
		
		double media = z/n;
		 
		System.out.printf("A média das alturas é: %.2f%n", media);
	
		
		
		
		
		
		md.close();
	}

}
