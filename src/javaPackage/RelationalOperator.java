package javaPackage;
public class RelationalOperator {
	public static void main(String[] args) {
		int a = 300;
		int b = 300;
		
		if  (a!=b){
			System.out.println("a is not equal to b");
		}
		else {
			System.out.println("a is equal to b");
		}
		
		String p = "HELLO";
		String q = "hello";
		// == is used for comparing integers ... not String // == is not RECommended for String
		if (p == q) {
		System.out.println("p and q are same");
	}
		else {
			System.out.println("p and q are not same");
		}
		//comparison of String in correct way:
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p and q are kina same");
		}
		else {
			System.out.println("p and q are not kinda same");
		}
	}
}