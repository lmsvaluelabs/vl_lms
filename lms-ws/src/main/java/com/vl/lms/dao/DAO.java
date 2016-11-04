package com.vl.lms.dao;

import java.io.Serializable;

public interface DAO {
	<T extends Serializable> void save(T obj);		
}
