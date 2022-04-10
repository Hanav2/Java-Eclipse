package Day8.Polymorphism;

public class Inheritance { 
	// Notes
	/*It is used for the reusability of the fields and methods of the existing class
	 * Subclass/ child class:- is the class that inherit the other class.
	 * Super class/ Parent class:- is the class where the subclass inherits the features. It is also called base class or a parent class.
	 */

	int age=26;
	String name;
	double salary;
	
	public void printname(String name) {
		System.out.println("your name is: " + name);
	}
	
	public void printAge(int age) {
		System.out.println("your age is: " + age);
	}
	
	public void printsalary(double salary) {
		System.out.println("your salary is: " + salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Inheritance(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

}
