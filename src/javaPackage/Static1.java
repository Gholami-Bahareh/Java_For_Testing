package javaPackage;

public class Static1 {

	String s = "Hello"; //global variable
	static int y = 50; //static variable   **This static variable is a part of static members.
	
	//user defined  *static* method        **This static method is a part of static members. 
	public static void method1() {
		String x = "Selenium"; //local variable 
	}
	
	//user defined non static method   
	public void method2( ) {
		int a = 45;  //local variable
	}
	

}
