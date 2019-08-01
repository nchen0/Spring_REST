package com.springrest.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            // Create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file & convert to Java POJO

            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println("First name = " + theStudent.getFirstName());
            Address tempAddress = theStudent.getAddress();
            System.out.println("Street = " + tempAddress.getStreet());

            // print first name and last name
        } catch(Exception exc) {
            exc.printStackTrace();
        }
    }
}
