package com.employee.dataaccess;

import java.time.LocalDate;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private float salary;
	private static int counter = 0;
	private int employeeId;
	private LocalDate hireDate;
	private LocalDate retireDate;
	private boolean isActive;
	
	
	public Employee(String firstName, String lastName, int age, float salary, boolean isActive) {
		
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		counter++;
		employeeId = counter;
		this.hireDate = LocalDate.now();
		this.isActive = isActive;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setRetireDate(LocalDate retireDate) {
		this.retireDate = retireDate;
		
	}

	public LocalDate getRetireDate() {
		return retireDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
	
	

}
