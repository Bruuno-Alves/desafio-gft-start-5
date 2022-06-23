package desafio1;

public class ContaPoupanca extends Conta implements Imposto{

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		this.rendimento = 0.05;
	}
	
	@Override
	public String toString() {
		return String.format("O saldo da Conta Poupança é R$ %.2f\nO rendimento mensal é R$ %.2f\n", this.getSaldo(), this.Rendimento());
	}
	
	@Override
	public double calcularImposto() {
		double imposto = this.Rendimento() * 0.1;
		return imposto;
	}
	
}
