package home.rico.sandbox.fileaccess;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class CreateTextFile 
{
	
	private static Formatter output;
	
	public static void openFile()
	{
		try
		{
			output = new Formatter("clients.txt");
		}
		catch (SecurityException securityException)
		{
			System.err.println("Write permission denied");
			System.exit(1);
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error opening file");
			System.exit(1);
		}
	}

}
