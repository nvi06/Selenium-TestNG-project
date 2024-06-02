package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.TestBase;

public class Skills_LanguagePage extends TestBase{
public static Select sel;
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='txtUserName']")
	WebElement username_txtbox;
	
	@FindBy(xpath="//*[@name='txtPassword']")
	WebElement password_txtbox;
	
	@FindBy(xpath="//input[@name=\"Submit\"]")
	WebElement login_button;
	
	@FindBy(css="li[id=admin]")
	WebElement Admin_element;
	
	@FindBy(css="a.skills")
	WebElement Skills_element;
	
	@FindBy(xpath="//*[@class=\"skills\"]/*[text()=\"Skills\"]")
	WebElement Skills_s_element;
	
	@FindBy(xpath="//*[@class=\"skills\"]/*[text()=\"Languages\"]")
	WebElement Skills_languages;

	@FindBy(id="rightMenu")
	WebElement Move_To_Iframe1;
	
	@FindBy(name="allCheck")
	WebElement Chkbox;
	
	@FindBy(id="loc_code")
	WebElement Select_Dropd;
	
	@FindBy(css="input[name=loc_name]")
	WebElement SearchFor_txtbox;
	
	@FindBy(css="input[class=plainbtn][value=Search]")
	WebElement click_search;
	
	@FindBy(css="input[class=plainbtn][value=Reset]")
	WebElement click_reset;
	
	@FindBy(css="input[value=Add]")
	WebElement click_Add;
	
	@FindBy(id="txtLanguageInfoDesc")
	WebElement name_txt;
	
	@FindBy(css="input[class=clearbutton][value=Reset]")
	WebElement Reset;
	
	@FindBy(css="input[class=savebutton][id=editBtn]")
	WebElement Save;
	
	
	
	
	public Skills_LanguagePage(WebDriver driver)
	{ 	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Enterdata_usernametextbox(String uname)
	{
		username_txtbox.sendKeys(uname);
	}
	
	public void Enterdata_passwordtextbox(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void Click_login_button()
	{
		login_button.submit();
	}
	
	public void mouse_Hover_on_Admin() 
	{
		ac.moveToElement(Admin_element).build().perform();
	}
	
	public void Hover_from_Admin_to_Skills() 
	{
		ac.moveToElement(Skills_element).build().perform();
	}
	
	public void click_Languages()
	{
		Skills_languages.click();
	}

	public void Switch_to_Iframe()
	{
		driver.switchTo().frame(Move_To_Iframe1);
	}
	
	public void select_n_deselect_checkbox()
	{
		Chkbox.click();
	}
	
	public void Access_Select_Dropd_Id()
	{
		sel=new Select(Select_Dropd);
		sel.selectByVisibleText("ID");
	}
	
	public void Enter_ID_SearchFor(String Id)
	{
		SearchFor_txtbox.sendKeys(Id);
	}
	
	public void Click_Search_Bttn()
	{
		click_search.click();
	}
	
	public void Click_Reset_Bttn()
	{
		click_reset.click();
	}
	
	public void Click_Add_Bttn()
	{
		click_Add.click();
	}
	
	public void Name_txt_enter(String sAdd)
	{
		name_txt.sendKeys(sAdd);
	}
	
	public void clk_reset()
	{
		Reset.click();
	}
	
	public void clk_save()
	{
		Save.click();
	}
	
	public void Access_Select_Dropd_Name()
	{
		sel=new Select(Select_Dropd);
		sel.selectByVisibleText("Name");
	}
	


}
