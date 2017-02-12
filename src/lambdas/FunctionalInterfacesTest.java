package lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfacesTest {
	public static void main(String[] args) {
		
		//Predicate, permite evaluar valores
		Predicate<Integer> evaluarBooleano = x -> x>100; 
		System.out.println(evaluarBooleano.test(150));
		
		//
		Consumer<String> consumer = x ->System.out.println(x); 
		consumer.accept("Hola mundo");
		
		Runnable hilo = () -> System.out.println("Hilo1");
		hilo.run();
		
		
	}
}
