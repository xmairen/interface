package com.newtouch.yida_action;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginAction {
	private static WebElement element = null;
	
	public static WebElement userName(WebDriver driver){
		element = driver.findElement(By.id("username"));
		return element;
	}

	public static WebElement passWord(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement loginButton(WebDriver driver){
		element = driver.findElement(By.id("login_btn"));
		return element;
	}
	
	public static WebElement loginOut1(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a/span"));
		return element;
	}
	
	public static WebElement loginOut2(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/ul/li[2]/div[1]/a"));
		return element;
	}
}
