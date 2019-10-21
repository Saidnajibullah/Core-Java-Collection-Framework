import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {

	public static void main(String[] args) {
		
		//Eclipse automatically adds an slash as treats the first slash as a escape character. If its not added
		// automatically you either added manually or change the slashes into forward slashes.
		
		
		//before copying the file into classpath
		//String fileName = "C:\\Users\\Najib\\Desktop\\readWithScanner.txt";
		
		//after copying the in the classpath
		String fileName = "readWithScanner.txt";
		
		File file = new File(fileName);
		
		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
