package org.mySpringPractice;

public class WagesSalary implements Employee {
	
	@Override
	public String getEmployeeSalary() {
		
		return "you have earn a sum of 10k per day";
	}

	@Override
	public double getdailySalary(double hourly, double amount) {
	
		return hourly * amount ;
	}

	
} 
