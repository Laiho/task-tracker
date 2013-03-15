package com.epam.cdp.tasktracker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.cdp.tasktracker.model.Project;

@Repository
public interface ProjectDAO extends GenericDAO<Project> {
	
	public List<Project> findAllProjects();
	
}