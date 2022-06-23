package desafio3;

public class PessoaTeste {

	public static void main(String[] args) {

		//Objeto instanciado a partir do construtor padrão
		Pessoa pessoa1 = new Pessoa();
		
		//Valores atribuídos ao objeto através dos métodos setters
		pessoa1.setNome("Antonio");
		pessoa1.setEndereco("Rua das Laranjeiras, 75");
		pessoa1.setTelefone("(11) 97568-2235");
		
		//Valores impressos através do toString()
		System.out.println(pessoa1);
	}

}
