package general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RandomText {
	public static void main(String[] args) throws IOException {
		String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		
		
		String pathTXT = "F:/java_test/";
		String file = "texto.txt";
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pathTXT + file)));
		
		
		for(int a=0; a<1_000_000; a++){
			bw.write(texto);
			bw.newLine();
			bw.flush();
		}
		
		
		bw.close();
		
		
	}
}
