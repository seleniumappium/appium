package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.reporters.jq.Main;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidWebApplication 
{
	 public static void main(String[] args) throws MalformedURLException 
	 {
		 	DesiredCapabilities caps = new DesiredCapabilities();
			//Common Capability
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "B1-730HD");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
			
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");


			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			driver.get("http://www.google.com");
			
			
			//Calculator Application
			WebElement textElement = driver.findElement(By.id("lst-ib"));
			textElement.clear();
			textElement.sendKeys("Selenium");
	}
}
