
public class TestNegozio {

	public static void main(String[] args) {
		
		Biscotti oreo = new Biscotti(5, true);
		Verdura zucchine = new Verdura(1, 2);
		Prodotto wafer = new Biscotti(2, false);
		Prodotto finocchi = new Verdura(1, 3);
		
		Ordine ordine1 = new Ordine();
		
		ordine1.aggiungiProdotto(oreo);
		ordine1.aggiungiProdotto(finocchi);
		ordine1.aggiungiProdotto(wafer);
		ordine1.aggiungiProdotto(zucchine);
		
		Descrizione d = new Descrizione();
		
		System.out.println(ordine1.toString());

	}

}
