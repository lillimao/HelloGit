
public class Carrello {
	
	private Prodotto[]prodotti;
	
	public Carrello(int numProdMax) {
		prodotti = new Prodotto[numProdMax];
			}
	
	public boolean aggiungiProdotto(Prodotto prod) {
		boolean aggiunto = true;
		
		for(int i = 0; i < prodotti.length; i++) {
		if (prodotti[i] == null) {
			prodotti[i] = prod;
			System.out.println("Prodotto aggiunto al carrello");
			return aggiunto;
		}
		} 
		System.out.println("Carrello pieno, prodotto non aggiunto");
		return !aggiunto;
	}
	
	public String vediCarrello(int posizione) {
		return prodotti[posizione].toString();
		
	}
	
	public double calcolaCostoTotale() {
		double tot = 0;
		for(int k = 0; k < prodotti.length && prodotti[k] != null; k++) {
			tot += prodotti[0].getCosto();
		}
		return tot;
	}
	
	public String toString() {
		String descrizione = "il carrello ha un costo totale di:" + calcolaCostoTotale() + "euro";
		return descrizione;
	}

}
