package desafio3;

public class PessoaTeste {

	public static void main(String[] args) {

		//Objeto instanciado a partir do construtor padr�o
		Pessoa pessoa1 = new Pessoa();
		
		//Valores atribu�dos ao objeto atrav�s dos m�todos setters
		pessoa1.setNome("Antonio");
		pessoa1.setEndereco("Rua das Laranjeiras, 75");
		pessoa1.setTelefone("(11) 97568-2235");
		
		//Valores impressos atrav�s do toString()
		System.out.println(pessoa1);
	}

}
