package pkg;

public class PracownikEtatowy extends Pracownik {
	public PracownikEtatowy(int pesel) {
		this.pesel = pesel;
	}

	public void dodajZajecia() {
		iloscZajec += 1.5;
	}

	protected void liczWyn() {
		wynBrutto = iloscZajec * 25;
	}
}
