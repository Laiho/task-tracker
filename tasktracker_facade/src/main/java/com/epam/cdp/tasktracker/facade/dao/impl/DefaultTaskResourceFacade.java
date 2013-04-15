package com.epam.cdp.tasktracker.facade.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.cdp.tasktracker.facade.dao.Facade;
import com.epam.cdp.tasktracker.facade.dto.assembler.impl.TaskDTOAssembler;
import com.epam.cdp.tasktracker.facade.dto.model.TaskDTO;
import com.epam.cdp.tasktracker.model.Task;
import com.epam.cdp.tasktracker.service.TaskService;

public class DefaultTaskResourceFacade implements Facade<TaskDTO> {
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private TaskDTOAssembler taskDTOAssembler;
	
	public List<TaskDTO> getAllEntity() {
		return taskDTOAssembler.createDTOList(taskService.getAllTasks());
	}
	
	public List<TaskDTO> getAllTasksWithoutProjects() {
		return taskDTOAssembler.createDTOList(taskService.getAllTasksWithoutProjects());
	}

	public TaskDTO getEntityById(Long parseLong) {
		return null;
	}

	public TaskDTO createEntity(TaskDTO taskDTO) {
		Task task = taskService.createTask(taskDTOAssembler.createEntity(taskDTO));
		return taskDTOAssembler.createDTO(task);
	}

	public void removeEntityById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntityById(Long id, TaskDTO entity) {
		// TODO Auto-generated method stub
		
	}

}
