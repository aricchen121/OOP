import java.io.File;
import java.util.Arrays;

/*
 * I learn about the file class from here:
 * https://docs.oracle.com/javase/7/docs/api/java/io/File.html
 */
public class Apple {
	
	static void RecursivePrint(File[] arr, int level)
	{
		// for main directory files
		for (File f: arr)
		{
			//tabs for inner levels
			for (int i = 0; i < level; i++)
				System.out.print("\t");
			
			if(f.isFile())
				System.out.println("-> " + f.getName());
			
			else if(f.isDirectory())
			{
				System.out.println(f.getName());
				
				// recursion for sub-directories
				RecursivePrint(f.listFiles(), level + 1);
			}
			}
		}
	
	public static void main(String[] args) {
		// provide full path for directory
		String dirpath = "C:\\Users\\America\\Desktop\\nov";
			
		// File object
		File maindir = new File(dirpath);
		
		if(maindir.exists() && maindir.isDirectory())
		{
			//array for files and sub-directories
			//of directory pointed by maindir
			File arr[] = maindir.listFiles();
			
			System.out.println("Files in main diretory: " + maindir);
			
			// Call recursive method
			RecursivePrint(arr, 0);
		}
	}
}