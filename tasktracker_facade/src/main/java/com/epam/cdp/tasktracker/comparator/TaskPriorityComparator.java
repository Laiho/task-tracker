package com.epam.cdp.tasktracker.comparator;

import java.util.Comparator;

import com.epam.cdp.tasktracker.model.Task;

public class TaskPriorityComparator implements Comparator<Task> {

	public int compare(Task o1, Task o2) {
		int result = o2.getPriority().compareTo(o1.getPriority());
		if (result == 0) {
			result = o1.getCreateDate().compareTo(o2.getCreateDate());
		}
		return result;
	}

}