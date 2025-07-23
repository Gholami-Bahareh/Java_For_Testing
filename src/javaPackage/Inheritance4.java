package javaPackage;

public class Inheritance4 { 

	int z; //declaring global variable
	
	//defining non static methods:
	
	public void addition(int x , int y) {
//		z= x + y;
		System.out.println(x + y);
	}
	
	public void substraction(int x , int y) {
		z= x - y;
		System.out.println(z);
	}
	
	public void multiplication(int x , int y) {
//		z= x * y;
		System.out.println(x * y);
	}
	
	public void devision(int x , int y) {
		z= x / y;
		System.out.println(z);
	}

}
