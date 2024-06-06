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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class AppointmentServiceTest {
    private AppointmentService service;

    @BeforeEach
    void setUp() {
        service = new AppointmentService();
    }

    @Test
    void testAddAndDeleteAppointment() {
        Appointment appointment = new Appointment("A123456789", new Date(), "Check-up");
        service.addAppointment(appointment);
        assertNotNull(service.getAppointment("A123456789"));
        service.deleteAppointment("A123456789");
        assertThrows(IllegalArgumentException.class, () -> service.getAppointment("A123456789"));
    }

    @Test
    void testDuplicateId() {
        Appointment appointment = new Appointment("A123456789", new Date(), "Check-up");
        service.addAppointment(appointment);
        assertThrows(IllegalArgumentException.class, () -> service.addAppointment(appointment));
    }
}