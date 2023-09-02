package com.recap.constructor_statics;

public class FieldAndInstanceInitializer {
	// field init
	int x = 10;
	// instance init
	{
		int b = 20;
		x = 20;
		System.out.println(x);
	}
	public FieldAndInstanceInitializer() {
		System.out.println(x);
	}
	{
		x = 30;
		System.out.println(x);
	}
}
