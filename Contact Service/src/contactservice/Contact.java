/********************************************************************************************
 * Title: Contact                   |********************************************************
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
 *                  This is the Source Code for the Contact class.                          *
 *              The Contact class is responsible for creating a contact object.             *
 *  The contact object contains a contact ID, first name, last name, phone number, and      *
 *                                  an address.                                             * 
 *                                                                                          *
 ********************************************************************************************/

package contactservice;                // Package name

public class Contact {               // Class name
    private final String contactId; // Instance variables
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) { // Constructor to create a contact object; with the
                                                                                                       // parameters for contact ID, first name, last name, phone number, and address.
        if (contactId == null || contactId.length() > 10) {                                           // Validation; if the contact ID is null or the length is greater than 10, then an exception is thrown.
            throw new IllegalArgumentException("Invalid contact ID");                                // Exception; "Invalid contact ID" is thrown.
        }
        if (firstName == null || firstName.length() > 10) {                                        // Validation; if the first name is null or the length is greater than 10, then an exception is thrown.
            throw new IllegalArgumentException("Invalid first name");                             // Exception; "Invalid first name" is thrown.
        }
        if (lastName == null || lastName.length() > 10) {                                       // Validation; if the last name is null or the length is greater than 10, then an exception is thrown.
            throw new IllegalArgumentException("Invalid last name");                           // Exception; "Invalid last name" is thrown.
        }
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {               // Validation; if the phone number is null, the length is not equal to 10, or the phone number does not
                                                                                            // match the regular expression, then an exception is thrown.
            throw new IllegalArgumentException("Invalid phone number");                    // Exception; "Invalid phone number" is thrown.
        }
        if (address == null || address.length() > 30) {                                  // Validation; if the address is null or the length is greater than 30, then an exception is thrown.
            throw new IllegalArgumentException("Invalid address");                      // Exception; "Invalid address" is thrown.
        }
                                                                                      // Assigning the values to the instance variables of the new contact object to the values of the parameters.
        this.contactId = contactId;  // Assigning the contact ID.
        this.firstName = firstName; // Assigning the first name.
        this.lastName = lastName;  // Assigning the last name.
        this.phone = phone;       // Assigning the phone number.
        this.address = address;  // Assigning the address.
    }
                                                         // Getters for contactId, firstName, lastName, phone, and address
    public String getContactId() { return contactId; }  // Getter for the contact ID.
    public String getFirstName() { return firstName; } // Getter for the first name.
    public String getLastName() { return lastName; }  // Getter for the last name.
    public String getPhone() { return phone; }       // Getter for the phone number.
    public String getAddress() { return address; }  // Getter for the address.

                                                                                // Setters for contactId, firstName, lastName, phone, and address
    public void setFirstName(String firstName) { this.firstName = firstName; } // Setter for the instance variable of the contact object to equal the value of the new first name.
    public void setLastName(String lastName) { this.lastName = lastName; }    // Setter for the instance variable of the contact object to equal the value of the new last name.
    public void setPhone(String phone) { this.phone = phone; }               // Setter for the instance variable of the contact object to equal the value of the new phone number.
    public void setAddress(String address) { this.address = address; }      // Setter for the instance variable of the contact object to equal the value of the new address.
}