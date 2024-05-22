package learning.advanced;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {

	public static void main(String... args) throws FileNotFoundException {

		String path = "M:\\Study\\exe.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line;
			while ((line = br.readLine()) != null) {

				String[] values = line.split(",");

				for (String value : values) {

					System.out.println(value + " ");
				}

			} System.out.println();

		} catch (IOException e) {

			System.out.println("Não foi possível encontrar o arquivo!" + e.getMessage());

		}

	}

}
