package classes;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		double desconto = p1.preco * p1.desconto;
		
		System.out.println("O produto é: "+p1.nome);
		System.out.println("O preço é: "+p1.preco);
		System.out.println("O valor do desconto é: "+(p1.preco * p1.desconto));
		System.out.println("O preço final é: "+ (p1.preco - desconto));

	}

}
