package com.aspireappautomation.utils.businesslogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aspireappautomation.utils.common.PageRepoFactory;

public class ManufacturingPageBL

{

	public void createorder(WebDriver driver, String productname) throws InterruptedException 
	{
		PageRepoFactory.ProductPageRepo(driver).gethomebtn().click();
		PageRepoFactory.manufacturingPageRepo(driver).getMftBtn().click();
		PageRepoFactory.manufacturingPageRepo(driver).getmftCreate().click();
		PageRepoFactory.manufacturingPageRepo(driver).getproducttxtbox().sendKeys(productname);
		PageRepoFactory.manufacturingPageRepo(driver).getElement(driver, productname).click();;
		PageRepoFactory.manufacturingPageRepo(driver).getconfirmBtn().click();
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(PageRepoFactory.manufacturingPageRepo(driver).getmarkasdoneBtn()));
		PageRepoFactory.manufacturingPageRepo(driver).getmarkasdoneBtn().click();
		PageRepoFactory.manufacturingPageRepo(driver).getokBtn().click();
		PageRepoFactory.manufacturingPageRepo(driver).getapplyBtn().click();
		String orderno = PageRepoFactory.manufacturingPageRepo(driver).getref().getText();
		PageRepoFactory.manufacturingPageRepo(driver).getback().click();
		PageRepoFactory.manufacturingPageRepo(driver).getremoveBtn().click();
		PageRepoFactory.manufacturingPageRepo(driver).getSearchBox().sendKeys(orderno);
		PageRepoFactory.manufacturingPageRepo(driver).getSearchBox().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.textToBePresentInElement(PageRepoFactory.manufacturingPageRepo(driver).getname(),orderno));

	}

}
