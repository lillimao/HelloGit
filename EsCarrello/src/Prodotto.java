
public class Prodotto {
	
	private double costo;
	
	public Prodotto(double costo) {
		this.costo = costo;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		if(costo > 0)
			this.costo = costo;
	}
	
	public String toString() {
		String stringaProdotto = "questo prodotto costa" + costo + "euro";
		return stringaProdotto;
	}

}
