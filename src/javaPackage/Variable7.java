package javaPackage;

public class Variable7 {

	int a =10; // global variable
	static int b = 20; //static
			
	public static void main(String[] args) {
		
		Variable7 z = new Variable7();
		
		int c = 30; //local
		System.out.println(c); //30
		System.out.println(b); //20
		System.out.println(z.a); 
	

	}

}

