package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		String path = "M:\\Study\\Programming\\Books\\Java\\out";

		File pathMk = new File(path);

		if (!pathMk.exists()) {

			pathMk.mkdir();
			System.out.println("Subpasta criada");

		}

		String arquivoSumary = path + File.separator + "Sumary.csv";

		File arquivoNovo = new File(arquivoSumary);

		try {

			if (arquivoNovo.exists()) {

				BufferedReader br = new BufferedReader(new FileReader(arquivoNovo));

				System.out.println("Arquivo criado com sucesso");
			} else {
				
				

				System.out.println("Arquivo já existe");
			}
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
