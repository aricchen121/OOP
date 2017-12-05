import java.util.concurrent.Semaphore;


//Declare arrays and threads 
public class Apple {
	public static void main (String[] args) {
		char[] arr1 = {'A', 'E', 'I', 'M', 'Q', 'U', 'Y'};
		char[] arr2 = {'B', 'F', 'J', 'N', 'R', 'V', 'Z'};
		char[] arr3 = {'C', 'G', 'K', 'O', 'S', 'W'};
		char[] arr4 = {'D', 'H', 'L', 'P', 'T', 'X'};
		
		Threadb t1 = new Threadb(arr1);
		Threadb t2 = new Threadb(arr2);
		Threadb t3 = new Threadb(arr3);
		Threadb t4 = new Threadb(arr4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

// Switch between the threads and print them out 
/* I learn about using switching threads using semaphore here:
https://stackoverflow.com/questions/9388838/writing-a-program-with-2-threads-which-prints-alternatively
I was unsucessful with getting them to print out in order, I tried using sleep to keep threads in order. 
*/
class Threadb extends Thread {
	char[] arr;
	static Semaphore a = new Semaphore(1);
	
	Threadb(char[] arr) {
		this.arr = arr;
	}
	
	//switch between threads 
	//use sleep to keep them in order 
	public void run() {
		try {
			for (int i=0; i<arr.length; i++) {
				switch(getName()) {
				case "Thread 0": break;
				case "Thread 1": sleep(10); break;
				case "Thread 2": sleep(20); break; 
				case "Thread 3": sleep(30); break; 
				}
				
				a.acquire();
				System.out.print(arr[i] + " ");
				a.release();
				sleep(500);
			}
		} catch (Exception e) {}
	}
}

