package desafio4;

public class Veiculo extends Carro {

	private String combustivel;
	
	public Veiculo(String marca, String modelo, String combustivel) {
		super(marca, modelo);
		this.combustivel = combustivel;
	}

	public String getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	@Override
	public String toString() {
		return String.format("O carro é um %s %s movido a %s", this.getMarca(), this.getModelo(), this.getCombustivel());
	}
	
}
