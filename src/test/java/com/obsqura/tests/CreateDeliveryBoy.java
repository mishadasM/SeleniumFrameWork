package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class CreateDeliveryBoy extends BaseTest{
	
	
	@Test
	public void CreateDeliveryBoyTest() {
		lp.Login();
		hp.NavigateTo_ManageDeliverBoy();
		String date= DateUtility.GetCurrentDate();
		ldp.CreateDeliveryBoy(date);
		
		ldp.ValidateDeliveryBoyIsCreated();
		
	}

}