
public class Confezione {
	
	Object contenuto;
	
	public Confezione(Object contenuto){
		this.contenuto = contenuto;
	}
	
	public Object scarta(){
		
		System.out.println(contenuto.toString());
		return contenuto;
		
	}

}
