package com.epam.cdp.tasktracker.facade.dto.model;

import java.io.Serializable;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProjectDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Queue<TaskDTO> tasks = new PriorityQueue<TaskDTO>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Queue<TaskDTO> getTasks() {
		return tasks;
	}

	public void setTasks(Queue<TaskDTO> tasks) {
		this.tasks = tasks;
	}
}
