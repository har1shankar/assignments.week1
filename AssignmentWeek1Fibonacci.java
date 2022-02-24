package week1.day2;

public class AssignmentWeek1Fibonacci {

public static void main(String[] args) {
	
	int firstNum = 0;
	int secNum = 1;
	System.out.println(firstNum);
	System.out.println(secNum);
	int range = 6;
	
	for (int i = 1; i <= range; i++) {
		
		
		int sum = firstNum + secNum;
		
		System.out.println(sum);
		
		firstNum = secNum;
		secNum = sum;
		
		
	}
			
	
	
}
	
	
	
}


