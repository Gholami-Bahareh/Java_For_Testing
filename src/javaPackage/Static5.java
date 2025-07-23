package javaPackage;

public class Static5 {
	static int z =5;
	int y = 1;
	
	//user defined static method
	public static void a() {
		z= 10 ; //overriding or modifying the value of z
	System.out.println(z);
	}
	
	//user defined non static method
	public  void b() {
		z= 15 ; //overriding or modifying the value of z
	System.out.println(z);
	}

	public static void main(String[] args) {
		a();
		Static5 s5 = new Static5(); //error without this line: ((cant make a static reference to a non-static method b() from the typeStatic5))
		s5.b();

	}

}
