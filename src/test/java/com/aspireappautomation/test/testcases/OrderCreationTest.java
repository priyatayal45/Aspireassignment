package com.aspireappautomation.test.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aspireappautomation.utils.common.BaseClass;
import com.aspireappautomation.utils.common.BusinessLogicFactory;
import com.aspireappautomation.utils.common.PageRepoFactory;

public class OrderCreationTest extends BaseClass

{
	WebDriver driver;

	@Test(priority = 0)
	public void loginTest() throws IOException {
		this.driver = BaseClass.driverSetUp();
		driver.get(BaseClass.configreader("Url"));
		driver.manage().window().maximize();
		BusinessLogicFactory.loginpagebl().login(driver);
	}

	@Test(priority = 1)
	public void selectInvntTest() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		BusinessLogicFactory.homepagebl().selectInventory(driver);
	}

	@Test(priority = 2)
	public void createPrdTest() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		BusinessLogicFactory.productpagebl().createProduct(driver, "TestAutomation_10","1");
	}

	@Test(priority = 3)
	public void createManufacturingOrdertest() throws InterruptedException {
		BusinessLogicFactory.manufacturingpagebl().createorder(driver, "TestAutomation_10");
		Assert.assertEquals(PageRepoFactory.manufacturingPageRepo(driver).getStatus().getText(), "Done");
		BaseClass.browserQuit();
	}
}
