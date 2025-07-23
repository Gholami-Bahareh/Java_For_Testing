package javaPackage;

public class IFElese4 {

	public static void main(String[] args) {
		int age = 10;
		int weight = 55;
		
		//outer if
		if(age> 18) {
			if(weight >50) {
				System.out.println("eligible for wight");
			}
			else {
				System.out.println("not eligible for weight");
			}
			System.out.println("eligible for both");
		}
		else {
			System.out.println("not eligible for age");
		}
}
}