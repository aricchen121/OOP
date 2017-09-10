import java.util.Stack;
import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in); //create scanner
        String inputString = in.nextLine();
        Stack stack = new Stack(); //create stack 
        
        // push into stack
        for (int i = 0; i < inputString.length(); i++) {
        	stack.push(inputString.charAt(i));
        }
        
        String reverseString = "";

        while (!stack.isEmpty()) {
        	reverseString = reverseString + stack.pop();
        }
        
        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
	}

}
