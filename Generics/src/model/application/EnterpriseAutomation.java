package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Contract;
import model.utils.ContractValidator;

public class EnterpriseAutomation {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);
		List<Contract> listContract = new ArrayList<>();
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		char control;

		do {

			System.out.println("Enter contract detail:");
			System.out.print("Number: ");
			String numberContract = ContractValidator.numberValidator(md.nextLine(), md);
			boolean validDate = false;
			LocalDate date = null;
			while (!validDate) {
				System.out.print("Date (dd/MM/yyyy): ");
				String dateStr = md.nextLine();
				try {
					date = LocalDate.parse(dateStr, dtm);
					validDate = true;
				} catch (DateTimeParseException e) {
					System.out.println("Invalid date format. Please enter date in format dd/MM/yyyy.");
				}
			}
			System.out.print("Contract value: ");
			double valueTotal = md.nextDouble();
			Contract contract = new Contract(numberContract, date, valueTotal);
			listContract.add(contract);
			System.out.println("Do you want add any more contract?(y/n) ");
			control = md.next().charAt(0);

		} while (Character.toLowerCase(control) == 'y');

		md.close();

	}

}
