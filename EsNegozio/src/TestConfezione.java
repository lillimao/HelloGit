import junit.framework.TestCase;

public class TestConfezione extends TestCase {
		public void testUnaConfezione() {
			Verdura v = new Verdura(1, 2);
			Confezione c = new Confezione(v);
			Object o = c.scarta();
			assertTrue(o instanceof Prodotto);
			assertTrue(o instanceof Verdura);
			
		}

}
