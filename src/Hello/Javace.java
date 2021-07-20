package Hello;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Javace {

	public static void main(String[] args) {
		try {
			// Create new file

			File file = new File("HelloWorld");
			Scanner sc = new Scanner(System.in);
			// If file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			while (true) {
				System.out.println("Please, enter your name");
				bw.write("Please, enter your name");
				String name = sc.next();
				System.out.println("Hello, " + name);
				bw.write("Hello, " + name);
				bw.close();

			}
			// Write in file

			// Close connection

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}