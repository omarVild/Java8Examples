package lambdaFunctions;

public class Test {
	public static void main(String[] args) {
		FunctionalInterface  funInter = () -> System.out.println("Hola mundo");
		funInter.call();
	}
}
