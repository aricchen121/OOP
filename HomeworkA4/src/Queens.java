
public class Queens{
	int [] x;
	
	
	public Queens(int n){
		x = new int[n];
	}
	
	/*
	 * Returns true if queen can be placed in row r and column c.
	 * The first (r-1) values are set for array x. 
	 * Check ascending and descending diagonal for queen. 
	 */
	public boolean checkQueen(int r, int c){
		for (int i = 0; i < r; i++) {
			if(x[i] == c || (i-r) == (x[i] - c) || (i - r) == (c - x[i]))
			{
				return false;
			}
		}
		return true;
	}
	
	/* print out chessboard
	 * rows are numbered from bottom to top and columns are numbered left to right
	 */
	public void printQueens(int[] x) {
		int n = x.length;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				if (x[i] == j) {
					System.out.print("Q ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/*
	 * Use backtracking to find placement of n queens on n x n chessboard. 
	 */
	public void placeNqueens(int r, int n) {
		for(int c = 0; c < n; c++) {
			if(checkQueen(r,c)) {
				x[r] = c;
				if (r == n-1) {
					printQueens(x);
				}
				else{
					placeNqueens(r+1, n);
				}
			}
		}
	}
	
	//use to call non static variables
	public void callplaceNqueens() {
		placeNqueens(0, x.length);
	}
	
	public static void main(String args[]) {
		Queens Q = new Queens(4);
		Q.callplaceNqueens();
		System.out.println("2 solutions");
	}
}
