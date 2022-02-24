package com.aspireappautomation.utils.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aspireappautomation.utils.pagerepositories.HomePageRepo;
import com.aspireappautomation.utils.pagerepositories.LoginpageRepo;
import com.aspireappautomation.utils.pagerepositories.ManufacturingPageRepo;
import com.aspireappautomation.utils.pagerepositories.ProductPageRepo;

public class PageRepoFactory

{
	static LoginpageRepo loginPageRepo;
	static HomePageRepo homePageRepo;
	static ProductPageRepo productPageRepo;
	static ManufacturingPageRepo manufacturingPageRepo;

	public static LoginpageRepo loginpagerepo(WebDriver driver) {
		if (loginPageRepo == null) {

			loginPageRepo = PageFactory.initElements(driver, LoginpageRepo.class);
		}
		return loginPageRepo;

	}

	public static HomePageRepo homePageRepo(WebDriver driver) {
		if (homePageRepo == null) {

			homePageRepo = PageFactory.initElements(driver, HomePageRepo.class);
		}
		return homePageRepo;

	}

	public static ProductPageRepo ProductPageRepo(WebDriver driver) {
		if (productPageRepo == null) {

			productPageRepo = PageFactory.initElements(driver, ProductPageRepo.class);
		}
		return productPageRepo;

	}

	public static ManufacturingPageRepo manufacturingPageRepo(WebDriver driver) {
		if (manufacturingPageRepo == null) {

			manufacturingPageRepo = PageFactory.initElements(driver, ManufacturingPageRepo.class);
		}
		return manufacturingPageRepo;

	}

}
