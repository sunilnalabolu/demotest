package org.hcl.resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	WebDriver driver;
	public Properties prop;
	public FileInputStream fis;

	public WebDriver intializeDriver() throws IOException {

		prop = new Properties();

		String proppath = System.getProperty("user.dir") + "\\src\\main\\java\\org\\hcl\\resource\\data.properties";

		fis = new FileInputStream(proppath);
		prop.load(fis);

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		return driver;

	}

}
