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
 * 		TaskServiceTest is a JUnit test class for the TaskService class. It tests the		*
 * 		creation of a task, making sure that the task ID, name, and description are  		*
 * 			valid, while also testing for invalid task ID, name, and description.			*
 *                                                                                          *
 *******************************************************************************************/

package task;	// Package name


/** import task.Task; **/
/** import task.TaskService; **/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
/** import org.junit.jupiter.api.AfterEach;	**/
import org.junit.jupiter.api.BeforeEach;	
import org.junit.jupiter.api.Test;				   // Import Test

public class TaskServiceTest {					 // TaskServiceTest class
	private TaskService service;			    // TaskService field

	@BeforeEach								  // Before each test
	public void setUp() {					 // Set up method
		service = new TaskService();		// Initialize TaskService
	}

	@Test
	public void testAddTask() {												 // method to test add task
		Task task = new Task("1234567890", "TaskName", "Task description");	// Create a new task with valid task ID, name, and description
		service.addTask(task);		  									   // Add task to service
		assertNotNull(service.getTask("1234567890"));					  // Assert that the task is not null
	}

	@Test
	public void testDeleteTask() {											 // method to test delete task
		Task task = new Task("1234567890", "TaskName", "Task description");	// Create a new task with valid task ID, name, and description
		service.addTask(task);											   // Add task to service
		service.deleteTask("1234567890");								  // Delete task by ID
		assertThrows(IllegalArgumentException.class, () -> {			 // Assert that an IllegalArgumentException is thrown
			service.deleteTask("1234567890");							// Delete task again
		});
	}

	@Test
	public void testUpdateTask() {											 // method to test update task
		Task task = new Task("1234567890", "TaskName", "Task description");	// Create a new task with valid task ID, name, and description
		service.addTask(task);											   // Add task to service
		service.updateTask("1234567890", "NewName", "New description");	  // Update task with new ID, name, and description
		Task updatedTask = service.getTask("1234567890");				 // Get updated task by ID
		assertEquals("NewName", updatedTask.getName());					// Assert that the name is updated
		assertEquals("New description", updatedTask.getDescription()); // Assert that the description is updated
	}

	@Test
	public void testAddDuplicateTask() {									 // method to test add duplicate task
		Task task = new Task("1234567890", "TaskName", "Task description"); // Create a new task with valid task ID, name, and description
		service.addTask(task);											   // Add task to service
		assertThrows(IllegalArgumentException.class, () -> {			  // Assert that an IllegalArgumentException is thrown
			service.addTask(task);										 // Add task again
		});
	}
}