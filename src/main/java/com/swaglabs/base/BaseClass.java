package com.swaglabs.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

// PARENT CLASS
public class BaseClass {// 
	
	public static WebDriver driver; // passing this driver to all my page classes

	@BeforeMethod
	public void setup() {
		// readConfig();
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOption);
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public void readConfig() {
		String filePath = System.getProperty("user.dir") + "/config.properties";
		System.err.println(filePath);

		Properties prop = new Properties();
		FileInputStream ip = null;
		try {
			ip = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String s = prop.getProperty("username");
		System.out.println(s);
		System.out.println(prop.getProperty("browser"));
	}

}
