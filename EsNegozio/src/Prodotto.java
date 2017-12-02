
public class Prodotto {
	int prezzoFisso;

	public Prodotto(int prezzoFisso){
		this.prezzoFisso = prezzoFisso;
		
		}
	
	public int getPrezzo(){
		return prezzoFisso + getCostoSpecifico();
	}
	
	public int getCostoSpecifico(){
		return 0;
	}
	
	public String toString(){
		String s = "Questo prodotto costa:" + this.getPrezzo();
		return s;
	}

}
