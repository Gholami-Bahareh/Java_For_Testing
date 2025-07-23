package javaPackage;

public class Static2 {
	int roll; //declaring global variable
	String name; //Declaring a global variable
	String college = "IIT Delhi"; //Defining a global variable

	public static void main(String[] args) {
		
		Static2 s2 = new Static2();
		System.out.println(s2.roll); //0  defaul value of int datat type is Zero 
		System.out.println(s2.name); //null   defaul value of String datat type is Null
		System.out.println(s2.college); 

	}

}
