package com.epam.cdp.tasktracker.facade.dao;

import java.util.List;

public interface Facade<T> {

	List<T> getAllEntities();

	T getEntityById(Long parseLong);
	
	void createEntity(T newResource);
	
	void removeEntityById(Long id);
	
	void updateEntityById(Long id, T entity);
}
