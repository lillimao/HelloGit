
import junit.framework.TestCase;

	public class TestConfezione extends TestCase {
		/*public void testUnaConfezione(){
		
		Biscotti pavesini = new Biscotti(50, false);
		Confezione conf = new Confezione(pavesini);
		Object ob = conf.scarta();
		assertTrue(ob instanceof Prodotto);
		assertTrue(ob instanceof Biscotti);
		assertEquals(pavesini, ob);
		}*/
		
		public void testCliente() {
			Biscotti gocciole = new Biscotti(2,true);
			Confezione c = new Confezione(gocciole);
			Cliente mario = new Cliente();
			assertTrue(mario.acquisisci(c) == gocciole.getPrezzo());
			Caramelle golia = new Caramelle(3, 30);
			Confezione co = new Confezione(golia);
			assertTrue(mario.acquisisci(co) == 3);
		}
	}



