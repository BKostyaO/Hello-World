package Hello;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class forst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try (FileWriter writer = new FileWriter("notes3.txt", false)) {
			while (true) {
				System.out.println("Please, enter your name");
				String name = sc.next();
				System.out.println("Hello, " + name);

				writer.write(name);
				writer.write("\n");
				writer.flush();
			}
		}

		catch (IOException e) {
			e.printStackTrace();

		}
	}
}
