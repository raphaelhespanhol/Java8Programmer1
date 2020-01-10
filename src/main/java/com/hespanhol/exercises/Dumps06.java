package com.hespanhol.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Dumps06 {

	private int num;
	private String alphabet;
	private boolean status;
	
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAlphabet() {
		return alphabet;
	}

	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
