package org.mySpringPractice;

import java.io.PrintStream;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	private static PrintStream printstream;

	public static void main(String[] args) {
		
//		load spring conf file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("springDemo-data-context.xml");
		
		
//		retrieve from spring container
		Employee theEmployee = context.getBean("mySal", Employee.class);
		
//		call method on the bean
		System.out.println(theEmployee.getEmployeeSalary());			
		System.out.println(theEmployee.getdailySalary(2.00, 30.00));
//		close the context
		context.close();

	}

}
