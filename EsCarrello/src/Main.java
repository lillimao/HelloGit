
public class Main {
	public static void main(String args[]) {
		
		Carrello carrello = new Carrello(6);
		Libro libro = new Libro(5, "titolo1");
		BigliettoAuguri biglietto = new BigliettoAuguri(3, "anniversario");
		CD cd = new CD(2, "led zeppelin");
		Prodotto scarpe = new Prodotto(9);
		carrello.aggiungiProdotto(scarpe);
		System.out.println(scarpe.toString());
		carrello.aggiungiProdotto(cd);
		System.out.println(cd.toString());
		carrello.aggiungiProdotto(biglietto);
		biglietto.toString();
		carrello.aggiungiProdotto(libro);
		libro.toString();
		carrello.calcolaCostoTotale();
		carrello.toString();
		
		System.out.println(carrello.calcolaCostoTotale());
	
	}

}
