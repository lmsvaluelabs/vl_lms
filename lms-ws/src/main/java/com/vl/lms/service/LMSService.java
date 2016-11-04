package com.vl.lms.service;

import com.vl.lms.dto.LeaveDTO;
import com.vl.lms.exceptions.LMSException;

public interface LMSService {

	void addLeave(LeaveDTO leaveDTO) throws LMSException;
}
