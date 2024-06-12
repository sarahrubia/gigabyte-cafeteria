package autodromo;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("x932022");
		
		// carro herda de veículo o método ligar que é específico para carro
		jeep.ligar();
		
		Moto pop100 = new Moto();
		pop100.setChassi("123343");
		
		// moto herda método ligar de veículo e tem sua própria forma de ligar
		pop100.ligar();
		
		// Se o tipo da variável for Veiculo, que é a classe mais genérica
		// O método chamado (ligar()) vai acessar o método específico do objeto	
		Veiculo coringaCarro = jeep;
		coringaCarro.ligar();
		
		Veiculo coringaMoto = pop100;
		coringaMoto.ligar();
		
	}
}
