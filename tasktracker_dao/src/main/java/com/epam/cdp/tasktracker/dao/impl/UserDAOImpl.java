package com.epam.cdp.tasktracker.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.cdp.tasktracker.dao.UserDAO;
import com.epam.cdp.tasktracker.model.User;

@Repository
public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO {

	public List<User> findAllUsers() {
		List<User> entities = em.createNamedQuery("findAllUsers").getResultList();
		return entities;
	}
	
}
