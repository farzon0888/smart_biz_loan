package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.SmartBizLoan_Page;
import utilities.Config;
import utilities.Driver;
import utilities.Utility;

import java.util.Random;


public class SmartBizLoan_Steps {

    String email;
    String password;

    SmartBizLoan_Page smartBizLoan_page = new SmartBizLoan_Page();


    @Given("User in Paycheck Protection plan apply page")
    public void user_in_Paycheck_Protection_plan_apply_page() throws InterruptedException {

       Driver.getDriver().get(Config.getProperty("smartBizLoanURL"));
       // Using if condition to allow cookies if it appears
       if (smartBizLoan_page.allowCookiesButton.isDisplayed()){
           smartBizLoan_page.allowCookiesButton.click();
       }

        // This method handles iframe and switches back to parent frame
        Utility.switchToFrame(smartBizLoan_page.iframe);

    }

    @And("User verify page is loaded and all fields on the form are present")
    public void user_verify_page_is_loaded_and_all_fields_on_the_form_are_present() {

        Assert.assertTrue("First name input is NOT displayed !",smartBizLoan_page.firstName_box.isDisplayed());
        Assert.assertTrue("Last name input is NOT displayed !",smartBizLoan_page.lastName_box.isDisplayed());
        Assert.assertTrue("Business name is NOT displayed ! ",smartBizLoan_page.businessName_box.isDisplayed());
        Assert.assertTrue("Email input is NOT displayed !",smartBizLoan_page.email_box.isDisplayed());
        Assert.assertTrue("Phone input box is NOT displayed ! ",smartBizLoan_page.phone_box.isDisplayed());
        Assert.assertTrue("Type of Business input is NOT displayed ! ",smartBizLoan_page.typeOfBusiness_dropdown.isDisplayed());
        Assert.assertTrue("Estimated loan Amount is NOT displayed !",smartBizLoan_page.estimatedLoanAmount_box.isDisplayed());

    }

    @And("User verify the continue to pre-qualify button is disabled")
    public void user_verify_the_continue_to_pre_qualify_button_is_disabled() {

        String str = Driver.getDriver().findElement(By.id("submit_apply_form")).getAttribute("class");
        Assert.assertTrue(str.contains("disabled"));


    }


    @And("User enters {string} in the First Name input")
    public void user_enters_in_the_First_Name_input(String firstName) {
            smartBizLoan_page.firstName_box.sendKeys(firstName);

    }

    @And("User enters {string} in the Last name input")
    public void user_enters_in_the_Last_name_input(String lastName) {

      smartBizLoan_page.lastName_box.sendKeys(lastName);

    }

    @And("User enters {string} in the Business name input")
    public void user_enters_in_the_Business_name_input(String businessName) {

      smartBizLoan_page.businessName_box.sendKeys(businessName);

    }

    @And("User enters {string} in the Email input")
    public void user_enters_in_the_Email_input(String strEmail) {

        int num = new Random().nextInt(1999);
        smartBizLoan_page.email_box.sendKeys(strEmail+num+"@gmail.com");
        email  = strEmail +  num + "@gmail.com";

    }

    @And("User enters {string} in the Phone number input")
    public void user_enters_in_the_Phone_number_input(String phoneNumber) {

      smartBizLoan_page.phone_box.sendKeys(phoneNumber);

    }

    @And("User select {string} in the Type of Business from dropdown")
    public void user_select_in_the_Type_of_Business_from_dropdown(String selectDropdown) {

        Utility.selectByVisibleText(smartBizLoan_page.typeOfBusiness_dropdown,selectDropdown);

    }

    @And("User enters {string} in the Estimated Loan Amount input")
    public void user_enters_in_the_Estimated_Loan_Amount_input(String amountLoan) {

        smartBizLoan_page.estimatedLoanAmount_box.sendKeys(amountLoan);

    }

    @And("User check Accept Terms and conditions Check box on the page")
    public void user_check_Accept_Terms_and_conditions_Check_box_on_the_page() {

          Utility.pageScrollDownJavaScript();
          smartBizLoan_page.accept_Check_box.click();

    }

