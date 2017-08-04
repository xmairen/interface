package com.newtouch.yida_data;
import org.openqa.selenium.*;
import com.newtouch.yida_action.*;

public class loginData {

	//登录方法
	public static void login(WebDriver driver){
		String[] data = readCSV.readCsvFile().split(",");
		loginAction.userName(driver).clear();
		loginAction.userName(driver).sendKeys(data[0]);
		loginAction.passWord(driver).clear();
		loginAction.passWord(driver).sendKeys(data[1]);
		loginAction.loginButton(driver).click();
	}
	//退出方法
	public static void loginOut(WebDriver driver) throws Exception {
		loginAction.loginOut1(driver).click();
		Thread.sleep(1000);
		loginAction.loginOut2(driver).click();
		}

}
