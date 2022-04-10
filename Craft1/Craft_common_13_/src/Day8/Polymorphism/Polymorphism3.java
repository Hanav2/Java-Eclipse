package Day8.Polymorphism;

public class Polymorphism3 {
	
	int age;
	double salary;
	double height;
	
	public Polymorphism3(int a, double s, double h) {
		this.age= a;
		this.salary=s;
		this.height=h;
			
	}
	// If we want to create another one with different parameter

	public Polymorphism3() { // we can the parameters with the value we can create an empty constructor object in the main method
		
		this.age =12;
		this.height=44;
		this.salary = 22;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism3 ph = new Polymorphism3();  // so if I don't give it any parameter it will print the second method
		System.out.println(ph.age);					// If we put the variables inside the parameter it will print the first method
		System.out.println(ph.height);
		System.out.println(ph.salary);
	}

}
