package lab4;

public class ROT11 implements Algorythm {
	static final char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
									'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};	
	
	public String crypt(String word)
	{
		String tmpWord ="";
		char[] wordChar = word.toCharArray();
		for(int i=0; i<wordChar.length; i++)
		{
			int k = 0;
			for(char c : alphabet)
			{
				
			if(c == wordChar[i])
				tmpWord += alphabet[k+11];
			k++;
			}
			
		}
		return tmpWord;
	}
	
	public String decrypt(String word)
	{
		String tmpWord = "";
		char[] wordChar = word.toCharArray();
		
		for(int i=0; i<wordChar.length;i++)
		{
			int k = 0;
			for(char c : alphabet)
			{
				if(c == wordChar[i])
					tmpWord += alphabet[k-11];
				k++;
			}
		}
		return tmpWord;
	}
	
	
}
