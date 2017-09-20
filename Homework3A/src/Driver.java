
public class Driver {

	public static void main(String[] args) {
		char[] a = {'A','p','p','l','e'};
		MyString s = new MyString(a);
		
		s.print();
		System.out.print("\n");
		//test output
		System.out.println("Character at index 2:");
		System.out.println(s.charAt(2));
		
		System.out.println("Length of string:");
		System.out.println(s.length());
		
		System.out.println("Substring index 1 to 4:");
		s.substring(1,4).print();
		System.out.print("\n");
		
		System.out.println("Lowercase:");
		s.toLowerCase().print();
		System.out.print("\n");
		
		System.out.println("Uppercase:");
		s.toUpperCase().print();
		System.out.print("\n");
		
		System.out.println("Compare string:");
		char[] a2 = {'B','l','u','e'};
		MyString s2 = new MyString(a2);
		
		//equal
		s2.print();
		System.out.print("\n");
		System.out.println("String 1 equal to string 2?:");
		System.out.println(s.equals(s2));
		
		System.out.println("Get string:");
		System.out.println(s.getMyString());
		
		System.out.println("Turn to string:");
		System.out.println(s.toString());
		
		//convert
		System.out.println("Convert interger to string:");
		MyString.valueOf(20).print();
		System.out.print("\n");
		}
	

}
