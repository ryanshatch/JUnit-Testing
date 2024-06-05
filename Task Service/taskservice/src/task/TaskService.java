/********************************************************************************************
 * Title: Task Service              |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: June 2nd 2024              |********************************************************
 * Last Updated: June 2nd 2024      |********************************************************
 * Version: 1.1                     |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *     	The TaskService is responsible for creating, updating, and deleting tasks.      	*
 * 					It also provides the ability to retrieve tasks by ID.					*
 *     																						*
 *******************************************************************************************/

package task;	// Package name	

//import task.Task;
import java.util.HashMap;
import java.util.Map;

public class TaskService {								 				// TaskService class with tasks field
	private Map<String, Task> tasks = new HashMap<>();			   	   // Map of tasks

	public void addTask(Task task) {		   					 	 // Add task method
		if (task == null || tasks.containsKey(task.getTaskId())) {	// If task is null or task ID already exists
			throw new IllegalArgumentException("Task already exists or invalid");	// Throw an exception
		}
		tasks.put(task.getTaskId(), task);						 // Add task to map
	}

	public void deleteTask(String taskId) {								  // Delete task method
		if (!tasks.containsKey(taskId)) {						   		 // If task does not exist
			throw new IllegalArgumentException("Task does not exist");	// Throw an exception
		}
		tasks.remove(taskId);										  // Remove task from map
	}

	public void updateTask(String taskId, String name, String description) {	 // Update task method
		Task task = tasks.get(taskId);											// Get task by ID
		if (task != null) {													   // If the task exists already
			if (name != null && name.length() <= 20)						  // If name is not null and less than or equal to 20 characters
				task.setName(name);											 // Set name
			if (description != null && description.length() <= 50)			// If the description is not null and less than or equal to 50 characters
				task.setDescription(description);						   // Set description
		} else {														  // If the task does not exist
			throw new IllegalArgumentException("Task does not exist");	 // Throw an exception
		}
	}

	public Task getTask(String taskId) {							// Get task method
		return tasks.get(taskId);								   // Return task by ID
	}
}