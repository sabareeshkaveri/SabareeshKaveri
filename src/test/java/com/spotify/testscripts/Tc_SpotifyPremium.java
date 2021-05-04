package com.spotify.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Excel.Utility.ExcelUtility;

@Test

public class Tc_SpotifyPremium extends SpotifyBase {
	
	

	@Test( dataProvider = "getData")
	public void Soptify(String user, String pass, String planning, String month, String Paymentmode)
			throws InterruptedException 
	{
		Thread.sleep(2000);
		spotify.getLoggin().click();
		Thread.sleep(2000);
		spotify.getUsername().sendKeys(user);
		spotify.getPassword().sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000);
		
			Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Account overview - Spotify")); 
			Reporter.log("Login Success full", driver.getCurrentUrl().contains("overview"));
			spotify.getPremium().click();
			Thread.sleep(2000);
			spotify.getSelectOtherPlan().click();
			planning = planning.toLowerCase();
			Thread.sleep(2000);
			Reporter.log(planning+"Selected Plan for Premium Subscription", true);
			Reporter.log(month+"Selected Month is taken for plan", true);
			Reporter.log(Paymentmode+"Selected Payment Option is taken for plan", true);
			switch (planning) 
			{
			case "duo":
				Thread.sleep(2000);
				spotify.getDuo().click();
				break;
			case "mini":
				Thread.sleep(2000);
				spotify.getMini().click();
				break;
			case "individual":
				Thread.sleep(2000);
				spotify.getIndividual().click();
				break;
			case "family":
				Thread.sleep(2000);
				spotify.getFamily().click();
				break;

			default:
				Reporter.log(planning + "Option is Not Available", true);
				break;
			}
			Thread.sleep(5000);
			Paymentmode = Paymentmode.toLowerCase();
			SAssert.assertEquals(planning.equalsIgnoreCase("duo") || planning.equalsIgnoreCase("individual") || planning.equalsIgnoreCase("family") ||planning.equalsIgnoreCase("mini") , true);
				switch (month) {

				case "1month":
					spotify.getMonth1().sendKeys(Keys.ENTER);
					switch (Paymentmode) {
					case "paytm":
						spotify.getPaytm1().sendKeys(Keys.ENTER);
					case "upi":
						
						spotify.getUpi1().sendKeys(Keys.ENTER);
											break;
					case ("debitcredit"):
						spotify.getDebitCredit1().sendKeys(Keys.ENTER);
						break;
					default:
						Reporter.log(Paymentmode + "Option is Not Available", true);
						break;
					}

					break;
				case "3month":
					spotify.getMonth3().sendKeys(Keys.ENTER);
					switch (Paymentmode) {

					case "paytm":
						spotify.getPaytm3().sendKeys(Keys.ENTER);
						break;
					case "upi":
						spotify.getUpi3().sendKeys(Keys.ENTER);
						break;
					case ("debitcredit"):
						spotify.getDebitCredit3().sendKeys(Keys.ENTER);
						break;
					default:
						Reporter.log(Paymentmode + "Option is Not Available", true);
						break;
					}
					break;
				case "6month":
					spotify.getMonth6().sendKeys(Keys.ENTER);
					switch (Paymentmode) {

					case "paytm":
						spotify.getPaytm6().sendKeys(Keys.ENTER);
						break;
					case "upi":
						spotify.getUpi6().sendKeys(Keys.ENTER);
						break;
					case ("debitcredit"):
						spotify.getDebitCredit6().sendKeys(Keys.ENTER);
						break;
					default:
						Reporter.log(Paymentmode + "Option is Not Available", true);
						break;
					}

					break;
				case "12month":
					spotify.getMonth12().sendKeys(Keys.ENTER);
					switch (Paymentmode) {

					case "paytm":
						spotify.getPaytm12().sendKeys(Keys.ENTER);
						break;
					case "upi":
						spotify.getUpi12().sendKeys(Keys.ENTER);
						break;
					case ("debitcredit"):
						spotify.getDebitCredit12().sendKeys(Keys.ENTER);
						break;
					default:
						Reporter.log(Paymentmode + "Option is Not Available", true);
						break;
					}
					case "week":
						spotify.getWeek().sendKeys(Keys.ENTER);
						switch (Paymentmode) {
						case "upi":
							spotify.getWeekupi().sendKeys(Keys.ENTER);
							break;
						case "paytm":
							spotify.getWeekpaytm().sendKeys(Keys.ENTER);
							break;
						default:
							Reporter.log(Paymentmode + "Selected Payment is not Available", true);
							break;
						}
						
					case "day":
						spotify.getDay().sendKeys(Keys.ENTER);
						switch (Paymentmode) {
						case "upi":
							spotify.getDayupi().sendKeys(Keys.ENTER);
							break;
						case "paytm":
							spotify.getDaypaytm().sendKeys(Keys.ENTER);
							break;
						default:
							Reporter.log(month + "Option is Not Available", true);
							break;
							
						}
						Thread.sleep(2000);
						spotify.getLogout1().click();
						Thread.sleep(2000);
						spotify.getLogotBotton().click();
						Reporter.log("Successfully loggedout", true);
						Thread.sleep(2000);
			} 
	}


	/*
	 * @DataProvider public String[][] getData2() throws Exception { String Xlpath
	 * ="C:\\Users\\kaveri\\OneDrive\\Desktop\\ExcelUtility.xlsx"; String
	 * Xpath="Sheet3"; int rowCount=ExcelUtility.GetRowCount(Xlpath, Xpath); int
	 * columnCount =ExcelUtility.GetCellCount(Xlpath, Xpath, rowCount); String [][]
	 * data = new String[rowCount][columnCount]; for (int i = 1; i <= rowCount; i++)
	 * { for (int j = 0; j < columnCount; j++) {
	 * data[i-1][j]=ExcelUtility.GetCallData(Xlpath, Xpath, i, j);
	 * 
	 * }
	 * 
	 * } return data; }
	 */

	@DataProvider
	public String[][] getData() throws Exception {
		String Xlpath = "C:\\Users\\kaveri\\OneDrive\\Desktop\\ExcelUtility.xlsx";
		String Xpath = "Sheet1";
		int rowCount = ExcelUtility.GetRowCount(Xlpath, Xpath);
		int columnCount = ExcelUtility.GetCellCount(Xlpath, Xpath, rowCount);
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				data[i - 1][j] = ExcelUtility.GetCallData(Xlpath, Xpath, i, j);

			}

		}
		return data;
	}

	/*
	 * @DataProvider public String[][] getData1() throws Exception { String Xlpath =
	 * "C:\\Users\\kaveri\\OneDrive\\Desktop\\ExcelUtility.xlsx"; String
	 * Xpath="Sheet2"; int rowCount=ExcelUtility.GetRowCount(Xlpath, Xpath); int
	 * columnCount =ExcelUtility.GetCellCount(Xlpath, Xpath, rowCount); String [][]
	 * data = new String[rowCount][columnCount]; for (int i = 1; i <= rowCount; i++)
	 * { for (int j = 0; j < columnCount; j++) {
	 * data[i-1][j]=ExcelUtility.GetCallData(Xlpath, Xpath, i, j);
	 * 
	 * }
	 * 
	 * } return data; }
	 * /html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]/span[1]
	 * /html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]/span[1]
	 * //*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a
	 * //*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div
	 */
}
