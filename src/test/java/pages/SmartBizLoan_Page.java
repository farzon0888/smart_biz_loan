package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartBizLoan_Page {

    public SmartBizLoan_Page(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id = "first_name")
    public WebElement firstName_box;

    @FindBy(id = "last_name")
    public WebElement lastName_box;

    @FindBy(id = "legal_business_name")
    public WebElement businessName_box;

    @FindBy(id = "email")
    public WebElement email_box;

    @FindBy(id = "phone")
    public WebElement phone_box;


    @FindBy(id = "business_type")
    public WebElement typeOfBusiness_dropdown;

    @FindBy(id = "loan_amount")
    public WebElement estimatedLoanAmount_box;

    @FindBy(xpath = "//div//input[@id='privacy_policy']")
    public WebElement accept_Check_box;

    @FindBy (id = "submit_apply_form")
    public WebElement continue_to_preQualify_button;

    @FindBy(id = "apply_loading")
    public WebElement letsGetStarted_Button;


    @FindBy(id = "bordered-selector-label-6010")
    public WebElement no_this_is_My_firstPPP_Loan_button;

    @FindBy(xpath = "//label[@id='bordered-selector-label-6011']")
    public WebElement yes_I_recive_aPPP_loan_lastYear;


    @FindBy(xpath = "//a[@id='password_new_prequal']")
    public WebElement save_And_continue_button;

    @FindBy(xpath = "//label[@id='bordered-selector-label-option_0']")
    public WebElement years_box_1;

    @FindBy(xpath = "//label[@id='bordered-selector-label-option_1']")
    public WebElement years_box_2;

    @FindBy(xpath = "//label[@id='bordered-selector-label-option_2']")
    public WebElement years_box_3;


    @FindBy(xpath = "//label[@id='bordered-selector-label-option_3']")
    public WebElement years_box_4;


    @FindBy(xpath = "//select[@id='business_type_id']")
    public WebElement business_industry_selection_dropdwon_button;

    @FindBy(xpath = "//input[@id='street']")
    public WebElement search_for_address;

    @FindBy(xpath = "//input[@placeholder='Suite / Apt']")
    public WebElement suite_aprtmant_button;

    @FindBy(xpath = "//div[@role='listbox']")
    public WebElement listBox;

    @FindBy(xpath = "//label[@id='bordered-selector-label-option_1']")
    public WebElement less_than_100_employees;

    @FindBy(id = "password")
    public WebElement password_input;


    @FindBy(xpath = "//h1[@class='page-subheader-zilla']")
    public WebElement owner_name_text;

    @FindBy(id = "owners_new_prequal")
    public WebElement owner_save_and_continue_button;

    @FindBy(id = "logout-link")
    public WebElement logout_button;

    @FindBy(xpath = "//a[text()='Yes, sign me out']")
    public WebElement yes_signMe_out_button;

    @FindBy(id = "login_to_flow")
    public WebElement login_button;

    @FindBy(xpath = "//iframe[@title='Intercom Live Chat']")
    public WebElement iframe;

    @FindBy(xpath = "//span[@role='button']")
    public static WebElement closeIframeButton;

    @FindBy(xpath = "//span/button[.='Allow']")
    public WebElement allowCookiesButton;
































}
