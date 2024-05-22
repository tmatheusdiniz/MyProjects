package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import learning.entities.Product;

public class ProgramReader {

	public static void main(String[] args) {

		List<Product> listProducts = new ArrayList<>();

		String st = "M:\\Study\\exe.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(st))) {

			String line = br.readLine();

			while (line != null) {

				String[] splt = line.trim().split(";");

				if (splt.length == 2) {
					listProducts.add(new Product(splt[0], Double.parseDouble(splt[1])));
				} else {
					System.out.println("Formato inválido na linha: " + line);
				}
				line = br.readLine();
			}

			Double sum = listProducts.stream().mapToDouble(Product::getPrice).average().orElse(0);

			System.out.println("Average price: " + sum);

			System.out.println();

			System.out.println("products priced below average: \n");

			for (Product list : listProducts) {

				if (list.getPrice() < sum) {

					System.out.println(list.getName() + "," + list.getPrice()); //Se não importasse a ordem\*
				}

			}

			System.out.println();

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> name = listProducts.stream().filter(p -> p.getPrice() < sum).map(p -> p.getName())
					.sorted(comp.reversed()).collect(Collectors.toList()); // Lista em ordem decrescente por nome \*

			
		name.forEach(System.out::println);
			
			
		}	catch (IOException e) {
			System.out.println("arquiv unavailable" + e.getMessage());
		}
	}
}
		
