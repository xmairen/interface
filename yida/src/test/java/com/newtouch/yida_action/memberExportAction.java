package com.newtouch.yida_action;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class memberExportAction {
	private static WebElement element = null;
	
	public static WebElement export(WebDriver driver){
		element = driver.findElement(By.id("export"));
		return element;
	}//会员信息管理导出按钮


}
