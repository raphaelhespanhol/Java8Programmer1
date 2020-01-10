package com.hespanhol.exercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Dumps04 {

	public static void main(String[] args) {
		List<String> hex = Arrays.asList("3", "3A", "AB", "FF", "4F");
		Collections.sort(hex);         // 3    3A    4F    AB    FF
		int x = Collections.binarySearch(hex, "4A");   // 
		int y = Collections.binarySearch(hex, "3A");  // INDICE 1
		int z = Collections.binarySearch(hex, "1F");  // INDICE -1
		System.out.println(x + " " + y + " " + z);
	}

}
