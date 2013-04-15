package com.epam.cdp.tasktracker.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.cdp.tasktracker.dao.ProjectDAO;
import com.epam.cdp.tasktracker.model.Project;
import com.epam.cdp.tasktracker.model.Task;

@Repository
public class ProjectDAOImpl extends GenericDAOImpl<Project> implements ProjectDAO {

	public List<Project> findAllProjects() {
		List<Project> entities = em.createNamedQuery("findAllProjects").getResultList();
		return entities;
	}
	
}
