/********************************************************************************************
 * Title: AppointmentServiceTest    |********************************************************
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
 *  AppointmentServiceTest is a JUnit test file that tests the AppointmentService class.    *
 *          The tests include checking if an appointment can be added and deleted,          *
 *          and if adding an appointment with a duplicate ID is rejected.                   *
 *     																						*
 *******************************************************************************************/

package appointment;                                    // Package containing the AppointmentService class

import static org.junit.jupiter.api.Assertions.*;     // Importing necessary classes for testing
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AppointmentServiceTest {             // Class containing the JUnit tests for the AppointmentService class
    private AppointmentService service;          // Creating an instance of the AppointmentService class

    @BeforeEach                                // Method to set up the AppointmentService instance before each test
    void setUp() {
        service = new AppointmentService();  // Creating a new instance of the AppointmentService class
    }

    @Test
    void testAddAndDeleteAppointment() {                                                    // Test to check if an appointment can be added and deleted
        Appointment appointment = new Appointment("A123456789", new Date(), "Check-up");   // Creating a new appointment
        service.addAppointment(appointment);                                              // Adding the appointment to the service
        assertNotNull(service.getAppointment("A123456789"));                             // Checking if the appointment was added
        service.deleteAppointment("A123456789");                                        // Deleting the appointment
        assertThrows(IllegalArgumentException.class, () -> service.getAppointment("A123456789"));   // Checking if the appointment was deleted by trying to get it
    }

    @Test
    void testDuplicateId() {                                                              // Test to check if adding an appointment with a duplicate ID is rejected
        Appointment appointment = new Appointment("A123456789", new Date(), "Check-up"); // Creating a new appointment
        service.addAppointment(appointment);                                            // Adding the appointment to the service
        assertThrows(IllegalArgumentException.class, () -> service.addAppointment(appointment));    // Adding the same appointment again and checking if it is rejected
    }
}