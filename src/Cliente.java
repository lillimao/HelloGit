
public class Cliente {
	
	
	public int acquisisci(Confezione conf) {
		Object contenuto = conf.scarta();
		int prezzo = 0;
		
		if (contenuto instanceof Prodotto) {
			Prodotto p = (Prodotto)contenuto;
			prezzo = p.getPrezzo();
			
			if(p instanceof Caramelle) {
				Caramelle c = (Caramelle)p;
				c.conta();
			}
		

		}return prezzo;
	}

}
