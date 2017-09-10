/* I read about labels from here.
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
 */

public class four {
    public static void main(String[] args) {
    	
    	//create 2D array
        int[][] arrayOfInts = { 
            { 40, 50, 10, 589 },
            { 125, 107, 1000, 88 },
            { 62, 27, 7, 95 }
        };
        int searchfor = 10;

        int i;
        int j = 0;
        boolean found = false;
    
    // label for nested loop
    search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    found = true;
                    break search; //break out of nested loop
                }
            }
        }

        if (found) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}

