package com.recap.constructor_statics;

class R{
	static int a = 10;
	static {
		System.out.println("in R's first static initializer a = " + a);
		a = 20;
	}
	static {
		System.out.println("in R's second static initializer a = " + a);
		a = 30;
	}
	
	int x = 15; // inst var with field init
	
	{
		// first inst init
		System.out.println("in first inst init x = " + x);
		x = 25;
	}
	
	public R() {
		System.out.println("in no-arg constructor of R x = " + x);
		x = 35;
	}
	
	public R(int a) {
		System.out.println("in param constr a = " + a);
		x = a;
	}
}


public class AllInititalizersTest02 {
	
	public static void main(String[] args) {
//		System.out.println("main()->R.a = " + R.a); // 30 - initialized to default value
		R obj = new R();
		System.out.println("main()->obj.x = " + obj.x); // 15
		System.out.println("main()-> created one object of R");
		R obj2 = new R(55);
		System.out.println("main()->obj2.x = " + obj2.x);
		
		/**
		 * in R's first static initializer a = 10
		 * in R's second static initializer a = 20
		 * in first inst init x = 15
		 * in no-arg constructor of R x = 25
		 * main()->obj.x = 35
		 * main()-> created one object of R
		 * in first inst init x = 15
		 * in param constr a = 55
		 * main()->obj2.x = 55
		 * 
		 * */
	}
}
