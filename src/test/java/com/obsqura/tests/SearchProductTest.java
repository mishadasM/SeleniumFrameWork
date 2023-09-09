package com.obsqura.tests;


import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ProductsPage;

public class SearchProductTest extends BaseTest {

	
	@Test
	public void MySearchProductTest() {
		
		
		
		lp.Login();
		hp.NavigateToManageProduct();
		pp.ClickSearchBtn();
		pp.ValidateSearchProduct("Maggi");
		
		
	}
}