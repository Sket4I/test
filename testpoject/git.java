package testpoject;

import java.io.*;

public class git {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/Slava/GitHub/test/test.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}