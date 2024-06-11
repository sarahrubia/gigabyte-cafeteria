package cafeteria.service.kitchen;

public class Warehouseman {	
	public void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	public void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	// (removeu public) quando o método é default
	/*
	 * remoção do public no método
	 * quando o método é default, nem todo mundo tem acesso
	 * nesse caso, apenas as classes no mesmo nível de pacote
	 * têm acesso aos métodos abaixo
	 */
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
	}
	// default
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
