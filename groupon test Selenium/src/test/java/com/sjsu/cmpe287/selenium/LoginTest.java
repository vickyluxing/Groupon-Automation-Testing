package com.sjsu.cmpe287.selenium;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.groupon.com");
	}

	@Test
	public void testLogin() {
		// Click on "No Thanks" link
		WebElement firstTimePrompt = driver.findElement(By.cssSelector("#nothx"));
		if (firstTimePrompt != null) {
			firstTimePrompt.click();
		}
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("#ls-user-signin")).click();

		String email1 = "jihenglu@hotmail.com";
		String password1 = "luanna7123";
		WebDriverWait wait = new WebDriverWait(driver, 5);
		login(email1, password1, driver, wait);

		// wait and click Jiheng on the upper right
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-name")));
		WebElement firstName = driver.findElement(By.cssSelector("#user-name"));
		String value = firstName.getAttribute("data-user-name");
		assertEquals("Jiheng", value);
		firstName.click();

		// tap x to close pop up download app prompt
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("#web2app > div:nth-child(1) > a:nth-child(1)"))).click();

		driver.findElement(By.cssSelector("input.btn")).click();

		String email2 = "cynthialee.lee525@gmail.com";
		String password2 = "Liqi1025";
		login(email2, password2, driver, wait);

		// wait and click ACCOUNT button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ls-my-account > a:nth-child(1)")))
				.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user_firstName")));
		WebElement previous_firstName = driver.findElement(By.cssSelector("#user_firstName"));
		String p_fn = previous_firstName.getAttribute("value");

		if (p_fn.equals("QI")) {
			previous_firstName.clear();
			previous_firstName.sendKeys("Cynthia");
			// System.out.println(previous_firstName.getAttribute("QI"));
			assertEquals("Cynthia", driver.findElement(By.cssSelector("#user_firstName")).getAttribute("value"));
		} else {
			previous_firstName.clear();
			previous_firstName.sendKeys("QI");
			// System.out.println(previous_firstName.getAttribute("QI"));
			assertEquals("QI", driver.findElement(By.cssSelector("#user_firstName")).getAttribute("value"));
		}

		// Click Save Changes Button
		driver.findElement(By.cssSelector(".btn-cta")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".notification")));
		assertTrue(isElementPresent(By.cssSelector(".notification")));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void login(String email, String password, WebDriver driver, WebDriverWait wait) {
		// wait to type in input
		WebElement findEmail;
		findEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email-input")));
		findEmail.sendKeys(email);
		driver.findElement(By.cssSelector("#password-input")).sendKeys(password);

		// unclick "Keep me signed in on this computer" button
		driver.findElement(By.cssSelector("#field-remember-me-checkbox > label:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".social-remember-me > label:nth-child(2)")).click();

		// click signin
		driver.findElement(By.cssSelector("#signin-button")).click();

	}

}
