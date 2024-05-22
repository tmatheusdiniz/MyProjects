package tests;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class ProgramShapes {

	public static void main(String[] args) {

		Scanner md = new Scanner(System.in);

		List<Shape> listShape = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");

		int n = md.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Shape #" + (i + 1) + " data: ");

			System.out.print("Rectangle or circle(r/c)? ");
			char x = md.next().charAt(0);

			if (x == 'r') {

				Rectangle rectangle = new Rectangle();

				System.out.print("Color (BLACK/BLUE/RED): ");
				md.nextLine();
				String colorShape = md.nextLine();

				Color color = null;

				switch (colorShape.toUpperCase()) {

				case "BLACK":
					color = Color.BLACK;
					break;

				case "BLUE":
					color = Color.BLUE;
					break;

				case "RED":
					color = Color.RED;
					break;

				}

				rectangle.setColor(color);

				System.out.print("Width: ");
				rectangle.setWidth(md.nextDouble());

				System.out.print("Hidth: ");
				rectangle.setHeidth(md.nextDouble());

				listShape.add(rectangle);

			} else {
				
				Circle circle = new Circle();

				String colorShape = md.nextLine();

				Color color = null;

				switch (colorShape.toUpperCase()) {

				case "BLACK":
					color = Color.BLACK;
					break;

				case "BLUE":
					color = Color.BLUE;
					break;

				case "RED":
					color = Color.RED;
					break;

				}

				circle.setColor(color);

				System.out.print("Radius: ");
				circle.setRadius(md.nextDouble());
				listShape.add(circle);
			}

		}

		System.out.println("SHAPE AREAS:");

		for (Shape cudeboi : listShape) {

			if (cudeboi instanceof Rectangle) {

				Rectangle rectangleaux = (Rectangle) cudeboi;
				System.out.println("AREA: " + rectangleaux.area());
				System.out.println("COLOR: " + rectangleaux.getColorString());
			} else {

				Circle circleaux = (Circle) cudeboi;
				System.out.println("AREA: " + circleaux.area());
				System.out.println("COLOR: " + circleaux.getColorString());

			}

		}

		md.close();
	}
}
