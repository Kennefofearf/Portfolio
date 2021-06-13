/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactServiceApp;


import java.util.*;

/**
 *
 * @author 1336870_snhu
 */
public class ContactService {

    /**
     * @param args the command line arguments
     */
    // Calls the below written CRUD methods in the main thread
    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        List<Contact> contactsList = contactService.prepareContactCreation();
        TreeMap<String, Contact> contacts = contactService.populateTreeMap(contactsList);

        System.out.println("Sorted Map: " + contacts);
    }

    private TreeMap<String, Contact> populateTreeMap(List<Contact> contactsList) {
        TreeMap<String, Contact> contacts = new TreeMap<>();
        for(int j = 0; j <= contactsList.size() - 1 ; j++) {
            contacts.put(contactsList.get(j).firstName, contactsList.get(j));
            System.out.println("Here is " + contactsList.get(j).getFirstName() + "'s information: " + contactsList.get(j).toString());
        }
        return contacts;
    }

    public List<Contact> prepareContactCreation() {
        List<Contact> contactsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people's data will be entered?");
        Integer inputNum = scanner.nextInt();

        for (int i = 0; i <= inputNum -1; i++) {
            contactsList.add(createContact());
        }
        return contactsList;
    }

    public Contact createContact() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter contact id:");
        String input = scanner.next();
        System.out.println("\nEnter first name:");
        String input2 = scanner.next();
        System.out.println("\nEnter last name:");
        String input3 = scanner.next();
        System.out.println("\nEnter phone number:");
        String input4 = scanner.next();
        System.out.println("\nEnter address:");
        String input5 = scanner.next();

        return new Contact(input, input2, input3, input4, input5);
    }
}
