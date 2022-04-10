package variables;



public class calc {  //we are doing arthimetic operation


	public double division(double a, double b) {
		return a/b;
	}
	

	
public int multiplication(int a, int b) {
	return a*b;
	
}

public double addition(double a, double b) {
	return a+b;
}
	
public int subtraction(int a, int b) {
	return a-b;
}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	 calc c= new  calc();
	
	System.out.println(c.division(33,10));
	System.out.println(c.multiplication(12, 10));
	System.out.println(c.addition(15,15));
	System.out.println(c.subtraction(15, 2));

}
}