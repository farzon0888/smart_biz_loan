
@test
Feature: Paycheck Protection Plan apply page


  Background: User navigates to home page
    Given User in Paycheck Protection plan apply page



 Scenario Outline: Verify Paycheck Protection Plan apply page
    And User verify page is loaded and all fields on the form are present
    And User verify the continue to pre-qualify button is disabled
    And User enters "<firstName>" in the First Name input
    And User enters "<lastName>" in the Last name input
    And User enters "<businessName>" in the Business name input
    And User enters "<email>" in the Email input
    And User enters "<phoneNumber>" in the Phone number input
    And User select "<typeOfBusiness>" in the Type of Business from dropdown
    And User enters "<estimatedLoanAmount>" in the Estimated Loan Amount input
    And User check Accept Terms and conditions Check box on the page
    And User Verify that the continue to pre-qualify button is now enabled and clickable
    And User should be able to click Continue_to_pre_qualify button
    And User verify the url to contains "/apply/loan"
    And User verify  Let’s get started button is present
    And User Click on Let’s get started button
    And User verify the url to contains "apply/prequalify/business/ppp_questions"
    And User Verify button No, this is my first PPP loan is present
    And User verify button Yes, I received a PPP loan last year is present
    And User verify  Save & Continue  button is present
    And User click on No, this is my first PPP loan
    And User Click on Save & Continue button
    And User verify the url to contains "/apply/prequalify/business/inception_date"
    And User Verify the buttons "Less let 2 years ago","2-5 years ago", "6-10 years ago", "More than 10 years ago" are present
    And User verify  Save & Continue  button is present
    And User Select two five years ago
    And User Click on Save & Continue button
    And User verify the url to contains "/apply/prequalify/business/industry"
    And User Verify the Business Industry selection drop down is present and the Save & Continue button is present
    And User Select "Manufacturing" option from the drop down menu
    And User Click on Save & Continue button
    And User verify the url to contains "/apply/prequalify/business/address"
    And User Verify text box for address and apt suite is present
    And User verify  Save & Continue  button is present
    And User Enter address "378 East St, Bloomsburg, PA" and select the auto suggested option displayed by hovering over it
    And User verify the url to contains "/apply/prequalify/business/employees"
    And User Verify the buttons "No Employees - just me","Less than 100 employees", "100-500 employees", "More than 500 employees" are present
    And User Select Less than hundred employee
    And User Click on Save & Continue button
    And User verify the url to contains "/apply/prequalify/business/password"
    And User Verify Create password text box is present
    And User verify  Save & Continue  button is present
    And User enters "Test123!" in the password input
    And User Click on Save & Continue button
    And User verify the url to contains "/apply/prequalify/owners"
    And User Verify users "<firstName>" is displayed on the page along with Save & Continue  button enabled
    And User Verify logout button on the top menu
    And User Click on logout button
    And User Click on Yes, sign me out button on modal dialog
    And User verify the url to contains "/login"
    And User Verify the login page elements, Email, password and Login button to be present
    And User Enter the email address and password and click login button
    Then Verify the user is able to login to application



    Examples:
   | firstName              | lastName              | businessName    | email             | phoneNumber     | typeOfBusiness | estimatedLoanAmount  |
   | Test User First Name   | Test User Last Name   | Test Business   | test.Automation   | 1234567234      |  Corporation   |  25000               |










