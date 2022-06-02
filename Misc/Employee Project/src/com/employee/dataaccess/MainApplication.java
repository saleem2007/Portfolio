package com.employee.dataaccess;

import java.util.Scanner;



public class MainApplication {
	static Scanner scanner = new Scanner(System.in); // creates a scanner object
	static DAO employeeDAO = new SqlEmployeeDAO();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        		
		

	
		
		int input;
		
		
		
		do {
			
			System.out.println("******************** Main Menu ***************\n"
					+          "  1. Add Employee                             \n"
					+          "  2. Make Employee Inactive                   \n"
					+          "  3. Display Employee Record Information      \n"
					+ 		   "  4. Display Active Employee Count            \n"
					+          "  5. Display Inactive Employees               \n"
					+          "  6. Quit                                     \n"
					+          "**********************************************");
			
			System.out.println("Please Select an option from the menu !!!!!");
			input = scanner.nextInt();
			
			switch(input) {
			
				case 1: addEmployee();
			
					break;
				
				case 2: retireEmployee();
			
					break;
				
				case 3: displayEmployee();
			
					break;
							
				case 4: displayEmpCount();
			
					break;
				
				case 5: retiredEmpRecord();
				
					break;
					
				case 6: programEnd();
			
					break;
					
				default: System.out.println("Please Enter number 1 through 5");
				
					break;
								
				}
			
			
			} while (input!= 6);
		
				scanner.close();
		

	}
	
	public static void addEmployee() {
		
		System.out.println("Enter Employee's First Name");
		String firstName = scanner.next();
		System.out.println("Enter Employee's Last Name");
		String lastName = scanner.next();
		System.out.println("Enter Employee's Age");
		int age = scanner.nextInt();
		System.out.println("Enter Employee's Salary");
		float salary = scanner.nextFloat();
		Employee emp = new Employee(firstName, lastName, age, salary, true);
		employeeDAO.addEmployee(emp);
			
	}
	
	public static void retireEmployee() {
		
		System.out.println("Enter Employee's ID number");
		int id = scanner.nextInt();
		employeeDAO.retireEmployee(id);
		
	}

	public static void displayEmployee() {
	
		employeeDAO.printEmployees();
	}

	public static void displayEmpCount() {
		
		employeeDAO.employeeCount();
	
	}
	
	public static void retiredEmpRecord() {
		
		employeeDAO.retiredEmployeesRecord();
		
	}
		

	public static void programEnd() {
		
		System.out.println("Thank you for using the System");
	
	}

		

	


	}







