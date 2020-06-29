package sef.module17.activity;

//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {
	
	public Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost/activity?serverTimezone=UTC";
		String user = "root";
		String pass = "qwerty4567";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public Employee findEmployeeById(String id) {
		Connection con = createConnection();
		Employee emp = null;
		try {
			// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * from employee where id = ? ");

			// 2 - Search for the given id
			pStmt.setString(1, id);

			// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();

			// 4 - If resultset is not null, then initialize emp object with data
			if (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String firstName) {
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee emp = null;

		try {
			// 1 - Create a PreparedStatement with a query
			PreparedStatement pStmt = con.prepareStatement("select * from employee where firstName = ? ");

			// 2 - Search for the given name
			pStmt.setString(1, firstName);

			// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();

			// 4 - While there are some records, continue
			while (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				list.add(emp);
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(int salary) {
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee emp = null;
		try {
			PreparedStatement pStmt = con.prepareStatement("select * from employee where salary = ? ");

			// 2 - Search for the given name
			pStmt.setInt(1, salary);

			// 3 - Execute this query
			ResultSet rs = pStmt.executeQuery();

			// 4 - While there are some records, continue
			while (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
				list.add(emp);
			}
			// 1 - Create a PreparedStatement with a query

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public void insertEmployee(Employee emp) {
		Connection con = createConnection();

		// 1 - Create a PreparedStatement with a query "insert into employee
		// values(?,?,?,?)"
		try {
			PreparedStatement pStmt = con
					.prepareStatement("insert into employee (id, firstName, lastName, salary) values(?,?,?,?)");
			con.setAutoCommit(false);

			// Substitute the ? now.
			pStmt.setString(1, emp.getId());
			pStmt.setString(2, emp.getFirstName());
			pStmt.setString(3, emp.getLastName());
			pStmt.setInt(4, emp.getSalary());

			// 2 - Execute this query using executeUpdate()
			int rows = pStmt.executeUpdate();
			System.out.println(rows + " row(s) added!");

			con.commit();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
