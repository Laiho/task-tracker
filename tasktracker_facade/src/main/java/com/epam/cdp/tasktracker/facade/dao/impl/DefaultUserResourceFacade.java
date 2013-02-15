package com.epam.cdp.tasktracker.facade.dao.impl;

import java.util.List;

import com.epam.cdp.tasktracker.facade.dao.Facade;
import com.epam.cdp.tasktracker.facade.dto.model.UserDTO;

public class DefaultUserResourceFacade implements Facade<UserDTO> {

	public List<UserDTO> getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserDTO getEntityById(Long parseLong) {
		UserDTO user = new UserDTO();
		user.setId(parseLong);
		user.setPassword("user" + parseLong);
		user.setUsername("user" + parseLong);
		user.setEnabled(true);
		return user;
	}

	public void createEntity(UserDTO newResource) {
		// TODO Auto-generated method stub
		
	}

	public void removeEntityById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntityById(Long id, UserDTO entity) {
		// TODO Auto-generated method stub
		
	}

}
