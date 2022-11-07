package controle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			// Se for impar, o continue interrompe a ITERAÇÃO ao invés de interromper todo o
			// laço.
			if (i % 2 == 1) {
				continue;
			}

			System.out.println("O valor atual é: " + i);

		}

	}

}
