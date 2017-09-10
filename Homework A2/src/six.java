import java.util.Scanner;

public class six {
public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in); //create new scanner
        in.useDelimiter("");
        System.out.println("Enter string: ");
        while (in.hasNext()){
			System.out.println(in.next());
		}
	}
}
