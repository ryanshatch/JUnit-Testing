<<<<<<< HEAD
/********************************************************************************************
 * Title: Task Service              |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: May 22nd 2023              |********************************************************
 * Last Updated: May 24th 2023      |********************************************************
 * Version: 1.0                     |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *     The ContactService is responsible for sending and receiving contact information.     *
 *******************************************************************************************/

package task;

//import task.Task;
import java.util.HashMap;
import java.util.Map;

public class TaskService {
	private Map<String, Task> tasks = new HashMap<>();

	public void addTask(Task task) {
		if (task == null || tasks.containsKey(task.getTaskId())) {
			throw new IllegalArgumentException("Task already exists or invalid");
		}
		tasks.put(task.getTaskId(), task);
	}

	public void deleteTask(String taskId) {
		if (!tasks.containsKey(taskId)) {
			throw new IllegalArgumentException("Task does not exist");
		}
		tasks.remove(taskId);
	}

	public void updateTask(String taskId, String name, String description) {
		Task task = tasks.get(taskId);
		if (task != null) {
			if (name != null && name.length() <= 20)
				task.setName(name);
			if (description != null && description.length() <= 50)
				task.setDescription(description);
		} else {
			throw new IllegalArgumentException("Task does not exist");
		}
	}

	public Task getTask(String taskId) {
		return tasks.get(taskId);
	}
=======
/********************************************************************************************
 * Title: Task Service              |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: May 22nd 2023              |********************************************************
 * Last Updated: May 24th 2023      |********************************************************
 * Version: 1.0                     |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *     The ContactService is responsible for sending and receiving contact information.     *
 *******************************************************************************************/

package task;

import task.Task;
import java.util.HashMap;
import java.util.Map;

public class TaskService {
	private Map<String, Task> tasks = new HashMap<>();

	public void addTask(Task task) {
		if (task == null || tasks.containsKey(task.getTaskId())) {
			throw new IllegalArgumentException("Task already exists or invalid");
		}
		tasks.put(task.getTaskId(), task);
	}

	public void deleteTask(String taskId) {
		if (!tasks.containsKey(taskId)) {
			throw new IllegalArgumentException("Task does not exist");
		}
		tasks.remove(taskId);
	}

	public void updateTask(String taskId, String name, String description) {
		Task task = tasks.get(taskId);
		if (task != null) {
			if (name != null && name.length() <= 20)
				task.setName(name);
			if (description != null && description.length() <= 50)
				task.setDescription(description);
		} else {
			throw new IllegalArgumentException("Task does not exist");
		}
	}

	public Task getTask(String taskId) {
		return tasks.get(taskId);
	}
>>>>>>> b494d275103db40ab7b82148c6a0739e42f5f9d0
}