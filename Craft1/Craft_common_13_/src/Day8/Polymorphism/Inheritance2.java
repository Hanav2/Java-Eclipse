package Day8.Polymorphism;

public class Inheritance2 extends Inheritance {
	// to inherit we use extends meaning child extends parent. one child can't extend more than once at the same time. but we can do it through hirarchial mechanism
	// a extends b; c extends a; meaning inother way c inherited from b and a;
	
	// Method overriding is when the child name have the same method name and parameter with the parent class.
	
	public Inheritance2 (int age, String name, double salary) {
		super(age, name, salary);
	}
	public int ssn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance2 I = new Inheritance2(26,"Hana",200000);
		I.age=27;
		I.name= "Hana";
		I.salary= 170000;
		I.ssn=689;
		System.out.println(I.age);
		System.out.println(I.name);
		System.out.println(I.salary);
		System.out.println(I.ssn);
	
	}

	
}

                     // Keywords
// Final:- is used for something to make constant. if we use it for variable we can't change the value. if we use it for method and class we can't inherit it'


//Super:- is used if there is two similar variables int age both in parent class and child class and if we want to print the parent class age variable inside the child class we use super


//public void printAge(){ system.out.println(super.age)} but if we don't use supper it will use the child class age.  if we don't use super it will prioritize the child class variable