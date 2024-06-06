/********************************************************************************************
 * Title: Appointment               |********************************************************
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
 *          Appointment.java represents an appointment and includes the appointment         *
 *                          ID, date, and description.                                      *
 *    																						*
 *      The class includes methods to get and set the appointment date and description.     *
 *          along with validation to ensure that the appointment ID is not null and         *
 *          is not longer than 10 characters, the appointment date is not in the            *
 *      past, and the description is not null and is not longer than 50 characters.         *
 *                                                                                          *
 *******************************************************************************************/

package appointment;                         // Package containing the Appointment class

import java.util.Date;                     // Importing necessary classes for the Appointment class

public class Appointment {               // Class representing an appointment
    private final String appointmentId; // Creating a final variable to store the appointment ID
    private Date appointmentDate;      // Creating a variable to store the appointment date
    private String description;       // Creating a variable to store the appointment description

    public Appointment(String appointmentId, Date appointmentDate, String description) {        // Constructor to create an appointment
        if (appointmentId == null || appointmentId.length() > 10)                              // Checking if the appointment ID is null or longer than 10 characters
            throw new IllegalArgumentException("Invalid appointment ID");                     // Throwing an exception if the appointment ID is invalid
        if (appointmentDate == null || appointmentDate.before(new Date()))                   // Checking if the appointment date is null or in the past
            throw new IllegalArgumentException("Appointment date must not be in the past"); // Throwing an exception if the appointment date is in the past
        if (description == null || description.length() > 50)                              // Checking if the description is null or longer than 50 characters
            throw new IllegalArgumentException("Description too long");                   // Throwing an exception if the description is too long

        this.appointmentId = appointmentId;                                             // Setting the appointment ID to the provided value if it is valid
        this.appointmentDate = appointmentDate;                                        // Setting the appointment date to the provided value if it is valid
        this.description = description;                                               // Setting the description to the provided value if it is valid
    }

    public String getAppointmentId() {                                             // Method to get the appointment ID
        return appointmentId;                                                     // Returning the appointment ID
    }

    public Date getAppointmentDate() {                                         // Method to get the appointment date
        return appointmentDate;                                               // Returning the appointment date
    }

    public void setAppointmentDate(Date appointmentDate) {                 // Method to set the appointment date
        if (appointmentDate.before(new Date()))                           // Checking if the appointment date is in the past
            throw new IllegalArgumentException("Appointment date must not be in the past"); // Throwing an exception if the appointment date is indeed in the past
        this.appointmentDate = appointmentDate;                         // Setting the appointment date to the provided value if it is valid
    }

    public String getDescription() {                                // Method to get the appointment description
        return description;                                        // Returning the appointment description
    }

    public void setDescription(String description) {            // Method to set the appointment description
        if (description.length() > 50)                         // Checking if the description is longer than 50 characters
            throw new IllegalArgumentException("Description too long"); // Throwing an exception if the description is too long
        this.description = description;                      // Setting the description to the provided value if it is valid
    }
}