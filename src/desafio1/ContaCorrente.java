package desafio1;

public class ContaCorrente extends Conta implements Imposto {

	public ContaCorrente(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		this.rendimento = 0.03;
	}
	
	@Override
	public String toString() {
		return String.format("O saldo da Conta Corrente é R$ %.2f\nO rendimento mensal é R$ %.2f\n", this.getSaldo(), this.Rendimento());
	}

	@Override
	public double calcularImposto() {
		double imposto = this.Rendimento() * 0.25;
		return imposto;
	}

}
