package com.springrest.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
    public static void main(String[] args) {
        try {
            // Create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON file & convert to Java POJO


            // print first name and last name
        } catch(Exception exc) {
            exc.printStackTrace();
        }
    }
}
