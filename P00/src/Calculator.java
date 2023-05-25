
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a , int b) {
		return a - b;
	}
	public int multiple(int a , int b) {
		return a * b;
	}
	public int divide(int a , int b) {
		
		if(b == 0) {
			System.out.println("DENOMINATOR CANNOT BE 0!");
			b = 1;
		}
		else {
			return a/b;
		}
		return a/b;


	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}

}
