package demo;

import org.openqa.selenium.WebDriver;

public class TestCons {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		new ConsDemo(driver, "hello");// calling the constructor
		ConsDemo cd1 = new ConsDemo("hello");

	}

}
