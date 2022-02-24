package com.aspireappautomation.utils.common;

import com.aspireappautomation.utils.businesslogic.HomePageBL;
import com.aspireappautomation.utils.businesslogic.LoginPageBL;
import com.aspireappautomation.utils.businesslogic.ManufacturingPageBL;
import com.aspireappautomation.utils.businesslogic.ProductPageBL;
import com.aspireappautomation.utils.pagerepositories.ManufacturingPageRepo;

public class BusinessLogicFactory {

	private static LoginPageBL loginpagebl;
	private static HomePageBL homepagebl;
	private static ProductPageBL productpagebl;
	private static ManufacturingPageBL manufacturingpagebl;
	
	public static LoginPageBL loginpagebl() {
		return loginpagebl != null ? loginpagebl : new LoginPageBL();
	}

	public static HomePageBL homepagebl() {
		return homepagebl != null ? homepagebl : new HomePageBL();
	}

	public static ProductPageBL productpagebl() {
		return productpagebl != null ? productpagebl : new ProductPageBL();
	}
	
	public static ManufacturingPageBL manufacturingpagebl() {
		return manufacturingpagebl != null ? manufacturingpagebl : new ManufacturingPageBL();
	}
}
