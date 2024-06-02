package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase{
	
	//POM using Page Factory Implementation
		//@FindBy(locator= "locatorvalue")
		// WebElement element;
		WebDriver driver;
			
		@FindBy(xpath="//*[@name='txtUserName']")
		WebElement username_txtbox;
		
		@FindBy(xpath="//*[@name='txtPassword']")
		WebElement password_txtbox;
		
		@FindBy(xpath="//input[@name=\"Submit\"]")
		WebElement login_button;
		
		@FindBy(xpath="//input[@name=\"Clear\"]")
		WebElement clear_button;
		
		@FindBy(css="li[id=admin]")
		WebElement Admin_element;
		
		
		public LoginPage(WebDriver driver)
		{ 	
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public void Enterdata_usernametextbox(String uname)
		{
			username_txtbox.sendKeys(uname);
		}
		public void Cleardata_usernametextbox()
		{
			username_txtbox.clear();
		}
		
		public void Enterdata_passwordtextbox(String password)
		{
			password_txtbox.sendKeys(password);
		}
		
		public boolean Check_username_textbox()
		{
			return username_txtbox.isDisplayed();
			//password_txtbox.isDisplayed();
		}
		
		public boolean Check_password_textbox()
		{
			return password_txtbox.isDisplayed();
			
		}
		
		public boolean _Admin_element()
		{
			return Admin_element.isDisplayed();
		}
		
		public void Click_login_button()
		{
			login_button.submit();
		}
		public void Click_clear_button()
		{
			clear_button.click();
		}
		
		public void login(String uname, String password)
		{
			username_txtbox.sendKeys(uname);
			password_txtbox.sendKeys(password);
			login_button.submit();
		}

}
