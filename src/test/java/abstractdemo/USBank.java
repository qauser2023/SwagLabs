package abstractdemo;

public abstract class USBank {
	// 1 - 100% abstraction - achieve 
	// concrete method + you can write any regular 
	
	public void deposit() {
		System.out.println("US BANK Deposit");
	}
	public void withdraw() {
		System.out.println("US BANK withdraw");
	}
	
	public abstract void checkBalance();

}
