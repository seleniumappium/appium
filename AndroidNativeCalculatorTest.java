package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidNativeCalculatorTest 
{
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		//Common Capability
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "B1-730HD");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		
		//Android Capability - Application
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		//Calculator Application
		WebElement element7 = driver.findElement(By.name("7"));
		element7.click();
		
		WebElement elementPlus = driver.findElement(By.id("com.android.calculator2:id/plus"));
		elementPlus.click();
		
		WebElement element9 = driver.findElement(By.id("com.android.calculator2:id/digit9"));
		element9.click();
		
		
		WebElement elementEqual = driver.findElementByAccessibilityId("equals");
		elementEqual.click();
		
		WebElement textFieldElement = driver.findElement(By.className("android.widget.EditText"));
		String text = textFieldElement.getText();
		System.out.println(text);
		
		driver.closeApp();
	}
}
