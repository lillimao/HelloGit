
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
	
	public int getTotale(){
		return totOrdine;
	}
	
	public String toString(){
		String s = "Ordine: " + d.toString() + "Totale: " + totOrdine;
		return s;
	}

}
