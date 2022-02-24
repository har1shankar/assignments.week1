package week1.day2;

public class AssignmentWeek1sum {

	public static void main(String[] args) {
		
		int input = 7891;
		int sum = 0;
		
		
		while (input > 0) {
			
			int a = input % 10;
			sum =  sum + a;
			
			input = input / 10;
			
		}
		System.out.println(sum);
	}

}
