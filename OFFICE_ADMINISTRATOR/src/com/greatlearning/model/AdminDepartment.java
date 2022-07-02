
package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		// gives department name
		return  "Admin Department" ;
	}

	@Override
	public String getTodaysWork() {
		// gives todays worklog
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		// gives todays work deadline
		return "Complete by EOD";
	}

	

}
