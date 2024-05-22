package entities;

import java.awt.Color;

public class Rectangle extends Shape {

	double width;
	double heidth;
	Color color;

	@Override
	public double area() {

		return width * heidth;
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeidth() {
		return heidth;
	}

	public void setHeidth(double heidth) {
		this.heidth = heidth;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
