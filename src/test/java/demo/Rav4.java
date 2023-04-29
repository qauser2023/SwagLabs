package demo;

public class Rav4 implements Car{

	@Override
	public void drive() {
		System.out.println("Rav4 Class - drive");
	}

	@Override
	public void start() {
		System.out.println("Rav4 Class - start");
	}

	@Override
	public void stop() {
		System.out.println("Rav4 Class - stop");
	}

	@Override
	public int getMileage() {
		int mileage = 150312;
		System.out.println(mileage);
		return mileage;
	}
	
	public static void main(String[] args) {
		Rav4 r = new Rav4();
		
		r.drive();
		r.getMileage();
		
		r.greetings();
		Car.byeBye();
		
	}

}
