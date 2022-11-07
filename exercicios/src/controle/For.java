package controle;

public class For {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {

			System.out.println("a repetição atual é: " + a);

		}

		System.out.println("Transição");

		int a = 1;
		for (; a <= 10;) {

			System.out.println("a repetição atual é: " + a);
			a++;

		}

		System.out.println("Transição");

		for (;;) {

			System.out.println("for infinito");

		}
	}

}
