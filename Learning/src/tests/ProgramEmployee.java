package tests;

import java.util.Scanner;

import learning.entities.*;

public class ProgramEmployee {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		System.out.println("type it your name and gross salary: ");

		String name1 = md.nextLine();
		double grossSalary1 = md.nextDouble();

		Employee employee1 = new Employee(name1, grossSalary1);
		
		System.out.println("type it the tax you are subjecto to: ");
		
		double tax = md.nextDouble();
		
		String carac = employee1.getCaract(tax);

		System.out.println(carac);

		md.close();

	}
}