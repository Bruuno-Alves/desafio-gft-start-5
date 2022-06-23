package desafio1;

public class ContaTeste {

	public static void main(String[] args) {

		//Valores adicionados diretamente na instância dos objetos
		ContaCorrente cc = new ContaCorrente(0010020034, "Jose", 1000.00);
		ContaPoupanca cp = new ContaPoupanca(0040050067, "Alberto", 1000.00);
		
		//Valores impressos através do método toString()
		System.out.println(cc);
		System.out.println(cp);
		
		System.out.println("O imposto sobre rendimento da Conta Corrente é R$ " + cc.calcularImposto() + "\n");
		System.out.println("O imposto sobre rendimento da Conta Corrente é R$ " + cp.calcularImposto() + "\n");
		
	}

}
