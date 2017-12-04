
public class Cliente {
	Confezione c;
	
	public Cliente(Confezione c) {
		this.c = c;
	}
	
	public int acquisisci(Confezione c) {
		int prezzo = 0;
		Object contenuto = c.scarta();
		
		if (contenuto instanceof Prodotto) {
			Prodotto p = (Prodotto)contenuto;
			prezzo = p.getPrezzo();
			if(p instanceof Caramelle) {
				return ((Caramelle) p).contaCaramelle();
				
			}
		}return prezzo;
		
	}

}
