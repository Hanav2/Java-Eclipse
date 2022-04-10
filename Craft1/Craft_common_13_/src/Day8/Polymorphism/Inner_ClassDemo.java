package Day8.Polymorphism;

//Notes
	/*inner class is a nested class ( a class within the a class) 
	 * it help to group classes that belong together
	 * it makes our code more readable and maintainable
	 * create an object of the outer class and then create an object of the inner class. 
	 */
class outerclass{
	int age=26;
	
	class Innerclass{
		int ssn=777;
	}
}
	
	
		
		class superuser{
			int ssn=555;
		}
	
//}
		public class Inner_ClassDemo {
	
	public static void main(String[] args) {
		
		
		outerclass o = new outerclass();
		outerclass.Innerclass I = o.new Innerclass();
		System.out.println(I.ssn);
	}

}
//}