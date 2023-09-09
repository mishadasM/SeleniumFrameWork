package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ListExpensePage extends PageUtility{

	
	WebDriver driver;

	public ListExpensePage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}