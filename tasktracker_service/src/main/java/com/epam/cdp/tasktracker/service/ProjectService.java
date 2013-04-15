package com.epam.cdp.tasktracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epam.cdp.tasktracker.model.Project;

@Service
public interface ProjectService {

	public Project getProjectById(Long id);
	
	public List<Project> getAllProjects();
	
	public Project createProject(Project project);
	
}
