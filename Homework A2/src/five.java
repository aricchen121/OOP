import java.util.Scanner;

public class five {
		public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in); //create new scanner
        in.useDelimiter(",");
        System.out.println("Enter string seperated by commas: ");
        while (in.hasNext()){
			System.out.println(in.next());
		}
	}
}
