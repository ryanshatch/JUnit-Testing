package contactservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St");
        service.addContact(contact);
        assertNotNull(service);
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St");
        service.addContact(contact);
        service.deleteContact("1234567890");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("1234567890");
        });
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St");
        service.addContact(contact);
        service.updateContact("1234567890", "Janet", "Doe", "0987654321", "456 Oak St");
        Contact updatedContact = service.getContact("1234567890");
        assertEquals("Janet", updatedContact.getFirstName());
        assertEquals("0987654321", updatedContact.getPhone());
    }

    @Test
    public void testAddDuplicateContact() {
        Contact contact = new Contact("1234567890", "Jane", "Doe", "1234567890", "123 Elm St");
        service.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact);
        });
    }
}