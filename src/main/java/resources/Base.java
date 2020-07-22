package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Base {

	public WebDriver driver;
	public String browser;
	public String url;

	public WebDriver initialize() throws IOException {

		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream(
				"/Users/admin/Desktop/Working/TestAutomationProject/src/main/java/resources/data.Properties");
		prop.load(fin);
		System.out.println("Testing 666667777");
		browser = System.getProperty("Browser");
		//browser = prop.getProperty("browser");
		url = prop.getProperty("testurl");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/Work/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox"))

		{
			System.setProperty("webdriver.gecko.driver","/Users/admin/Desktop/Work/geckodriver" ); 
			
			driver = 	new FirefoxDriver();
		} else {

		}
		return driver;
	}

	public void getScreenshot(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destination = "/Users/admin/Desktop/Working/TestAutomationProject"+"/reports/"+testcaseName+".png";
		FileUtils.copyFile(source,new File("destination"));

	}
}
