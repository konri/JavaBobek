package pack;

import java.util.*;

public class liczbyPierwsze {
	public static List<Integer> szukajPierwszych(int n)
	{
		List<Integer> lista = new ArrayList<Integer>();
		for(int i=2;i<n;i++)
		{
			if (czyPierwsza(i))
			   lista.add(i);
		}
		return lista;
	}
	
	static boolean czyPierwsza(int n)
	{
		for(int i=2;i<n-1;i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

