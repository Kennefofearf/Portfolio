/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactServiceApp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


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
        JSONParser jsonParser = new JSONParser();

        try {

            // Map object to file
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("C:\\Users\\Kenny\\IdeaProjects\\ScannerProject\\src\\main\\resources\\ContactData\\contactData.json");

            mapper.writeValue(file, contactsList);

            // Parse Json
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader(file));

            //establish connection and prepare statement
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactservice", "root", "password");
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO contacts values (?, ?, ?, ?, ? )");

            for(Object object : jsonArray) {
                JSONObject record = (JSONObject) object;
                String contactID = (String) record.get("contactID");
                String first_name = (String) record.get("firstName");
                String last_name = (String) record.get("lastName");
                String phone = (String) record.get("phone");
                String address = (String) record.get("address");
                pstmt.setString(1, contactID);
                pstmt.setString(2, first_name);
                pstmt.setString(3, last_name);
                pstmt.setString(4, phone);
                pstmt.setString(5, address);
                pstmt.executeUpdate();
            }
            System.out.println("Records inserted.....");



        } catch ( Exception e) {
            e.printStackTrace();
        }


//        System.out.println("Sorted Map: " + contacts);
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
