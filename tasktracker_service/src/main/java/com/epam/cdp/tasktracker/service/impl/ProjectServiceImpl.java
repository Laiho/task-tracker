package com.epam.cdp.tasktracker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.epam.cdp.tasktracker.dao.ProjectDAO;
import com.epam.cdp.tasktracker.model.Project;
import com.epam.cdp.tasktracker.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDAO projectDAO;
	
	public List<Project> getAllProjects() {
		return projectDAO.findAllProjects();
	}

	public Project getProjectById(Long id) {
		return projectDAO.find(id);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public Project createProject(Project project) {
		return projectDAO.save(project);
	}
	
	

}
