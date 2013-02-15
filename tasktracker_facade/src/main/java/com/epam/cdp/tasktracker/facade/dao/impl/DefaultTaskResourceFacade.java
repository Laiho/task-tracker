package com.epam.cdp.tasktracker.facade.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.epam.cdp.tasktracker.facade.dao.Facade;
import com.epam.cdp.tasktracker.facade.dto.model.TaskDTO;

public class DefaultTaskResourceFacade implements Facade<TaskDTO> {
	
	public List<TaskDTO> getAllEntities() {
		// TODO: Implement getting all task across service layer
		List<TaskDTO> tasks = new ArrayList<TaskDTO>();
		for (long i = 1; i < 11; i++) {
			TaskDTO task = new TaskDTO();
			task.setId(i);
			task.setDescription("task number: " + i);
			task.setTitle("Task" + i);
			tasks.add(task);
		}
		return tasks;
	}

	public TaskDTO getEntityById(Long parseLong) {
		// TODO: Implement getting task across service layer by id
		TaskDTO task = new TaskDTO();
		task.setId(parseLong);
		task.setDescription("task number: " + parseLong);
		task.setTitle("Task" + parseLong);
		return task;
	}

	public void createEntity(TaskDTO newResource) {
		// TODO Auto-generated method stub
		
	}

	public void removeEntityById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntityById(Long id, TaskDTO entity) {
		// TODO Auto-generated method stub
		
	}

}
