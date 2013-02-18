package com.epam.cdp.tasktracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.cdp.tasktracker.dao.UserDAO;
import com.epam.cdp.tasktracker.model.User;
import com.epam.cdp.tasktracker.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<User> getAllUsers() {
		return userDAO.findAllUsers();
	}

	public User getUserById(Long id) {
		return userDAO.find(id);
	}
	
	public User createUser(User user) {
		return userDAO.save(user);
	}
	
	

}
