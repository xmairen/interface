package com.newtouch.yida;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class testBing {
	private WebDriver driver;
	private String baseUrl;
	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.firefox.bin", "D:\\Mozilla Firefox\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.bing.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void testCase() throws Exception {
		driver.get(baseUrl + "/");
		driver.findElement(By.id("sb_form_q")).sendKeys("testNG");
		driver.findElement(By.id("sb_form_go")).click();
		Thread.sleep(2000);
		String title =driver.getTitle();
		assertEquals(title,"testNG - 国内版 Bing");
	}
	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
}
}