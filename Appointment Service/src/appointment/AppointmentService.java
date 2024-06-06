/********************************************************************************************
 * Title: AppointmentService        |********************************************************
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
 *          The AppointmentService class includes methods and uses a map to                 *
 *          add an appointment, delete an appointment, and get an appointment.              *    
 *          If an appointment is null or if the appointment ID is a duplicate,              *
 *         an IllegalArgumentException is thrown. If an appointment does not exist in       *
 *                  the map, an IllegalArgumentException is also thrown.                    *
 *     																						*
 *******************************************************************************************/

package appointment;          // Package containing the AppointmentService class

import java.util.HashMap;   // Importing necessary classes for the AppointmentService class
import java.util.Map;

public class AppointmentService {
    private Map<String, Appointment> appointments = new HashMap<>();    // Creating a map to store appointments

    public void addAppointment(Appointment appointment) {             // Method to add an appointment to the service 
        if (appointment == null || appointments.containsKey(appointment.getAppointmentId()))    // Checking if the appointment is null or if the ID is a duplicate
            throw new IllegalArgumentException("Duplicate or invalid appointment ID");         // Throwing an exception if the appointment is null or the ID is a duplicate
        appointments.put(appointment.getAppointmentId(), appointment);                        // Adding the appointment to the map if it is valid
    }

    public void deleteAppointment(String appointmentId) {                       // Method to delete an appointment from the service
        if (!appointments.containsKey(appointmentId))                          // Checking if the appointment exists in the map
            throw new IllegalArgumentException("Appointment does not exist"); // Throwing an exception if the appointment does not exist
        appointments.remove(appointmentId);                                  // Removing the appointment from the map if it exists
    }

    public Appointment getAppointment(String appointmentId) {        // Method to get an appointment from the service
        Appointment appointment = appointments.get(appointmentId);  // Getting the appointment from the map
        if (appointment == null) {                                 // Checking if the appointment exists in the map
            throw new IllegalArgumentException("Appointment does not exist");   // Throwing an exception if the appointment does not exist
        }
        return appointment;                                                   // Returning the appointment if it exists
    }
}