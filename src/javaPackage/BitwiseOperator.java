package javaPackage;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Bitwise Operator
		System.out.println(b<c & ++a<c); //true (first a is incremented and then will compare with c)
		System.out.println(a); //11 
		System.out.println(b>c & b>a); //false

	}

}
