package org.hcl.loginpage;

import java.io.IOException;

import org.hcl.pageobjects.HomePage;
import org.hcl.pageobjects.LoginPag;
import org.hcl.resource.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	WebDriver driver;

	@Test
	public void login() throws IOException {

		LoginPag loginpag = new LoginPag(driver);
		loginpag.emailAdressField().sendKeys(prop.getProperty("email"));
		loginpag.passwordField().sendKeys(prop.getProperty("password"));
		loginpag.loginButton().click();

		HomePage homepage = new HomePage(driver);
		Assert.assertTrue(homepage.homepageField().isDisplayed());

	}

	@BeforeTest
	public void setup() throws IOException {

		driver = intializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@AfterTest
	public void teardown() {

		driver.close();
	}

}
