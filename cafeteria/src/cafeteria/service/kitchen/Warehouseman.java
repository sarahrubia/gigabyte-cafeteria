package cafeteria.service.kitchen;

public class Warehouseman {	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	// default
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		//pode controlar entrada e saída de itens aqui
		controlarSaida();
	}
	// default
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
