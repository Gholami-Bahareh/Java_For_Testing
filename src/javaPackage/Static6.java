package javaPackage;

public class Static6 {
	String a;
	int b ;
	static int c = 4;
	
	public static void a() {
		System.out.println("Hello Static Method!");
	}

	public static void main(String[] args) {
		Static6 s6 = new Static6();
		
		c= 200;
		s6.a= "Selenium!";
		s6.b = 100;
		
		System.out.println(c + " " + s6.a + " " + s6.b);
		System.out.println(c++);
		System.out.println(c++);
		System.out.println(c++);
		System.out.println(c);
		
	}

}
