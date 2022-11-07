package controle;

public class While {

	public static void main(String[] args) {

		int a = 1;
		while (a <= 10) {
			System.out.println("a repetição atual é: " + a);
			a++;
		}
		
		System.out.println("Transição");
		
		do {
			System.out.println("a repetição atual é: " + a);
			a++;
		} while (a <= 20);
			

	}

}
