package org.hcl.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this .driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
    @FindBy(linkText="Home")
	WebElement homepageField;
	
	public WebElement homepageField() {
		
		return homepageField;
	}
}
