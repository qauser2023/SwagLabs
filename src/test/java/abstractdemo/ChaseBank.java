package abstractdemo;

public class ChaseBank extends USBank{

	@Override
	public void checkBalance() {
		System.out.println("CHASE BANK BAL: $10,0000");
		
	}
	public static void main(String[] args) {
		
		ChaseBank cb = new ChaseBank();
		cb.checkBalance();
		cb.deposit();
		cb.withdraw();
	}
	

}
