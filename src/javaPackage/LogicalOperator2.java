package javaPackage;

public class LogicalOperator2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		//logical operator
		System.out.println(a<b  &&  ++a<c); //false
		System.out.println(a); //since on above , first condition is false, second will not check, so a is not incremented so it is still 10 ..and not 11
		
		//Bitwise Operator
		System.out.println(a<b  &  ++a<c); //false
		System.out.println(a); // but Bitwise check both condition ..> so a is incremented
		
		System.out.println(a<c  &  a<c);
		System.out.println(b<a  &&  b<c);

	}

}
