
public class File {
	
	private byte[] arrayB = new byte[8];
	
	public File(byte[] arrayB) {
		this.arrayB = arrayB;
	}
	
	public int getSize() {
		
		int size = 0;
		for(int i = 0; i < arrayB.length; i++) {
			size = size + arrayB[i]; 
		} return size;
	}
	
	public boolean isBiggerThan (int termineParagone) {
		int size = getSize();
		boolean bigger = size > termineParagone;
		return bigger;
		
	}

}
