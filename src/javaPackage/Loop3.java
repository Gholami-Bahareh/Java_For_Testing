package javaPackage;

public class Loop3 {

	public static void main(String[] args) {
		
		int i = 10;
		
		//print the numbers from 10 to 17 using while loop    for (int b=10; b<18 ; ++b ) {
		//while(condition) {                                      System.out.println(b);
		//executable code                                          }
		//}
			
		while(i<18) {
			System.out.println(i);
			i++;//if we forget the incr/decr, loop will go to infinite loop!!
			}
	}
}
