package com.vl.lms.builder;

import java.util.Objects;

import com.vl.lms.dto.LeaveDTO;
import com.vl.lms.model.Leave;

public class LeaveBuilder {

	public Leave buildLeaveEntity(LeaveDTO leaveDTO) {
		Leave leave = null;
		if (Objects.nonNull(leaveDTO)) {
			leave = new Leave();
			leave.setEmployeeComments(leaveDTO.getEmployeeComments());

		} 
		return leave; 

	}
}
