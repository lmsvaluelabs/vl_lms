package com.vl.lms.dto;

import java.io.Serializable;

public class LeaveDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String managerComments;
	private String employeeComments;
	private String fromDate;
	private String toDate;

	public String getManagerComments() {
		return managerComments;
	}

	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}

	public String getEmployeeComments() {
		return employeeComments;
	}

	public void setEmployeeComments(String employeeComments) {
		this.employeeComments = employeeComments;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return "LeaveDTO [managerComments=" + managerComments + ", employeeComments=" + employeeComments + ", fromDate="
				+ fromDate + ", toDate=" + toDate + "]";
	}

}
