package Static;

import java.io.Serializable;

public class Employee extends superEmployee {
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
}

// The static variables are not saved. 
class superEmployee implements Serializable{
	public String lastName;
	static String companyName;
}

