package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		// gives department name
		return "HR Department ";
	}

	@Override
	public String getTodaysWork() {
		// gives todays worklog
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {
		// gives work deadline
		return "Complete by EOD ";
	}
	public String doActivity() {
		//specific method for activity
		return "team Lunch";
	}
}
