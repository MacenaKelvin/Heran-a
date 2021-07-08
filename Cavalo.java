package br.com.generation.heranca.correcao;

public class Cavalo extends Animal {
	
	private String Crina;
	
	
	
	public String getCrina() {
		return Crina;
	}
	public void setCrina(String crina) {
		Crina = crina;
	}


	void galopar() {
		System.out.println("Cavalo Galopando!!");
	}
}
