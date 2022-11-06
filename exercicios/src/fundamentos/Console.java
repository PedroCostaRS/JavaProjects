package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.println("Bom");
		System.out.println("Dia");

		System.out.print("Bom");
		System.out.print(" Dia");

		System.out.printf("Resultado loteria: %d %d %d %d %d %d \n %n", 1, 2, 3, 4, 5, 6); // %d variável double

		System.out.printf("Exemplo com ponto flutuante: %.1f \n", 21113.3614);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe qualquer coisa: ");
		String entra = entrada.next();

		System.out.println("Você informou: " + entra);

		entrada.close();

	}

}
