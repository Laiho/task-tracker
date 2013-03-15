package com.epam.cdp.tasktracker.facade.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.cdp.tasktracker.facade.dao.Facade;
import com.epam.cdp.tasktracker.facade.dto.assembler.impl.UserDTOAssembler;
import com.epam.cdp.tasktracker.facade.dto.model.UserDTO;
import com.epam.cdp.tasktracker.model.User;
import com.epam.cdp.tasktracker.service.UserService;

@Component
public class DefaultUserResourceFacade implements Facade<UserDTO> {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserDTOAssembler userDTOAssembler;
		
	public List<UserDTO> getAllEntity() {
		System.out.println(userService);
		List<User> users = userService.getAllUsers();
		return userDTOAssembler.createDTOList(users);
	}

	public UserDTO getEntityById(Long id) {
		return userDTOAssembler.createDTO(userService.getUserById(id));
	}

	public UserDTO createEntity(UserDTO userDTO) {
		User user = userService.createUser(userDTOAssembler.createEntity(userDTO));
		return userDTOAssembler.createDTO(user);
	}
	
	public void removeEntityById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntityById(Long id, UserDTO entity) {
		// TODO Auto-generated method stub
		
	}

}
