/********************************************************************************************
 * Title: ContactTest               |********************************************************
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
 *          ContactTest is a JUnit test class that tests the Contact class.                 *
 *             It checks for valid and invalid inputs for the Contact class.                *
 *                                                                                          *
 ********************************************************************************************/

package contactservice;                                          // Package for contact service

import static org.junit.jupiter.api.Assertions.assertNotNull;  // Importing the static assertions
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;                           // Importing the Test annotation
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {                                // Class for the Contact Test
    @Test
    public void testContactCreationSuccess() {                                                   // Method to test creating a contact successfully
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St"); // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        assertNotNull(contact);                                                                // Checking that the contact is not null
    }

    @Test
    public void testContactIdTooLong() {                                               // Method to test contact ID too long
                                                                                      // Testing that an exception is thrown for too long contact ID
        assertThrows(IllegalArgumentException.class, () -> {                         // Checking that an exception is thrown
            new Contact("12345678901", "Jane", "Doe", "1234567890", "123 Elm St");  // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testNullContactId() {                                          // Method to test null contact ID
                                                                              // Testing that an exception is thrown for null contact ID
        assertThrows(IllegalArgumentException.class, () -> {                 // Checking that an exception is thrown
            new Contact(null, "Jane", "Doe", "1234567890", "123 Elm St");   // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testFirstNameTooLong() {                                // Method to test first name too long
                                                                       // Testing that an exception is thrown for too long first name
        assertThrows(IllegalArgumentException.class, () -> {          // Checking that an exception is thrown
            new Contact("1234567890", "Janesuperlong", "Doe", "1234567890", "123 Elm St");  // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testNullFirstName() {                                               // Method to test null first name
                                                                                   // Testing that an exception is thrown for null first name
        assertThrows(IllegalArgumentException.class, () -> {                      // Checking that an exception is thrown
            new Contact("1234567890", null, "Doe", "1234567890", "123 Elm St");  // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testLastNameTooLong() {                                                            // Method to test last name too long
                                                                                                  // Testing that an exception is thrown for too long last name
        assertThrows(IllegalArgumentException.class, () -> {                                     // Checking that an exception is thrown
            new Contact("1234567890", "Jane", "Doelonglastname", "1234567890", "123 Elm St");   // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testNullLastName() {                                                   // Method to test null last name
                                                                                      // Testing that an exception is thrown for null last name
        assertThrows(IllegalArgumentException.class, () -> {                         // Checking that an exception is thrown
            new Contact("1234567890", "Jane", null, "1234567890", "123 Elm St");    // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testInvalidPhoneNumber() {                                             // Method to test invalid phone number
                                                                                      // Testing that an exception is thrown for invalid phone number
        assertThrows(IllegalArgumentException.class, () -> {                         // Checking that an exception is thrown
            new Contact("1234567890", "Jane", "Doe", "123456789", "123 Elm St");    // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testNullPhone() {                                            // Method to test null phone number
                                                                            // Testing that an exception is thrown for null phone number
        assertThrows(IllegalArgumentException.class, () -> {               // Checking that an exception is thrown
            new Contact("1234567890", "Jane", "Doe", null, "123 Elm St"); // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testAddressTooLong() {                                                                             // Method to test address too long
                                                                                                                  // Testing that an exception is thrown for too long address
        assertThrows(IllegalArgumentException.class, () -> {                                                     // Checking that an exception is thrown
            new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm Street, Some City, State, 12345");  // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }

    @Test
    public void testNullAddress() {                                            // Method to test null address
                                                                              // Testing that an exception is thrown for null address
        assertThrows(IllegalArgumentException.class, () -> {                 // Checking that an exception is thrown
            new Contact("1234567890", "Jane", "Doe", "1234567890", null);   // Creating a new contact object with the contact ID, first name, last name, phone number, and address
        });
    }
}