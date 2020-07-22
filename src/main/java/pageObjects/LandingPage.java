package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}

By Login = By.cssSelector("a[href*= 'sign_in']");
By videotext = By.cssSelector("div.video-banner h3");

public WebElement fetchLogin()
{
	return driver.findElement(Login);
}

public WebElement videoText()
{
	return driver.findElement(videotext);
}
}
