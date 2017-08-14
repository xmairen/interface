//园区配置管理--用户管理--添加用户
package com.newtouch.yida_action;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addUserAction {
	private static WebElement element = null;
	
	public static WebElement userManage(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[14]/a"));
		return element;
	}//点击用户管理
	
	public static WebElement addUser(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div/div/div[1]/div/a"));
		return element;
	}//点击添加用户
	
	public static WebElement userAvatar(WebDriver driver){
		element = driver.findElement(By.id("userAvatar"));
		return element;
	}//点击头像
	
	public static WebElement userName(WebDriver driver){
		element = driver.findElement(By.id("username"));
		return element;
	}//输入用户名
	
	public static WebElement realName(WebDriver driver){
		element = driver.findElement(By.id("realname"));
		return element;
	}//输入真实姓名

	public static WebElement phone(WebDriver driver){
		element = driver.findElement(By.id("phone"));
		return element;
	}//输入手机号
	
	public static WebElement sex(WebDriver driver){
		element = driver.findElement(By.id("sexWomen"));
		return element;
	}//选择性别
	
	public static WebElement birthday(WebDriver driver){
		element = driver.findElement(By.id("birthday"));
		return element;
	}//输入生日
	
	public static WebElement qq(WebDriver driver){
		element = driver.findElement(By.id("qq"));
		return element;
	}//输入QQ号
	
	public static WebElement email(WebDriver driver){
		element = driver.findElement(By.id("email"));
		return element;
	}//输入邮箱
	
	public static WebElement role(WebDriver driver){
		element = driver.findElement(By.id("role"));
		return element;
	}//下拉框角色
	
	public static WebElement department(WebDriver driver){
		element = driver.findElement(By.id("department"));
		return element;
	}//下拉框所属部门
	
	public static WebElement remarks(WebDriver driver){
		element = driver.findElement(By.id("remarks"));
		return element;
	}//输入备注信息
	
	public static WebElement submit(WebDriver driver){
		element = driver.findElement(By.id("submit"));
		return element;
	}//点击提交
	
	public static WebElement delete(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/div/button[3]"));
		return element;
	}//点击删除
	
	public static WebElement deleteConfirm(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]"));
		return element;
	}//点击确定

			
	
	
	
	
	

}
