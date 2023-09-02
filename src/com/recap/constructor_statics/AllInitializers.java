package com.recap.constructor_statics;


class T{
	static int b = 40; 			// static field initializer
	int a = 30; 				// instance field initializer
	static { b = 50; } 			// static initializer
	{ 							// instance initializer
		System.out.println("a = " + a); // 30
		a = 40; 
	} 
	public T(){ 				// constructor
		System.out.println("cons a = " + a); // 40 
		System.out.println("cons b = " + b); // 50
	}
}


public class AllInitializers {

	public static void main(String[] args) {
		
		// CASE 1
		
		/**
		 * -1. JVM loads T class, Class object of T class is created  
		 *  0. Memory allocated for static field
		 * 
		 * 1. static field initializer executed
		 * 2. static initializer executed 
		 * 
		 * */
//		System.out.println("T.b = " + T.b); // 50
		
		
		/**
		 * 0. instance variable created
		 * 1. instance field initializer executed
		 * 2. instance initializer executed
		 * 3. constructors executed
		 * 
		 * */
//		T t1 = new T();
//		System.out.println("ti.a = " + t1.a); // 40 
		
		// CASE 2
		
		T t2 = new T();
		System.out.println("t2.a = " + t2.a);
		
		
	}
}

/**
 * JVM encounters T.b
 * Class loader loads the class
 * Class object created
 * 
 * 1. static field initializers
 * 2. static initializers
 * 
 * Object created
 * 
 * 3. instance field inititalizers
 * 4. instance inititalizers
 * 5. constructors
 * 
 * Note* : the order of declaration matters when it comes to determining the initial value of a field.
 * 
 * */
