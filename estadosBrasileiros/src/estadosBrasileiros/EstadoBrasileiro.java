package estadosBrasileiros;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO("SP","São Paulo", 11),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
	PIAUI("PI", "Piauí", 13),
	MARANHAO("MA","Maranhão", 14),
	ALAGOAS("AL", "Alagoas", 15);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	// Não é preciso criar enum com sigla e nome fora do enum
	// pode-se criar um construtor
	private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = codigoIbge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIBGE() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}

