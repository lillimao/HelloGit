
public class Verdura extends Prodotto {
	
	int prezzoSpecifico;
	int kg;
	
	public Verdura(int prezzoFisso, int prezzoSpecifico){
		super(prezzoFisso);
		this.prezzoSpecifico = prezzoSpecifico;
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
