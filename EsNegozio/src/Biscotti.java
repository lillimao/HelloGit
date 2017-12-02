
public class Biscotti extends Prodotto {
	
	int prezzoSpecifico;
	boolean isConfezioneGrande;
	
	
	public Biscotti(int prezzoFisso, int prezzoSpecifico){
		super(prezzoFisso);
		this.prezzoSpecifico = prezzoSpecifico;
	}
	
	@Override
	public int getCostoSpecifico(){
		if(isConfezioneGrande) return 20;
		else return 10;
	}
	
	@Override
	public String toString(){
		String s = "Prezzo biscotti:" + super.toString();
		return s;
	}

}
