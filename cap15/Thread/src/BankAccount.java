
    class BankAccount {
	
	private int balance;
	
	public BankAccount(int start) {
		balance = start;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}	

	public int getBalance() {
		return balance;
	}

	/*public void setBalance(int balance) {
		this.balance = balance;
	}*/
	
	
}
