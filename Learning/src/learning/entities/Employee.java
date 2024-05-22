package learning.entities;

public class Employee {

	private String name;
	private double grossSalary;

	public Employee(String name1, double grossSalary1) {

		this.name = name1;
        this.grossSalary = grossSalary1;
	}

	public String getCaract (double tax ) {
		
		String descont = "NAME = " + this.name +", " + "TAX = "  + ((tax*grossSalary)/100) +  ", " + "SALARY = " + this.grossSalary;
		
		return descont; 
		
	}
	
	
}




