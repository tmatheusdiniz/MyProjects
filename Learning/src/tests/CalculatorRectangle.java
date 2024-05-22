package tests;

import java.util.Scanner;

import learning.basic.*;

public class CalculatorRectangle {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		System.out.println("Enter rectangle width and heigth: ");

		StaticClass carac = new StaticClass();

		carac.heig = md.nextDouble();
		carac.wid = md.nextDouble();

		String result = carac.calculator(carac.heig,carac.wid);
		
	    System.out.printf(result);
		
		md.close();

	}

}
