package cafeteria;

import cafeteria.area.cliente.Client;
import cafeteria.service.Waiter;
import cafeteria.service.kitchen.Chef;
import cafeteria.service.kitchen.Warehouseman;

public class GigaByteCafeteria {
	public static void main(String[] args) {
		Chef cozinheiro = new Chef();
		//ações que não precisam estarem disponíveis para toda a aplicação
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Warehouseman almoxarife = new Warehouseman();
		//ações que não precisam estarem disponíveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// almoxarife.entregarIngredientes();
		// almoxarife.trocarGas();
		
		Waiter atendente = new Waiter();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
		// atendente.trocarGas();
		
		Client cliente = new Client();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();
		
		//esta ação é muito sigilosa, qua tal ser privada ?
		cliente.consultarSaldoAplicativo();
		
		//já pensou os clientes ouvindo que o gás acabou ?
		// 
		/*
		 * O método pedirParaTrocarGas não está mais disponível
		 * porque ele chama o método trocarGas() do Waiter
		 * que agora só está disponível para classes no mesmo
		 * nível de pacote
		 */
		//cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
		
	}
}
