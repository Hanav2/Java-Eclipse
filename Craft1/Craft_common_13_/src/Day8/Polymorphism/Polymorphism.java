package Day8.Polymorphism;

public class Polymorphism { 
	
	// Polymorphism is a concept which we can perform a single action in different ways. 

	/* There are two types of polymorphism:- compile time(method overloading) and run time(method overriding)
	 * we can perform polymorphism in java by Method overloading  and Method overriding
	 * method overloading will help us to create multiple methods by one name with different parameter(in size and in Datatype)
	 * Method overloading increases the readability of the program. 
	 * There are two ways to overload the method in java
		//By changing number of arguments
		//By changing the data type

	*
	 */
	
	public void multiply (int a, int b) {
		System.out.println(a*b);
	}
	
	public void multiply(double a, int b ) {
		System.out.println(a*b);
	}
	public void multiply(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism phy = new Polymorphism();
		phy.multiply(15, 15);
		phy.multiply(18, 18);
		phy.multiply(15, 16, 23);
	}

}
