package com.aspireappautomation.utils.businesslogic;

import org.openqa.selenium.WebDriver;

import com.aspireappautomation.utils.common.PageRepoFactory;

public class HomePageBL 
{

	public void selectInventory(WebDriver driver)
	{
		PageRepoFactory.homePageRepo(driver).getInventory().click();	
	}
}
