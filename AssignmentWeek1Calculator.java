package week1.day2;

public class AssignmentWeek1Calculator {
	
	
	public int addNumber(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
		return a+b+c+d;
		
	}
	
	public int subtractNumber(int a, int b, int c, int d) {
		System.out.println(a-b-c-d);
		return a-b-c-d;
	}
	
	public int muliplyNumber(int a, int b, int c, int d) {
		System.out.println(a*b*c*d);
		return a*b*c*d;
	}
	
	public int divNumber(int a, int b, int c, int d) {
		System.out.println(a/b/c/d);
		return a/b/c/d;
	}

	public static void main(String[] args) {
		
		
		AssignmentWeek1Calculator obj = new AssignmentWeek1Calculator();
		
		obj.addNumber(10,12,14,20);
		obj.subtractNumber(25, 5, 2, 3);
		obj.muliplyNumber(2, 2, 2, 2);
		obj.divNumber(10, 2, 1, 1);
		
	}

}
