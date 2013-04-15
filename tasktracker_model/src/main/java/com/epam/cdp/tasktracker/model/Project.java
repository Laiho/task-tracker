package com.epam.cdp.tasktracker.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.epam.cdp.tasktracker.queries.NamedQueriesConstants;

@Entity(name = "project")
@NamedQueries({
	@NamedQuery(name="findAllProjects", query=NamedQueriesConstants.findAllProjects)
})
public class Project {

	@Id
	@GeneratedValue
	@Column(name = "PROJECT_ID")
	private Long id;

	@Column(name = "TITLE")
	private String title;
	
	@OneToMany(mappedBy = "project", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Task> tasks = new LinkedList<Task>();

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

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

}
