
public class Caramelle extends Prodotto {
	int numCaramelle;
	
	public Caramelle(int prezzoFisso, int numCaramelle) {
		super(prezzoFisso);
		this.numCaramelle = numCaramelle;
	}
	public int contaCaramelle() {
		return numCaramelle;
	}

}
