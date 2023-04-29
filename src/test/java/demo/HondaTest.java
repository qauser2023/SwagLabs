package demo;

public class HondaTest extends Honda {

	public static void main(String[] args) {
		HondaTest ht = new HondaTest();
		ht.drive();

	}

	@Override
	public void drive() {
		System.out.println("HONDA DRIVE");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return 0;
	}

}
