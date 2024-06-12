package estadosBrasileiros;

public class SistemaIBGE {
	public static void main(String[] args) {
		for(EstadoBrasileiro estado: EstadoBrasileiro.values()) {
			System.out.println(estado.getSigla() + "-" + estado.getNome());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.ALAGOAS;
		System.out.println(eb);
		// Imprime ALAGOAS
		System.out.println(eb.getNome());
		// Imprime Alagoas
		System.out.println(eb.getSigla());
		// Imprime AL
		System.out.println(eb.getNomeMaiusculo());
		// Imprime ALAGOAS
		System.out.println(eb.getIBGE());
	}
}
