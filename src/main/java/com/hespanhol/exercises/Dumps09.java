package com.hespanhol.exercises;

class Rope {
	public static int LENGTH;
	static {
		int LENGHT = 5;
		System.out.println("Static local - "+Rope.LENGTH);
	}
	static {
		Rope.LENGTH = 10;
		System.out.println("Static global - "+Rope.LENGTH);
	}
	{
		Rope.LENGTH = 15;
		System.out.println("Instance global 1 - "+Rope.LENGTH);
	}
	public Rope() {
		Rope.LENGTH = 25;
		System.out.println("Instance constructor - "+Rope.LENGTH);
	}
	{
		Rope.LENGTH = 20;
		System.out.println("Instance global 2 - "+Rope.LENGTH);
	}
}