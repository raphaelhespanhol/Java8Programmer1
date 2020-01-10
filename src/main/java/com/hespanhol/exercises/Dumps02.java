package com.hespanhol.exercises;

public class Dumps02 {
	public static void main(String[] args) {
		//_Assessment.q1();
		//_Assessment.q2();
		//_Assessment.q11();
		_Assessment.q12();
	}

}

class _Assessment {
	private String color;
	public _Assessment() {
		this("white");
	}
	public _Assessment(String color) {
		color = color;
	}
	
	private static int $;
	public static void q1() {
		String a_b = null;
		System.out.print($);
		System.out.print(a_b);
	}
	
	public static void q2() {
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}
	
	public static void q11() {
		int x=5,j=0;
		OUTER: for(int i=0; i<3; )
			INNER: do {
				i++; x++;
				if(x > 10) break INNER;
				x += 4;
				j++;
			} while(j <= 2);
		System.out.println(x);
	}
	
	public static void q12() {
		_Assessment ass = new _Assessment();
		System.out.println("Color:" + ass.color);
	}
		
}