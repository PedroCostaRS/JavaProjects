package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		// atribuição
		double a = 4.5;
		System.out.println(a);

		// surgiu a partir do Java 10, e deve ser inicializada na mesma linha.
		// inferência - atribui o tipo a variável pelo tipo da atribuição.
		var b = 4.5;
		System.out.println(b);

	}

}
