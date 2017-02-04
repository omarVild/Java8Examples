package lambdas;
@FunctionalInterface
public interface Calculadora<X> {
	Integer calculo(X a,X b);
}
