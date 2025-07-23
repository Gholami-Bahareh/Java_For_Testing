package javaPackage;

public class UnaryOperator3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a++ + ++a); // output 10* , RAM 11 + Output 12*, RAM 12 (10+12)
		System.out.println(++b + ++b); // output 11* , RAM 11 + Output 12*, RAM 12 (11+12)
		
		System.out.println(b++ + b--); // output 12* , RAM 13 + Output 13*, RAM 12 (12+13)
		System.out.println(a); // 12
		System.out.println(b); // 12
	
	}

}
