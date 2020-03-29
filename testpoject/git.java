package testpoject;

import java.io.*;

public class git {
	public static void main(String[] args) {
		try {
			File file = new File("C:/Users/Slava/GitHub/test/test.txt");
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(new FileInputStream(file), "UTF-8"));

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
		try {
			Method1();
		} catch (Exception e) {
			System.out.println("RuntimeEXception"+e.getMessage());
		}
	}

	public static void Method1() {
		throw new RuntimeException("Runtime");
	}
}