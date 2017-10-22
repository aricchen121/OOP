package Question1;

/* The throw exceptions will have this form: 
 * 
 * class LookAtMrAlgebraOverHereException extends Exception
{
    public LookAtMrAlgebraOverHereException(String s)
    {
        super(s);
    }
}

class IllegalOperationException extends Exception
{
    public IllegalOperationException(String s)
    {
        super(s);
    }
}

class UserIsaDumbassException extends Exception
{
    public UserIsaDumbassException(String s)
    {
        super(s);
    }
}

I got stuck because I needed functions to throw the exceptions. 
Research:
https://beginnersbook.com/2013/04/user-defined-exception-in-java/
http://illegalargumentexception.blogspot.com/2009/11/java-how-to-use-illegalargumentexceptio.html
 */

public class Calc {

	public static void main(String[] args) {
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		int c = 0; // result 

		String operator = args[1];

		switch(operator){
		case "+":
			c = a + b;
			break;
		case "-":
			c = a - b;
			break;
		case "p": // for multiplying 
			c = a * b;
			break;
		case "/":
			c = a / b;
			break;
		case "%":
			c = a % b;
			break;
		}
		
	
		System.out.println(a + " " + operator + " "+ b +" = " + c);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
	}
	
}

