package com.epam.cdp.tasktracker.facade.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.cdp.tasktracker.facade.dao.Facade;
import com.epam.cdp.tasktracker.facade.dto.assembler.impl.ProjectDTOAssembler;
import com.epam.cdp.tasktracker.facade.dto.model.ProjectDTO;
import com.epam.cdp.tasktracker.model.Project;
import com.epam.cdp.tasktracker.service.ProjectService;

public class DefaultProjectResourceFacade implements Facade<ProjectDTO>{

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ProjectDTOAssembler projectDTOAssembler;
	
	public List<ProjectDTO> getAllEntity() {
		return projectDTOAssembler.createDTOList(projectService.getAllProjects());
	}

	public ProjectDTO getEntityById(Long parseLong) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProjectDTO createEntity(ProjectDTO projectDTO) {
		Project project = projectService.createProject(projectDTOAssembler.createEntity(projectDTO));
		return projectDTOAssembler.createDTO(project);
	}

	public void removeEntityById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateEntityById(Long id, ProjectDTO entity) {
		// TODO Auto-generated method stub
		
	}

}
