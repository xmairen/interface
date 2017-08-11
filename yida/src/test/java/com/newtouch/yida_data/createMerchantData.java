package com.newtouch.yida_data;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import com.newtouch.yida_action.*;

import com.newtouch.yida_action.*;

public class createMerchantData {

	//登录方法
	public static void create(WebDriver driver) throws Exception {
		//*********************************第一页基本信息*******************************************************
		createMerchantAction.merchantManage(driver).click();//点击商户管理
		Thread.sleep(2000);
		createMerchantAction.merchantJoin(driver).click();//点击商户入驻
		Thread.sleep(2000);
		switchFrameAction.driverIn(driver);//切换内部frame
		createMerchantAction.merchantName(driver).sendKeys("熙熙的餐饮");//输入商户名称
		createMerchantAction.merchantPhone(driver).sendKeys("18629356280");//输入登录手机
		Select sel = new Select(createMerchantAction.merchantLevel(driver));//选择商户级别
		sel.selectByIndex(1);//选择商户级别
		createMerchantAction.principal(driver).sendKeys("许萌");//输入商户负责人
		createMerchantAction.container(driver).click();//选择商户对接人
		createMerchantAction.containerInput(driver).sendKeys("许萌");//输入商户对接人
		Thread.sleep(2000);
		createMerchantAction.containerChoose(driver).click();//选择对应列出的商户对接人
		createMerchantAction.nextBase(driver).click();//点击下一步
		
		//***************************************第二页账户信息**************************************************
		createMerchantAction.SettleSettings(driver).click();//点击结算设置添加
		Thread.sleep(2000);
		Select sel1 = new Select(createMerchantAction.SettleSelect(driver));//下拉框行业类别
		sel1.selectByIndex(1);//下拉框选择第二项
		createMerchantAction.setRate(driver).clear();//结算费率清空
		createMerchantAction.setRate(driver).sendKeys("9");//结算费率设置
		createMerchantAction.setWan(driver).click();//结算费率完成
		createMerchantAction.startMonney(driver).sendKeys("100");//起始提现金额
		createMerchantAction.moneyRate(driver).sendKeys("1");//提现费率
		createMerchantAction.cashFee(driver).sendKeys("1");//最小提现手续费
		createMerchantAction.bankCardNo(driver).sendKeys("6225768783396666");//提现银行卡
		createMerchantAction.bankName(driver).click();//银行名称搜索按钮
		Thread.sleep(2000);
		createMerchantAction.bankNameChoose(driver).click();//银行名称搜索按钮
		Thread.sleep(2000);
		createMerchantAction.bankAccountName(driver).sendKeys("熙熙餐饮银行账户");//银行账户
		Thread.sleep(2000);
		createMerchantAction.secondFinish(driver).click();//第二页完成
		
		//***************************************第三页开票信息**************************************************
		createMerchantAction.companyName(driver).sendKeys("熙熙餐饮单位名称");//银行账户
		createMerchantAction.address(driver).sendKeys("科技二路软件园秦凤阁");//地址
		createMerchantAction.telephoneNumber(driver).sendKeys("18629356280");//电话
		createMerchantAction.bankName2(driver).click();//开户行点击
		Thread.sleep(2000);
		createMerchantAction.bankName2Choose(driver).click();//开户行选择点击
		createMerchantAction.bankAccount(driver).sendKeys("6225768783396666");//账号
		createMerchantAction.taxpayerIdentification(driver).sendKeys("0006225768783396666");//纳税人识别号
		createMerchantAction.thirdFinish(driver).click();//第三页下一步
		
		//***************************************第四页店铺及收款信息**************************************************
		createMerchantAction.apiName(driver).sendKeys("熙熙的店铺1");//店铺名称
		createMerchantAction.apiPeople(driver).sendKeys("许萌");//收款负责人
		Select sel2 = new Select(createMerchantAction.apiType(driver));//行业类别下拉框
		sel2.selectByIndex(1);//行业类别选择
		createMerchantAction.wan(driver).click();//确定
		createMerchantAction.fourthFinish(driver).click();//第四页完成
		
		
		
		
		//***************************************切换至外部Frame**************************************************
		switchFrameAction.driverOut(driver);
		
	}


}

