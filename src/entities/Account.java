package entities;

public class Account {
	
	private Integer numero;
	private String holder;
	protected double balance;
	
	public Account() {
		
	}

	public Account(Integer numero, String holder, double balance) {
		this.numero = numero;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void saque(double dinheiro) {
		balance -= dinheiro + 5.0;
	}
	
	public void deposito(double dinheiro) {
		balance += dinheiro;
	}
	
	
	
	

}
