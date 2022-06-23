package desafio1;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
		this.rendimento = 0.03;
	}
	
	@Override
	public String toString() {
		return String.format("O saldo da Conta Corrente �: %.2f\nO rendimento mensal � %.2f\n", this.getSaldo(), this.Rendimento());
	}

}
