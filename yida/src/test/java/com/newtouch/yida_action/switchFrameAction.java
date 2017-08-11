package com.newtouch.yida_action;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class switchFrameAction {
	private static WebElement element = null;
	
	public static WebDriver driverIn(WebDriver driver){
		driver = driver.switchTo().frame("contentFrame");//切换内部frame
		return driver;
	}
	
	public static WebDriver driverOut(WebDriver driver){
		driver = driver.switchTo().defaultContent();//切换外部frame
		return driver;
	}
}
