package model.entities;

import java.time.LocalDate;

public class HourContract {

	LocalDate date;
	double valorPerHour;
	Integer hours;

	public String toString() {
		return "Date: " + this.date.toString() + "\nValue per hour: " + this.valorPerHour + "\nDuration (hours): "
				+ this.hours;
	}

	public double totalValue() {

		return valorPerHour * hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getValorPerHour() {
		return valorPerHour;
	}

	public void setValorPerHour(double valorPerHour) {
		this.valorPerHour = valorPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
}
