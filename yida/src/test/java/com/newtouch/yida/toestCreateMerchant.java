package com.newtouch.yida;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.newtouch.yida_data.*;


public class toestCreateMerchant {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass
	public void setUp() throws Exception {
//		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.bin", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		baseUrl = "http://unified.xanewtouch.cn/park/login.html";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testCase() throws Exception{
		driver.get(baseUrl);
		driver.manage().window().maximize();
		loginData.login(driver);
		Thread.sleep(2000);
		createMerchantData.create(driver);
		loginData.loginOut(driver);

	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
}
}

