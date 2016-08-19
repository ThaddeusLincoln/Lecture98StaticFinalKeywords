package com.turing.jdev.finalstatickeywords;

public class StaticBlockInitializer {
	
	public static final String owner;
	
	static{
		owner = "tim";
		System.out.println("SIBTest static initialization block called");
	}
	
	public StaticBlockInitializer(){
		System.out.println("SIB Consctructor");
	}
	
	static{
		System.out.println("2nd initialization block called");
	}
	
	public void someMethod(){
		System.out.println("someMethod called");
	}
}
