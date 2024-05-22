package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Accounts {

	private Holder holder;
	private LocalDateTime date;
	private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss");
	private Double balance = (double) 0;

	public Accounts() {

	}

	public Accounts(Holder holder, LocalDateTime date, double balance) {

		this.holder = holder;
		this.date = date;
		this.balance = balance;
	}

	public String createAccount(String name, int age, String taxPayer) {

		if (getValidationAge(age) == true) {

			this.holder = new Holder(name, taxPayer, age);
			setDate(LocalDateTime.now().format(format));
			return "account created successfully!";

		} else {
			return "Age must be at least 18 to open an account.";

		}

	}

	public Accounts findAccountByCPF(List<Accounts> accountList, String cpf) {
		for (Accounts conta : accountList) {
			if (conta.getHolder().getTaxPayer().equals(cpf)) {
				return conta;
			}
		}
		return null;
	}

	public static int getIntInput(Scanner scanner) {
		int input;
		while (true) {
			try {
				input = scanner.nextInt();
				scanner.nextLine();
				return input; // Em java, quando tem um "return", o laço é interrompido \*
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.nextLine();
			}
		}
	}

	public void deposit(double balance) {

		this.balance = balance;
	}

	public boolean getValidationAge(double x) {

		if (x < 18) {

			return false;

		} else {

			return true;
		}
	}

	public Holder getHolder() {
		return holder;
	}

	public String getDate() {
		return date.format(format);
	}

	public void setDate(String dateF) {

		this.date = LocalDateTime.parse(dateF, format);

	}

	public double getBalance() {
		return balance;
	}

	@Override

	public String toString() {

		return "Account Information:" + "\nHolder Name: " + this.holder.getName() + "\nHolder Age: "
				+ this.holder.getAge() + "\nTaxPayer: " + this.holder.getTaxPayer() + "\nBalance: " + this.balance
				+ "\nDate: " + this.date.toString();

	}

}
