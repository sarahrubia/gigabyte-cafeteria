package cafeteria.service;

public class Waiter {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	// default ou sem modificador
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}
}
