package com.epam.cdp.tasktracker.facade.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.epam.cdp.tasktracker.facade.dao.TaskResourceFacade;
import com.epam.cdp.tasktracker.facade.dto.model.TaskDTO;

public class DefaultTaskResourceFacade implements TaskResourceFacade {

	public TaskDTO getTaskbyId(Long id) {
		// TODO: Implement getting task across service layer by id
		TaskDTO task = new TaskDTO();
		task.setId(id);
		task.setDescription("task number: " + id);
		task.setTitle("Task" + id);
		return task;
	}

	public List<TaskDTO> getAllTasks() {
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

	public void createTask(TaskDTO task) {
		// TODO: Implement storing task across service layer
	}

	public void removeTaskById(Long id) {
		// TODO: Implement remove task by id across service layer

	}

	public void removeTask(TaskDTO task) {
		// TODO: Implement remove task across facade layer
	}

	public void updateTaskById(Long id, TaskDTO task) {
		// TODO: Implement update task by id across facade layer
	}

}
