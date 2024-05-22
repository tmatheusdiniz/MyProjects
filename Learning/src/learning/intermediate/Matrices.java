package learning.intermediate;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		int x, y;

		System.out.println("Digite quantas linhas e colunas, respectivamente, sua matriz vai ter: ");

		x = md.nextInt();
		y = md.nextInt();

		int mat[][] = new int[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.println("------------------------------------");
				mat[i][j] = md.nextInt();

			}
		}

		System.out.println("-----------------------");
		System.out.println(mat[x-1][y-1]);

		md.close();

	}
}