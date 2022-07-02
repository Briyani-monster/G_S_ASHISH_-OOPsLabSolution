package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		// tech department name return method
		return "Tech Department ";
	}

	@Override
	public String getTodaysWork() {
		// gives todays work log
		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {
		// gives todays work deadline
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		//specific method for tech stack info
		return "Core Java";
	}

}
