package desafio1;

public class ContaTeste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(0010020034, "Jose", 1000.00);
		ContaPoupanca cp = new ContaPoupanca(0040050067, "Alberto", 1000.00);
		
		System.out.println(cc);
		System.out.println(cp);
		
		System.out.println("O imposto sobre rendimento da Conta Corrente � R$ " + cc.calcularImposto() + "\n");
		System.out.println("O imposto sobre rendimento da Conta Corrente � R$ " + cp.calcularImposto() + "\n");
		
	}

}
