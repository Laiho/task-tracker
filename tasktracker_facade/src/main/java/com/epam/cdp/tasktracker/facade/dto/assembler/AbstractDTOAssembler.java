package com.epam.cdp.tasktracker.facade.dto.assembler;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDTOAssembler<T, V> {

	public abstract T createDTO(V entity);

	public abstract V createEntity(T dto);
	
	public List<T> createDTOList(final List<V> entityList) {
		List<T> dtoList = new ArrayList<T>();
		for (V entity : entityList) {
			dtoList.add(createDTO(entity));
		}
		return dtoList;
	}
	
	public List<V> createEntityList(final List<T> dtoList) {
		List<V> userDTOList = new ArrayList<V>();
		for (T user : dtoList) {
			userDTOList.add(createEntity(user));
		}
		return userDTOList;
	}
}
