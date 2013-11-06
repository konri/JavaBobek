package pkg;

import java.util.Collections;
import java.util.LinkedList;

public class Kadry {

	public void dodajPracownika(Pracownik prac) {
		pracownicy.add(prac);
	}

	public void usunPracownika(int pesel) {
		for (int i = 0; i < pracownicy.size(); ++i) {
			if (pracownicy.get(i).pesel() == pesel)
				pracownicy.remove(i);
		}
	}

	public void sortujPracPoWyn() {
		Collections.sort(pracownicy, new PracWynComparator());
	}

	public double wynNetto(int pesel) {
		return wynBrutto(pesel) * 0.65;
	}

	public double wynBrutto(int pesel) {
		return pracownik(pesel).wynBrutto();
	}

	public Boolean ustawWynBrutto(int pesel, double wyn) {
		Pracownik prac = pracownik(pesel);
		if (prac.pesel() == 0)
			return false;
		prac.ustawWynBrutto(wyn);
		return true;
	}

	public Pracownik pracownik(int pesel) {
		for (Pracownik prac : pracownicy) {
			if (prac.pesel() == pesel)
				return prac;
		}
		return new Student(0);
	}

	private LinkedList<Pracownik> pracownicy = new LinkedList<Pracownik>();
}
