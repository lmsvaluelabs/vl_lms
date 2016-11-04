package com.vl.lms.resource;

import com.vl.lms.dto.LeaveDTO;
import com.vl.lms.service.LMSService;
import com.vl.lms.service.LMSServiceImpl;

/*
 * This class is used for to get access of webapis
 */
public class LMSResource {

	public void applyLeave(LeaveDTO leaveDTO) {

		LMSService lmsService = new LMSServiceImpl();
		lmsService.addLeave(leaveDTO);

	}
}
