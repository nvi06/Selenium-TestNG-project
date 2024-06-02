package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.SkillsPage;
import testBase.TestBase;

public class SkillsTest extends TestBase{
	SkillsPage SP;

	public SkillsTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		SP = new SkillsPage(driver);
		
	}

	@Test (priority =1)
	public void login_TestCase_with_Valid_Usernmae_Valid_Password() {

		SP.Enterdata_usernametextbox(prop.getProperty("user1"));
		SP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		SP.Click_login_button();

	}

		@Test (priority = 2)
		public void Skills_TestCase_Move_to_Skills_in_Admin_dropdown()
		{
			SP.mouse_Hover_on_Admin();
			SP.Hover_from_Admin_to_Skills();
			SP.click_skills();
		}
		
		@Test (priority = 3)
		public void Testcase_Skill_page_moving_to_iframe()
		{
			SP.Switch_to_Iframe();
		}
		
		@Test (priority =4)
		public void Testcase_validate_allcheckbox()
		{
			SP.select_n_deselect_checkbox();
		}
		
		@Test (priority = 5)
		public void Validating_testcase_SearchBy_Selecting_Id()
		{
			SP.Access_Select_Dropd_Id();
		}
		
		@Test (priority = 6)
		public void Testcase_Enter_Id_SearchFor_inputbox()
		{
			SP.Enter_ID_SearchFor(prop.getProperty("skil_id"));
		}
		
		@Test (priority = 7)
		public void Testcase_validate_search_bttn()
		{
			SP.Click_Search_Bttn();
		}
		
		@Test (priority = 8)
		public void Testcase_validate_reset_bttn()
		{
			SP.Click_Reset_Bttn();
		}
		
		@Test (priority = 9)
		public void Testcase_Validate_Add_bttn()
		{
			SP.Click_Add_Bttn();
		}
		
		@Test (priority = 10)
		public void Testcase_Entertxt_nameinputbox()
		{
			SP.Name_txt_enter(prop.getProperty("Name_input"));
		}
		
		@Test (priority = 11)
		public void Testcase_Enter_Description()
		{
			SP.Write_Description(prop.getProperty("Desc"));
		}
		
		@Test (priority = 12)
		public void Testcase_validate_Reset_bttn()
		{
			SP.clk_reset();
		}
		
		@Test (priority = 13)
		public void Testcase_validate_save_bttn()
		{
			SP.Name_txt_enter(prop.getProperty("Name_input"));
			SP.Write_Description(prop.getProperty("Desc"));	
			SP.clk_save();
		}
		
		@Test (priority = 14)
		public void Validating_testcase_SearchBy_Selecting_Name()
		{
			SP.Access_Select_Dropd_Name();
		}
		
		@AfterSuite
		public void teardown()
		{
			closure();
		}

}