    @And("User Verify that the continue to pre-qualify button is now enabled and clickable")
    public void user_Verify_that_the_continue_to_pre_qualify_button_is_now_enabled_and_clickable() {

       Assert.assertTrue("Continue to pre-qualify button now is NOT enable !",smartBizLoan_page.continue_to_preQualify_button.isEnabled());

    }

    @And("User should be able to click Continue_to_pre_qualify button")
    public void user_should_be_able_to_click_Continue_to_pre_qualify_button() {

        Utility.pageScrollDownJavaScript();
        smartBizLoan_page.continue_to_preQualify_button.click();

    }



    @And("User verify the url to contains {string}")
    public void user_verify_the_url_to_contains(String string) {

        Utility.waitUntilUrlContains(string);
       Assert.assertTrue("Actual URL is not matching Expected URL !",Driver.getDriver().getCurrentUrl().contains(string));

    }


    @Given("User verify  Let’s get started button is present")
    public void user_verify_Let_s_get_started_button_is_present() {

        Utility.waitUntilVisibilityOf(smartBizLoan_page.letsGetStarted_Button);
        Assert.assertTrue("Let's get started button is NOT present on the page !",smartBizLoan_page.letsGetStarted_Button.isDisplayed());
    }

    @Given("User Click on Let’s get started button")
    public void user_Click_on_Let_s_get_started_button()  {

        Utility.clickJavaScript(smartBizLoan_page.letsGetStarted_Button);

    }



    @Given("User Verify button No, this is my first PPP loan is present")
    public void user_Verify_button_No_this_is_my_first_PPP_loan_is_present() {

        Assert.assertTrue("NO, this is my  first PPP loan is NOT present on the page !",smartBizLoan_page.no_this_is_My_firstPPP_Loan_button.isDisplayed());

    }

    @Given("User verify button Yes, I received a PPP loan last year is present")
    public void user_verify_button_Yes_I_received_a_PPP_loan_last_year_is_present() {

      Assert.assertTrue("Yes, I received a PPP loan last year is NOT present on the page !",smartBizLoan_page.yes_I_recive_aPPP_loan_lastYear.isDisplayed());

    }

    @Given("User verify  Save & Continue  button is present")
    public void user_verify_Save_Continue_button_is_present() {

          Assert.assertTrue("Save & Continue  button is NOT present on the page !",smartBizLoan_page.save_And_continue_button.isDisplayed());

    }

    @Given("User click on No, this is my first PPP loan")
    public void user_click_on_No_this_is_my_first_PPP_loan() {

        smartBizLoan_page.no_this_is_My_firstPPP_Loan_button.click();

    }

    @Given("User Click on Save & Continue button")
    public void user_Click_on_Save_Continue_button() {

        Utility.pageScrollDownJavaScript();
        smartBizLoan_page.save_And_continue_button.click();
    }


