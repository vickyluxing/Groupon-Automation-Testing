package com.sjsu.cmpe287.selenium;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.groupon.com");
	}

	@Test
	public void testPurchase() throws InterruptedException {
		WebElement firstTimePrompt = driver.findElement(By.cssSelector("#nothx"));
		if (firstTimePrompt != null) {
			firstTimePrompt.click();
		}
		driver.navigate().refresh();

		// browse things to do
		driver.findElement(By.cssSelector("figure.cui-c-navigation-tile:nth-child(1) > a:nth-child(1)")).click();
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// select San Jose
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[@data-id='san-jose']/descendant::label/a"))).click();

		// Click Sort by Relevance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#grpn-sorts-select"))).click();
		// Click Distance
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#grpn-sorts-select > option:nth-child(2)"))).click();

		Thread.sleep(6000);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//figure[@data-pingdom-info='purchasable-deal']")));

		List<WebElement> figureList = driver.findElements(By.xpath("//figure[@data-pingdom-info='purchasable-deal']"));
		WebElement figureElements = figureList.get(4);
		System.out.println(figureElements.findElement(By.tagName("a")).getAttribute("href"));
		String newURL = figureElements.findElement(By.tagName("a")).getAttribute("href");
		driver.get(newURL);
		Thread.sleep(6000);
		// click buy
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-bhw='BuyButton']"))).click();
		Thread.sleep(6000);

		String email = "jihenglu@hotmail.com";
		String password = "luanna7123";

		// wait to type in input
		WebElement findEmail;
		findEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-email-input")));
		findEmail.sendKeys(email);
		driver.findElement(By.cssSelector("#login-password-input")).sendKeys(password);

		// unclick "Keep me signed in on this computer" button
		driver.findElement(By.cssSelector("#field-remember-me-checkbox-login-checkout > label:nth-child(2)")).click();
		driver.findElement(By.cssSelector(
				"div.tab-content:nth-child(1) > div:nth-child(3) > div:nth-child(3) > fieldset:nth-child(1) > label:nth-child(2)"))
				.click();

		// click signin
		driver.findElement(By.cssSelector("#sign-in-checkout")).click();
//		assertEquals(driver.findElement(By.cssSelector("#mod-welcome")).getAttribute("data-bhw-path"),
//				"ConfirmationForm|ModWelcome");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
