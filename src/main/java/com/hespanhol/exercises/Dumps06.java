package com.hespanhol.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Dumps06 {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("fish");
		animals.add("rabbit");
		
		print(animals, a -> a.startsWith("ra"));
	}
	
	private static void print(List<String> animals, Predicate<String> checker) {
		for (String animal : animals) { 
			if (checker.test(animal))
				System.out.print(animal + " "); 
		}
		System.out.println(); 
	}
}
