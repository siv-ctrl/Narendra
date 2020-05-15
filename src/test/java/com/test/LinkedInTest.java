package com.test;


	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	import com.base.WrapperClass;
import com.example.XLSXFileReadEx;
import com.pages.LinkedIn;

	public class LinkedInTest extends WrapperClass{
		@BeforeMethod
		public void startup() {
			LaunchApplication("chrome","https://www.linkedin.com/home");
		}
		@DataProvider(name="LinkedIn")
		public Object[][] passData() throws IOException{
			XLSXFileReadEx read = new XLSXFileReadEx();
			Object[][] data = read.ReadData();
			return data;
		}
			@Test(dataProvider="LinkedIn")
			public void LinkedInlogin(String username,String pword) throws IOException {
				LinkedIn login = new LinkedIn(driver);
				login.click();
				login.enterUserName(username);
				login.enterPassword(pword);	
		}
	    @AfterMethod
	    public void close(){
	    	quit();
	    }
	}