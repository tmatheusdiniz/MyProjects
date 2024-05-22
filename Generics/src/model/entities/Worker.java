package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contract = new ArrayList<>();

	public void addContract(LocalDate data, double x, int y) {

		HourContract contractmd = new HourContract();
		contractmd.setDate(data);
		contractmd.setValorPerHour(x);
		contractmd.setHours(y);

		contract.add(contractmd);
	}

	public void removeContract(HourContract n) {
		contract.remove(n);
	}

	public Double income(Integer year, Integer month) {

		double sum = baseSalary;
		

		for (HourContract c : contract) {

			LocalDate contractDate = c.getDate();

			int a_year = contractDate.getYear();
	        int a_month = contractDate.getMonthValue();

			if (a_year == year && a_month == month) {
				sum += c.totalValue();
			}

		}

		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<HourContract> getContract() {
		return contract;
	}

}
