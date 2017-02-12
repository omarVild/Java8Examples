package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		
		List<String> letras = new ArrayList<String>(){{
			add("B"); add("C"); add("A"); add("D"); add("E"); add("J"); add("H"); add("I"); add("G"); add("K"); add("L"); add("F"); add("AA"); add("BB");
		}};
 		
		//ForEach
		letras.stream().forEach(item -> System.out.print(item+","));
		System.out.println("\n------------");
		letras.stream().forEach(System.out::print);
		
		System.out.println("\n------------");
		//Filtrado Lazy evaluation
		Stream<String> st = letras.stream().filter(item->item.length()>1); //solo crea un stream, digamos solo las reglas pero no ejecuta aún nada
		st.forEach(item -> System.out.print(item+","));
		
		System.out.println("\n------------");
		//Filtrado 
		letras.stream().filter(item->{return item.length()>1;}).forEach(item -> System.out.print(item+","));

		System.out.println("\n------------");
		//Map
		letras.stream().map(item->item.toLowerCase()).forEach(item -> System.out.print(item+","));
		
		System.out.println("\n-----números integer-------");
		List<Integer> numerosInteger = new ArrayList<Integer>(){{
			add(8); add(3); add(10); add(5); add(12); add(6); add(7); add(1); add(9); add(2); add(11); add(4);
		}};
		
		//Order
		numerosInteger.stream().sorted().forEach(item -> System.out.print(item+","));
		System.out.println("\n------------");
		//count
		Long resultadoTMP = numerosInteger.stream().count();
		System.out.println(resultadoTMP);
		
		
		
	}
	
	
	
	
	
	
	
	
}
