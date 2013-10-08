package pack;

import javaIn.*;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wpisz liczbe:");
		int liczba = JIn.getInteger();
		List<Integer> tmp = new  ArrayList<Integer>();
		tmp = liczbyPierwsze.szukajPierwszych(liczba);
		for (Integer num : tmp) 
		{
			System.out.println(num);
		}
	}

}
