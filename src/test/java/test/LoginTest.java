package test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.LoginPage;
import testBase.TestBase;

public class LoginTest extends TestBase{

	LoginPage LP;

	public LoginTest() {
		super();

	}

	@BeforeSuite
	public void setup() throws IOException
	{
		initialize();
		LP= new LoginPage(driver);
	}

	@Test (priority = 1)
	public void login_TestCase_without_entering_credentials() {

		LP.Click_login_button();
		driver.switchTo().alert().accept();
	}

	@Test (priority = 2)
	public void login_TestCase_with_Valid_Usernmae_Invalid_Password() {
		
		LP.Enterdata_usernametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		LP.Click_login_button();

	}

	@Test (priority =3)
	public void login_TestCase_with_Invalid_Usernmae_valid_Password() {
		
		LP.Cleardata_usernametextbox();
		LP.Enterdata_usernametextbox(prop.getProperty("user2"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		LP.Click_login_button();

	}
	
	@Test (priority =4)
	public void login_TestCase_with_Invalid_Usernmae_Invalid_Password() {
		
		LP.Cleardata_usernametextbox();
		LP.Enterdata_usernametextbox(prop.getProperty("user2"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass2"));
		LP.Click_login_button();

	}
	
	@Test (priority =4)
	public void login_TestCase_with_Valid_Usernmae_Valid_Password() {
		
		LP.Cleardata_usernametextbox();
		LP.Enterdata_usernametextbox(prop.getProperty("user1"));
		LP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		LP.Click_login_button();
		Assert.assertEquals(true, LP._Admin_element());

	}
	

		@AfterSuite
		public void teardown()
		{
			closure();
		}

}
