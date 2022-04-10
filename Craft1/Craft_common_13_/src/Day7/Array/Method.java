package Day7.Array;

public class Method {



//Method
/*It perform an action. 
*  when we create a method we use : public int (if we want it to give as integer) or double (for decimal) or void (if we don't have anything to be returned)
* AC modifier then Return type then name then (parameter){Method body}
* public double calculate(double num1){double sum = num1 +num2; return sum;} 
* then create an object and call it
*/

	
	
	
	public double calculate (double num1, double num2) { //if we use double and int for the return type we need a return statement.
		double sum = num1 + num2;
		return sum;
		
	}
	// also we can use method for Array
	public void printAge(int a [][]) {
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<5; j++) {
				
				System.out.print(a[i][j]+ "");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) { //(String[] args) this means string of arguments. It is an Array.
		// TODO Auto-generated method stub
		
		Method_Array M = new Method_Array();  //here we created an object and assign it as M then we assign S to represent the calculation and its data type
		double S = M.calculate(25.6, 35.7);
		System.out.println(S);
		
		
		Method_Array H =new Method_Array ();
		int age [][] = {{12, 45, 33, 90, 87},{12 , 45 , 33 , 90 , 87}};
		H.printAge(age);
		// or after we create an object we can use only the print statement.
		
//		System.out.println(M.calculate(25.6, 35.7));
		
		

	}

}
