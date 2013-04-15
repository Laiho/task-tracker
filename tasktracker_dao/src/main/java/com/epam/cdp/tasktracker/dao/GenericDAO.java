package com.epam.cdp.tasktracker.dao;


public interface GenericDAO<T> {

	public T save(T entity);
	
	public void remove(Object id);
	
	public T find(Object id);
	
	public T update(T entity);
	
}
