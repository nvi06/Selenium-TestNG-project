package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.SkillsPage;
import pages.Skills_LanguagePage;
import testBase.TestBase;

public class Skills_LanguagesTest extends TestBase{
	Skills_LanguagePage SLP;

	public Skills_LanguagesTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		SLP = new Skills_LanguagePage(driver);
		
	}

	@Test (priority =1)
	public void login_TestCase_with_Valid_Usernmae_Valid_Password() {

		SLP.Enterdata_usernametextbox(prop.getProperty("user1"));
		SLP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		SLP.Click_login_button();

	}

		@Test (priority = 2)
		public void Skills_TestCase_Move_to_SkillsLanguages_in_Admin_dropdown()
		{
			SLP.mouse_Hover_on_Admin();
			SLP.Hover_from_Admin_to_Skills();
			SLP.click_Languages();
		}
		
		@Test (priority = 3)
		public void Testcase_Languages_page_moving_to_iframe()
		{
			SLP.Switch_to_Iframe();
		}
		
		@Test (priority =4)
		public void Testcase_validate_allcheckbox()
		{
			SLP.select_n_deselect_checkbox();
		}
		
		@Test (priority = 5)
		public void Validating_testcase_SearchBy_Selecting_Id()
		{
			SLP.Access_Select_Dropd_Id();
		}
		
		@Test (priority = 6)
		public void Testcase_Enter_Id_SearchFor_inputbox()
		{
			SLP.Enter_ID_SearchFor(prop.getProperty("Lan_id"));
		}
		
		@Test (priority = 7)
		public void Testcase_validate_search_bttn()
		{
			SLP.Click_Search_Bttn();
		}
		
		@Test (priority = 8)
		public void Testcase_validate_reset_bttn()
		{
			SLP.Click_Reset_Bttn();
		}
		
		@Test (priority = 9)
		public void Testcase_Validate_Add_bttn()
		{
			SLP.Click_Add_Bttn();
		}
		
		@Test (priority = 10)
		public void Testcase_Entertxt_nameinputbox()
		{
			SLP.Name_txt_enter(prop.getProperty("Lan"));
		}
		
		@Test (priority = 11)
		public void Testcase_validate_Reset_bttn()
		{
			SLP.clk_reset();
		}
		
		@Test (priority = 12)
		public void Testcase_validate_save_bttn()
		{
			SLP.Name_txt_enter(prop.getProperty("Lan"));	
			SLP.clk_save();
		}
		
		@Test (priority = 13)
		public void Validating_testcase_SearchBy_Selecting_Name()
		{
			SLP.Access_Select_Dropd_Name();
		}
		
		@AfterSuite
		public void teardown()
		{
			closure();
		}


}
