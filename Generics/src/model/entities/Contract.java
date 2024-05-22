package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contract {

	private String number;
	private LocalDate Date;
	private double valueTotal;
    private static final DateTimeFormatter DTM =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	public Contract() {

	}

	public Contract(String number, LocalDate date, double valueTotal) {

		this.number = number;
		Date = date;
		this.valueTotal = valueTotal;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public double getValueTotal() {
		return valueTotal;
	}
	public void setValueTotal(double valueTotal) {
		this.valueTotal = valueTotal;
	}

}
