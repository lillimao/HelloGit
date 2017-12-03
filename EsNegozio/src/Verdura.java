
public class Verdura extends Prodotto {
	
	int kg;
	
	public Verdura(int prezzoFisso, int kg){
		super(prezzoFisso);
		this.kg = kg;
	}
	
	@Override
	public int getCostoSpecifico(){
		return kg * 5;
	}
	
	@Override
	public String toString(){
		String s = "Verdura:" + super.toString();
		return s;
	}

}
