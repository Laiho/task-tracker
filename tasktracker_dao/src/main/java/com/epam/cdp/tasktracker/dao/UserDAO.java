package com.epam.cdp.tasktracker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.cdp.tasktracker.model.User;

@Repository
public interface UserDAO extends GenericDAO<User> {
	
	public List<User> findAllUsers();
}