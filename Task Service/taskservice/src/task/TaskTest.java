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
 * 	 TaskTest is a JUnit test class for the Task class. It tests the creation of a task,	*
 * 				making sure that the task ID, name, and description are valid,				*
 * 				while also testing for invalid task ID, name, and description.				*
 *                                                                                          *
 *******************************************************************************************/

package task;	// Package name

/** import task.Task; **/
/** import static org.junit.jupiter.api.Assertions.assertEquals; **/
import static org.junit.jupiter.api.Assertions.assertNotNull;					   // Import assertNotNull
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;												 // Import Test

public class TaskTest {													       // TaskTest class
	@Test
	public void testTaskCreationSuccess() {									 // method to test task creation
		Task task = new Task("1234567890", "TaskName", "Task description");	// Create a new task with valid task ID, name, and description
		assertNotNull(task);											   // Assert that the task is not null
	}

	@Test
	public void testTaskIdTooLong() {								   // method to test task ID too long
		assertThrows(IllegalArgumentException.class, () -> {		  // Assert that an IllegalArgumentException is thrown
			new Task("12345678901", "TaskName", "Task description"); // Create a new task with an invalid task ID that is too long
		});
	}

	@Test
	public void testNullTaskId() {								 // method to test null task ID
		assertThrows(IllegalArgumentException.class, () -> {	// Assert that an IllegalArgumentException is thrown
			new Task(null, "TaskName", "Task description");	   // Create a new task with a null task ID and valid name and description
		});
	}

	@Test
	public void testNameTooLong() {								 						  // method to test name too long
		assertThrows(IllegalArgumentException.class, () -> {							 // Assert that an IllegalArgumentException is thrown
			new Task("1234567890", "NameIsWayTooLongForTheLimit", "Task description");	// Create a new task with a name that is too long 
																					   // and valid task ID and description
		});
	}

	@Test
	public void testNullName() {												  // method to test null name
		assertThrows(IllegalArgumentException.class, () -> {					 // Assert that an IllegalArgumentException is thrown
			new Task("1234567890", null, "Task description");					// Create a new task with a null name and valid task ID and description
		});
	}

	@Test
	public void testDescriptionTooLong() {									// method to test description too long
		assertThrows(IllegalArgumentException.class, () -> {			   // Assert that an IllegalArgumentException is thrown
			new Task("1234567890", "TaskName", "This description is way too long and should not be accepted");	// Create a new task with a description that is too long 
																											   // and valid task ID and name
		});
	}

	@Test
	public void testNullDescription() {							// method to test null description
		assertThrows(IllegalArgumentException.class, () -> {   // Assert that an IllegalArgumentException is thrown
			new Task("1234567890", "TaskName", null);		  // Create a new task with a null description and valid task ID and name
		});
	}
}