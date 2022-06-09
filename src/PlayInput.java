import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayInput {
	
	//main
	public static void main(String[] args) {
		// Scanner class return the input method in the 
		//
		Scanner scanner = new Scanner(System.in);// help to take input from the user
		
		System.out.println("Enter the n:");
		
		// scanner.nextInt(); is thrown an exception to the caller function/class if we input
		// some string then it throw an exception 
		// and for that we need to handle this with some display massage to the user
		//so we use try-catch 
		try {
			//variable are block scoping so we need to remember that one also
			//we only put those statements which may arise exception and the next related 
			// statements not whole statement inside the try block
			int n = scanner.nextInt();//nextInt hold the screen for taking input from the user
			System.out.println( n%2 == 0 ? "It is  even": "it is odd");
		
		}catch(InputMismatchException e) {
			System.out.println("Please enter only integer value");
		}
		
//		System.out.println( n%2 == 0 ? "It is  even": "it is odd");
		
	}

}
