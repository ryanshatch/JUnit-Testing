package contactservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    @Test
    public void testContactCreationSuccess() {
        // Testing successful creation of a contact
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St");
        assertNotNull(contact);
    }

    @Test
    public void testContactIdTooLong() {
        // Testing that an exception is thrown for too long contact ID
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Jane", "Doe", "1234567890", "123 Elm St");
        });
    }

    @Test
    public void testNullContactId() {
        // Testing that an exception is thrown for null contact ID
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Jane", "Doe", "1234567890", "123 Elm St");
        });
    }

    @Test
    public void testFirstNameTooLong() {
        // Testing that an exception is thrown for too long first name
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Janesuperlong", "Doe", "1234567890", "123 Elm St");
        });
    }

    @Test
    public void testNullFirstName() {
        // Testing that an exception is thrown for null first name
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", null, "Doe", "1234567890", "123 Elm St");
        });
    }

    @Test
    public void testLastNameTooLong() {
        // Testing that an exception is thrown for too long last name
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jane", "Doelonglastname", "1234567890", "123 Elm St");
        });
    }

    @Test
    public void testNullLastName() {
        // Testing that an exception is thrown for null last name
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jane", null, "1234567890", "123 Elm St");
        });
    }

    @Test
    public void testInvalidPhoneNumber() {
        // Testing that an exception is thrown for invalid phone number
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jane", "Doe", "123456789", "123 Elm St");
        });
    }

    @Test
    public void testNullPhone() {
        // Testing that an exception is thrown for null phone number
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jane", "Doe", null, "123 Elm St");
        });
    }

    @Test
    public void testAddressTooLong() {
        // Testing that an exception is thrown for too long address
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm Street, Some City, State, 12345");
        });
    }

    @Test
    public void testNullAddress() {
        // Testing that an exception is thrown for null address
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Jane", "Doe", "1234567890", null);
        });
    }
}