package com.epam.cdp.tasktracker.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.epam.cdp.tasktracker.dao.TaskDAO;
import com.epam.cdp.tasktracker.model.Task;

@Repository
public class TaskDAOImpl extends GenericDAOImpl<Task> implements TaskDAO {

	public List<Task> findAllTasks() {
		List<Task> entities = em.createNamedQuery("findAllTasks").getResultList();
		return entities;
	}

	public List<Task> findAllTasksWithoutProjects() {
		Query query = em.createNamedQuery("findAllTasksWithoutProjects");
		List<Task> entities = query.getResultList();
		return entities;
	}
	
}
