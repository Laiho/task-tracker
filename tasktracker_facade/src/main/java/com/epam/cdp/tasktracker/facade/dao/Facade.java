package com.epam.cdp.tasktracker.facade.dao;

import java.util.List;

public interface Facade<T> {

	List<T> getAllEntity();

	T getEntityById(Long parseLong);
	
	T createEntity(T newResource);
	
	void removeEntityById(Long id);
	
	void updateEntityById(Long id, T entity);
}
