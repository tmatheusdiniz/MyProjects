package model.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPFValidator {

	public static String cpfValidator(String taxPayer, Scanner md) {

		String regex = "(\\d{3})\\.(\\d{3})\\.(\\d{3})-(\\d{2})";

		// Compilar a expressão regular em um padrão \*
		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(taxPayer);

		if (matcher.matches()) {
			// Se corresponder, formatar o CPF conforme o padrão
			String cpfFormatado = matcher.group(1) + "." + matcher.group(2) + "." + matcher.group(3) + "-"
					+ matcher.group(4);

			return cpfFormatado;
		} else {

			do {
				System.out.print("CPF inválido ou não formatado corretamente. Digite novamente: ");
				taxPayer = md.nextLine();
				matcher = pattern.matcher(taxPayer);

			} while (!matcher.matches());

			String cpfFormatado = matcher.group(1) + "." + matcher.group(2) + "." + matcher.group(3) + "-"
					+ matcher.group(4);
			

			return cpfFormatado;

		}

	}

}
