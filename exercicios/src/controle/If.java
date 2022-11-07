package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		entrada.close();

		if (media < 6) {

			System.out.println("Reprovado!");

		} else if (media >= 6 && media < 9.9) {
			System.out.println("Aprovado!!");
		} else {
			System.out.println("Aprovado com louvor. Aluno nota 10");
		}

	}
}
