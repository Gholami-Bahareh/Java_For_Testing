package javaPackage;

public class Variable5 {

	public static void main(String[] args) {
		//store value 5 to 9
		int b [] = {5,6,7,8,9}; //integer type array
		System.out.println(b[0]);
		System.out.println(b[3]);
		
		String c [] = {"Hello", "Java" , "Selenium", "QA"}; //String type array
		System.out.println(c[1]);
		System.out.println(c[3]);
		
		//Object Type array can store all types of **primitive** data types 
		Object s [] = {1,2,3,"Anay", "India", 'c', 'q', 3>20};
		System.out.println(s[2]); //3
		System.out.println(s[4]); //India
		System.out.println(s[5]); //c
		System.out.println(s[7]); // false
		
		method2();
		method1(); //calling a user defined method
		


	}
	//user defined method
	public static void method1() {
		int a = 100; //local variable
		System.out.println(a);
	}
	
	public static void method2() {
		int b = 200;
		System.out.println(b);
	}
	

}
