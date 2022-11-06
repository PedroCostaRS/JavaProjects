package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		String n1 = entrada.nextLine();
		System.out.println("Informe o segundo número: ");
		String n2 = entrada.nextLine();
		
		
		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2) ;
		
		System.out.println("O resultado da soma é: "+(a+b));
		
	entrada.close();

		
	}

}
