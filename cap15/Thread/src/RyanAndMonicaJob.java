
public class RyanAndMonicaJob implements Runnable {                                                                                                       
	
	private BankAccount account = new BankAccount(100);
	
	public void run () {
		
		for (int x = 0; x<10; x++) {
			makeWithdraw(6);
			if (account.getBalance() < 0) {
				System.out.println("Estouro!");
			}
		}
	}
	
	public synchronized void makeWithdraw(int amount) {
		if (account.getBalance() > amount) {
			System.out.println(Thread.currentThread().getName() + " vai fazer uma retirada!");
			try {
				System.out.println(Thread.currentThread().getName() + " vai dormir");
				Thread.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " acordou!");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " concluiu a retirada");
		} else {
			System.out.println("Não há saldo suficiente para a retirada de " + Thread.currentThread().getName());
		}
	}
	
	public static void main (String[] args) {
		
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
				
	}
	                                                               
}
       