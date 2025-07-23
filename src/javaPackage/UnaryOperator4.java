package javaPackage;

public class UnaryOperator4 {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		
		//++ increment by 1
		//-- decrement by 1
		System.out.println(a++); //1,2
		System.out.println(a++); // 2,3
		
		//a=3 , b=5
		
		System.out.println(++a + a++); //4 , 4 + 4,5 ...(4+4)=8
		System.out.println(b-- + --b); //5,4 + 3,3 ... (5+3)= 8

	}

}
