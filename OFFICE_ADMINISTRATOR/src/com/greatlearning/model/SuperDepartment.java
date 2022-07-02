package com.greatlearning.model;

public class SuperDepartment implements ISuperDepartment {

	@Override
	public String departmentName() {
		// department name implementation
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		// gives todays work log
		return "No work as of now";
	}

	@Override
	public String getWorkDeadline() {
		// gives todays work deadline
		return "Nil";
	}

	@Override
	public String isTodayAHoliday() {
		// gives information about holiday on the current day
		return "Today is not a holiday";
	}

}
