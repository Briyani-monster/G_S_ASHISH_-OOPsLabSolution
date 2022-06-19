package com.greatlearning.model;

import java.util.Objects;

public class Employee {
	/***
	 * variables
	 * */
	private String firstName;
	private String lastName;

	/***
	 *Constructor 
	 */	

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/***
	 * Getter
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	/***
	 * 
	 * setter
	 * */
		
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/***
	 * Equals and hash code
	 * 
	 * */
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}
	

}
