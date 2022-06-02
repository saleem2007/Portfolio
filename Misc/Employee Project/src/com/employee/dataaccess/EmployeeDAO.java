package com.employee.dataaccess;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements DAO {
	
	private final static List<Employee> employees = new ArrayList<Employee>();
	

	
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employees.add(emp);
		
	}

	@Override
	public void printEmployees() {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if (employee.isActive() == true) {
			System.out.println("Employee No: " + employee.getEmployeeId() + " Full Name: " + employee.getFirstName() + " " + employee.getLastName() + " Active: " + employee.isActive());
			} 
		}

	}

	@Override
	public void retireEmployee(int employeeId) {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId) {
				employee.setRetireDate(LocalDate.now());
				employee.setActive(false);
				System.out.println(employee.getFirstName() + " is retired on " + employee.getRetireDate());
				break;
			}
			
		}
		
		
	}

	@Override
	public void retiredEmployeesRecord() {
		// TODO Auto-generated method stub
		for (Employee employee : employees) {
			if (employee.isActive() == false) {
			System.out.println("Employee No: " + employee.getEmployeeId() + " Full Name: " + employee.getFirstName() + " " + employee.getLastName() + " Retired on: " + employee.getRetireDate());
			} 
		}
	}

	@Override
	public void employeeCount() {
		// TODO Auto-generated method stub
		int counter = 0;
		
		for (Employee employee : employees) {
			if (employee.isActive() == true) {
				counter++;
				
			} 
		} System.out.println("Total Active Employees in the system: " + counter);
	}
		
	

	

}
