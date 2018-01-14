
public class CD extends Prodotto {
	
	private String titoloAlbum;
	
	public CD(double costo, String titoloAlbum) {
		super(costo);
		this.titoloAlbum = titoloAlbum;
			}
	
	public String toString() {
		String stringaCD = "il prezzo del CD è:" + getCosto();
		return stringaCD;
	}
	

}
