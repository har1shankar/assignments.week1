package week1.day2;

public class AssignmentWeek1PrimeNumber {

	public static void main(String[] args) {


		// Declare an int Input and assign a value 13

		int input = 13;
int reminder = 0;

		for (int i = 2; i <= input / 2; i++)		{

					// Divide the input with each for loop variable and check the remainder

					if (input%i == 0) {
		reminder = reminder + 1;
						
					}
					// break the iterator

		}
		// Check the flag (Provide a condition)

				if (reminder > 0) {
				System.out.println("Not a Prime Number");
				}
				else {
					System.out.println("Is a Prime Number");

				}

		// Print 'Not a Prime' when the condition doesn't match 

		
		

	}

}
