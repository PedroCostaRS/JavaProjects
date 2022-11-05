package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		// variável com ponto e não vírgula
		double raio = 3.4;

		// constante com nome maiúsculo
		final double PI = 3.14159;

		double area = PI * raio * raio;
		
		System.out.println(area);
		// concatenação de string
		System.out.println("Área = "+area);
	}
}
