package com.vl.lms.dao;

import java.io.Serializable;

public interface DAO {
	<T extends Serializable> void save(T obj);

	<T extends Serializable> void saveOrUpdate(T obj);
	
	<T extends Serializable> void update(T obj);
}
