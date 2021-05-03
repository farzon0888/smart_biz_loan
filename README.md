Used Java, Selenium WebDriver, JUnit, Cucumber, followed POM (page object model), and Singleton design patter (Singleton)

Test can be run from Test_Runner class under: src/test/java/runners/Test_Runner
Under src/test/java/pages created java "SmartBizLoan_Page" class located and stored all web elements related to the page for re-usability
Under src/test/java/step_definitions package created java "SmartBizLoan_Steps" class for validation/verification
Under src/test/java/step_definitions package created java "Hooks" class and used @Before  and @After annotation 
for taking some action before and after each scenario such as taking screenshot etc..
Under  src/test/java/utilities package created Config, Driver, and Utility classes.
Followed singleton design pattern (Singleton) to use only one instance for for all testing
Used Config class to read/get data dynamically from configuration.properties file
In Utility class created some custom/re-usable method such as switch to frame, scroll down etc..
Under resources/features wrote scenario in Gherkin language
Under resources/drivers stored chrome driver (using only chrome driver)
Reports are stored under target folder in html and json format




