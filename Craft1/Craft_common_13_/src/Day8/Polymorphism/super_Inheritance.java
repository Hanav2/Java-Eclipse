package Day8.Polymorphism;

public class super_Inheritance extends Inheritance2 {
	
	// This is hirarchial inheritance because this class inherit what is in Inheritance class as well as in Inheritance 2 class.
	
	//If we want to use supper with constructor
	
	// They have hirarchial relation ship with the grand parent class(Inheritance class)
		
	//Super:- is used if there is two similar variables int age both in parent class and child class and if we want to print the parent class age variable inside the child class we use super

	//public void printAge(){ system.out.println(super.age)} but if we don't use supper it will use the child class age.  if we don't use super it will prioritize the child class variable

	// super is used to refer immediate parent class instance variable, method, and constructor
	
	public super_Inheritance(int age, String name, double salary) { // this is to try out constructor using supper
		super(age, name, salary);
		// TODO Auto-generated constructor stub
	}

	public String gender;
	public int age=25; 
	public String name;
	
	public void printName() {
		//super.printAge(age);
		System.out.println(super.age);  //super variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		super_Inheritance s = new super_Inheritance(12,"hana",280000); // we were trying the super constructor
		//s.age= 25;
		s.name= "Hana";
		s.salary= 200000;
		s.ssn=689;
		s.gender= "Female";
		s.printName(); // for it to print the parent variable we have to add super and make sure the variable is declared out side of the main method
	
	}

}
