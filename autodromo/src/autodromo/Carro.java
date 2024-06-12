package autodromo;

// extends é herança
public class Carro extends Veiculo {
	// método ligar específico para o carro
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("Carro ligado!");
	}
	
	private void conferirCombustivel() {
		System.out.println("Conferindo combustível");
	}
	private void conferirCambio() {
		System.out.println("Conferindo câmbio");
	}
}
