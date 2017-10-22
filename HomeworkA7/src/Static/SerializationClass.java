package Static;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* I read about static variables and also got the piece of code here:
http://javabeginnerstutorial.com/core-java-tutorial/transient-vs-static-variable-java/

First run the SerializationClass, then run DeserializationClass to see which variables are 
saved. 
*/
public class SerializationClass {
	public static void main(String[] args) {
		Employee em = new Employee();
	    em.firstName = "Vivi";
	    em.lastName = "Lam";
	    em.companyName = "Verizon";
	    try {
	    	FileOutputStream fileOut = new FileOutputStream("employee.txt");
	    	ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    	out.writeObject(em);
	    	out.close();
	    	fileOut.close();
	    	System.out.printf("Serialized data is saved in employee.txt file");
	    } catch (IOException i) {
	    	i.printStackTrace();
	    }
	  }
	}