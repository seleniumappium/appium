package com.appium.ios;

import java.io.File;
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

public class WorkingWithIOSNativeApplication 
{
		public static void main(String[] args) throws MalformedURLException {
			DesiredCapabilities caps = new DesiredCapabilities();
			//Common Capability
			File file = new File("/Users/dnreddy/Documents/Appium/TestApp.app");
			caps.setCapability(MobileCapabilityType.APP, file);
			
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 Plus");
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
			
			
			IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			
			
			WebElement textField1 = driver.findElement(By.name("TextField1"));
			textField1.clear();
			textField1.sendKeys("abc");
			
			WebElement textField2 = driver.findElement(By.name("TextField2"));
			textField2.clear();
			textField2.sendKeys("xyz");

		}
}
