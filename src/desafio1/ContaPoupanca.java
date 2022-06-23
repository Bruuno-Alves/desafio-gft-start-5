package desafio1;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		this.rendimento = 0.05;
	}
	
	@Override
	public String toString() {
		return String.format("O saldo da Conta Poupança é: %.2f\nO rendimento mensal é %.2f\n", this.getSaldo(), this.Rendimento());
	}
	
}
