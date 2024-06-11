/********************************************************************************************
 * Title: ContactServiceTest        |********************************************************
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
 *         ContactServiceTest is a JUnit test class that tests the ContactService class.    *
 *          It checks for valid and invalid inputs for the ContactService class.            *
 *                                                                                          *
 ********************************************************************************************/

package contactservice; // Package for contact service

import org.junit.jupiter.api.BeforeEach;    // Importing the BeforeEach annotation
import org.junit.jupiter.api.Test;  // Importing the Test annotation
import static org.junit.jupiter.api.Assertions.*;   // Importing the static assertions

public class ContactServiceTest {       // Class for the Contact Service Test
    private ContactService service; // Creating an instance of the ContactService class

    @BeforeEach 
    public void setUp() {   // Method to set up the test
        service = new ContactService(); // Creating a new instance of the ContactService class
    }

    @Test
    public void testAddContact() {  // Method to test adding a contact to the service
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St"); // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        service.addContact(contact);    // Adding the contact to the service
        assertNotNull(service); // Checking that the service is not null
    }

    @Test
    public void testDeleteContact() {   // Method to test deleting a contact from the service
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St"); // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        service.addContact(contact);    // Adding the contact to the service
        service.deleteContact("1234567890");    // Deleting the contact from the service
        assertThrows(IllegalArgumentException.class, () -> {    // Checking that an exception is thrown when trying to get the contact
            service.deleteContact("1234567890");    // Deleting the contact from the service
        });
    }

    @Test
    public void testUpdateContact() {   // Method to test updating a contact in the service
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St"); // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        service.addContact(contact);    // Adding the contact to the service
        service.updateContact("1234567890", "Janet", "Doe", "0987654321", "456 Oak St");    // Updating the contact in the service
        Contact updatedContact = service.getContact("1234567890");  // Getting the updated contact
        assertEquals("Janet", updatedContact.getFirstName());   // Checking that the first name is updated
        assertEquals("0987654321", updatedContact.getPhone());  // Checking that the phone number is updated
    }

    @Test
    public void testAddDuplicateContact() {  // Method to test adding a duplicate contact to the service
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St"); // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        service.addContact(contact);    // Adding the contact to the service
        assertThrows(IllegalArgumentException.class, () -> {    // Checking that an exception is thrown when trying to add the duplicate contact
            service.addContact(contact);    // Adding the duplicate contact to the service
        });
    }
}