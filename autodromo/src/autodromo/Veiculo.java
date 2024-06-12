package autodromo;

// abstract é abstração
public abstract class Veiculo {
	private String chassi;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	// método com modificador abstract permite o polimorfismo
	public abstract void ligar();
	// método abstract não tem body
}
