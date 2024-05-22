
package tests;

import java.util.Scanner;


import learning.entities.*;

public class ProgramTriangle {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		Triangle areaa, areab;
		
		areaa = new Triangle();
		areab = new Triangle();

		double resulta;
		double resultb;

		System.out.println("Digite os lados do triangulo a: ");

		areaa.x = md.nextDouble();
		areaa.y = md.nextDouble();
		areaa.z = md.nextDouble();

		System.out.println("Digite os lados do triangulo b: ");

		areab.x = md.nextDouble();
		areab.y = md.nextDouble();
		areab.z = md.nextDouble();

		resulta = areaa.area();
		resultb = areab.area();

		System.out.println();

		System.out.printf("Área A = %.2f%n", resulta);

		System.out.printf("Área B = %.2f%n", resultb);

		System.out.println();

		if (resulta > resultb) {

			System.out.println("Maior área: Área a");

		} else {
			System.out.println("Maior Área: Área b");
		}

		md.close();
	}

}
