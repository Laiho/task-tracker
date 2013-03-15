package com.epam.cdp.tasktracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epam.cdp.tasktracker.model.Task;

@Service
public interface TaskService {

	public Task getTaskById(Long id);
	
	public List<Task> getAllTasks();
	
	public List<Task> getAllTasksWithoutProjects();
	
	public Task createTask(Task task);
	
}
