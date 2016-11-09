package com.vl.lms.dto;

import java.io.Serializable;

/**
 * @author hari.polnati
 *
 */
public class EmployeeDTO implements Serializable {

	private static final long serialVersionUID = 1345635635623543L;

	private Long id;
	private String firstName;
	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
