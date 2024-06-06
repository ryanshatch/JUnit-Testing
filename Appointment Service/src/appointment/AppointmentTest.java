/********************************************************************************************
 * Title: Appointment Test          |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: June 6th 2024              |********************************************************
 * Last Updated: June 6th 2024      |********************************************************
 * Version: 1.0                     |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *     																						*
 *******************************************************************************************/

package appointment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AppointmentTest {
    @Test
    void testAppointmentCreation() {
        Appointment appointment = new Appointment("A123456789", new Date(), "Check-up");
        assertNotNull(appointment);
    }

    @Test
    void testInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> new Appointment("12345678901", new Date(), "Check-up"));
    }

    @Test
    void testPastDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 100000);
        assertThrows(IllegalArgumentException.class, () -> new Appointment("A123456789", pastDate, "Check-up"));
    }

    @Test
    void testLongDescription() {
        String longDesc = "This is a very long description that should throw an error because it is way too long.";
        assertThrows(IllegalArgumentException.class, () -> new Appointment("A123456789", new Date(), longDesc));
    }
}
