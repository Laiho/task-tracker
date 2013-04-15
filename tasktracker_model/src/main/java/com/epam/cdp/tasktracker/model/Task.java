package com.epam.cdp.tasktracker.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import com.epam.cdp.tasktracker.queries.NamedQueriesConstants;

@Entity(name = "task")
@NamedQueries({
	@NamedQuery(name="findAllTasks", query=NamedQueriesConstants.findAllTasks),
	@NamedQuery(name="findAllTasksWithoutProjects", query=NamedQueriesConstants.findAllTasksWithoutProjects)
})
public class Task implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "TASK_ID")
	private Long id;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "PRIORITY")
	private Integer priority;

	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private Project project;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
