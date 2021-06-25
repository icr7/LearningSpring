package com.icr7.Rest.JasonBinding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {
	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read json file and map/convert to java POJO: data/sample-lite.json
               Student ishwar =
            		   mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			// print first name and last name
               System.out.println("First name = "+ ishwar.getFirstName());
               System.out.println("Last name = "+ ishwar.getLastName());
               
		} catch (Exception exe) {
			exe.printStackTrace();
		}

		
	}
}
