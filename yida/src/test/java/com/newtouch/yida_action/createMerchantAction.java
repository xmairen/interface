package com.newtouch.yida_action;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.support.ui.Select;


public class createMerchantAction {
	private static final WebElement Select = null;
	private static WebElement element = null;
	
	//************************第一页基本信息*******************************************		
	public static WebElement merchantManage(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a/span[1]"));//点击商户管理
		return element;
	}

	public static WebElement merchantJoin(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/ul/li[1]/a"));//点击商户入驻
		return element;
	}
	
	
	public static WebDriver driver(WebDriver driver){
		driver = driver.switchTo().frame("contentFrame");//切换内部frame
		return driver;
	}
	
	public static WebElement merchantName(WebDriver driver){
		element = driver.findElement(By.name("name"));//点击商户名称
		return element;	
	}
	
	public static WebElement merchantPhone(WebDriver driver){
		element = driver.findElement(By.id("mobile"));//点击登录手机
		return element;	
	}
	
	public static WebElement merchantLevel(WebDriver driver){
		element = driver.findElement(ById.xpath("//select[@id='level']"));//点击商户级别
		return element;	
	}
	
	
	public static WebElement principal(WebDriver driver){
		element = driver.findElement(By.id("principal"));//商户负责人
		return element;	
	}
	
	public static WebElement container(WebDriver driver){
		element = driver.findElement(By.id("select2-dockingPeople-container"));//商户对接人
		return element;	
	}
	
	public static WebElement containerInput(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));//商户对接人输入框
		return element;
	}
	
	public static WebElement containerChoose(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li"));//商户对接人选择结果
		return element;	
	}
	
	public static WebElement nextBase(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/div/div[2]/div/div[1]/div/button"));//基本信息下一步
		return element;	
	}
	
//************************第二页账户信息*******************************************	
	public static WebElement SettleSettings(WebDriver driver){
		element = driver.findElement(By.id("setAdd"));//结算设置行业类别
		return element;	
	}
	
	public static WebElement SettleSelect(WebDriver driver){
		element = driver.findElement(By.id("setType"));//结算设置行业类别下拉框
		return element;	
	}
	
	public static WebElement setRate(WebDriver driver){
		element = driver.findElement(By.id("setRate"));//结算设置行业费率
		return element;	
	}
	
	public static WebElement setWan(WebDriver driver){
		element = driver.findElement(By.id("setWan"));//结算设置确定
		return element;	
	}
	
	public static WebElement startMonney(WebDriver driver){
		element = driver.findElement(By.id("withdrawalsStartMoney"));//提现起始金额
		return element;	
	}
	
	public static WebElement moneyRate(WebDriver driver){
		element = driver.findElement(By.id("withdrawalsRate"));//提现费率
		return element;	
	}
	
	public static WebElement cashFee(WebDriver driver){
		element = driver.findElement(By.id("minWithdrawCashFee"));//最小提现手续费
		return element;	
	}
	
	public static WebElement bankCardNo(WebDriver driver){
		element = driver.findElement(By.id("bankCardNo"));//提现银行卡
		return element;	
	}
	
	public static WebElement bankName(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/div/div[2]/div/div[2]/form/div/div/div[3]/div[2]/div/button"));//银行名称搜索按钮
		return element;	
	}
	
	public static WebElement bankNameChoose(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[1]/section/div/div[7]/div/div/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[3]/td[3]/button"));//银行账户名称选择
		return element;	
	}
	
	public static WebElement bankAccountName(WebDriver driver){
		element = driver.findElement(By.id("bankAccountName"));//银行账户名称
		return element;	
	}
	
	public static WebElement secondFinish(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/div/div[2]/div/div[2]/div/button[2]"));//第二页最后下一步
		return element;	
	}
	
	
	//************************第三页开票信息*******************************************	
	public static WebElement companyName(WebDriver driver){
		element = driver.findElement(By.id("companyName"));//单位名称
		return element;	
	}
	
	public static WebElement address(WebDriver driver){
		element = driver.findElement(By.id("address"));//地址
		return element;	
	}
	
	public static WebElement telephoneNumber(WebDriver driver){
		element = driver.findElement(By.id("telephoneNumber"));//电话
		return element;	
	}
	
	public static WebElement bankName2(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/div/div[2]/div/div[3]/form/div/div/div[4]/div/button"));//开户行
		return element;	
	}//开户行
	
	
	public static WebElement bankName2Choose(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div[1]/section/div/div[7]/div/div/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[3]/td[3]/button"));//开户行
		return element;	
	}//开户行选择
	
	public static WebElement bankAccount(WebDriver driver){
		element = driver.findElement(By.id("bankAccount"));//账号
		return element;	
	}
	
	public static WebElement taxpayerIdentification(WebDriver driver){
		element = driver.findElement(By.id("taxpayerIdentification"));//纳税人识别号
		return element;	
	}
	
	public static WebElement thirdFinish(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/div/div[2]/div/div[3]/div/button[2]"));//第三页最后下一步
		return element;	
	}
	
	//************************第四页店铺及收款信息*******************************************	
	
	public static WebElement apiName(WebDriver driver){
		element = driver.findElement(By.id("apiName"));//店铺名称
		return element;	
	}
	
	public static WebElement apiPeople(WebDriver driver){
		element = driver.findElement(By.id("apiPeople"));//收款负责人
		return element;	
	}
	
	public static WebElement apiType(WebDriver driver){
		element = driver.findElement(By.id("apiType"));//行业类别下拉框
		return element;	
	}
	
	public static WebElement wan(WebDriver driver){
		element = driver.findElement(By.id("wan"));//确定
		return element;	
	}
	
	public static WebElement fourthFinish(WebDriver driver){
		element = driver.findElement(By.xpath("/html/body/div/section/div/div[1]/div/div[2]/div/div[4]/div[2]/button[2]"));//第四页最后下一步
		return element;	
	}
	
	
	
	
	
	
	
	
	
	
	public static WebDriver driver1(WebDriver driver){
		driver = driver.switchTo().defaultContent();
		return driver;
	}
	
	
}
