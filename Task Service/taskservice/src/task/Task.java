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
 * 					This is the Source Code for the Task Service Project. 					*
 * 			This service is responsible for creating, updating, and deleting tasks.  		*
 *  			It also provides the ability to retrieve tasks by ID.      					*
 *                                                                                          *
 ********************************************************************************************/

package task;									   // Package name

/** import task.Task; **/
/** import java.util.HashMap; **/
/** import java.util.Map; **/
/** import java.util.Objects; **/
/** import java.util.Optional; **/
/** import java.util.function.Consumer; **/

public class Task {							// Task class with task ID, name, and description fields
	private final String taskId;		   // Task ID field
	private String name;			      // Name field
	private String description;		     // Description field

	public Task(String taskId, String name, String description) {	  // Task constructor
		if (taskId == null || taskId.length() > 10) {				 // If task ID is null or greater than 10 characters
			throw new IllegalArgumentException("Invalid task ID");	// Throw an exception
		}	
		if (name == null || name.length() > 20) {				  			// If name is null or greater than 20 characters
			throw new IllegalArgumentException("Invalid name");			   // Throw an exception
		}
		if (description == null || description.length() > 50) {			 // If description is null or greater than 50 characters
			throw new IllegalArgumentException("Invalid description");	// Throw an exception
		}
		this.taskId = taskId;										  // Set task ID
		this.name = name;											 // Set name
		this.description = description;								// Set description
	}

	public String getTaskId() {									 // Get task ID
		return taskId;											// Return task ID
	}

	public String getName() {								 // Get name
		return name;										// Return name
	}

	public String getDescription() {					 // Get description
		return description;								// Return description
	}

	public void setName(String name) {							  // Set name
		if (name == null || name.length() > 20) {				 // If name is null or greater than 20 characters
			throw new IllegalArgumentException("Invalid name");	// Throw an exception
		}
		this.name = name;									  // If not, set name
	}

	public void setDescription(String description) {					 // Set description
		if (description == null || description.length() > 50) {			// If description is null or greater than 50 characters
			throw new IllegalArgumentException("Invalid description"); // Throw an exception
		}
		this.description = description;								 // If not, set description
	}
}