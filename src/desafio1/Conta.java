package desafio1;

public abstract class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	protected double rendimento;
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public double Rendimento() {
		double rendimentoMensal = this.saldo * this.rendimento;
		return rendimentoMensal;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
