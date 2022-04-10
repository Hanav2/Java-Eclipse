package Day8.Polymorphism;

public class StaticVariable_Methods { 
	// Notes
	/* If a variable is static, we don't need to create an object to call it 
	 * If a method is static it can be accessed with out creating an object
	 * static is global for all the objects
	 * Static is only for variable and methods
	 * static method can only call other static methods
	 */
	
	
	int age;
	int salary;
	
	public static double CalculateArea(int width,int height) {
		return width* height;
		
	}
	
	public void printAge(int age) {
		System.out.println(age);
	}
//Another example
	public static int addBonus(int salary) {
		salary= salary+1000;
		return salary;
	}
	public static void printsalary(int salary) {
		int salarysum= addBonus(salary);
		System.out.println(salarysum);
	}

	public static void main(String[] args) {// the main method is static because we don't need to create an object and call the again and again
		// TODO Auto-generated method stub

	
			double area = CalculateArea(12,13);
			System.out.println(area);
			
			//since this one is a static variable ass well we don't need to create an object
			addBonus(1000);
			printsalary(1000);
		
			//we can also call it: StaticVariable_Methods.addBonus=1000; StaticVariable_Methods.printsalary=1000;
			//Static is very easy 
		
	}

}
