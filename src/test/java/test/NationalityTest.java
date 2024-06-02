package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.NationalityPage;
import pages.SkillsPage;
import testBase.TestBase;

public class NationalityTest extends TestBase{
	NationalityPage NP;

	public NationalityTest() {
		super();
	}

	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		NP = new NationalityPage(driver);
		
	}

	@Test (priority =1)
	public void login_TestCase_with_Valid_Usernmae_Valid_Password() {

		NP.Enterdata_usernametextbox(prop.getProperty("user1"));
		NP.Enterdata_passwordtextbox(prop.getProperty("pass1"));
		NP.Click_login_button();

	}

		@Test (priority = 2)
		public void TestCase_Move_to_Nationality_in_Admin_dropdown()
		{
			NP.mouse_Hover_on_Admin();
			NP.Hover_from_Admin_to_Nationality();
			NP.click_Nationality();
		}
		
		@Test (priority = 3)
		public void Testcase_Nationality_page_moving_to_iframe()
		{
			NP.Switch_to_Iframe();
		}
		
		@Test (priority =4)
		public void Testcase_validate_allcheckbox()
		{
			NP.select_n_deselect_checkbox();
		}
		
		@Test (priority = 5)
		public void Validating_testcase_SearchBy_Selecting_Id()
		{
			NP.Access_Select_Dropd_Id();
		}
		
		@Test (priority = 6)
		public void Testcase_Enter_Id_SearchFor_inputbox()
		{
			NP.Enter_ID_SearchFor(prop.getProperty("Nat_id"));
		}
		
		@Test (priority = 7)
		public void Testcase_validate_search_bttn()
		{
			NP.Click_Search_Bttn();
		}
		
		@Test (priority = 8)
		public void Testcase_validate_reset_bttn()
		{
			NP.Click_Reset_Bttn();
		}
		
		@Test (priority = 9)
		public void Testcase_Validate_Add_bttn()
		{
			NP.Click_Add_Bttn();
		}
		
		@Test (priority = 10)
		public void Testcase_Entertxt_nameinputbox()
		{
			NP.Name_txt_enter(prop.getProperty("Nat"));
		}
		
		@Test (priority = 11)
		public void Testcase_validate_Reset_bttn()
		{
			NP.clk_reset();
		}
		
		@Test (priority = 12)
		public void Testcase_validate_save_bttn()
		{
			NP.Name_txt_enter(prop.getProperty("Nat"));
			NP.clk_save();
		}
		
		@Test (priority = 13)
		public void Validating_testcase_SearchBy_Selecting_Name()
		{
			NP.Access_Select_Dropd_Name();
		}
		
		@AfterSuite
		public void teardown()
		{
			closure();
		}


}
