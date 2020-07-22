package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignINPage {
	
	public WebDriver driver;
	public SignINPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	By username = By.id("user_email");
	By password = By.id("user_password");
	
	public WebElement fetchUsername()
	{
		return driver.findElement(username);
	}
	public WebElement fetchPassword()
	{
		return driver.findElement(password);
	}

}
