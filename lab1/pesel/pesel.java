package pack;

import javaIn.JIn;

public class pesel {
	public static void main(String[] argv) {
		System.out.println("Podaj PESEL do zweryfikowania:");
		String pesel = JIn.getString();
		if (pesel.matches("[0-9]{2}[0-1]{1}[0-9]{1}[0-2]{1}[0-9]{1}[0-9]{5}")) {
			System.out.println("OK");
		} else {
			System.out.println("PESEL jest nieprawidlowy!");
		}
	}
}
