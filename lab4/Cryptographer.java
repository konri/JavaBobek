package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class Cryptographer {
	
	static void cryptfile(String fileOpen, String fileSave, Algorythm algorytmToDo)
	{
		saveDB(fileSave,textCrypt(fileOpen,algorytmToDo));
		//createDB(fileOpen,algorytmToDo);
	}
	static void decryptfile(String fileOpen, String fileSave, Algorythm algorytmToDo)
	{
		saveDB(fileSave,textDecrypt(fileOpen,algorytmToDo));
	}
	
	
	private static String textCrypt(String filename, Algorythm algorytmToDo)
	{
		String tmpLinia; //temporary storage of line 
	
		String cryptedString = "";
		try
		{
			
			
		BufferedReader read = new BufferedReader(
								new InputStreamReader(
								new FileInputStream(new File(filename)), "UTF8"));
		
		while( (tmpLinia = (read.readLine()) ) != null )
		{
			String tmpString[] = tmpLinia.split(" ");
			for(int i = 0; i<tmpString.length; i++)
			{
				
				cryptedString += algorytmToDo.crypt(tmpString[i]) + " ";
				
			}
			cryptedString +="\n";
		
		}
		
		read.close();
		
		
			
			
		}catch(FileNotFoundException e)
		{
			System.out.print("B³ad!! Nie znaleziono pliku...");
			System.exit(1);
		}
		catch (IOException e) {
			// nie rób nic

		}
		return cryptedString;
	}
	
	
	private static String textDecrypt(String filename, Algorythm algorytmToDo)
	{
		String tmpLinia; //temporary storage of line 
	
		String cryptedString = "";
		try
		{
			
			
		BufferedReader read = new BufferedReader(
								new InputStreamReader(
								new FileInputStream(new File(filename)), "UTF8"));
		
		while( (tmpLinia = (read.readLine()) ) != null )
		{
			String tmpString[] = tmpLinia.split(" ");
			for(int i = 0; i<tmpString.length; i++)
			{
				
				cryptedString += algorytmToDo.decrypt(tmpString[i]) + " ";
				
			}
			cryptedString +="\n";
		
		}
		
		read.close();
		
		
			
			
		}catch(FileNotFoundException e)
		{
			System.out.print("B³ad!! Nie znaleziono pliku...");
			System.exit(1);
		}
		catch (IOException e) {
			// nie rób nic

		}
		return cryptedString;
	}
	
	
	private static void saveDB(String filename, String saveString)
	{
		try{
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			writer.write(saveString);
			writer.close();
		}
		catch (IOException e) {
			
		}
		
		
	}
}
