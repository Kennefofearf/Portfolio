/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactServiceAppTest;


import ContactServiceApp.Contact;
import ContactServiceApp.ContactService;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * @author 1336870_snhu
 */
public class ContactServiceTest {


    ListAppender<ILoggingEvent> listAppender;

    public ContactServiceTest() {
    }

    @BeforeEach
    public void startup() {
        Logger logger = (Logger) LoggerFactory.getLogger(ContactService.class);

        listAppender = new ListAppender<>();
        listAppender.start();

        // add the appender to the logger
        logger.addAppender(listAppender);
    }

    // Tests the string length and getters from ContactService.java
    @Test
    public void testContact() {
        Contact contact = new Contact("abcde", "Kenny", "Peterson", "9999998888", "New Road Lane");
        assertTrue(contact.getContactID().equals("abcde"));
        assertTrue(contact.getFirstName().equals("Kenny"));
        assertTrue(contact.getLastName().equals("Peterson"));
        assertTrue(contact.getPhone().equals("9999998888"));
        assertTrue(contact.getAddress().equals("New Road Lane"));
    }

    // Tests the createContact method from ContactService.java
    @Test
    public void testCreate() {
        ContactService contactService = new ContactService();
        List<ILoggingEvent> logsList = listAppender.list;
        Contact contact = new Contact("abcde", "Kenny", "Peterson", "9999998888", "New Road Lane");
        contactService.createContact(contact);
        assertTrue(contact.getContactID().equals("abcde"));
        assertTrue(contact.getFirstName().equals("Kenny"));
        assertTrue(contact.getLastName().equals("Peterson"));
        assertTrue(contact.getPhone().equals("9999998888"));
        assertTrue(contact.getAddress().equals("New Road Lane"));
        assertEquals("Starting create contact...", logsList.get(0).getMessage());
        assertEquals(Level.INFO, logsList.get(0).getLevel());
        assertEquals("Finished create contact...", logsList.get(2).getMessage());
        assertEquals(Level.INFO, logsList.get(2).getLevel());
        assertEquals("Contact Info: " + contact, logsList.get(1).getMessage());
        assertEquals(Level.DEBUG, logsList.get(1).getLevel());
    }

    @Test
    // Tests the modifyContact method from ContactService.java
    public void testModify() {
        List<ILoggingEvent> logsList = listAppender.list;
        Contact originalContact = new Contact("abcde", "Kenny", "Peterson", "9999998888", "New Road Lane");
        Contact modifiedContact = new Contact("zzzz", "Jim", "Beam", "292382", "Hawkstone Way");
        ContactService contactService = new ContactService();
        contactService.modifyContact(originalContact, modifiedContact);
        assertTrue(originalContact.contactID.equals("abcde"));
        assertTrue(originalContact.firstName.equals("Jim"));
        assertTrue(originalContact.lastName.equals("Beam"));
        assertTrue(originalContact.phone.equals("292382"));
        assertTrue(originalContact.address.equals("Hawkstone Way"));
        assertEquals("Modifying contact info...", logsList.get(0).getMessage());
        assertEquals(Level.INFO, logsList.get(0).getLevel());
        assertEquals("Finished modifying contact info...", logsList.get(logsList.size() - 1).getMessage());
        assertEquals(Level.INFO, logsList.get(logsList.size() - 1).getLevel());
    }

    @Test
    // Tests the deleteContact method from ContactService.java
    public void testDelete() {
        List<ILoggingEvent> logsList = listAppender.list;
        ContactService contactService = new ContactService();
        Contact contact = new Contact("zzzz", "Jim", "Beam", "292382", "Hawkstone Way");
        contactService.deleteContact(contact);
        assertTrue(contact.contactID.equals(""));
        assertTrue(contact.firstName.equals(""));
        assertTrue(contact.lastName.equals(""));
        assertTrue(contact.phone.equals(""));
        assertTrue(contact.address.equals(""));
        assertEquals("Deleting contact info...", logsList.get(0).getMessage());
        assertEquals(Level.INFO, logsList.get(0).getLevel());
        assertEquals("Deleted contact info...", logsList.get(logsList.size() - 1).getMessage());
        assertEquals(Level.INFO, logsList.get(logsList.size() - 1).getLevel());
    }
}
