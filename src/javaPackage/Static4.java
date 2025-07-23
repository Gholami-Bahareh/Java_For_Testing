package javaPackage; //recipe .. just reusing stuff from Static3

public class Static4 {

	public static void main(String[] args) {
	
		//here we are passing the data with using the constructor 
		//we called constructor 3 times 
		//chatGPT : ساختن شیء از کلاس استتیک3 
		Static3 s3 = new Static3(1,"John");
		Static3 s4 = new Static3(2,"Laxmi");
		Static3 s5 = new Static3(3,"Anay");
		
		s3.getResult();  // getResult() فراخوانی متد 
		s4.getResult();
		s5.getResult();

	}

}
