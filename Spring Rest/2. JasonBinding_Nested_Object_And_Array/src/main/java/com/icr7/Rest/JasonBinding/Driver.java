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
            		   mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print first name and last name
               System.out.println("First name = "+ ishwar.getFirstName());
               System.out.println("Last name = "+ ishwar.getLastName());
            
            //print out address 
                 Address tempAddress=ishwar.getAddress();
                 
                 System.out.println("house no.: "+tempAddress.getHouseNum());
                 System.out.println("colony name: "+tempAddress.getColony());
                 System.out.println("town name:"+tempAddress.getArea());
                 System.out.println("city: "+tempAddress.getCity());
                 System.out.println("state: "+tempAddress.getState());
                 System.out.println("PIN: "+tempAddress.getPincode());
              //print out languages
                 System.out.print("Skills : ");
                 for(String tempLang :ishwar.getLanguages())
                 {
                	 System.out.print(tempLang+", ");
                 }
               
		} catch (Exception exe) {
			exe.printStackTrace();
		}

		
	}
}
