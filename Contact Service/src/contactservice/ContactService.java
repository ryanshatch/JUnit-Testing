package contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact already exists or invalid");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact does not exist");
        }
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            if (firstName != null && firstName.length() <= 10) contact.setFirstName(firstName);
            if (lastName != null && lastName.length() <= 10) contact.setLastName(lastName);
            if (phone != null && phone.length() == 10 && phone.matches("\\d+")) contact.setPhone(phone);
            if (address != null && address.length() <= 30) contact.setAddress(address);
        } else {
            throw new IllegalArgumentException("Contact does not exist");
        }
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}