
public class BigliettoAuguri extends Prodotto{
	
	private String tipoRicorrenza;
	
	public BigliettoAuguri(double costo, String tipoRicorrenza) {
		super(costo);
		this.tipoRicorrenza = tipoRicorrenza;
	}
	
	public String toString() {
		String stringaBiglietto = "il prezzo del biglietto di auguri è" + getCosto();
		return stringaBiglietto;
	}

}
