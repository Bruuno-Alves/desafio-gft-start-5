package desafio1;

public class ContaTeste {

	public static void main(String[] args) {

		//Valores adicionados diretamente na inst�ncia dos objetos
		ContaCorrente cc = new ContaCorrente(0010020034, "Jose", 1000.00);
		ContaPoupanca cp = new ContaPoupanca(0040050067, "Alberto", 1000.00);
		
		//Valores impressos atrav�s do m�todo toString()
		System.out.println(cc);
		System.out.println(cp);
		
		System.out.println("O imposto sobre rendimento da Conta Corrente � R$ " + cc.calcularImposto() + "\n");
		System.out.println("O imposto sobre rendimento da Conta Corrente � R$ " + cp.calcularImposto() + "\n");
		
	}

}
