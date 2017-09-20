
public class MyString {
	private char [] chars;
	
	/*
	 * Make copy of a string.
	 * I learn how to use System.arraycopy from here:
	 * https://www.tutorialspoint.com/java/lang/system_arraycopy.htm
	 * 
	 */
	public MyString(char[] chars){
		
		this.chars = new char[chars.length];
	    System.arraycopy(chars, 0, this.chars, 0, chars.length);
	    }
	//verify print
	public MyString print(){
		for(int i = 0; i < this.length(); i++){
			System.out.print(this.chars[i]);
		}
		
		return this;
	}
	
	// get character at index
	public char charAt(int index){
		return this.chars[index];
	}
	
	// get length of string
	public int length(){
		return this.chars.length;
	}
	
	// get substring
	public MyString substring(int begin, int end){
		char[] substring = new char[end-begin];
		
		for(int i = begin; i < end; i++){
			substring[i-begin] = this.charAt(i);
		}
		
		return new MyString(substring);
	}
	
	/* lowercase
	 * I learned how to use Character.toLowerCase from here:
	 * https://stackoverflow.com/questions/5447580/tolowercasechar-method
	 */
	public MyString toLowerCase(){
		for(int i = 0; i < this.length(); i++){
			this.chars[i] = Character.toLowerCase(this.chars[i]);
		}
		
		return this;
	}
	
	// uppercase
		public MyString toUpperCase(){
			for(int i = 0; i < this.length(); i++){
				this.chars[i] = Character.toUpperCase(this.chars[i]);
			}
			
			return this;
		}
		
	//equals
	public boolean equals(MyString s){
		if(this.length() != s.length()){
			return false;
		}
		
		for(int i = 0; i < this.length(); i++){
			if(this.charAt(i) != s.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
	//returns MyString
	public MyString getMyString(){
		return new MyString(chars);
	}
	
	//toString
	public String toString(){
		String d = new String();
		for(int i = 0; i < this.length(); i++){
			d += this.charAt(i);
		}
		return d;
	}

	/*convert integer to object
	 * I learned about the tocharArray method here:
	 * https://www.tutorialspoint.com/java/java_string_tochararray.htm
	 */
	public static MyString valueOf(int i){
		return new MyString(Integer.toString(i).toCharArray());
	}
}