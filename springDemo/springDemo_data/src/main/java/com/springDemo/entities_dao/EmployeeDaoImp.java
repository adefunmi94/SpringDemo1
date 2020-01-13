package com.springDemo.entities_dao;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springDemo.entities.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDAO {

	
	@Autowired
	private SessionFactory sessionFasctory;
	private Logger logger = Logger.getLogger(EmployeeDaoImp.class.getName());
	
	@Transactional
	public void addEmployee( Employee employee) {
		// TODO Auto-generated method stub
				Session currentSession = sessionFasctory.getCurrentSession();
		
		logger.info("Starting a transaction");
		currentSession.beginTransaction();
		
	
		
		currentSession.save(employee);
		logger.info("Saving employee to the database" + employee.toString());
		currentSession.save(employee);
		
		
		
		
		
		
		
	}

}
