package aula_2;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	private String cor;
	
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	
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
