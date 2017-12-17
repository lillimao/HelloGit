import junit.framework.TestCase;

public class TestFileFolder extends TestCase {
	
	public void testFile() {
		byte[] array1 = {1, 2, 3, 4, 0, 0, 0, 0};
		byte[] array2 = {4,5,2,6,8,9,2,1};
		
		File[] arrayFile1 = new File[10];
		
		File file1 = new File(array1);
		File file2 = new File(array2);
		
		Folder folder1 = new Folder(array1, arrayFile1);
		
		folder1.aggiungiFile(file1);
		folder1.aggiungiFile(file2);
		
		
		System.out.println(folder1.getSize());

		
	}

}
