
public class Ordine {
	
	int totOrdine;
	Descrizione d;

	
	public Ordine(){
		d = new Descrizione();
		this.totOrdine = 0;
	}
	
	public void aggiungiProdotto(Prodotto p){
		
		totOrdine = totOrdine + p.getPrezzo();
		d.append(p);
		
	}

}
