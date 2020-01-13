  package com.springdemo.entities.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springDemo.entities.Employee;
import com.springDemo.entities_dao.EmployeeDAO;
import com.springDemo.entities_dao.EmployeeDaoImp;


@ContextConfiguration("/springDemo-data-context.xml")
@RunWith(SpringRunner.class)
public class EmployeeDaoImpTest {
	private Logger logger = Logger.getLogger(EmployeeDaoImp.class.getName());
	
	
	@Autowired
	private EmployeeDAO employeeImp;
	
	@Autowired
	private EmployeeDAO dataSource;
	
	@Autowired
	private EmployeeDAO sessionFactory;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void dbManagerClassesInitializedTest() {
		
		assertNotNull(employeeImp);
		assertNotNull(dataSource);
//		assertNotNull(sessionFactory);
	}
	
	public void addEmployeeToDatabase() {
		try {
			logger.info("Creating new employee object");
			Employee tempEmployee = new Employee("John", "Paulina", "john@gmail.com");
			
			logger.info("Storing employee to database");
		employeeImp.addEmployee(tempEmployee);
		
		logger.info("Successful saving employee to the database");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
