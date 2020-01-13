  package com.springdemo.employee_services;
  
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springDemo.entities.Employee;

import springDemo.employee.services.EmployeeService;

@ContextConfiguration("classpath:/springdemo-service-context.xml")
@RunWith(SpringRunner.class)
public class springDemoEmployeeServicesTest {
	
	@Mock
	private EmployeeService employeeService;
	
	@Before
	public void setUp() throws Exception {
		employeeService = mock(EmployeeService.class);
		
	}
	@Test
	public void employeeExistsTest() {
		assertNotNull(EmployeeService.class);
		
	}
	
	@Test
	public void addEmployeeTest() {
		Employee employee = new Employee("peter", "sholami", "petershola@gmail.com");
		doNothing().when(employeeService).addEemployee(isA(Employee.class));
		employeeService.addEemployee(employee);
		
		verify(employeeService, times(1)).addEemployee(employee);
	}
}
	

	
	