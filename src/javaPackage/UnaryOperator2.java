package javaPackage;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(++a); //output = 11  ... stored in RAM = 11
		System.out.println(b++);// output = 10  ... stored in RAM = 11
		
		System.out.println(a++); // output = 11  ... stored in RAM = 12
		System.out.println(b++);// output = 11  ... stored in RAM = 12
		
		System.out.println(a); //  output = 12  ... stored in RAM = 12
		System.out.println(b); //  output = 12  ... stored in RAM = 12
	}

}
