package pkg;

import java.util.Comparator;

public class PracWynComparator implements Comparator {
	public int compare(Object prac1, Object prac2) {
		if (((Pracownik) prac1).wynBrutto() > ((Pracownik) prac2).wynBrutto()) {
			return 1;
		} else if (((Pracownik) prac1).wynBrutto() == ((Pracownik) prac2).wynBrutto()) {
			return 0;
		} else {
			return -1;
		}
	}
}
