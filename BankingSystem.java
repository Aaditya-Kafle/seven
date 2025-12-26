package example;

public class BankingSystem {
	private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}
class myName{
	public void name() {
		System.out.println("Aaditya Kafle");
	}
	public void studentName() {
		System.out.println("Ram");
	}
}
