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
 *     The ContactTest is responsible for creating and running the contact tests.           *
 *        Contact tests are run in the following order of creation and validation:          *
 *                  contactId, firstName, lastName, phone, and address.                     *
 *******************************************************************************************/

package task;

import task.Task;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
>>>>>>> b494d275103db40ab7b82148c6a0739e42f5f9d0
}