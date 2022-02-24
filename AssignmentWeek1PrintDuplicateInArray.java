package week1.day2;


public class AssignmentWeek1PrintDuplicateInArray {

	public static void main(String[] args) {
		
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length = a.length;
		
		int count;
	
		
		for (int i = 0; i < length-1; i++) {
			
			count = i+1;
							
		 for (int j = count+1 ; j < length; j++ ) 			{
			 
			 
		if (a[i] == a[j]) {
			 System.out.println("missing number "+a[j]);
		 }
		 
		count = count + 1;
		 }
	}
	}
}
