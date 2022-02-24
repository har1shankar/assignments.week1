package week1.day2;

import java.util.Arrays;

public class AssignmentWeek1MissingElement {

	public static void main(String[] args) {
		
		int[] value = {1,2,3,4,7,6,8};
		
		Arrays.sort(value);
		
		
		
		for ( int i = value[0]; i <= value.length; i++) {
			
			int j = i+1;
			
			if (value[i] != j) {
				
				System.out.println("Missing Number "+j);
				break;
				
			}
		}

	}

}
