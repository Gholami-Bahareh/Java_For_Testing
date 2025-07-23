package javaPackage;

public class Inheritance5 extends Inheritance4 {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 50;
		
		//for calling non static method, object is needed
		Inheritance5 i5 = new Inheritance5();
		
		//***calling "non-static" method***
		i5.addition(x, y);
		i5.substraction(x, y);
		i5.multiplication(x, y);
		i5.devision(x, y);
		
	}

}
