import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 	// Create a new Scanner
		
		while (input.hasNextDouble()){
			double x = input.nextDouble();
			System.out.println(x);
		}
	}
}
		
