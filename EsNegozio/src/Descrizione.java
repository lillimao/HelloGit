
public class Descrizione {
	
	String g;
	
	public Descrizione(){
		g = "";
	}
	
	public void append(Object o){
		g = g + "-" + o.toString(); 
	}
	
	@Override
	public String toString(){
		String s = "Descrizione:" + g;
		return s;
	}

}
