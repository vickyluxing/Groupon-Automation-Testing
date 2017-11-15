package com.myappiumtest;
import java.io.*;
import java.util.Random;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Hello world!
 *
 */
public class App 
{
	protected AndroidDriver driver;

    protected void prepareAndroidForAppium() throws MalformedURLException {
        File appDir = new File("/Users/LuXing/Documents/workspace/Appium/Apk/");
        File app = new File(appDir, "com.groupon.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("device","Android");

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }  
}
