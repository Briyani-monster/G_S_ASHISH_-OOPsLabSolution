package com.greatlearning.services;

import com.greatlearning.model.Employee;

public interface ICredentialsServices {
	String generatePassword();

	String getEmailAddress(String firstName, String lastName, String department);

	void showCredential(Employee employee, String email,String generatePassword);
}