    @Given("User Verify url contains {string}")
    public void user_Verify_url_contains(String expectedInURL) {

      Utility.waitUntilUrlContains(expectedInURL);
      Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));

    }


    @Given("User Verify the buttons {string},{string}, {string}, {string} are present")
    public void user_Verify_the_buttons_are_present(String string, String string2, String string3, String string4) {

        Assert.assertTrue(string + " is NOT present on the page !",smartBizLoan_page.years_box_1.isDisplayed());
        Assert.assertTrue(string2 + " is NOT present on the page !",smartBizLoan_page.years_box_2.isDisplayed());
        Assert.assertTrue(string3 + " is NOT present on the page !",smartBizLoan_page.years_box_3.isDisplayed());
        Assert.assertTrue(string4 + " is NOT present on the page !",smartBizLoan_page.years_box_4.isDisplayed());

    }


     @Given("User Select two five years ago")
     public void user_Select_two_five_years_ago() {

         smartBizLoan_page.years_box_2.click();

    }


    @Given("User Verify the Business Industry selection drop down is present and the Save & Continue button is present")
    public void user_Verify_the_Business_Industry_selection_drop_down_is_present_and_the_Save_Continue_button_is_present() {

        Assert.assertTrue("Business Industry selection drop down is NOT present !",smartBizLoan_page.business_industry_selection_dropdwon_button.isDisplayed());
        Assert.assertTrue("Save & Continue button is  NOT present !",smartBizLoan_page.save_And_continue_button.isDisplayed());

    }

    @Given("User Select {string} option from the drop down menu")
    public void user_Select_option_from_the_drop_down_menu(String string) {

        Utility.selectByVisibleText(smartBizLoan_page.business_industry_selection_dropdwon_button,string);
    }



    @Given("User Verify text box for address and apt suite is present")
    public void user_Verify_text_box_for_address_and_apt_suite_is_present() {

        Assert.assertTrue("Address text box is NOT present on the page !",smartBizLoan_page.search_for_address.isDisplayed());
        Assert.assertTrue("APT suite is NOT present on the page !",smartBizLoan_page.suite_aprtmant_button.isDisplayed());

    }



    @Given("User Enter address {string} and select the auto suggested option displayed by hovering over it")
    public void user_Enter_address_and_select_the_auto_suggested_option_displayed_by_hovering_over_it(String string) {

        smartBizLoan_page.search_for_address.sendKeys(string);
        smartBizLoan_page.listBox.click();
        Utility.clickJavaScript(smartBizLoan_page.save_And_continue_button);

    }


    @Given("User Select Less than hundred employee")
    public void user_Select_Less_than_hundred_employee() {

        smartBizLoan_page.less_than_100_employees.click();

    }

    @Given("User Verify Create password text box is present")
    public void user_Verify_Create_password_text_box_is_present() {

        Assert.assertTrue(smartBizLoan_page.password_input.isDisplayed());
    }



    @Given("User enters {string} in the password input")
    public void user_enters_in_the_password_input(String string) {

     smartBizLoan_page.password_input.sendKeys(string);
     password = string;

    }


    @Given("User Verify users {string} is displayed on the page along with Save & Continue  button enabled")
    public void user_Verify_users_is_displayed_on_the_page_along_with_Save_Continue_button_enabled(String ownerName) {

        Assert.assertTrue(ownerName + " is NOT present on the page !",smartBizLoan_page.owner_name_text.getText().contains(ownerName));
        Assert.assertTrue("Save and Continue button is NOT enabled !",smartBizLoan_page.owner_save_and_continue_button.isEnabled());

    }

    @Given("User Verify logout button on the top menu")
    public void user_Verify_logout_button_on_the_top_menu() {

      Assert.assertTrue("Logout button is NOT displayed! ", smartBizLoan_page.logout_button.isDisplayed());

    }

    @Given("User Click on logout button")
    public void user_Click_on_logout_button() {

      smartBizLoan_page.logout_button.click();

    }
    @Given("User Click on Yes, sign me out button on modal dialog")
    public void user_Click_on_Yes_sign_me_out_button_on_modal_dialog()  {
        smartBizLoan_page.yes_signMe_out_button.click();

    }

    @Given("User Verify the login page elements, Email, password and Login button to be present")
    public void user_Verify_the_login_page_elements_Email_password_and_Login_button_to_be_present() {

        Assert.assertTrue("Email input is NOT displayed ! ", smartBizLoan_page.email_box.isDisplayed());
        Assert.assertTrue("Password input is NOT displayed !", smartBizLoan_page.password_input.isDisplayed());
        Assert.assertTrue("Login button is NOT displayed !", smartBizLoan_page.login_button.isDisplayed());

    }

    @Given("User Enter the email address and password and click login button")
    public void user_Enter_the_email_address_and_password_and_click_login_button() {

        smartBizLoan_page.email_box.sendKeys(email);
        smartBizLoan_page.password_input.sendKeys(password);
        smartBizLoan_page.login_button.click();

    }

    @Then("Verify the user is able to login to application")
    public void verify_the_user_is_able_to_login_to_application() {

        Utility.waitUntilVisibilityOf(smartBizLoan_page.owner_name_text);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("/apply/prequalify/owners"));
        Assert.assertTrue(smartBizLoan_page.owner_name_text.getText().contains("Test User First Name"));


    }

}
