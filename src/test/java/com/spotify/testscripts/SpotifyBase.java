package com.spotify.testscripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	public void CaptureScreenshot(WebDriver driver, String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+name+".png");
		FileUtils.copyFile(Source,target);
		System.out.println("Screenshot captured");
		
		
	}
	
	@AfterMethod
	public void TearDown()
	{
		//driver.close();
		driver.quit();
	}


}
