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

package task;

module taskservice {
    requires org.junit.jupiter.api;
    exports task;
}