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

        // Following statements test to make sure each string entered in ContactTest.java is less than 10 characters
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contactID");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        if (phone == null || phone.length() > 10) {
            throw new IllegalArgumentException("Invalid phone");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

    }

    Contact() {

        // Throws an exception if the operation is not supported yet.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Following methods are getters for the name, phone and address of the contact entered in ContactTest.java
    public String getContactID(){
        return contactID;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    // Following methods set the values for name, phone, and address from the getter methods.
    public void setContactID(String cID) {
        contactID = cID;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setPhoneNumber(String pNumber) {
        phone = pNumber;
    }

    public void setAddress(String sAddress) {
        address = sAddress;
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
