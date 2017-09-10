import java.util.Scanner;
/*
 * I have learned how to use nested loops to print the pyramid of numbers from:
 * http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
 */
public class One {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in); //create new scanner
        
        System.out.println("How many rows you want in your pyramid?");
        int numRows = input.nextInt();
 
        int rowCount = 1;
        System.out.println("Pyramid");
 
        //Create pyramid 
        for (int i = numRows; i > 0; i--) {
        	
        	//Print i * 2 spaces beginning of each row
        	for (int j = 1; j<= i*2; j++) {
        		System.out.print(" ");
        	}
        	
        	//Print j from 1 to rowCount
        	for (int j = 1; j<=rowCount; j++) {
        		System.out.print(j+" ");
        	}
        	
        	//Print j from rowCount-1 to 1
        	for (int j = rowCount -1; j >= 1; j--) {
        		System.out.print(j+" ");
        	}
        
            System.out.println();
 
            rowCount++;
        }
    }
}

