package javaPackage;

public class MethodOverriding2 extends MethodOverloading1 {
	public void eat() {
		System.out.println("Eating again!");
	}

	public static void main(String[] args) {
		
		MethodOverriding1 m1 = new MethodOverriding1();
		m1.eat();
		
		MethodOverriding2 m2 = new MethodOverriding2();
		m2.eat();
		
	}

}
