package com.hespanhol.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dumps01 {

	public static void main(String[] args) {
		try {
			//q1();
			//Q2 q = new Q2(); 
			//q4();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void q1() {
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date); // An exception is thrown at runtime.
	}
	
	static void q4() throws Exception{
		throw new Exception();
	}
	
	static void q5() {
//		Compilation fails
//		while(int ii=0;ii<2) {
//			ii++;
//			System.out.println("ii = " + ii);
//		}
	}
}

class Q3 {
	public int findMid(int n1, int n2) {
		return (n1+n2)/2;
	}
}

class Q2 extends Q3 {
	Q2() {
		int n1 = 22, n2 = 2;
		int n3 = super.findMid(n1, n2);
		System.out.println(n3); //12
	}
}