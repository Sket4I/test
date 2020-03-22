package testpoject;

import java.io.*;

public class git {

	public static void main(String[] args) throws Exception {
			File file = new File("C:/Users/Slava/GitHub/test/test.txt");
			FileReader fr = new FileReader(file);
		      char [] a = new char[1000];
		      fr.read(a);
		         System.out.print(a);
		      fr.close();
		   }
		}
