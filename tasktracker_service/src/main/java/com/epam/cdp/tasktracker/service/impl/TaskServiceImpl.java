package com.epam.cdp.tasktracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.epam.cdp.tasktracker.dao.TaskDAO;
import com.epam.cdp.tasktracker.model.Task;
import com.epam.cdp.tasktracker.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDAO taskDAO;
	
	public List<Task> getAllTasks() {
		return taskDAO.findAllTasks();
	}

	public List<Task> getAllTasksWithoutProjects() {
		return taskDAO.findAllTasksWithoutProjects();
	}
	
	public Task getTaskById(Long id) {
		return taskDAO.find(id);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Task createTask(Task task) {
		return taskDAO.save(task);
	}
	
	

}
