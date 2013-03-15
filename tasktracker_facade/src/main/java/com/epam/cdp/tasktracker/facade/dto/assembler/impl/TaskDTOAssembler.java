package com.epam.cdp.tasktracker.facade.dto.assembler.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.cdp.tasktracker.comparator.TaskDTOPriorityComparator;
import com.epam.cdp.tasktracker.comparator.TaskPriorityComparator;
import com.epam.cdp.tasktracker.facade.dto.assembler.AbstractDTOAssembler;
import com.epam.cdp.tasktracker.facade.dto.model.TaskDTO;
import com.epam.cdp.tasktracker.model.Task;
import com.epam.cdp.tasktracker.service.ProjectService;

@Component
public class TaskDTOAssembler extends AbstractDTOAssembler<TaskDTO, Task> {

	@Autowired
	ProjectService projectService;

	@Override
	public TaskDTO createDTO(final Task task) {
		TaskDTO taskDTO = new TaskDTO();
		taskDTO.setId(task.getId());
		taskDTO.setTitle(task.getTitle());
		taskDTO.setDescription(task.getDescription());
		taskDTO.setPriority(task.getPriority());
		taskDTO.setCreateDate(task.getCreateDate());
		if (task.getProject() != null) {
			taskDTO.setProjectId(task.getProject().getId());
		}
		return taskDTO;
	}

	@Override
	public Task createEntity(final TaskDTO taskDTO) {
		Task task = new Task();
		task.setId(taskDTO.getId());
		task.setTitle(taskDTO.getTitle());
		task.setDescription(taskDTO.getDescription());
		task.setPriority(taskDTO.getPriority());
		task.setCreateDate(taskDTO.getCreateDate());
		if (taskDTO.getProjectId() != null) {
			task.setProject(projectService.getProjectById(taskDTO
					.getProjectId()));
		}
		return task;
	}

	public Queue<TaskDTO> createDTOQueue(final List<Task> entityList) {
		Collections.sort(entityList, new TaskPriorityComparator());
		Queue<TaskDTO> dtoQueue = new PriorityQueue<TaskDTO>(10, new TaskDTOPriorityComparator());
		for (Task entity : entityList) {
			dtoQueue.offer(createDTO(entity));
		}
		return dtoQueue;
	}

	public List<Task> createEntityList(final Queue<TaskDTO> dtoQueue) {
		List<Task> userDTOList = new ArrayList<Task>();
		for (TaskDTO user : dtoQueue) {
			userDTOList.add(createEntity(user));
		}
		return userDTOList;
	}

}
