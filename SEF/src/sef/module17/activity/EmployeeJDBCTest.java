package sef.module17.activity;

//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Random;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;

	protected void setUp() throws Exception {
		// setUp() is used to initialize member data which would be used by all/most of
		// its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
	}

	public void testFindEmployeeById_MatchFound() {
		String id = String.valueOf(new Random().nextInt(1000000000));
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setFirstName("Alex");
		e1.setLastName("Moran");
		e1.setSalary(999);
		emp.insertEmployee(e1);

		Employee m1 = emp.findEmployeeById(id);
		assertEquals(e1.getFirstName(), m1.getFirstName());
		assertEquals(e1.getLastName(), m1.getLastName());
		assertEquals(e1.getSalary(), m1.getSalary());
		// complete the code here
	}

	public void testFindEmployeeById_NoMatchFound() {
		Employee m1 = emp.findEmployeeById("NoId");
		assertNull(m1);
		// complete the code here
	}

	public void testFindEmployeeByName_MatchFound() {
		String id = String.valueOf(new Random().nextInt(1000000000));
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setFirstName("Alex");
		e1.setLastName("Moran");
		e1.setSalary(999);
		emp.insertEmployee(e1);

		ArrayList<Employee> m1 = emp.findEmployeesByName(e1.getFirstName());
		m1.forEach(employee -> {
			if (employee.getId() == e1.getId()) {
				assertEquals(employee.getLastName(), e1.getLastName());
				assertEquals(employee.getSalary(), e1.getSalary());
			} 
		});
		// complete the code here
	}

	public void testFindEmployeeByName_NoMatchFound() {
		ArrayList<Employee> m1 = emp.findEmployeesByName("NoId");
		assertEquals(m1.size(), 0);
		// complete the code here
	}

	public void testFindEmployeeBySalary_MatchFound() {
		// complete the code here
		String id = String.valueOf(new Random().nextInt(1000000000));
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setFirstName("Alex");
		e1.setLastName("Moran");
		e1.setSalary(999);
		emp.insertEmployee(e1);

		ArrayList<Employee> m1 = emp.findEmployeesBySalary(e1.getSalary());
		m1.forEach(employee -> {
			if (employee.getId() == e1.getId()) {
				assertEquals(employee.getLastName(), e1.getLastName());
				assertEquals(employee.getFirstName(), e1.getLastName());
			}
		});
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		// complete the code here
		ArrayList<Employee> m1 = emp.findEmployeesBySalary(0);
		assertEquals(m1.size(), 0);
	}

	public void testInsertEmployee() {
		// complete the code here
		String id = String.valueOf(new Random().nextInt(1000000000));
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setFirstName("Alex");
		e1.setLastName("Moran");
		e1.setSalary(999);
		emp.insertEmployee(e1);

		Employee m1 = emp.findEmployeeById(id);
		assertEquals(e1.getFirstName(), m1.getFirstName());
		assertEquals(e1.getLastName(), m1.getLastName());
		assertEquals(e1.getSalary(), m1.getSalary());
	}
}
