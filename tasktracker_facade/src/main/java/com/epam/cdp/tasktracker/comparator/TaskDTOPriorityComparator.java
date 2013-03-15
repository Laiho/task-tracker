package com.epam.cdp.tasktracker.comparator;

import java.util.Comparator;

import com.epam.cdp.tasktracker.facade.dto.model.TaskDTO;

public class TaskDTOPriorityComparator implements Comparator<TaskDTO> {

	public int compare(TaskDTO o1, TaskDTO o2) {
		int result = o2.getPriority().compareTo(o1.getPriority());
		if (result == 0) {
			result = o1.getCreateDate().compareTo(o2.getCreateDate());
		}
		return result;
	}

}
