package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		// Mostra o índice 2 da palavra e-ou variável
		System.out.println("Teste".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // função para concatenar
		System.out.println(s.startsWith("Boa")); // Testa se a string inicia com a palavra boa.
		System.out.println(s.toLowerCase()); // Exibe tudo minúsculo
		System.out.println(s.toUpperCase()); // Exibe tudo maiúsculo
		System.out.println(s.length()); // retorna quantidade de caracteres da string
		
		
		
	}

}
