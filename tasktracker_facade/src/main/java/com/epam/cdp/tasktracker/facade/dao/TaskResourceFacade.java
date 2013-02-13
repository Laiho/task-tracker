package com.epam.cdp.tasktracker.facade.dao;

import java.util.List;

import com.epam.cdp.tasktracker.facade.dto.model.TaskDTO;

public interface TaskResourceFacade {
	
	TaskDTO getTaskbyId(Long id);
	
	List<TaskDTO> getAllTasks();
	
	void createTask(TaskDTO task);
	
	void removeTaskById(Long id);
	
	void removeTask(TaskDTO task);
	
	void updateTaskById(Long id, TaskDTO task);
}
