package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialServices;
import com.greatlearning.services.ICredentialsServices;

public class DriverClass {
	private static final ICredentialsServices credentialsService = new CredentialServices();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Your First Name:-");
		String firstName = sc.nextLine();
		System.out.println("Enter Your Last Name:-");
		String lastName = sc.nextLine();
		Employee employee = new Employee(firstName, lastName);
		String generatedEmail;
		String generatedPassword;
		System.out.println("Please enter the dpartment from the following");
		System.out.println("1) Technical");
		System.out.println("2) HR");
		System.out.println("3) Admin");
		System.out.println("4) Legal");
		
		//array storing department 
		String[] department = { "Tech", "HR", "Admin", "Legal" };
		int option = sc.nextInt();
		if (option >= 1 && option <= 4) {
			generatedPassword = credentialsService.generatePassword();
			generatedEmail = credentialsService.getEmailAddress(firstName, lastName, department[option - 1]);
			credentialsService.showCredential(employee, generatedEmail, generatedPassword);
		} else {
			System.out.println("Wrong Option:- No department with this option");
		}

	}

}
