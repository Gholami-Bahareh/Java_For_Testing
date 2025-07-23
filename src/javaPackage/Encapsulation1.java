package javaPackage;

public class Encapsulation1 {
	String name ;
	int b = 10;
	final int c = 2;
	
	//user defined method
	public void a() {
		b=15;
		//c = 20;  //we can not change the value of Final Variable
	}	
	
	final void d() {
		System.out.println("Hello final method!");
	}
		
	}
	