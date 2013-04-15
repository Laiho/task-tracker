package com.epam.cdp.tasktracker.facade.dto.assembler.impl;

import org.springframework.stereotype.Component;

import com.epam.cdp.tasktracker.facade.dto.assembler.AbstractDTOAssembler;
import com.epam.cdp.tasktracker.facade.dto.model.UserDTO;
import com.epam.cdp.tasktracker.model.User;

@Component
public class UserDTOAssembler extends AbstractDTOAssembler<UserDTO, User> {

	@Override
	public UserDTO createDTO(final User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setUsername(user.getUsername());
		userDTO.setPassword(user.getPassword());
		userDTO.setEnabled(user.isEnabled());
		return userDTO;
	}
	
	@Override
	public User createEntity(final UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setUsername(userDTO.getUsername());
		user.setPassword(userDTO.getPassword());
		user.setEnabled(userDTO.isEnabled());
		return user;
	}
	
}
