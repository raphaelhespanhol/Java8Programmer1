package com.hespanhol.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dumps07 {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);
		
		Dumps07 dump = new Dumps07();
		dump.moreA(1,2,3,4);
		
		dump.moreB("Example02", 1,2,3,4,5);
		
		dump.moreG(new String[]{"A","B","C"},new int[] {1,2,3,4});
	}
	
	public void moreA(int... a) {
		System.out.println("moreA: "+Arrays.toString(a));
	}
	
	public void moreB(String value, Integer... nums) {
		System.out.println("moreB: " + value + " "+Arrays.deepToString(nums));
	}
	
	public void moreG(String[] values, int[] nums) { 
		System.out.println("moreG: "+Arrays.deepToString(values)+Arrays.toString(nums));
	}
}
