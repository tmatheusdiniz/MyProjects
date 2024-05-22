package entities;

import java.awt.Color;

public class Circle extends Shape {

	double radius;
	Color color;

	@Override
	public double area() {

		return Math.PI * Math.pow(radius, 2);
	}

	public String getColorString() {
		if (color == Color.BLACK) {
			return "BLACK";
		} else if (color == Color.BLUE) {
			return "BLUE";
		} else if (color == Color.RED) {
			return "RED";
		} else {
			return "UNKNOWN";
		}
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
