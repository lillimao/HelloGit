
public class Folder extends File {
	
	private File[] arrayFile = new File[10];
	private int i = 0;
	
	public Folder(byte[] arrayB, File[] arrayFile) {
		super(arrayB);
		this.arrayFile = arrayFile;
	}
	
	public boolean aggiungiFile(File file) {
		
		boolean aggiunto = true;
		if (i < 10) {
			arrayFile[i] = file;
			i++;
			return aggiunto;
		}
		else {System.out.println("Il folder e' pieno");
		return !aggiunto;
		}
	}
	
	
	public int getSize() {
		int sizeFolder = 0;
		/*for(int k = 0; k < arrayFile.length; k++) {
			sizeFolder = sizeFolder + arrayFile[k].getSize(); 
		}*/
		sizeFolder = arrayFile[0].getSize() + arrayFile[1].getSize();
		
		return sizeFolder;
	}

}
