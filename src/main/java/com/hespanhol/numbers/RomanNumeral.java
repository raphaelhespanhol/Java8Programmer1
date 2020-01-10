package com.hespanhol.numbers;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RaphaelHespanhol
 * @LinkeIn https://www.linkedin.com/in/raphael-hespanhol-58a8691a/
 */
public class RomanNumeral {

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1));
			} else {
				result += map.get(s.charAt(i));
			}
		}
		return result;
	}
	
}
