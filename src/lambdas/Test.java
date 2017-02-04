package lambdas;

import java.util.function.BinaryOperator;

public class Test {
	public static void main(String[] args) {

		int numeroA=8;
		int numeroB=9;
		
		
		//clases anonimas
		Calculadora<Integer> calculadora = new Calculadora<Integer>() {
			@Override
			public Integer calculo(Integer a, Integer b) {	
				return a*b;
			}
		};
		//Ejemplo con clase anonima
		System.out.println(calculadora.calculo(numeroA, numeroB));
		
		
		//Ejemplo Lambdas
		Calculadora<Integer> calculadoraLambda = (x,y) -> x*y;
		System.out.println(calculadoraLambda.calculo(numeroA, numeroB));
		

		/*
		 * BinaryOperator java 8
		 */
		//Clase anonima
		BinaryOperator<Integer> operadorBinario = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t*u;
			}
		};
		System.out.println(operadorBinario.apply(numeroA, numeroB));
		
		//Functional Interface
		BinaryOperator<Integer> operadorBinarioLambda = (x,y)->x*y;
		System.out.println(operadorBinarioLambda.apply(numeroA, numeroB));
		
		
	}
}
