package com.turing.jdev.finalstatickeywords.test;

import com.turing.jdev.finalstatickeywords.StaticBlockInitializer;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main method called");
		StaticBlockInitializer sbiTest = new StaticBlockInitializer();
		sbiTest.someMethod();
		System.out.println("Owner owner is " + sbiTest.owner);
		
		// Sample to show that static block initializers and statoc blocks execute before
		// the constructor. Actually before any non-static method. We can have as much static
		// blocks as we want.
		
	}

}
