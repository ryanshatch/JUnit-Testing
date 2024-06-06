/********************************************************************************************
 * Title: AppointmentTest           |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: June 6th 2024              |********************************************************
 * Last Updated: June 6th 2024      |********************************************************
 * Version: 1.1                     |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *      The AppointmentTest.java file contains JUnit tests for the Appointment class.       *
 *                  The tests include checking for invalid appointment                      *
 *                      IDs, past dates, and long descriptions.                             *
 *     																						*
 *******************************************************************************************/

package appointment;                                     // Package containing the Appointment class

import static org.junit.jupiter.api.Assertions.*;      // Importing necessary classes for testing
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AppointmentTest {                     // Class containing the JUnit tests for the Appointment class
    @Test
    void testAppointmentCreation() {             // Test to check if an appointment can be created
        Appointment appointment = new Appointment("A123456789", new Date(), "Check-up");    // Creating a new appointment
        assertNotNull(appointment);            // Checking if the appointment was created
    }

    @Test
    void testInvalidId() {                  // Test to check if an invalid appointment ID is rejected
        assertThrows(IllegalArgumentException.class, () -> new Appointment("12345678901", new Date(), "Check-up"));   // Creating an appointment with an invalid ID
    }

    @Test
    void testPastDate() {                                                // Test to check if an appointment with a past date is rejected
        Date pastDate = new Date(System.currentTimeMillis() - 100000);  // Creating a past date with a time 100000 milliseconds ago
        assertThrows(IllegalArgumentException.class, () -> new Appointment("A123456789", pastDate, "Check-up"));    // Creating an appointment with a past date and checking if it is rejected
    }

    @Test
    void testLongDescription() {                                    // Test to check if a long description is rejected
        String longDesc = "This is a very long description that should throw an error because it is way too long.";   // Creating a long description that is 80 characters long, since the limit is 50
        assertThrows(IllegalArgumentException.class, () -> new Appointment("A123456789", new Date(), longDesc));    // Creating an appointment with a long description and checking if it is rejected
    }
}