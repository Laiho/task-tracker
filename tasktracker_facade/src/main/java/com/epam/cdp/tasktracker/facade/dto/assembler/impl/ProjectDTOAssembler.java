package com.epam.cdp.tasktracker.facade.dto.assembler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.cdp.tasktracker.facade.dto.assembler.AbstractDTOAssembler;
import com.epam.cdp.tasktracker.facade.dto.model.ProjectDTO;
import com.epam.cdp.tasktracker.model.Project;

@Component
public class ProjectDTOAssembler extends AbstractDTOAssembler<ProjectDTO, Project> {

	@Autowired
	private TaskDTOAssembler taskDTOAssembler;
	
	@Override
	public ProjectDTO createDTO(final Project project) {
		ProjectDTO projectDTO = new ProjectDTO();
		projectDTO.setId(project.getId());
		projectDTO.setTitle(project.getTitle());
		projectDTO.setTasks(taskDTOAssembler.createDTOQueue(project.getTasks()));
		return projectDTO;
	}
	
	@Override
	public Project createEntity(final ProjectDTO projectDTO) {
		Project project = new Project();
		project.setId(projectDTO.getId());
		project.setTitle(projectDTO.getTitle());
		project.setTasks(taskDTOAssembler.createEntityList(projectDTO.getTasks()));
		return project;
	}
	
}
