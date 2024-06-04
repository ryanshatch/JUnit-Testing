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
 *******************************************************************************************/

package task;

/*
import task.Task;
import static org.junit.jupiter.api.Assertions.assertEquals;
**/
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class TaskTest {
	@Test
	public void testTaskCreationSuccess() {
		Task task = new Task("1234567890", "TaskName", "Task description");
		assertNotNull(task);
	}

	@Test
	public void testTaskIdTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "TaskName", "Task description");
		});
	}

	@Test
	public void testNullTaskId() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "TaskName", "Task description");
		});
	}

	@Test
	public void testNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "NameIsWayTooLongForTheLimit", "Task description");
		});
	}

	@Test
	public void testNullName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", null, "Task description");
		});
	}

	@Test
	public void testDescriptionTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "TaskName", "This description is way too long and should not be accepted");
		});
	}

	@Test
	public void testNullDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567890", "TaskName", null);
		});
	}
}