package javaPackage; // ingredients

public class Static3 {  // no main method here! since we are not going to execute this 
	int roll; //Declaring a global variable  
	String name; //Declaring a global variable	
	String college = "IIT Delhi"; //Defining a global variable
	
	//constructor  ... for doing something several times
	Static3(int r, String n) {     //First two variable:no value ... so  a Constructor is created and two parameters are passed
			roll = r;
			name = n;
	}
			
	// user defined non static method
	public void getResult() {      // on the Statc4 this method is called
	System.out.println(roll + " "+ name+" " + college);
	}	

}
