import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // create scannner
		
		System.out.println("Enter ctrl z to exit");
		System.out.println("Enter three 2D coordinates x1, y1, x2, y2, x3, y3: ");
		
		while (input.hasNextDouble()){
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		double x2 = input.nextDouble();
		double y2 = input.nextDouble(); 
		double x3 = input.nextDouble();
		double y3 = input.nextDouble(); 
		
		//Calculate length of sides
		double sideOne = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double sideTwo = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double sideThree = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		
		//Determine real or fake triangle
		if (sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne 
			&& sideThree + sideOne > sideTwo){
			System.out.println("Real triangle");
		}
		else{ 
			System.out.println("Fake triangle");	
		}
		System.out.println("Enter three 2D coordinates x1, y1, x2, y2, x3, y3: ");
		}
	}

}

