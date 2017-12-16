
public class Biscotti extends Prodotto {
	
	boolean isConfezioneGrande;
	
	
	public Biscotti(int prezzoFisso, boolean isConfezioneGrande){
		super(prezzoFisso);
		this.isConfezioneGrande = isConfezioneGrande;
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
