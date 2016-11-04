package com.vl.lms.service;

import com.vl.lms.builder.LeaveBuilder;
import com.vl.lms.dao.DAO;
import com.vl.lms.dao.DAOImpl;
import com.vl.lms.dto.LeaveDTO;
import com.vl.lms.exceptions.LMSException;

public class LMSServiceImpl implements LMSService {

	@Override
	public void addLeave(LeaveDTO leaveDTO) throws LMSException {

		DAO dao = new DAOImpl();
		LeaveBuilder leaveBuilder = new LeaveBuilder();
		dao.save(leaveBuilder.buildLeaveEntity(leaveDTO));
	}

}
