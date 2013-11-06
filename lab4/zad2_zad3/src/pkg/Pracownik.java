package pkg;

public abstract class Pracownik {
	protected int pesel;
	protected double wynBrutto;
	protected int iloscZajec;

	public abstract void dodajZajecia();

	protected abstract void liczWyn();

	public void ustawWynBrutto(double wyn) {
		wynBrutto = wyn;
	}

	public double wynBrutto() {
		return wynBrutto;
	}

	public int pesel() {
		return pesel;
	}
}
