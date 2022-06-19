package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialServices implements ICredentialsServices {

	@Override
	public String generatePassword() {
		String capitailCaseLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCaseLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String  specialCharacters="!@#$%&*+<>";
		//values variable have 		
		String values=capitailCaseLetters+smallCaseLetters+numbers+specialCharacters;

		//randomly select a combination of all these different type of characters;
		StringBuffer strBuffer=new StringBuffer("");
		Random random=new Random();
		for(int i=0;i<8;i++) {
			int randomNumber=random.nextInt(values.length());
			strBuffer.append(values.charAt(randomNumber));
		}
		return strBuffer.toString();
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName.toLowerCase().replaceAll(" ", "") + lastName.toLowerCase().replaceAll(" ", "") + "@" + department.toLowerCase() + ".abc.com";
	}

	@Override
	public void showCredential(Employee employee, String email, String generatePassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generate credentials are as follows ");
		System.out.println("Email -> " + email);
		System.out.println("Password -> " + generatePassword);

	}

}
