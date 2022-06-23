package desafio3;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	
	//Construtor padrão
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() +
				"\nEndereço: " + this.getEndereco() +
				"\nTelefone: " + this.getTelefone();
	}

}
