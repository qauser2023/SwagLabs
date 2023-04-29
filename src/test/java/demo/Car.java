package demo;

public interface Car {
	
	// concrete method/ method prototype
	// 100% abstraction
	public void drive();  // functionality/ business logic
	
	public void start(); // half-cooked
	
	public void stop();
	
	public int getMileage(); // int
	
	 // check bal()//  - insert card -> enter pin - re-enter pin

	// we can not have any static or method body before Java 8 + public static , default method body
	
	// We can NEVER create any Object of INTERFACE/ ABSTRACT CLASS
	
	default void greetings() {
		System.out.println("Default Method from CAR INTERFACE");
	}
	
	public static void byeBye() {
		System.out.println("STATIC Method from CAR INTERFACE");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
