package com.hespanhol.exercises;

import java.io.File;
import java.io.IOException;

public class Dumps12 {

	public static void main(String[] args) {
		try {
			createFile();
		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (IllegalArgumentException iae) {
			System.out.println(iae);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void createFile() throws IOException {
		File testF = new File("//writeableDir");
		File tempF = testF.createTempFile("te",null, testF);
		System.out.println("Temp filename: "+tempF.getPath());
		int myInt[] = new int[5];
		myInt[5] = 25;
	}

}
