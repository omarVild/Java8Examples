package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtros {
	public static void main(String[] args) throws IOException {
		
		String pathTXT = "F:/java_test/";
		String file = "texto.txt";
		
		BufferedReader libro = new BufferedReader(new FileReader(pathTXT + file));
//		BufferedReader libro = new BufferedReader(new FileReader("textosEjemplo/alicia.txt"));

		
		long inicio = System.currentTimeMillis();
		
		List<String> palabras = new ArrayList<>();

		String textoTMP = "";
		while ((textoTMP = libro.readLine()) != null) {
			String[] palabrasTMP = textoTMP.split(" ");
			for (String palabraTMP : palabrasTMP) {
				if (!(palabraTMP.equals(" ") || palabraTMP.equals(""))) {
//					System.out.println(palabraTMP);
					palabras.add(palabraTMP);
				}
			}
		}

		Stream<String> filtradoPalabrasL = palabras.stream().filter(u -> u.startsWith("l"));
		List<String> palabrasConL = filtradoPalabrasL.collect(Collectors.toList());
		/*for (String palabraL : palabrasConL) {
			System.out.println(palabraL);
		}*/
		filtradoPalabrasL = palabras.stream().filter(u -> u.startsWith("l"));

		long contadorPalabrasL = filtradoPalabrasL.count();
		System.out.println("Numero de palabras con L: " + contadorPalabrasL);

		Predicate<String> palabrasConNPredicate = new Predicate<String>() {
			@Override
			public boolean test(String txt) {
				return txt.toUpperCase().startsWith("N");
			}
		};

		Stream<String> filtradoPalabrasN = palabras.stream().filter(palabrasConNPredicate);

		List<String> palabrasConN = filtradoPalabrasN.collect(Collectors.toList());
		/*for (String palabra : palabrasConN) {
			System.out.println(palabra);
		}*/
		filtradoPalabrasN = palabras.stream().filter(palabrasConNPredicate);
		long contadorPalabrasN = filtradoPalabrasN.count();
		System.out.println("Numero de palabras con N: " + contadorPalabrasN);
			
		
		long fin = System.currentTimeMillis();
		
		System.out.println(((fin - inicio)/ 1000));
		libro.close();
	}
}
