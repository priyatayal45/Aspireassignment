package com.aspireappautomation.utils.businesslogic;

import org.openqa.selenium.WebDriver;

import com.aspireappautomation.utils.common.PageRepoFactory;

public class ProductPageBL 
{

	
	public void createProduct(WebDriver driver,String productname,String quantity)
	{
		PageRepoFactory.ProductPageRepo(driver).getProducts().click();
		PageRepoFactory.ProductPageRepo(driver).getListProducts().click();
		PageRepoFactory.ProductPageRepo(driver).getCreate().click();
		PageRepoFactory.ProductPageRepo(driver).getproductName().sendKeys(productname);
		PageRepoFactory.ProductPageRepo(driver).getupdateQuantity().click();
		PageRepoFactory.ProductPageRepo(driver).getcreateQuantity().click();
		PageRepoFactory.ProductPageRepo(driver).getinvntQuantity().clear();
		PageRepoFactory.ProductPageRepo(driver).getinvntQuantity().sendKeys(quantity);
		PageRepoFactory.ProductPageRepo(driver).getsaveBtn().click();	
	}
}
