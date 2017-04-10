package com.appium.ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.reporters.jq.Main;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSWebApplication 
{
	 public static void main(String[] args) throws MalformedURLException 
	 {
		 	DesiredCapabilities caps = new DesiredCapabilities();
			//Common Capability
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 Plus");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
			caps.setCapability(MobileCapabilityType.NO_RESET, true);

			IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			driver.get("http://www.google.com");
			
			
			//Calculator Application
			WebElement textElement = driver.findElement(By.id("lst-ib"));
			textElement.clear();
			textElement.sendKeys("Selenium");
	}
}
