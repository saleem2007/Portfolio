package com.employee.dataaccess;

public interface DAO {
	
	public void addEmployee(Employee emp);
	public void printEmployees();
	public void retireEmployee(int employeeId);
	public void retiredEmployeesRecord();
	public void employeeCount();
	
}
