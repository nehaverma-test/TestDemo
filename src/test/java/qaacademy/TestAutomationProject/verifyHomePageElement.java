package qaacademy.TestAutomationProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class verifyHomePageElement extends Base {

	public WebDriver driver = null; 
	@BeforeTest
	public void launching() throws IOException {

		// System.out.println("111");
		driver = initialize();
		driver.get(url);
	}

	@Test
	public void FetchTitle() throws IOException {

		LandingPage l = new LandingPage(driver);
		String text = l.videoText().getText();
		System.out.println("text is = " + text);

		AssertJUnit.assertTrue(l.videoText().isDisplayed());
		AssertJUnit.assertEquals(text, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");

	}

	@AfterTest
	public void closure() {
		driver.close();
	}

}
