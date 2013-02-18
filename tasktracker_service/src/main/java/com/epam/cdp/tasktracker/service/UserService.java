package com.epam.cdp.tasktracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epam.cdp.tasktracker.model.User;

@Service
public interface UserService {

	public User getUserById(Long id);
	
	public List<User> getAllUsers();
	
	public User createUser(User user);
	
}
