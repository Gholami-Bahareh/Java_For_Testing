package javaPackage;

public class Inheritance2 extends Inheritance1 {
	//Inheritance2 acquires properties of  Inheritance1
	//Inheritance2 : child class
	//Inheritance1 : Parent class
	
	int b =100;
 
	public static void main(String[] args) {
		
		Inheritance2 h = new Inheritance2();
		System.out.println(h.b);
		System.out.println(h.a);
		

	}

}
