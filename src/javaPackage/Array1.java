package javaPackage;
public class Array1 {

	public static void main(String[] args) {
		int b[] = {0,1,2,3,4,5};
		String s [] = {"Java","Selenium","Hello"};
		Object a []=	{1,2,3,"c", "1","oline" , 20>4};
		
	System.out.println(a.length);
	System.out.println(b.length);	
	System.out.println(s.length);	
	System.out.println(s[1]);
	
	s[1] = "Automation";  //modifying the value of s[1]
	System.out.println(s[1]); 
	
	
	for(String o : s) {
		System.out.println(o);}		
	}
	}
