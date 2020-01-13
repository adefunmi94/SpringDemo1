package springDemo.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springDemo.entities.Employee;
import com.springDemo.entities_dao.EmployeeDaoImp;
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	private EmployeeDaoImp employeeDaoImp;
	
	
	public void addEemployee(Employee employee) {
		employeeDaoImp.addEmployee(employee);
		
	}

}
