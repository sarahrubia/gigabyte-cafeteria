package cafeteria;

import cafeteria.area.cliente.Client;
import cafeteria.service.Waiter;
import cafeteria.service.kitchen.Chef;

public class GigaByteCafeteria {
	public static void main(String[] args) {
		//ações que estabelecimento precisa ter ciência
		Chef cozinheiro = new Chef();
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Waiter atendente = new Waiter();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Client cliente = new Client();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();			
	}
}
