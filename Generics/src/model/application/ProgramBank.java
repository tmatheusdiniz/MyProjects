package model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Accounts;
import model.utils.CPFValidator;

public class ProgramBank {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		List<Accounts> accountList = new ArrayList<>();

		int aux;

		int x = 1; // temporariamente \*

		try {

			do {

				System.out.println("Want to open a new account, Enter " + 1);
				System.out.println("Make a transfer, Enter " + 2);
				System.out.println("know your account information, Enter " + 3);
				System.out.println("Return to main menu, Enter " + 4);

				aux = md.nextInt();

				md.nextLine();

				System.out.println();

				switch (aux) {

				case 1:

					for (int i = 0; i < x; i++) {
						Accounts accounts = new Accounts();

						System.out.println("Type it your name, age and TaxPayer(000.000.000-00): ");

						String name = md.nextLine();

						int age;

						age = Accounts.getIntInput(md);

						String taxPayer = CPFValidator.cpfValidator(md.nextLine(), md);

						System.out.println();

						System.out.println("TaxPayer entered:" + taxPayer);

						System.out.println();

						// Uso opcional:
						// DecimalFormat df = new DecimalFormat("000.000.000-00");
						// String taxPayerFormat = df.format(taxPayer); /*

						System.out.println(accounts.createAccount(name, age, taxPayer));

						accountList.add(accounts);

					}

					break;

				case 2:
					Accounts accounts = new Accounts();
					System.out.print("Enter your taxPayer(000.000.000-00) so we can locate your account: ");
					String taxPayer = md.nextLine();
					Accounts accountInfo = accounts.findAccountByCPF(accountList, taxPayer);
					System.out.println(accountInfo);
					break;

				}

				System.out.print("Do you want to return to the main menu? If yes, enter 4, if not, 0: ");
				aux = md.nextInt();
				md.nextLine();
				
			} while (aux == 4);
		} finally {
			md.close();
		}
	}
}
