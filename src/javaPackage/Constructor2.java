package javaPackage;

public class Constructor2 {
	//default constructor
		Constructor2(){
			System.out.println("Hello default Constructor");
		}
		String name;
		String college;
		
	//parameterized constructor	
		Constructor2(String b , String c){
			name = b;
			college = c;
			System.out.println(name+ "   " +college );
		}
		
		
	public static void main(String[] args) {
		Constructor2 c2 = new Constructor2("bahar","GU"); 
		Constructor2 c3 = new Constructor2();
	}
}
