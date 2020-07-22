package qaacademy.TestAutomationProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SignINPage;
import resources.Base;

public class HomePage extends Base {

	public WebDriver driver = null;
	@BeforeTest
	public void launching() throws IOException
	{
		
		driver = initialize();
		driver.get(url);
		
	}
	@Test(dataProvider = "fetchData")
	public void function(String usernameTest,String passwordTest) throws IOException {
		
		
		System.out.println("1115555");
		LandingPage landing1 = new LandingPage(driver);
		landing1.fetchLogin().click();

		SignINPage signPage = new SignINPage(driver);
		signPage.fetchUsername().sendKeys(usernameTest);
		signPage.fetchPassword().sendKeys(passwordTest);
		
		System.out.println(driver.getCurrentUrl());

	}

	@DataProvider
	public Object[][] fetchData()
	{
	     Object[][] inputData = new Object[1][2];
	 inputData[0][0] = "testing.com";
	 inputData[0][1] =  "123456";
	     return inputData;
	}
	
	@AfterTest
	public void closure()
	{
		driver.close();
	}
}
