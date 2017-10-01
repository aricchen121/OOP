/*
 * I learn about monte carlo simulation from here:
 * https://www.youtube.com/watch?v=cKPVnIi9rpU
 */
public class Monte {
	public static void main (String [] args) {
		int i;
		int point = 0; // counter of points generated
		int success = 0; // counter keep track of points inside circle
		
		double x, y;
		
		// generate 4 billion points 
		for(i = 0; i <400000000; i++) {
			x = Math.random();
			y = Math.random();
			
			point++;
			
			// points fall within the circle
			if (x*x + y*y <=1)
				success++;
		}
		
		System.out.println("Ratio of points inside circle: " + (double)success/(double)point);
		System.out.println("Ratio of points outside of circle: " + (1 - ((double)success/(double)point)));
		System.out.println("Pi = " + ((double)success/(double)point) * 4);
	}
}
