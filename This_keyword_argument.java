/* Task:1. Write a Java Program  to pass  this keyword as argument in the constructor call.*/

package ANP_D0453.com;

class Abc {
	This_Key var;
	Abc ( This_Key var) {
		this.var=var;
	} 
	
	// Method to show
	
	void show()
	{
		System.out.println(" Count variable value : " + var.count );
	}
}

public class This_Key {
	int count =1;	//instance variable

	// Constructor that calls Abc Class constructor with 'this' keyword
	This_Key() {
		// Passing 'this' (the current object) to the constructor of Abc Class
		Abc  obj = new  Abc (this);
		obj.show(); // Call the show method of the Abc class
	}

	public static void main(String[] args) {
		// Creating an instance of ThisConstrusctorAgumentExample which will invoke the constructor
		This_Key example = new This_Key();
	}
}

/* Output

Count variable value : 1
*/