package com.spotify.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;




public class SpotifyBase 
{
	WebDriver driver;
	SpotifyPages spotify;
	 JavascriptExecutor js;
	 SoftAssert SAssert;
	@Parameters({"Browser","Url"})
	@BeforeMethod
	public void Setup(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\testing\\Tools\\chromedriver_win32\\chromedriver.exe\\");
			
			driver = new ChromeDriver();
		}

		else if(Browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\testing\\Tools\\edgedriver_win64\\msedgedriver.exe");
			
			driver = new EdgeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\testing\\Tools\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("ide"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\testing\\Tools\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}
		driver.get(Url);
		driver.manage().window().maximize();
		
		spotify=new SpotifyPages(driver);
		
		js = (JavascriptExecutor) driver;
		SAssert = new SoftAssert();
	}
	
	@AfterMethod
	public void TearDown()
	{
		//driver.close();
		driver.quit();
	}


}
