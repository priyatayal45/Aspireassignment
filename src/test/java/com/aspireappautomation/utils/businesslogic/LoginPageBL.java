package com.aspireappautomation.utils.businesslogic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aspireappautomation.utils.common.BaseClass;
import com.aspireappautomation.utils.common.PageRepoFactory;

public class LoginPageBL 
{

	public void login(WebDriver driver) throws IOException
	{
		PageRepoFactory.loginpagerepo(driver).getUsername().sendKeys(BaseClass.configreader("Username"));
		PageRepoFactory.loginpagerepo(driver).getPassword().sendKeys(BaseClass.configreader("Password"));
		PageRepoFactory.loginpagerepo(driver).getLgnBtn().click();
	}
	
	
	
}
