
public class TestNegozio {

	public static void main(String[] args) {
		
		Biscotti oreo = new Biscotti(5, 7);
		Verdura zucchine = new Verdura(1, 2);
		Prodotto wafer = new Biscotti(2, 3);
		Prodotto finocchi = new Verdura(0, 1);
		
		Ordine ordine1 = new Ordine();
		
		ordine1.aggiungiProdotto(oreo);
		ordine1.aggiungiProdotto(finocchi);
		ordine1.aggiungiProdotto(wafer);
		ordine1.aggiungiProdotto(zucchine);
		
		Descrizione d = new Descrizione();
		
		d.toString();

	}

}
