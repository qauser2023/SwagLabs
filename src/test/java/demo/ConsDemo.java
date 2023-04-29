package demo;

import org.openqa.selenium.WebDriver;

public class ConsDemo {

	WebDriver driver ;// globally
	String name;
	
	
	public  ConsDemo(String name ){
		System.out.println("OVERLOADING CONS"+name);
	}

	ConsDemo(WebDriver driver , String name){
	this.driver = driver;
	this.name = name;
	}
	
	
	
}
