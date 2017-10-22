package Static;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* First run the SerializationClass, then run DeserializationClass to see which variables are 
saved. After deserialization, the company name shows it was not saved. 
*/

public class DeserializationClass {
  public static void main(String[] args) {
    Employee em = null;
    try {
    	FileInputStream fileIn = new FileInputStream("employee.txt");
    	ObjectInputStream in = new ObjectInputStream(fileIn);
    	em = (Employee) in.readObject();
    	in.close();
    	fileIn.close();
    } catch (IOException i) {
      i.printStackTrace();
      return;
    } catch (ClassNotFoundException c) {
      System.out.println("Employee class not found");
      c.printStackTrace();
      return;
    }
    System.out.println("Deserializing Employee...");
    System.out.println("First Name of Employee: " + em.firstName);
    System.out.println("Last Name of Employee: " + em.lastName);
    System.out.println("Company Name: "+em.companyName);

  }
}

