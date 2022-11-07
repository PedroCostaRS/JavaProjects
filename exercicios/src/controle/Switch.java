package controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número de 1 a 5");

		int a = entrada.nextInt();

		// recebe o valor em si e não uma expressão
		switch (a) {
		case 1:
			System.out.println("Acertô miserávi!! " + a);
			break;
		case 2:
			System.out.println("Acertô miserávi!! " + a);
			break;
		case 3:
			System.out.println("Acertô miserávi!! " + a);
			break;
		case 4:
			System.out.println("Acertô miserávi!! " + a);
			break;

		default:
			System.out.println("Eroooou!");
			break;
		}

	}

}
