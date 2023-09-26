package org.hcl.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPag {

	WebDriver driver;

	public LoginPag(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "user_name")
	WebElement emailAdressField;

	@FindBy(id = "user_pass")
	WebElement passwordField;

	@FindBy(id = "login_button")
	WebElement loginButton;
	
	
	public WebElement emailAdressField() {
		return emailAdressField;
	}
	
	public WebElement passwordField() {
		
		return passwordField;
	}
	
	public WebElement loginButton() {
		return loginButton;
	}
	
	
	

}
