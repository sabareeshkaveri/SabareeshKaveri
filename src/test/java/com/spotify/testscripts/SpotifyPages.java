package com.spotify.testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SpotifyPages {
	WebDriver driver;

	public SpotifyPages(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement Loggin;

	/**
	 * @return the loggin
	 */
	public WebElement getLoggin() {
		return Loggin;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")
	WebElement username;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")
	WebElement Password;
	@FindBy(id = "login-button")
	WebElement LoginButton;

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return Password;
	}
	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return LoginButton;
	}
	@FindBy(linkText = "Premium")
	WebElement Premium;
	@FindBy(xpath = "//span[contains(text(),'See other plans')]")
	WebElement SelectOtherPlan;

	/**
	 * @return the premium
	 */
	public WebElement getPremium() {
		return Premium;
	}
	/**
	 * @return the selectOtherPlan
	 */
	public WebElement getSelectOtherPlan()
	{
		return SelectOtherPlan;
	}
	@FindBy(xpath = "//span[contains(text(),'View Plans')]")
	WebElement Mini;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[5]/article[1]/div[2]/div[5]/div[1]/a[1]/div[1]")
	WebElement Individual;
	@FindBy(xpath = "//body[1]/div[1]/main[1]/section[5]/article[1]/div[2]/div[8]/div[1]/a[1]/div[1]/span[1]")
	WebElement Duo;
	@FindBy(xpath = "//body[1]/div[1]/main[1]/section[5]/article[1]/div[2]/div[11]/div[1]/a[1]/div[1]/span[1]")
	WebElement Family;

	/**
	 * @return the mini
	 */
	public WebElement getMini() {
		return Mini;
	}
	/**
	 * @return the individual
	 */
	public WebElement getIndividual() {
		return Individual;
	}
	/**
	 * @return the duo
	 */
	public WebElement getDuo() {
		return Duo;
	}
	/**
	 * @return the family
	 */
	public WebElement getFamily() {
		return Family;
	}
	
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[4]/details[1]/summary[1]")
	WebElement Month1;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[3]/details[1]/summary[1]")
	WebElement Month3;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/summary[1]")
	WebElement Month6;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/summary[1]")
	WebElement Month12;

	/**
	 * @return the month1
	 */
	public WebElement getMonth1() {
		return Month1;
	}
	/**
	 * @return the month3
	 */
	public WebElement getMonth3() {
		return Month3;
	}
	/**
	 * @return the month6
	 */
	public WebElement getMonth6() {
		return Month6;
	}
	/**
	 * @return the month12
	 */
	public WebElement getMonth12() {
		return Month12;
	}
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/ul[1]/li[1]/a[1]")
	
	WebElement Paytm12;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/ul[1]/li[2]/a[1]")
	WebElement Upi12;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/ul[1]/li[3]/a[1]")
	WebElement DebitCredit12;

	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/ul[1]/li[1]/a[1]")
	
	WebElement Paytm6;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/ul[1]/li[2]/a[1]")
	WebElement Upi6;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/ul[1]/li[3]/a[1]")
	WebElement DebitCredit6;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[3]/details[1]/ul[1]/li[1]/a[1]")
	
	WebElement Paytm3;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[3]/details[1]/ul[1]/li[2]/a[1]")
	WebElement Upi3;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[3]/details[1]/ul[1]/li[3]/a[1]")
	WebElement DebitCredit3;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[4]/details[1]/ul[1]/li[1]/a[1]")
	
	WebElement Paytm1;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[4]/details[1]/ul[1]/li[2]/a[1]")
	WebElement Upi1;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[4]/details[1]/ul[1]/li[3]/a[1]")
	WebElement DebitCredit1;

	/**
	 * @return the paytm12
	 */
	public WebElement getPaytm12() {
		return Paytm12;
	}
	/**
	 * @return the upi12
	 */
	public WebElement getUpi12() {
		return Upi12;
	}
	/**
	 * @return the debitCredit12
	 */
	public WebElement getDebitCredit12() {
		return DebitCredit12;
	}
	/**
	 * @return the paytm6
	 */
	public WebElement getPaytm6() {
		return Paytm6;
	}
	/**
	 * @return the upi6
	 */
	public WebElement getUpi6() {
		return Upi6;
	}
	/**
	 * @return the debitCredit6
	 */
	public WebElement getDebitCredit6() {
		return DebitCredit6;
	}
	/**
	 * @return the paytm3
	 */
	public WebElement getPaytm3() {
		return Paytm3;
	}
	/**
	 * @return the upi3
	 */
	public WebElement getUpi3() {
		return Upi3;
	}
	/**
	 * @return the debitCredit3
	 */
	public WebElement getDebitCredit3() {
		return DebitCredit3;
	}
	/**
	 * @return the paytm1
	 */
	public WebElement getPaytm1() {
		return Paytm1;
	}
	/**
	 * @return the upi1
	 */
	public WebElement getUpi1() {
		return Upi1;
	}
	/**
	 * @return the debitCredit1
	 */
	public WebElement getDebitCredit1() {
		return DebitCredit1;
	}
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/summary[1]")
	WebElement Week;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/summary[1]")
	WebElement day;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/ul[1]/li[1]/a[1]")
	WebElement Weekupi;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[1]/details[1]/ul[1]/li[2]/a[1]")
	WebElement weekpaytm;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/ul[1]/li[1]/a[1]")
	WebElement dayupi;
	@FindBy(xpath = "//body/div[@id='spoti-root']/main[1]/section[2]/article[1]/div[1]/ul[1]/li[2]/details[1]/ul[1]/li[2]/a[1]")
	WebElement daypaytm;

	/**
	 * @return the week
	 */
	public WebElement getWeek() {
		return Week;
	}
	/**
	 * @return the day
	 */
	public WebElement getDay() {
		return day;
	}
	/**
	 * @return the weekupi
	 */
	public WebElement getWeekupi() {
		return Weekupi;
	}
	/**
	 * @return the weekpaytm
	 */
	public WebElement getWeekpaytm() {
		return weekpaytm;
	}
	/**
	 * @return the dayupi
	 */
	public WebElement getDayupi() {
		return dayupi;
	}
	/**
	 * @return the daypaytm
	 */
	public WebElement getDaypaytm() {
		return daypaytm;
	}
	@FindBy(xpath = "//header/div[1]/nav[1]/ul[1]/li[1]/button[1]")
	WebElement Logout1;
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement LogotBotton;

	/**
	 * @return the logout1
	 */
	public WebElement getLogout1() {
		return Logout1;
	}
	/**
	 * @return the logotBotton
	 */
	public WebElement getLogotBotton() {
		return LogotBotton;
	}
	
	
	
	
	
	
		
	

}
