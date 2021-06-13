/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactServiceApp;

/**
 *
 * @author 1336870_snhu
 */
public class Contact {

    public String contactID;
    public String firstName;
    public String lastName;
    public String phone;
    public String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Following methods are getters for the name, phone and address of the contact entered in ContactTest.java
    public String getFirstName(){
        return firstName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID='" + contactID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
