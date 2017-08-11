//园区配置管理--用户管理--添加用户
package com.newtouch.yida_data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.newtouch.yida_action.addUserAction;
import com.newtouch.yida_action.switchFrameAction;;

public class addUserData {
	
	public static void addUserData(WebDriver driver) throws Exception{
		addUserAction.userManage(driver).click();//点击用户管理
		Thread.sleep(3000);
		switchFrameAction.driverIn(driver);//切换内部Frame
		Thread.sleep(2000);
		addUserAction.addUser(driver).click();//点击添加用户
		Thread.sleep(2000);
		addUserAction.userAvatar(driver).click();//点击头像
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E://javaproject//project1//yida//upload.exe");
		Thread.sleep(2000);
		addUserAction.userName(driver).sendKeys("笑嘻嘻");//输入用户名
		addUserAction.realName(driver).sendKeys("许萌");//输入真实姓名
		addUserAction.phone(driver).sendKeys("18629356280");//输入手机号
		addUserAction.sex(driver).click();//选择性别
		addUserAction.birthday(driver).sendKeys("2017/08/11");//输入生日
		addUserAction.qq(driver).sendKeys("47852538");//输入QQ号
		addUserAction.email(driver).sendKeys("47852538@qq.com");//输入邮箱
		Select selRole = new Select(addUserAction.role(driver));//下拉框角色
		Thread.sleep(2000);
		selRole.selectByIndex(2);//下拉框选择角色
		Select selDepartment = new Select(addUserAction.department(driver));//下拉框所属部门
		Thread.sleep(2000);
		selDepartment.selectByIndex(2);//下拉框选择所属部门
		addUserAction.remarks(driver).sendKeys("笑嘻嘻的备注信息");//输入备注信息
		addUserAction.submit(driver).click();//点击完成
		
		switchFrameAction.driverOut(driver);//切换外部Frame
		
	}
}

