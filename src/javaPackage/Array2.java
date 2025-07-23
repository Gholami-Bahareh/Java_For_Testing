package javaPackage;
public class Array2 {
	public static void main(String[] args) {
				//Defining multi-dimentional array
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);
		
		//total number of rows / column
		int rows = a.length;
		System.out.println("total number of rows:" + rows );
		
		int columns = a[0].length; ///یعنی تعداد ستون‌ها در سطر اول.
		System.out.println("total number of columns:" + columns );
	}
}
