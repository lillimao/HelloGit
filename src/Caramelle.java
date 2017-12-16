
public class Caramelle extends Prodotto {
	
	int numeroCaramelle;
	
	public Caramelle(int prezzoFisso, int numeroCaramelle) {
		super(prezzoFisso);
		this.numeroCaramelle = numeroCaramelle;
	}
	
	public int conta () {
		System.out.println("le caramelle sono:"+ numeroCaramelle);
		return numeroCaramelle;
	}

}
