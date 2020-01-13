package org.mySpringPractice;

public class Salary implements Employee {
//	field for the dependency


	@Override
	public String getEmployeeSalary() {
		
		return "Your salary for this month is 50k";
	}

	@Override
	public double getdailySalary(double hourly, double amount) {
		
		
		return  hourly * amount;
	}
	

}
