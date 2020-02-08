package com.hespanhol.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Dumps10 {

	public static void main(String[] args) {
		String[] days = {"monday", "saturday","tuesday","sunday","friday"};
		
		// Convert the days array into an ArrayList
		ArrayList<String> dayList = new ArrayList(Arrays.asList(days));

		// Loop through the ArrayList, printing out "sunday" elements in
		// upper case (use to UpperCase() method of String class)
		// Print all other days in lower case
		// Print out the ArrayList
//		for (String s : dayList) {
//			if(s.equals("sunday"))
//				System.out.println(s.toUpperCase());
//			else
//				System.out.println(s.toLowerCase());
//		}
		
		// Lambda expression
		//long version
		dayList.replaceAll((String s) -> { return s.toUpperCase();} );
		
		// short version
		dayList.replaceAll(s -> s.toUpperCase());
		
		
		dayList.forEach(s -> System.out.println(s));
	}

}
