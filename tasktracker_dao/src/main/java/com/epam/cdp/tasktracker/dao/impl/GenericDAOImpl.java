package com.epam.cdp.tasktracker.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.epam.cdp.tasktracker.dao.GenericDAO;

public class GenericDAOImpl<T> implements GenericDAO<T> {

	@PersistenceContext
	protected EntityManager em;

	private Class<T> type;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class<T>) pt.getActualTypeArguments()[0];
	}

	public T save(final T entity) {
		em.persist(entity);
		em.flush();
		return entity;
	}

	public void remove(final Object id) {
		T entity = em.getReference(type, id);
		em.remove(entity);
	}

	public T find(final Object id) {
		return em.find(type, id);
	}

	public T update(final T entity) {
		return em.merge(entity);
	}

}
