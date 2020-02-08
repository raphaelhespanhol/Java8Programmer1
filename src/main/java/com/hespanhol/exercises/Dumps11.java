package com.hespanhol.exercises;

public class Dumps11 {

	public static void main(String[] args) {
		Dumps11 theUtils = new Dumps11();
		theUtils.doThis();
		System.out.println("Back to main method");
	}
	
	public void doThis() {
		try {
			doThat();
		} catch(Exception e) {
			System.out.println("doThis - "
					+ " Exception caught: " + e.getMessage());
		}
	}
	
	public void doThat() throws Exception{
		System.out.println("doThat: Throwing exception");
		throw new Exception("Ouch!");
	}

}
