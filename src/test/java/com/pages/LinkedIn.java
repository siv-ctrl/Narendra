package com.pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LinkedIn
	{
	    
		static WebDriver driver;
		
		@FindBy(xpath="//a[@class='nav__button-secondary']")
		private WebElement signin;
		@FindBy(xpath="//input[@id='username']")
		private WebElement username;
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		@FindBy(xpath="//button[@class='btn__primary--large from__button--floating']")
		private WebElement sign_in;
		public LinkedIn (WebDriver driver) {
			PageFactory.initElements(driver, this);		
		}
		public void click() {
			signin.click();
		}
		public void enterUserName(String userName) {
			username.sendKeys(userName);
		}
		public void enterPassword(String passWord) {
			password.sendKeys(passWord);
		}
		public void clickSignIn() {
			sign_in.click();
		}
	
	}