/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactServiceApp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author 1336870_snhu
 */
public class ContactService {

    private static final Logger log = LoggerFactory.getLogger(ContactService.class);

    public String contactID;
    public String firstName;
    public String lastName;
    public String phone;
    public String address;

    /**
     * @param args the command line arguments
     */
    // Calls the below written CRUD methods in the main thread
    public static void main(String[] args) {
        log.info("Contact Service started...");
        ContactService contactService = new ContactService();
        Contact contact = new Contact();
        Contact modifiedContact = new Contact();
        contact = contactService.modifyContact(contact, modifiedContact);
        contact = contactService.deleteContact(contact);
    }

    // Method to create a contact with the strings entered in ContactServiceTest.java
    public Contact createContact(Contact contact) {
        log.info("Starting create contact...");
        contact.contactID = contact.getContactID();
        contact.firstName = contact.getFirstName();
        contact.lastName = contact.getLastName();
        contact.phone = contact.getPhone();
        contact.address = contact.getAddress();
        log.debug("Contact Info: " + contact);
        log.info("Finished create contact...");
        return contact;
    }

    // Method to delete a contact with the strings entered in ContactServiceTest.java
    public Contact deleteContact(Contact originalContact) {
        log.info("Deleting contact info...");
        createContact(originalContact);

        originalContact.setContactID("");
        originalContact.setFirstName("");
        originalContact.setLastName("");
        originalContact.setPhoneNumber("");
        originalContact.setAddress("");
        log.info("Deleted contact info...");
        return originalContact;
    }

    // Method to modify a contact with the strings entered in ContactServiceTest.java
    public Contact modifyContact(Contact originalContact, Contact modifiedContact) {
        log.info("Modifying contact info...");

        createContact(originalContact);

        originalContact.setFirstName(modifiedContact.getFirstName());
        originalContact.setLastName(modifiedContact.getLastName());
        originalContact.setPhoneNumber(modifiedContact.getPhone());
        originalContact.setAddress(modifiedContact.getAddress());
        log.info("Finished modifying contact info...");

        return originalContact;
    }

}
