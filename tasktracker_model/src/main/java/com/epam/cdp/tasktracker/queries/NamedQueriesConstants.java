package com.epam.cdp.tasktracker.queries;

public class NamedQueriesConstants {

	// Users
	public static final String findAllUsers = "SELECT u FROM users u";
	
	// Tasks
	public static final String findAllTasks = "SELECT t FROM task t";
	public static final String findAllTasksWithoutProjects = "SELECT t FROM task t WHERE t.project is null";
	
	// Projects
	public static final String findAllProjects = "SELECT p FROM project p";

}
