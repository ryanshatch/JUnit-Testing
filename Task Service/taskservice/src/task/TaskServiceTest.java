<<<<<<< HEAD
/********************************************************************************************
 * Title: Task Service              |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: June 2nd 2024              |********************************************************
 * Last Updated: June 2nd 2024      |********************************************************
 * Version: 1.0                     |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *                                                                                          *
 *******************************************************************************************/

package task;

/*
import task.Task;
import task.TaskService;
**/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
	private TaskService service;

	@BeforeEach
	public void setUp() {
		service = new TaskService();
	}

	@Test
	public void testAddTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		assertNotNull(service.getTask("1234567890"));
	}

	@Test
	public void testDeleteTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		service.deleteTask("1234567890");
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteTask("1234567890");
		});
	}

	@Test
	public void testUpdateTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		service.updateTask("1234567890", "NewName", "New description");
		Task updatedTask = service.getTask("1234567890");
		assertEquals("NewName", updatedTask.getName());
		assertEquals("New description", updatedTask.getDescription());
	}

	@Test
	public void testAddDuplicateTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		assertThrows(IllegalArgumentException.class, () -> {
			service.addTask(task);
		});
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
 *              The ContactServiceTest class tests the ContactService class.                *
 *                                                                                          *
 *******************************************************************************************/

package task;

import task.Task;
import task.TaskService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
	private TaskService service;

	@BeforeEach
	public void setUp() {
		service = new TaskService();
	}

	@Test
	public void testAddTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		assertNotNull(service.getTask("1234567890"));
	}

	@Test
	public void testDeleteTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		service.deleteTask("1234567890");
		assertThrows(IllegalArgumentException.class, () -> {
			service.deleteTask("1234567890");
		});
	}

	@Test
	public void testUpdateTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		service.updateTask("1234567890", "NewName", "New description");
		Task updatedTask = service.getTask("1234567890");
		assertEquals("NewName", updatedTask.getName());
		assertEquals("New description", updatedTask.getDescription());
	}

	@Test
	public void testAddDuplicateTask() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		service.addTask(task);
		assertThrows(IllegalArgumentException.class, () -> {
			service.addTask(task);
		});
	}
>>>>>>> b494d275103db40ab7b82148c6a0739e42f5f9d0
}