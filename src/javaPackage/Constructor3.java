package javaPackage;

public class Constructor3 {
	 Constructor3() {
		System.out.println("No argument");
	}
	 Constructor3(int a) {
			System.out.println("int argument constructore");
		}
	 Constructor3(String b) {
			System.out.println("Stirng argument constructore");
		}
	

	public static void main(String[] args) {
		
		Constructor3 s3 = new Constructor3();
		Constructor3 s4 = new Constructor3("India");
		Constructor3 s5 = new Constructor3(10);	
		}
}
