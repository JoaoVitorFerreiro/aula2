package aula_2;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	private String cor;
	
	
	public void Latir() {
		System.out.println("O cachorro: " 
	+ nome + "latiu");
	}
	
	public void GetCachorro() {
		System.out.println(
				"Nome: " + nome +
				"\nRaça: " + raca +
				"\nIdade: " + idade +
				"\nCor: " + cor
				);
	}
}
