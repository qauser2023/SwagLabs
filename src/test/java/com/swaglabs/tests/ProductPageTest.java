package com.swaglabs.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.swaglabs.pages.CompletePage;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.OverviewPage;
import com.swaglabs.pages.ProductPage;
import com.swaglabs.pages.YourCartPage;
import com.swaglabs.pages.YourInformationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPageTest {

	WebDriver driver;
	LoginPage loginPage;
	ProductPage prodPage;
	YourCartPage yourCartPage;
	YourInformationPage yourInformation;
	OverviewPage overviewPage;
	CompletePage completePage;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOption);
		loginPage = new LoginPage(driver);
		prodPage = new ProductPage(driver);
		yourCartPage = new YourCartPage(driver);
		yourInformation = new YourInformationPage(driver);
		overviewPage = new OverviewPage(driver);
		completePage = new CompletePage(driver);
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void verifyProductCount() {
		prodPage = loginPage.login();
		int actualTotlalItemCount = prodPage.getTotalItem();
		Assert.assertEquals(actualTotlalItemCount, 6);
	}
	
	@Test
	public void verifyBackpackProductView() throws InterruptedException {
		prodPage = loginPage.login();
		prodPage.viewBackpackItem();
		prodPage.addToCart();
		prodPage.clickShoppingCart();
		Thread.sleep(10000);
		
		yourCartPage.clickCheckOut();// exception
		yourInformation.enterInformation();
		overviewPage.clickFinishBtn();// success msh
		completePage.backToProductPage();
		// validation 
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
