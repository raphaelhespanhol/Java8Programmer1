package com.hespanhol.exercises;

import java.io.BufferedReader;
import java.io.FileReader;

public class Dumps05 {

	public static void main(String[] args) throws Throwable {

		FileReader fr = new FileReader("TextReaderExample.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println("Read: ".concat(line));
		}
	}
}
