package javaPackage;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		double b = 5.99;  //local variable 
		
		//double to int
		int a = (int) b; //we did it manually
		
		System.out.println(a);
		System.out.println(b);
		
		//String to int
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//int to String
		int x = 20;
		String y = String.valueOf(x);
		System.out.println(y);
		
	}
}
