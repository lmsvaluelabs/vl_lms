package com.vl.lms.service;

import com.vl.lms.dto.LeaveDTO;
import com.vl.lms.exceptions.LMSException;

public interface LMSService {

	//TEST commited for my valuelabs account
	void addLeave(LeaveDTO leaveDTO) throws LMSException;
}
