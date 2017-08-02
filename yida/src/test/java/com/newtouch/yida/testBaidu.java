package com.newtouch.yida;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
//import org.testng.annotations.Parameters;

public class testBaidu {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.baidu.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
//	@Parameters({"search_name1"})
	@Test
//	public void testCase(String search_name1) throws Exception{
//		driver.get(baseUrl + "/");
//		driver.findElement(By.id("kw")).sendKeys("testNG");
//		driver.findElement(By.id("su")).click();
//		Thread.sleep(2000);
//		String title =driver.getTitle();
//		assertEquals(title,"testNG_百度搜索");
//	}
//	
	public void testCase() throws Exception{
		driver.get(baseUrl + "/");
		driver.findElement(By.id("kw")).sendKeys("testNG");
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		String title =driver.getTitle();
		assertEquals(title,"testNG_百度搜索");
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
}
}