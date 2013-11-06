package pkg;

class Student extends Pracownik {
	public Student(int pesel) {
		this.pesel = pesel;
	}

	public void dodajZajecia() {
		++iloscZajec;
	}

	protected void liczWyn() {
		wynBrutto = iloscZajec * 15;
	}
}