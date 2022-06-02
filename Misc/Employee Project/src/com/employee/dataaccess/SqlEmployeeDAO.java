package com.employee.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class SqlEmployeeDAO implements DAO {

	 Statement statement;
	
	
	 {
		System.out.println("Initiate connection to mysql db.");
		String connectionUrl =
                "jdbc:mysql://localhost:3306/employeedb?user=root&password=root";
               
      
      

        try  {
        	Connection connection= DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            System.out.println("Connection made");
        }  catch (SQLException e) {
            e.printStackTrace();
        }


	}
	
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String insertSql = ("INSERT INTO employeedb.employee (firstName, lastName, age, salary, hireDate, retireDate, isActive)"
				+ " VALUES (" + "\"" + emp.getFirstName() + "\"" + "," + "\"" + emp.getLastName() + "\"" +  "," + emp.getAge() + "," + emp.getSalary() + ","  + "\"" + LocalDate.now() + "\"" + "," + null + "," + true + ")" );
		
		
		try {
		
         statement.executeUpdate(insertSql);

         // Print results from select statement
        
		} catch (SQLException e) {
            e.printStackTrace();
        }

	}

	@Override
	public void printEmployees() {
		// TODO Auto-generated method stub
		ResultSet resultSet = null;
		try {
		 String selectSql = "SELECT * from employeedb.employee";
         resultSet = statement.executeQuery(selectSql);

         // Print results from select statement
         while (resultSet.next()) {
             System.out.println("Employee Name: " + resultSet.getString(1) + " " + resultSet.getString(2) + " Employee ID: " + resultSet.getString(5) + " Age: " + resultSet.getString(3) + " Salary: " + resultSet.getString(4));
         }
		} catch (SQLException e) {
            e.printStackTrace();
        }

	}

	@Override
	public void retireEmployee(int employeeId) {
		// TODO Auto-generated method stub
		//ResultSet resultSet = null;
		try {
		 String updateSql = "UPDATE employeedb.employee SET isActive = false, retireDate = "+ "\"" + LocalDate.now() + "\"" +" WHERE employeeId = " + employeeId;
         statement.executeUpdate(updateSql);

         // Print results from select statement
        /* while (resultSet.next()) {
             System.out.println("Employee Name: " + resultSet.getString(1) + " " + resultSet.getString(2) + " Employee ID: " + resultSet.getString(5) + " Age: " + resultSet.getString(3) + " Salary: " + resultSet.getString(4));
         }*/
		} catch (SQLException e) {
            e.printStackTrace();
        }


	}

	@Override
	public void retiredEmployeesRecord() {
		// TODO Auto-generated method stub
		ResultSet resultSet = null;
		try {
		 String selectSql = "SELECT * from employeedb.employee WHERE isActive = false";
         resultSet = statement.executeQuery(selectSql);

         // Print results from select statement
         while (resultSet.next()) {
             System.out.println("Employee Name: " + resultSet.getString(1) + " " + resultSet.getString(2) + " Employee ID: " + resultSet.getString(5) + " Age: " + resultSet.getString(3) + " Salary: " + resultSet.getString(4));
         }
		} catch (SQLException e) {
            e.printStackTrace();
        }


	}

	@Override
	public void employeeCount() {
		// TODO Auto-generated method stub
		ResultSet resultSet = null;
		try {
		 String selectSql = "SELECT count(*) from employeedb.employee WHERE isActive = true";
         resultSet = statement.executeQuery(selectSql);

         // Print results from select statement
         while (resultSet.next()) {
             System.out.println("Employee Count: " + resultSet.getString(1));
         }
		} catch (SQLException e) {
            e.printStackTrace();
        }


	}

}
