import java.util.Scanner;

/*
 * I got the method to find out if feburary is a leap year from here:
 * http://www.dreamincode.net/forums/topic/86793-displaying-calendar-for-each-month-of-given-yearday/
 * 
 */
public class two {
	public static void main(String[] args) {
	    //Create a new scanner 
	    Scanner input = new Scanner(System.in);

	    // Ask user to enter year 
	    System.out.print("Enter a year: ");
	    int year = input.nextInt();

	    // Ask user to enter first day of the year 
	    //0 to 6 is sunday to saturday
	    System.out.println("Enter the weekday that the year starts: ");
	    int day = input.nextInt();
	    int dayCounter = day;
	    int numOfDays = 0;
	    String monthx = ""; 
	    
	    //Display month name
	    for (int month= 1; month <=12; month++)
	    {
	    	// Switch to month
	    	switch (month)
	    	{
	    	case 1: monthx = "January";
	    	numOfDays = 31;
	    	break;
	    	case 2: monthx = "Feburary";
	    	if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
	    	numOfDays = 29;
	    	break; 
	    	}
	    	else {
	    	numOfDays = 28;
	    	break;
	    	}
	    	
	    	case 3: monthx = "March";
	        		numOfDays = 31;
	        		break; 
	        case 4: monthx = "April";
	                numOfDays = 30;
	                break; 
	        case 5: monthx = "May";
	                numOfDays = 31;
	                break;
	        case 6: monthx = "June";
	         		numOfDays = 30;
	                break;
	        case 7: monthx = "July";
	                numOfDays = 31;
	                break;
	        case 8: monthx = "August";
	                numOfDays = 31;
	                break;
	        case 9: monthx = "September";
	                numOfDays = 30;
	                break; 
	        case 10: monthx = "October";
	                 numOfDays = 31;
	                 break; 
	        case 11: monthx = "November";
	                 numOfDays = 30;
	                 break; 
	        case 12: monthx = "December";
	                 numOfDays = 31;
	                 break;                  
	        }

	        System.out.printf("%15s %d \n", monthx , year);
	                 
	        System.out.printf("%s %s %s %s %s %s %s \n ", "Sun","Mon","Tue", "Wed", "Thu","Fri","Sat");
	        
	        // leave space for first row
	        for (int space = 1; space <= day; space++) {
	                 
	        	System.out.printf("%4s", "    ");
	        }
	        for (int i = 1; i <=numOfDays; i++) {
	                 
	             dayCounter++;
	             
	             // print out days of the week
	             if ( dayCounter% 7==0)
	            	 System.out.printf("%- 4d\n", i);
	             else
	                 System.out.printf("%-4d", i);

	         }
	         day = (day + numOfDays)%7;

	         System.out.println();

	    }    

	}
}
