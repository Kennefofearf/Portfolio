/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactServiceAppTest;

import ContactServiceApp.Contact;
import org.junit.Test;

//import contactserviceapp.Contact;

import static org.junit.Assert.*;

/**
 *
 * @author 1336870_snhu
 */
public class ContactTest {

    /**
     * Test of getfirstName method, of class Contact.
     */
    @Test
    // Tests the string length and getters from Contact.java
    public void testContact() {
        Contact contact = new Contact("abcde", "Kenny", "Peterson", "9999998888", "New Road Lane");
        assertTrue(contact.getContactID().equals("abcde"));
        assertTrue(contact.getFirstName().equals("Kenny"));
        assertTrue(contact.getLastName().equals("Peterson"));
        assertTrue(contact.getPhone().equals("9999998888"));
        assertTrue(contact.getAddress().equals("New Road Lane"));
    }

    // Tests invalid string lengths
    @Test (expected = Exception.class)
    public void testContactError() {
        Contact contact = new Contact("abcde1111111111111111", "Kenny111111111111111", "Peterson1111111111", "99999988881", "New Road Lane11111111111111111111111111111111111111111111111111111");
        assertTrue(contact.getContactID().equals("abcde1111111111111111"));
        assertTrue(contact.getFirstName().equals("Kenny111111111111111"));
        assertTrue(contact.getLastName().equals("Peterson1111111111"));
        assertTrue(contact.getPhone().equals("99999988881"));
        assertTrue(contact.getAddress().equals("New Road Lane11111111111111111111111111111111111111111111111111111"));
    }
}

