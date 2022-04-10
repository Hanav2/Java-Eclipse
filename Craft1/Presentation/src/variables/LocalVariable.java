package variables;

public class LocalVariable {

	public void methodone() {
		int H = 26;
		System.out.println("Value of H: " + H);
	}
	
	public void methodtwo() {
		int L = 30;
		System.out.println("Value of L: " + L);
	}
	public void methodthree() {
		int K = 40;
		System.out.println("Value of K: " + K);	
	}
	
	public static void main(String[] args) {
		
		LocalVariable anyname = new LocalVariable();
		anyname.methodone();
		anyname.methodtwo();
		anyname.methodthree();
		
	} 

}
