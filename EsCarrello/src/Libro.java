
public class Libro extends Prodotto {
	
	
	private String titolo;
	
	public Libro(double costo, String titolo) {
		super(costo);
		this.titolo = titolo;		
	}
	
	public String toString() {
		String stringaLibro = "questo libro costa:" + getCosto() + "euro";
		return stringaLibro;
	}

}
