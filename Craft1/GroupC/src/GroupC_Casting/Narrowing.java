package GroupC_Casting;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double d = 200.78547;
		float f = (float)d;
		long l = (long)f; //Explicit type casting
		int i = (int)l; // Explicit type casting
		
		System.out.println("double: " + d);
		System.out.println("float " + f);
		System.out.println("long: " + l);
		System.out.println("int: " + i);
		
		

	}

}