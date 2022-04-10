package JavaPractice;


import java.util.Scanner;
public class ScannerPractice {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
				// scanner is used to enter information using the consol keyboard 
		Scanner Han = new Scanner(System.in); 
			
			System.out.println("please enter your name:");
			String empName = Han.next();
			
			System.out.println("please enter your age:");
			int empAge = Han.nextInt();
			
			System.out.println("please enter your salary:");
			double empSalary = Han.nextDouble();
			
			System.out.println("please enter your bonus");
			double empBonus = Han.nextDouble();

			System.out.println("please enter your gender");
			String str=Han.next();
			char ch=str.charAt(0);  //kedro 
			
			double totalSalary = empSalary + empBonus;
			
			
			// To print out the result on the console we will use this commands
			
			System.out.println("Employee Name: " + empName);
			System.out.println("Employee Age: " + empAge);
			System.out.println("Employee Salary: " + empSalary);
			System.out.println("Employee Bonus: " + empBonus);
			System.out.println("Employee Total Salary: " + totalSalary);
			System.out.println("Employee Gender: " + ch);
		}
	}


