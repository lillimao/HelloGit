import junit.framework.TestCase;

public class TestOrdine2 extends TestCase {
	

	public void testGetTotale() {
		Prodotto oreo = new Biscotti(2, true);
		Prodotto zucchine = new Verdura(1, 2);
		Biscotti ringo = new Biscotti(1, false);
		Verdura insalata = new Verdura(2, 3);
		
		Ordine testOrdine = new Ordine();
		
		testOrdine.aggiungiProdotto(insalata);
		testOrdine.aggiungiProdotto(oreo);
		testOrdine.aggiungiProdotto(ringo);
		testOrdine.aggiungiProdotto(zucchine);
		
		assertTrue(testOrdine.getTotale() == 22 + 11 + 11 + 17);
		
	}

}
