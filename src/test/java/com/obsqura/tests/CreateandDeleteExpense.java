package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.DateUtility;

public class CreateandDeleteExpense  extends BaseTest{

	@Test
	public void MyCreateDeleteExpense() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		HomePage hp = new HomePage(driver);
		hp.NavigateToManageExpense();
		
		ExpenseCategoryPage ecp = new ExpenseCategoryPage(driver);
		String date=DateUtility.GetCurrentDate();
		ecp.CreateUniqueTitle(date);
		ecp.ValidateUniqueNameIsCreated();
		ecp.DeleteExpenseCategory(date);
			
	}
}