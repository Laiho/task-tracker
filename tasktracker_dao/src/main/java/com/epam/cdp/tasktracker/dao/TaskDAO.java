package com.epam.cdp.tasktracker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.cdp.tasktracker.model.Task;

@Repository
public interface TaskDAO extends GenericDAO<Task> {
	
	public List<Task> findAllTasks();
	
	public List<Task> findAllTasksWithoutProjects();
}