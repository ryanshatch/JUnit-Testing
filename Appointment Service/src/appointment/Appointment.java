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

import java.util.Date;

public class Appointment {
    private final String appointmentId;
    private Date appointmentDate;
    private String description;

    public Appointment(String appointmentId, Date appointmentDate, String description) {
        if (appointmentId == null || appointmentId.length() > 10)
            throw new IllegalArgumentException("Invalid appointment ID");
        if (appointmentDate == null || appointmentDate.before(new Date()))
            throw new IllegalArgumentException("Appointment date must not be in the past");
        if (description == null || description.length() > 50)
            throw new IllegalArgumentException("Description too long");

        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        if (appointmentDate.before(new Date()))
            throw new IllegalArgumentException("Appointment date must not be in the past");
        this.appointmentDate = appointmentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() > 50)
            throw new IllegalArgumentException("Description too long");
        this.description = description;
    }
}