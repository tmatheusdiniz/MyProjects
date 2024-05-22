package model.application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Department;
import model.entities.Worker;
import model.enums.WorkerLevel;
import model.utilities.LimparTela;

public class ProgramEmployee {

	public static void main(String[] args) throws ParseException {

		Scanner md = new Scanner(System.in);

		String dep;
		
		char control;

		Worker worker = new Worker();
		Department department = new Department();

		Locale locale = Locale.US;

		System.out.print("Enter department's name: ");

		dep = md.nextLine();

		department.setName(dep);

		System.out.println("Your department: " + department.getName());

		System.out.println("Enter worker data: ");

		System.out.print("Name: ");
		String name = md.nextLine();
		worker.setName(name);

		System.out.print("Enter the level of the worker (Junior, Mid, or Senior): ");

		String levelString = md.nextLine();

		WorkerLevel level = null;

		do {

			switch (levelString.toUpperCase()) {
			case "JUNIOR":
				level = WorkerLevel.JUNIOR;
				break;
			case "MID":
				level = WorkerLevel.MID_LEVEL;
				break;
			case "SENIOR":
				level = WorkerLevel.SENIOR;
				break;
			default:
				System.out.print("Invalid level. Type irt again: ");
				levelString = md.nextLine();
			}

		} while (!levelString.toUpperCase().equals("JUNIOR") && !levelString.toUpperCase().equals("MID")
				&& !levelString.toUpperCase().equals("SENIOR"));

		worker.setLevel(level);

		System.out.println("Enter your base salary: ");
		double sal = md.nextDouble();
		worker.setBaseSalary(sal);

		System.out.println("name: " + worker.getName().toLowerCase());
		System.out.println("base salary: " + String.format(locale, "%.2f", worker.getBaseSalary()));
		System.out.println("level: " + worker.getLevel().toString().toLowerCase());

		System.out.print("How many contracts to this worker? ");

		int n = md.nextInt();

		for (int i = 0; i < n; i++) {

			md.nextLine();
			System.out.println("Enter date for contract #" + (i + 1) + ": ");

			System.out.println("Please enter the date in the format DD/MM/YYYY:");

			String hour = md.nextLine();
			DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate contractDate = null;
			try {
				contractDate = LocalDate.parse(hour, sdf);

			} catch (DateTimeParseException e) {
				System.out.println("Invalid date format. Please enter the date in the format DD/MM/YYYY.");
				i--;
			}

			System.out.print("Value per hour: ");
			double x = md.nextDouble();

			System.out.print("Duration (hours):");
			int y = md.nextInt();

			worker.addContract(contractDate, x, y);
			LimparTela.limparTela();

		}

		List<model.entities.HourContract> contract = worker.getContract();

		for (model.entities.HourContract listaDetrabalhadores : contract) {
			System.out.println(listaDetrabalhadores);
			System.out.println("----------------------");
		}

		md.nextLine();

		do {

			System.out.print("Type it the year and mounth for get income: ");

			int year = md.nextInt();
			md.nextLine();
			int mounth = md.nextInt();
			md.nextLine();

			System.out.print("Your income for this period: ");
			System.out.println(worker.income(year, mounth));

			System.out.print("Do you  want continued: ");
			
			control = md.next().charAt(0);

		} while (control == 'y');
		
		md.close();
	}
}
