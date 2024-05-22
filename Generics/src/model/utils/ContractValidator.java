package model.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContractValidator {

	public static String numberValidator(String x, Scanner md) {

		String regex = "^\\d{1,4}$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(x);

		if (matcher.matches()) {

			return x;

		} else {
			do {
				System.out.print("Contract number invalid. Type it again: ");
				x = md.nextLine();
				matcher = pattern.matcher(x);

			} while (!matcher.matches());

			return x;
		}
	}

}
