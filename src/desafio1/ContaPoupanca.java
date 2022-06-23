package desafio1;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		this.rendimento = 0.05;
	}
	
	@Override
	public String toString() {
		return String.format("O saldo da Conta Poupan�a �: %.2f\nO rendimento mensal � %.2f\n", this.getSaldo(), this.Rendimento());
	}
	
}
