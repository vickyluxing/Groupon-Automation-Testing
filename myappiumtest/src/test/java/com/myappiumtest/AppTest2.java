package com.myappiumtest;

import java.awt.RenderingHints.Key;
//import java.io.*;
import java.util.Random;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.*;

public class AppTest2 {

	private static AppiumDriver driver;

	@SuppressWarnings("unchecked")
	@Test
	public void funLocationAccess() throws InterruptedException {

		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]")).isDisplayed()){
			System.out.println("\n User Login Page is displayed.");
		}else{
			System.out.println("\n User Login Page is not displayed.");
		}

		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).sendKeys("test287group16@gmail.com");;
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.EditText[2]")).sendKeys("287group16");
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).getText().equals("lu xing")){
			System.out.println("\n User login successfully.");
		}else{
			System.out.println("\n User Login failed.");
		}
		Thread.sleep(2000);
		driver.tap(1, 954, 66, 100);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")).click();
		Thread.sleep(2000);
		
		Cin_text text = new Cin_text();
		String s = text.readFileByLines().trim();
 		
		WebElement we = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]"));
		we.sendKeys(s);
		
		Thread.sleep(2000);
		System.out.println("\n result");
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]").click();
		System.out.println("\n Select the first result.");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")).click();
		System.out.println("\n Select an item.");
		Thread.sleep(2000);
		
		try{
			List<WebElement> eee = driver.findElements(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.support.v7.widget.RecyclerView[1]/android.support.v7.widget.RecyclerView[1]/*/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"));
			System.out.println(eee.size());
			for (WebElement e : eee){
				e.click();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.Button[1]")).click();
		System.out.println("\n add to shopping cart");
		Thread.sleep(2000);
		
		if(driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]")).isDisplayed()){
			System.out.println("\n Add successfully.");
		}else{
			System.out.println("\n Add failed.");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		System.out.println("\n Back.");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		System.out.println("\n Back.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		System.out.println("\n Back.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		System.out.println("\n Back to the main screen.");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		System.out.println("\n Click the side menu.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]")).click();
		Thread.sleep(2000);
		System.out.println("\n show sign out option.");
		driver.findElement(By.xpath("//android.widget.ListView[1]/android.widget.LinearLayout[1]")).click();
		Thread.sleep(2000);
		System.out.println("\n Sign out.");
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[2]")).click();
		Thread.sleep(2000);
		System.out.println("\n Confirmed.");
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
		System.out.println("\n Click the side menu.");
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).getText().equals("LOG IN OR SIGN UP")){
			System.out.println("\n LOG OUT successfully.");
		}else{
			System.out.println("\n LOG OUT failed.");
		}
	}


	@BeforeMethod
	//@Parameters({"emulator-5554","UDID_","5.1.1","127.0.0.1:4723"})
	public void beforeMethod() throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "XXXX");
		cap.setCapability("appPackage", "com.groupon");
		cap.setCapability("appActivity", "com.groupon.home.main.activities.Carousel");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.EditText[1]")).sendKeys("San Jose");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
		Thread.sleep(10000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

