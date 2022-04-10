package Day8.Polymorphism;
//method overloading we can also use it for constructor.
public class Polymorphism2 {
	
	
	// THE NORMAL WAY
	public double calculateArea(int length, int width) {
		return (length*width);
	}
	public double calculateArea(int radius) {
		return(3.14*radius*radius);
	}
	
	// WITH CONSTRUCTOR
	int age;
	double salary;
	int ssn;
				//when we create constructor the method name has to be the same as the class name
		public Polymorphism2(int age, double salary, int ssn) {
			this.age= age;
			this.salary= salary;   // this is representing and clarifying the represented variables
			this.ssn=ssn;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism2 calc = new Polymorphism2(26,26,27);
		double area = calc.calculateArea(99);
		System.out.println(area);
		
		
		// for constructor after we create an object we have to call each variables inside the print statement.
		Polymorphism2 con = new Polymorphism2(12,15,16);
		System.out.println(con.age);
		System.out.println(con.salary);
		System.out.println(con.ssn);
	}

}
