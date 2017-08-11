package com.newtouch.yida_data;

import org.openqa.selenium.WebDriver;

import com.newtouch.yida_action.memberExportAction;
import com.newtouch.yida_action.switchFrameAction;


public class memberExportData {
	
	public static void memberExportData(WebDriver driver){
		switchFrameAction.driverIn(driver);//切换内部Frame
		memberExportAction.export(driver).click();//点击会员导出
		switchFrameAction.driverOut(driver);//切换外部Frame
		
		
	}
}

