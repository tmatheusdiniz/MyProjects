package model.entities;

public class Holder {

	private String name;
	private String taxPayer;
	private int age;
	

	public Holder(String name, String taxPayer, int age) {
	
		this.name = name;
		this.taxPayer = taxPayer;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}