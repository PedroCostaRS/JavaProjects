package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {

		// (informa ºF - 32) x 5/9 = retorna ºC;

		Scanner entrada = new Scanner(System.in);
		final double diferenca = 32;
		final double m = 5;
		final double d = 9;
		double farenheit;

		System.out.println("Informe um valor em ºF: ");
		farenheit = entrada.nextDouble();

		System.out.println(((farenheit - diferenca) * m)/ d);
	}

}
