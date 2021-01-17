package entities;

public class BusinessAccount extends Account{
	
	public BusinessAccount(Integer numero, String holder, double balance, double loanLimite) {
		super(numero, holder, balance);
		this.loanLimite = loanLimite;
	}

	private double loanLimite;
	
	public BusinessAccount() {
		super();
	}
	
	public void loanLimite() {
	}
	
	@Override
	public void saque(double dinheiro) {
		super.saque(dinheiro);
		balance -= 50;
	}
	
	

}
