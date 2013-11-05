package lab4;

public class Polibiusz implements Algorythm{
	static final char[][] polibiuszMatrix = {{'A','B','C','D','E'},
											 {'F','G','H','I','K'},
											 {'L','M','N','O','P'},
											 {'Q','R','S','T','U'},
											 {'V','W','X','Y','Z'}};
	public int checkNumber(char a)
	{
		int numer = 0;
		if(a == 'J') a = 'I';
		for(int i=0;i<5;i++)
			for(int j=0; j< 5; j++)
				if(a == polibiuszMatrix[i][j])
				{
					numer = 10*(i+1)+(j+1);
				}
		return numer;
	}
	
	
	public String crypt(String word)
	{
		String tmpWord ="";
		word = word.toUpperCase();
		char[] wordChar = word.toCharArray();
		for(int i=0; i<wordChar.length; i++)
		{
			tmpWord += checkNumber(wordChar[i]) + " ";		
			
		}
		return tmpWord;
	}
	
	public String decrypt(String word)
	{
	String tmp = "";
	return tmp;
	}
	
	/*
	public static void main(String[] args) 
	{
		System.out.print(polibiuszMatrix[1][2]);
		System.out.print(crypt("scisle"));
		
	}
	*/
}
