/********************************************************************************************
 * Title: ContactService            |********************************************************
 * Developed by: Ryan Hatch         |********************************************************
 * Date: June 2nd 2024              |********************************************************
 * Last Updated: June 11th 2024     |********************************************************
 * Version: 1.1.1                   |********************************************************
 * ******************************************************************************************
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 * <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
 *                                                                                          *
 * ******************************** Description: ********************************************
 *                                                                                          *
 *          This is the Source Code for the Contact Service Project.                        *
 *          This service is responsible for creating, updating, and deleting contacts.      *
 *                                                                                          *
 ********************************************************************************************/

package contactservice;     // Package for contact service

import java.util.HashMap; // Importing the HashMap class
import java.util.Map;

public class ContactService {                                    // Class for the Contact Service
    private Map<String, Contact> contacts = new HashMap<>();    // Creating a HashMap to store contacts

    public void addContact(Contact contact) {                 // Method to add a contact
        if (contact == null || contacts.containsKey(contact.getContactId())) {        // If the contact is null or the contact ID already exists, an exception is thrown
            throw new IllegalArgumentException("Contact already exists or invalid"); // Exception; "Contact already exists or invalid" is thrown
        }
        contacts.put(contact.getContactId(), contact);                             // Adding the contact to the HashMap with the contact ID as the key
    }

    public void deleteContact(String contactId) {                               // Method to delete a contact
        if (!contacts.containsKey(contactId)) {                                // If the contact ID does not exist, an exception is thrown
            throw new IllegalArgumentException("Contact does not exist");     // Exception; "Contact does not exist" is thrown
        }
        contacts.remove(contactId);                                         // Removing the contact from the HashMap
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) { // Method to update a contact
        Contact contact = contacts.get(contactId);                                                                // Getting the contact from the HashMap
        if (contact != null) {                                                                                   // If the contact exists in the HashMap or if it is not null
            if (firstName != null && firstName.length() <= 10) contact.setFirstName(firstName);                 // If the first name is not null and the length is less than or equal to 10, set the first name
            if (lastName != null && lastName.length() <= 10) contact.setLastName(lastName);                    // If the last name is not null and the length is less than or equal to 10, set the last name
            if (phone != null && phone.length() == 10 && phone.matches("\\d+")) contact.setPhone(phone);      // If the phone number is not null, the length is equal to 10, and it matches the regular expression, set the phone number
            if (address != null && address.length() <= 30) contact.setAddress(address);                      // If the address is not null and the length is less than or equal to 30, set the address
        } else {    // If the contact does not exist
            throw new IllegalArgumentException("Contact does not exist");                                  // Exception; "Contact does not exist" is thrown
        }
    }

    public Contact getContact(String contactId) {                                                     // Method to get a contact by contact ID
        return contacts.get(contactId);                                                              // Returning the contact from the HashMap via the contact ID
    }
}